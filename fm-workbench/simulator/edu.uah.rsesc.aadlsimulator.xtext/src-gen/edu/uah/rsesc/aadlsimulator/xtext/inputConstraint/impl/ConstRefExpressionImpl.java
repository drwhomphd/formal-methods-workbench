/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl;

import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression;
import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Ref Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl#getPackageSegments <em>Package Segments</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl#getConstantName <em>Constant Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstRefExpressionImpl extends RefExpressionImpl implements ConstRefExpression
{
  /**
   * The cached value of the '{@link #getPackageSegments() <em>Package Segments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageSegments()
   * @generated
   * @ordered
   */
  protected EList<String> packageSegments;

  /**
   * The default value of the '{@link #getConstantName() <em>Constant Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantName()
   * @generated
   * @ordered
   */
  protected static final String CONSTANT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstantName() <em>Constant Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantName()
   * @generated
   * @ordered
   */
  protected String constantName = CONSTANT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstRefExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InputConstraintPackage.Literals.CONST_REF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPackageSegments()
  {
    if (packageSegments == null)
    {
      packageSegments = new EDataTypeEList<String>(String.class, this, InputConstraintPackage.CONST_REF_EXPRESSION__PACKAGE_SEGMENTS);
    }
    return packageSegments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstantName()
  {
    return constantName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantName(String newConstantName)
  {
    String oldConstantName = constantName;
    constantName = newConstantName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputConstraintPackage.CONST_REF_EXPRESSION__CONSTANT_NAME, oldConstantName, constantName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InputConstraintPackage.CONST_REF_EXPRESSION__PACKAGE_SEGMENTS:
        return getPackageSegments();
      case InputConstraintPackage.CONST_REF_EXPRESSION__CONSTANT_NAME:
        return getConstantName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InputConstraintPackage.CONST_REF_EXPRESSION__PACKAGE_SEGMENTS:
        getPackageSegments().clear();
        getPackageSegments().addAll((Collection<? extends String>)newValue);
        return;
      case InputConstraintPackage.CONST_REF_EXPRESSION__CONSTANT_NAME:
        setConstantName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InputConstraintPackage.CONST_REF_EXPRESSION__PACKAGE_SEGMENTS:
        getPackageSegments().clear();
        return;
      case InputConstraintPackage.CONST_REF_EXPRESSION__CONSTANT_NAME:
        setConstantName(CONSTANT_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InputConstraintPackage.CONST_REF_EXPRESSION__PACKAGE_SEGMENTS:
        return packageSegments != null && !packageSegments.isEmpty();
      case InputConstraintPackage.CONST_REF_EXPRESSION__CONSTANT_NAME:
        return CONSTANT_NAME_EDEFAULT == null ? constantName != null : !CONSTANT_NAME_EDEFAULT.equals(constantName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (packageSegments: ");
    result.append(packageSegments);
    result.append(", constantName: ");
    result.append(constantName);
    result.append(')');
    return result.toString();
  }

} //ConstRefExpressionImpl
