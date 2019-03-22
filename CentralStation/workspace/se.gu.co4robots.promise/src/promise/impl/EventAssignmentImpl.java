/**
 */
package promise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import promise.Event;
import promise.EventAssignment;
import promise.EventBasedOperator;
import promise.Operator;
import promise.PromisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.EventAssignmentImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link promise.impl.EventAssignmentImpl#getInputOperators <em>Input Operators</em>}</li>
 *   <li>{@link promise.impl.EventAssignmentImpl#getParent_event <em>Parent event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventAssignmentImpl extends MinimalEObjectImpl.Container implements EventAssignment {
	/**
	 * The cached value of the '{@link #getInputEvent() <em>Input Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected Event inputEvent;

	/**
	 * The cached value of the '{@link #getInputOperators() <em>Input Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOperators()
	 * @generated
	 * @ordered
	 */
	protected Operator inputOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.EVENT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getInputEvent() {
		if (inputEvent != null && inputEvent.eIsProxy()) {
			InternalEObject oldInputEvent = (InternalEObject)inputEvent;
			inputEvent = (Event)eResolveProxy(oldInputEvent);
			if (inputEvent != oldInputEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT, oldInputEvent, inputEvent));
			}
		}
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetInputEvent() {
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEvent(Event newInputEvent) {
		Event oldInputEvent = inputEvent;
		inputEvent = newInputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT, oldInputEvent, inputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getInputOperators() {
		return inputOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputOperators(Operator newInputOperators, NotificationChain msgs) {
		Operator oldInputOperators = inputOperators;
		inputOperators = newInputOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS, oldInputOperators, newInputOperators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputOperators(Operator newInputOperators) {
		if (newInputOperators != inputOperators) {
			NotificationChain msgs = null;
			if (inputOperators != null)
				msgs = ((InternalEObject)inputOperators).eInverseRemove(this, PromisePackage.OPERATOR__EVENT_ASSIGNED, Operator.class, msgs);
			if (newInputOperators != null)
				msgs = ((InternalEObject)newInputOperators).eInverseAdd(this, PromisePackage.OPERATOR__EVENT_ASSIGNED, Operator.class, msgs);
			msgs = basicSetInputOperators(newInputOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS, newInputOperators, newInputOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedOperator getParent_event() {
		if (eContainerFeatureID() != PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT) return null;
		return (EventBasedOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent_event(EventBasedOperator newParent_event, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent_event, PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent_event(EventBasedOperator newParent_event) {
		if (newParent_event != eInternalContainer() || (eContainerFeatureID() != PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT && newParent_event != null)) {
			if (EcoreUtil.isAncestor(this, newParent_event))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent_event != null)
				msgs = ((InternalEObject)newParent_event).eInverseAdd(this, PromisePackage.EVENT_BASED_OPERATOR__INPUT_EVENTS, EventBasedOperator.class, msgs);
			msgs = basicSetParent_event(newParent_event, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT, newParent_event, newParent_event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				if (inputOperators != null)
					msgs = ((InternalEObject)inputOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS, null, msgs);
				return basicSetInputOperators((Operator)otherEnd, msgs);
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent_event((EventBasedOperator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				return basicSetInputOperators(null, msgs);
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				return basicSetParent_event(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				return eInternalContainer().eInverseRemove(this, PromisePackage.EVENT_BASED_OPERATOR__INPUT_EVENTS, EventBasedOperator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT:
				if (resolve) return getInputEvent();
				return basicGetInputEvent();
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				return getInputOperators();
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				return getParent_event();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT:
				setInputEvent((Event)newValue);
				return;
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				setInputOperators((Operator)newValue);
				return;
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				setParent_event((EventBasedOperator)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT:
				setInputEvent((Event)null);
				return;
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				setInputOperators((Operator)null);
				return;
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				setParent_event((EventBasedOperator)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_EVENT:
				return inputEvent != null;
			case PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS:
				return inputOperators != null;
			case PromisePackage.EVENT_ASSIGNMENT__PARENT_EVENT:
				return getParent_event() != null;
		}
		return super.eIsSet(featureID);
	}

} //EventAssignmentImpl
