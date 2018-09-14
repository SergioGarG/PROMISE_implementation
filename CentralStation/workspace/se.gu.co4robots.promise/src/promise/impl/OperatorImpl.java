/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import promise.Event;
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
 *   <li>{@link promise.impl.OperatorImpl#getAffectingEvent <em>Affecting Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends MinimalEObjectImpl.Container implements Operator {
	/**
	 * The cached value of the '{@link #getAffectingEvent() <em>Affecting Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectingEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> affectingEvent;

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
	public EList<Event> getAffectingEvent() {
		if (affectingEvent == null) {
			affectingEvent = new EObjectResolvingEList<Event>(Event.class, this, PromisePackage.OPERATOR__AFFECTING_EVENT);
		}
		return affectingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromisePackage.OPERATOR__AFFECTING_EVENT:
				return getAffectingEvent();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PromisePackage.OPERATOR__AFFECTING_EVENT:
				getAffectingEvent().clear();
				getAffectingEvent().addAll((Collection<? extends Event>)newValue);
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
			case PromisePackage.OPERATOR__AFFECTING_EVENT:
				getAffectingEvent().clear();
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
			case PromisePackage.OPERATOR__AFFECTING_EVENT:
				return affectingEvent != null && !affectingEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperatorImpl
