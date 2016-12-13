/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl;

import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage;
import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression;
import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ScalarExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl#isLeftClosed <em>Left Closed</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl#isRightClosed <em>Right Closed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalExpressionImpl extends ExpressionImpl implements IntervalExpression
{
  /**
   * The default value of the '{@link #isLeftClosed() <em>Left Closed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeftClosed()
   * @generated
   * @ordered
   */
  protected static final boolean LEFT_CLOSED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLeftClosed() <em>Left Closed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeftClosed()
   * @generated
   * @ordered
   */
  protected boolean leftClosed = LEFT_CLOSED_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ScalarExpression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ScalarExpression right;

  /**
   * The default value of the '{@link #isRightClosed() <em>Right Closed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRightClosed()
   * @generated
   * @ordered
   */
  protected static final boolean RIGHT_CLOSED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRightClosed() <em>Right Closed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRightClosed()
   * @generated
   * @ordered
   */
  protected boolean rightClosed = RIGHT_CLOSED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntervalExpressionImpl()
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
    return InputConstraintPackage.Literals.INTERVAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLeftClosed()
  {
    return leftClosed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftClosed(boolean newLeftClosed)
  {
    boolean oldLeftClosed = leftClosed;
    leftClosed = newLeftClosed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__LEFT_CLOSED, oldLeftClosed, leftClosed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ScalarExpression newLeft, NotificationChain msgs)
  {
    ScalarExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ScalarExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputConstraintPackage.INTERVAL_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputConstraintPackage.INTERVAL_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ScalarExpression newRight, NotificationChain msgs)
  {
    ScalarExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ScalarExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRightClosed()
  {
    return rightClosed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightClosed(boolean newRightClosed)
  {
    boolean oldRightClosed = rightClosed;
    rightClosed = newRightClosed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT_CLOSED, oldRightClosed, rightClosed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT_CLOSED:
        return isLeftClosed();
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT:
        return getLeft();
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT:
        return getRight();
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT_CLOSED:
        return isRightClosed();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT_CLOSED:
        setLeftClosed((Boolean)newValue);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT:
        setLeft((ScalarExpression)newValue);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT:
        setRight((ScalarExpression)newValue);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT_CLOSED:
        setRightClosed((Boolean)newValue);
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
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT_CLOSED:
        setLeftClosed(LEFT_CLOSED_EDEFAULT);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT:
        setLeft((ScalarExpression)null);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT:
        setRight((ScalarExpression)null);
        return;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT_CLOSED:
        setRightClosed(RIGHT_CLOSED_EDEFAULT);
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
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT_CLOSED:
        return leftClosed != LEFT_CLOSED_EDEFAULT;
      case InputConstraintPackage.INTERVAL_EXPRESSION__LEFT:
        return left != null;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT:
        return right != null;
      case InputConstraintPackage.INTERVAL_EXPRESSION__RIGHT_CLOSED:
        return rightClosed != RIGHT_CLOSED_EDEFAULT;
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
    result.append(" (leftClosed: ");
    result.append(leftClosed);
    result.append(", rightClosed: ");
    result.append(rightClosed);
    result.append(')');
    return result.toString();
  }

} //IntervalExpressionImpl
