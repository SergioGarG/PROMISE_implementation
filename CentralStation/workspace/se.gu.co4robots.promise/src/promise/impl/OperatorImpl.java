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

import promise.CompositionOperator;
import promise.EventAssignment;
import promise.Operator;
import promise.PromisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.OperatorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link promise.impl.OperatorImpl#getEventAssigned <em>Event Assigned</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends MinimalEObjectImpl.Container implements Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionOperator getParent() {
		if (eContainerFeatureID() != PromisePackage.OPERATOR__PARENT) return null;
		return (CompositionOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositionOperator newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, PromisePackage.OPERATOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CompositionOperator newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != PromisePackage.OPERATOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PromisePackage.COMPOSITION_OPERATOR__INPUT_OPERATORS, CompositionOperator.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.OPERATOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAssignment getEventAssigned() {
		if (eContainerFeatureID() != PromisePackage.OPERATOR__EVENT_ASSIGNED) return null;
		return (EventAssignment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventAssigned(EventAssignment newEventAssigned, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEventAssigned, PromisePackage.OPERATOR__EVENT_ASSIGNED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventAssigned(EventAssignment newEventAssigned) {
		if (newEventAssigned != eInternalContainer() || (eContainerFeatureID() != PromisePackage.OPERATOR__EVENT_ASSIGNED && newEventAssigned != null)) {
			if (EcoreUtil.isAncestor(this, newEventAssigned))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEventAssigned != null)
				msgs = ((InternalEObject)newEventAssigned).eInverseAdd(this, PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS, EventAssignment.class, msgs);
			msgs = basicSetEventAssigned(newEventAssigned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.OPERATOR__EVENT_ASSIGNED, newEventAssigned, newEventAssigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.OPERATOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CompositionOperator)otherEnd, msgs);
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEventAssigned((EventAssignment)otherEnd, msgs);
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
			case PromisePackage.OPERATOR__PARENT:
				return basicSetParent(null, msgs);
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				return basicSetEventAssigned(null, msgs);
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
			case PromisePackage.OPERATOR__PARENT:
				return eInternalContainer().eInverseRemove(this, PromisePackage.COMPOSITION_OPERATOR__INPUT_OPERATORS, CompositionOperator.class, msgs);
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				return eInternalContainer().eInverseRemove(this, PromisePackage.EVENT_ASSIGNMENT__INPUT_OPERATORS, EventAssignment.class, msgs);
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
			case PromisePackage.OPERATOR__PARENT:
				return getParent();
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				return getEventAssigned();
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
			case PromisePackage.OPERATOR__PARENT:
				setParent((CompositionOperator)newValue);
				return;
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				setEventAssigned((EventAssignment)newValue);
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
			case PromisePackage.OPERATOR__PARENT:
				setParent((CompositionOperator)null);
				return;
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				setEventAssigned((EventAssignment)null);
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
			case PromisePackage.OPERATOR__PARENT:
				return getParent() != null;
			case PromisePackage.OPERATOR__EVENT_ASSIGNED:
				return getEventAssigned() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperatorImpl
