package com.rockwellcollins.atc.agree.analysis.lustre.visitors;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.EventDataPort;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.SystemImplementation;

import com.rockwellcollins.atc.agree.agree.Arg;
import com.rockwellcollins.atc.agree.agree.AssertStatement;
import com.rockwellcollins.atc.agree.agree.AssumeStatement;
import com.rockwellcollins.atc.agree.agree.GuaranteeStatement;
import com.rockwellcollins.atc.agree.agree.LemmaStatement;
import com.rockwellcollins.atc.agree.agree.PropertyStatement;
import com.rockwellcollins.atc.agree.analysis.AgreeException;
import com.rockwellcollins.atc.agree.analysis.AgreeLayout;
import com.rockwellcollins.atc.agree.analysis.AgreeLayout.SigType;
import com.rockwellcollins.atc.agree.analysis.AgreeRenaming;
import com.rockwellcollins.atc.agree.analysis.ast.AgreeASTBuilder;
import com.rockwellcollins.atc.agree.analysis.ast.AgreeStatement;
import com.rockwellcollins.atc.agree.analysis.ast.AgreeVar;
import com.rockwellcollins.atc.agree.analysis.ast.visitors.AgreeInlineLatchedConnections;
import com.rockwellcollins.atc.agree.analysis.translation.LustreAstBuilder;

import jkind.lustre.Node;
import jkind.lustre.Program;
import jkind.lustre.VarDecl;
import jkind.lustre.visitors.AstIterVisitor;

public class RenamingVisitor extends AstIterVisitor {

	private final AgreeRenaming renaming;
	private final AgreeLayout layout;
	private final Program program;
	private boolean isMainNode;
	private String nodeName;

	public static void addRenamings(Program program, AgreeRenaming renaming, AgreeLayout layout) {
		RenamingVisitor visitor = new RenamingVisitor(program, renaming, layout);
		visitor.visit(program);
	}

	private RenamingVisitor(Program program, AgreeRenaming renaming, AgreeLayout layout) {
		this.renaming = renaming;
		this.layout = layout;
		this.program = program;
	}

	@Override
	public Void visit(Program program) {
		super.visit(program);
		for (jkind.lustre.TypeDef typeDef : program.types) {
			if (typeDef.type instanceof jkind.lustre.EnumType) {
				jkind.lustre.EnumType enumType = (jkind.lustre.EnumType) typeDef.type;
				for (String enumerator : enumType.values) {
					renaming.addExplicitRename(enumerator, enumerator);
				}
			}
		}
		return null;
	}

	@Override
	public Void visit(Node node) {
		isMainNode = node.id.equals(program.main);
		nodeName = node.id;
		visitVarDecls(node.inputs);
		visitVarDecls(node.outputs);
		visitVarDecls(node.locals);
		return null;
	}

	@Override
	public Void visit(VarDecl e) {
		if (e instanceof AgreeVar) {
			AgreeVar var = (AgreeVar) e;
			String category = getCategory(var);
			String refStr = getReferenceStr(var);

			if (isMainNode && var.reference != null) {
				// TODO: the means of detecting whether this is a consistency analysis is a hack. Fix it.
				if ((var.reference instanceof AssumeStatement
						|| (nodeName.contains("consistency") && var.reference instanceof GuaranteeStatement))
						&& category != null && category.equals("")) {
					renaming.addSupportRename(var.id, var.id);
					renaming.addSupportRefString(var.id, refStr);
					renaming.getRefMap().put(refStr, var.reference);
				} else {
					renaming.addExplicitRename(var.id, refStr);
					renaming.addToRefMap(var.id, var.reference);
				}
			} else if (var.reference instanceof GuaranteeStatement) {
				renaming.addSupportRename(nodeName + "." + var.id, category + "." + var.id);
				renaming.addSupportRefString(nodeName + "." + var.id, refStr);
				renaming.getRefMap().put(refStr, var.reference);
			} else {
				return null;
			}

			if (category != null && !layout.getCategories().contains(category)) {
				layout.addCategory(category);
			}
			layout.addElement(category, refStr, SigType.INPUT);

		}
		return null;
	}

	private String getReferenceStr(AgreeVar var) {

		String prefix = getCategory(var);
		if (prefix == null) {
			return null;
		}
		if (var.id.endsWith(AgreeASTBuilder.clockIDSuffix)) {
			return null;
		}

		String seperator = (prefix == "" ? "" : ".");
		EObject reference = var.reference;
		String suffix = "";

		if (var.id.endsWith(AgreeASTBuilder.eventSuffix + AgreeInlineLatchedConnections.LATCHED_SUFFIX)) {
			suffix = "._EVENT_._LATCHED_";
		} else if (var.id.endsWith(AgreeASTBuilder.eventSuffix)) {
			suffix = "._EVENT_";
		} else if (var.id.endsWith(AgreeInlineLatchedConnections.LATCHED_SUFFIX)) {
			suffix = "._LATCHED_";
		}

		if (reference instanceof GuaranteeStatement) {
			return ((GuaranteeStatement) reference).getStr();
		} else if (reference instanceof AssumeStatement) {
			return prefix + " assume: " + ((AssumeStatement) reference).getStr();
		} else if (reference instanceof LemmaStatement) {
			return prefix + " lemma: " + ((LemmaStatement) reference).getStr();
		} else if (reference instanceof AssertStatement) {
			throw new AgreeException("We really didn't expect to see an assert statement here");
		} else if (reference instanceof Arg) {
			return prefix + seperator + ((Arg) reference).getName() + suffix;
		} else if (reference instanceof DataPort) {
			return prefix + seperator + ((DataPort) reference).getName() + suffix;
		} else if (reference instanceof EventDataPort) {
			return prefix + seperator + ((EventDataPort) reference).getName() + suffix;
		} else if (reference instanceof FeatureGroup) {
			String featName = ((FeatureGroup) reference).getName();
			String varName = var.toString();
			featName = varName.substring(varName.indexOf(featName)).replace("__", ".");
			return prefix + seperator + featName;
		} else if (reference instanceof PropertyStatement) {
			return prefix + seperator + ((PropertyStatement) reference).getName();
		} else if (reference instanceof ComponentType || reference instanceof ComponentImplementation
				|| reference instanceof SystemImplementation) {
			if (var.id.equals(LustreAstBuilder.assumeHistSufix)) {
				return "Subcomponent Assumptions";
			}
			return "Result";
		} else if (reference instanceof AgreeStatement) {
			return prefix + reference.toString();
		}
		throw new AgreeException("Unhandled reference type: '" + reference.getClass().getName() + "'");
	}

	public static String getCategory(AgreeVar var) {
		if (var.compInst == null || var.reference == null) {
			return null;
		}
		return LustreAstBuilder.getRelativeLocation(var.compInst.getInstanceObjectPath());
	}

}
