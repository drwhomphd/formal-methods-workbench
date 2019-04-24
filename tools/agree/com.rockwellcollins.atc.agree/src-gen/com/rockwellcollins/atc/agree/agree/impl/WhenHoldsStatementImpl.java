/**
 */
package com.rockwellcollins.atc.agree.agree.impl;

import com.rockwellcollins.atc.agree.agree.AgreePackage;
import com.rockwellcollins.atc.agree.agree.Expr;
import com.rockwellcollins.atc.agree.agree.TimeInterval;
import com.rockwellcollins.atc.agree.agree.WhenHoldsStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Holds Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.WhenHoldsStatementImpl#getCauseCondition <em>Cause Condition</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.WhenHoldsStatementImpl#getConditionInterval <em>Condition Interval</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.WhenHoldsStatementImpl#getEffectEvent <em>Effect Event</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.WhenHoldsStatementImpl#getExcl <em>Excl</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.WhenHoldsStatementImpl#getEventInterval <em>Event Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenHoldsStatementImpl extends WhenStatementImpl implements WhenHoldsStatement
{
  /**
   * The cached value of the '{@link #getCauseCondition() <em>Cause Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCauseCondition()
   * @generated
   * @ordered
   */
  protected Expr causeCondition;

  /**
   * The cached value of the '{@link #getConditionInterval() <em>Condition Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionInterval()
   * @generated
   * @ordered
   */
  protected TimeInterval conditionInterval;

  /**
   * The cached value of the '{@link #getEffectEvent() <em>Effect Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffectEvent()
   * @generated
   * @ordered
   */
  protected Expr effectEvent;

  /**
   * The default value of the '{@link #getExcl() <em>Excl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcl()
   * @generated
   * @ordered
   */
  protected static final String EXCL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExcl() <em>Excl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcl()
   * @generated
   * @ordered
   */
  protected String excl = EXCL_EDEFAULT;

  /**
   * The cached value of the '{@link #getEventInterval() <em>Event Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventInterval()
   * @generated
   * @ordered
   */
  protected TimeInterval eventInterval;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenHoldsStatementImpl()
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
    return AgreePackage.Literals.WHEN_HOLDS_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getCauseCondition()
  {
    return causeCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCauseCondition(Expr newCauseCondition, NotificationChain msgs)
  {
    Expr oldCauseCondition = causeCondition;
    causeCondition = newCauseCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION, oldCauseCondition, newCauseCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCauseCondition(Expr newCauseCondition)
  {
    if (newCauseCondition != causeCondition)
    {
      NotificationChain msgs = null;
      if (causeCondition != null)
        msgs = ((InternalEObject)causeCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION, null, msgs);
      if (newCauseCondition != null)
        msgs = ((InternalEObject)newCauseCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION, null, msgs);
      msgs = basicSetCauseCondition(newCauseCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION, newCauseCondition, newCauseCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeInterval getConditionInterval()
  {
    return conditionInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionInterval(TimeInterval newConditionInterval, NotificationChain msgs)
  {
    TimeInterval oldConditionInterval = conditionInterval;
    conditionInterval = newConditionInterval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL, oldConditionInterval, newConditionInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConditionInterval(TimeInterval newConditionInterval)
  {
    if (newConditionInterval != conditionInterval)
    {
      NotificationChain msgs = null;
      if (conditionInterval != null)
        msgs = ((InternalEObject)conditionInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL, null, msgs);
      if (newConditionInterval != null)
        msgs = ((InternalEObject)newConditionInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL, null, msgs);
      msgs = basicSetConditionInterval(newConditionInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL, newConditionInterval, newConditionInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getEffectEvent()
  {
    return effectEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffectEvent(Expr newEffectEvent, NotificationChain msgs)
  {
    Expr oldEffectEvent = effectEvent;
    effectEvent = newEffectEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT, oldEffectEvent, newEffectEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffectEvent(Expr newEffectEvent)
  {
    if (newEffectEvent != effectEvent)
    {
      NotificationChain msgs = null;
      if (effectEvent != null)
        msgs = ((InternalEObject)effectEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT, null, msgs);
      if (newEffectEvent != null)
        msgs = ((InternalEObject)newEffectEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT, null, msgs);
      msgs = basicSetEffectEvent(newEffectEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT, newEffectEvent, newEffectEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExcl()
  {
    return excl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExcl(String newExcl)
  {
    String oldExcl = excl;
    excl = newExcl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__EXCL, oldExcl, excl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeInterval getEventInterval()
  {
    return eventInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEventInterval(TimeInterval newEventInterval, NotificationChain msgs)
  {
    TimeInterval oldEventInterval = eventInterval;
    eventInterval = newEventInterval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL, oldEventInterval, newEventInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEventInterval(TimeInterval newEventInterval)
  {
    if (newEventInterval != eventInterval)
    {
      NotificationChain msgs = null;
      if (eventInterval != null)
        msgs = ((InternalEObject)eventInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL, null, msgs);
      if (newEventInterval != null)
        msgs = ((InternalEObject)newEventInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL, null, msgs);
      msgs = basicSetEventInterval(newEventInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL, newEventInterval, newEventInterval));
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
      case AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION:
        return basicSetCauseCondition(null, msgs);
      case AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL:
        return basicSetConditionInterval(null, msgs);
      case AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT:
        return basicSetEffectEvent(null, msgs);
      case AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL:
        return basicSetEventInterval(null, msgs);
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
      case AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION:
        return getCauseCondition();
      case AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL:
        return getConditionInterval();
      case AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT:
        return getEffectEvent();
      case AgreePackage.WHEN_HOLDS_STATEMENT__EXCL:
        return getExcl();
      case AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL:
        return getEventInterval();
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
      case AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION:
        setCauseCondition((Expr)newValue);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL:
        setConditionInterval((TimeInterval)newValue);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT:
        setEffectEvent((Expr)newValue);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EXCL:
        setExcl((String)newValue);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL:
        setEventInterval((TimeInterval)newValue);
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
      case AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION:
        setCauseCondition((Expr)null);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL:
        setConditionInterval((TimeInterval)null);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT:
        setEffectEvent((Expr)null);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EXCL:
        setExcl(EXCL_EDEFAULT);
        return;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL:
        setEventInterval((TimeInterval)null);
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
      case AgreePackage.WHEN_HOLDS_STATEMENT__CAUSE_CONDITION:
        return causeCondition != null;
      case AgreePackage.WHEN_HOLDS_STATEMENT__CONDITION_INTERVAL:
        return conditionInterval != null;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EFFECT_EVENT:
        return effectEvent != null;
      case AgreePackage.WHEN_HOLDS_STATEMENT__EXCL:
        return EXCL_EDEFAULT == null ? excl != null : !EXCL_EDEFAULT.equals(excl);
      case AgreePackage.WHEN_HOLDS_STATEMENT__EVENT_INTERVAL:
        return eventInterval != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (excl: ");
    result.append(excl);
    result.append(')');
    return result.toString();
  }

} //WhenHoldsStatementImpl
