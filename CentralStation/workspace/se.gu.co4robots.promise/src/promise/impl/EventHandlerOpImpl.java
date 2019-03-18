/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import promise.Event;
import promise.EventHandlerOp;
import promise.PromisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Handler Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.EventHandlerOpImpl#getInputEvents <em>Input Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventHandlerOpImpl extends CompositionOperatorImpl implements EventHandlerOp {
	/**
	 * The cached value of the '{@link #getInputEvents() <em>Input Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> inputEvents;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.EVENT_HANDLER_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getInputEvents() {
		if (inputEvents == null) {
			inputEvents = new EObjectResolvingEList<Event>(Event.class, this, PromisePackage.EVENT_HANDLER_OP__INPUT_EVENTS);
		}
		return inputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromisePackage.EVENT_HANDLER_OP__INPUT_EVENTS:
				return getInputEvents();
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
			case PromisePackage.EVENT_HANDLER_OP__INPUT_EVENTS:
				getInputEvents().clear();
				getInputEvents().addAll((Collection<? extends Event>)newValue);
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
			case PromisePackage.EVENT_HANDLER_OP__INPUT_EVENTS:
				getInputEvents().clear();
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
			case PromisePackage.EVENT_HANDLER_OP__INPUT_EVENTS:
				return inputEvents != null && !inputEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventHandlerOpImpl
