/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Ref Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getPackageSegments <em>Package Segments</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getConstantName <em>Constant Name</em>}</li>
 * </ul>
 *
 * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getConstRefExpression()
 * @model
 * @generated
 */
public interface ConstRefExpression extends RefExpression
{
  /**
   * Returns the value of the '<em><b>Package Segments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Segments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Segments</em>' attribute list.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getConstRefExpression_PackageSegments()
   * @model unique="false"
   * @generated
   */
  EList<String> getPackageSegments();

  /**
   * Returns the value of the '<em><b>Constant Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Name</em>' attribute.
   * @see #setConstantName(String)
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getConstRefExpression_ConstantName()
   * @model
   * @generated
   */
  String getConstantName();

  /**
   * Sets the value of the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getConstantName <em>Constant Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Name</em>' attribute.
   * @see #getConstantName()
   * @generated
   */
  void setConstantName(String value);

} // ConstRefExpression
