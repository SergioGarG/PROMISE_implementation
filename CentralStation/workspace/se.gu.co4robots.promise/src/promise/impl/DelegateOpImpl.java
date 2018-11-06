/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import promise.Action;
import promise.DelegateOp;
import promise.Event;
import promise.Location;
import promise.Pattern;
import promise.PromisePackage;
import promise.Robot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegate Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputRobot <em>Input Robot</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputAction <em>Input Action</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getStoppingEvent <em>Stopping Event</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputLocations <em>Input Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegateOpImpl extends OperatorImpl implements DelegateOp {
	/**
	 * The cached value of the '{@link #getInputRobot() <em>Input Robot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRobot()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> inputRobot;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

	/**
	 * The cached value of the '{@link #getInputAction() <em>Input Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> inputAction;

	/**
	 * The cached value of the '{@link #getStoppingEvent() <em>Stopping Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppingEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> stoppingEvent;

	/**
	 * The cached value of the '{@link #getInputLocations() <em>Input Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> inputLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegateOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.DELEGATE_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Robot> getInputRobot() {
		if (inputRobot == null) {
			inputRobot = new EObjectResolvingEList<Robot>(Robot.class, this, PromisePackage.DELEGATE_OP__INPUT_ROBOT);
		}
		return inputRobot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PromisePackage.DELEGATE_OP__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PromisePackage.DELEGATE_OP__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PromisePackage.DELEGATE_OP__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.DELEGATE_OP__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getInputAction() {
		if (inputAction == null) {
			inputAction = new EObjectResolvingEList<Action>(Action.class, this, PromisePackage.DELEGATE_OP__INPUT_ACTION);
		}
		return inputAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getStoppingEvent() {
		if (stoppingEvent == null) {
			stoppingEvent = new EObjectResolvingEList<Event>(Event.class, this, PromisePackage.DELEGATE_OP__STOPPING_EVENT);
		}
		return stoppingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getInputLocations() {
		if (inputLocations == null) {
			inputLocations = new EObjectResolvingEList<Location>(Location.class, this, PromisePackage.DELEGATE_OP__INPUT_LOCATIONS);
		}
		return inputLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.DELEGATE_OP__PATTERN:
				return basicSetPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromisePackage.DELEGATE_OP__INPUT_ROBOT:
				return getInputRobot();
			case PromisePackage.DELEGATE_OP__PATTERN:
				return getPattern();
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				return getInputAction();
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				return getStoppingEvent();
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				return getInputLocations();
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
			case PromisePackage.DELEGATE_OP__INPUT_ROBOT:
				getInputRobot().clear();
				getInputRobot().addAll((Collection<? extends Robot>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				getInputAction().clear();
				getInputAction().addAll((Collection<? extends Action>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				getStoppingEvent().clear();
				getStoppingEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				getInputLocations().clear();
				getInputLocations().addAll((Collection<? extends Location>)newValue);
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
			case PromisePackage.DELEGATE_OP__INPUT_ROBOT:
				getInputRobot().clear();
				return;
			case PromisePackage.DELEGATE_OP__PATTERN:
				setPattern((Pattern)null);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				getInputAction().clear();
				return;
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				getStoppingEvent().clear();
				return;
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				getInputLocations().clear();
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
			case PromisePackage.DELEGATE_OP__INPUT_ROBOT:
				return inputRobot != null && !inputRobot.isEmpty();
			case PromisePackage.DELEGATE_OP__PATTERN:
				return pattern != null;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				return inputAction != null && !inputAction.isEmpty();
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				return stoppingEvent != null && !stoppingEvent.isEmpty();
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				return inputLocations != null && !inputLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DelegateOpImpl
