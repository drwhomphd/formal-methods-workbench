/*
 * generated by Xtext
 */
package edu.uah.rsesc.aadlsimulator.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class InputConstraintAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("edu/uah/rsesc/aadlsimulator/xtext/parser/antlr/internal/InternalInputConstraint.tokens");
	}
}
