/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import promise.Action;
import promise.Event;
import promise.EventAssignment;
import promise.Location;
import promise.Mission;
import promise.Operator;
import promise.PromisePackage;
import promise.Robot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.MissionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getEventassignment <em>Eventassignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operator;

	/**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> robots;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getEventassignment() <em>Eventassignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventassignment()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAssignment> eventassignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperator() {
		if (operator == null) {
			operator = new EObjectContainmentEList<Operator>(Operator.class, this, PromisePackage.MISSION__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robot> getRobots() {
		if (robots == null) {
			robots = new EObjectContainmentEList<Robot>(Robot.class, this, PromisePackage.MISSION__ROBOTS);
		}
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, PromisePackage.MISSION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, PromisePackage.MISSION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, PromisePackage.MISSION__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventAssignment> getEventassignment() {
		if (eventassignment == null) {
			eventassignment = new EObjectContainmentEList<EventAssignment>(EventAssignment.class, this, PromisePackage.MISSION__EVENTASSIGNMENT);
		}
		return eventassignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.MISSION__OPERATOR:
				return ((InternalEList<?>)getOperator()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__ROBOTS:
				return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__EVENTASSIGNMENT:
				return ((InternalEList<?>)getEventassignment()).basicRemove(otherEnd, msgs);
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
			case PromisePackage.MISSION__OPERATOR:
				return getOperator();
			case PromisePackage.MISSION__ROBOTS:
				return getRobots();
			case PromisePackage.MISSION__ACTIONS:
				return getActions();
			case PromisePackage.MISSION__EVENTS:
				return getEvents();
			case PromisePackage.MISSION__LOCATIONS:
				return getLocations();
			case PromisePackage.MISSION__EVENTASSIGNMENT:
				return getEventassignment();
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
			case PromisePackage.MISSION__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends Operator>)newValue);
				return;
			case PromisePackage.MISSION__ROBOTS:
				getRobots().clear();
				getRobots().addAll((Collection<? extends Robot>)newValue);
				return;
			case PromisePackage.MISSION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PromisePackage.MISSION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case PromisePackage.MISSION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case PromisePackage.MISSION__EVENTASSIGNMENT:
				getEventassignment().clear();
				getEventassignment().addAll((Collection<? extends EventAssignment>)newValue);
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
			case PromisePackage.MISSION__OPERATOR:
				getOperator().clear();
				return;
			case PromisePackage.MISSION__ROBOTS:
				getRobots().clear();
				return;
			case PromisePackage.MISSION__ACTIONS:
				getActions().clear();
				return;
			case PromisePackage.MISSION__EVENTS:
				getEvents().clear();
				return;
			case PromisePackage.MISSION__LOCATIONS:
				getLocations().clear();
				return;
			case PromisePackage.MISSION__EVENTASSIGNMENT:
				getEventassignment().clear();
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
			case PromisePackage.MISSION__OPERATOR:
				return operator != null && !operator.isEmpty();
			case PromisePackage.MISSION__ROBOTS:
				return robots != null && !robots.isEmpty();
			case PromisePackage.MISSION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PromisePackage.MISSION__EVENTS:
				return events != null && !events.isEmpty();
			case PromisePackage.MISSION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case PromisePackage.MISSION__EVENTASSIGNMENT:
				return eventassignment != null && !eventassignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionImpl
