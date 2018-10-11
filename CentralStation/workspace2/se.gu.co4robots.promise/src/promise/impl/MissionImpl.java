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

import promise.Condition;
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
 *   <li>{@link promise.impl.MissionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link promise.impl.MissionImpl#getLocation <em>Location</em>}</li>
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
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

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
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, PromisePackage.MISSION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, PromisePackage.MISSION__LOCATION);
		}
		return location;
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
			case PromisePackage.MISSION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__ROBOTS:
				return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
			case PromisePackage.MISSION__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case PromisePackage.MISSION__CONDITIONS:
				return getConditions();
			case PromisePackage.MISSION__ROBOTS:
				return getRobots();
			case PromisePackage.MISSION__LOCATION:
				return getLocation();
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
			case PromisePackage.MISSION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case PromisePackage.MISSION__ROBOTS:
				getRobots().clear();
				getRobots().addAll((Collection<? extends Robot>)newValue);
				return;
			case PromisePackage.MISSION__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
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
			case PromisePackage.MISSION__CONDITIONS:
				getConditions().clear();
				return;
			case PromisePackage.MISSION__ROBOTS:
				getRobots().clear();
				return;
			case PromisePackage.MISSION__LOCATION:
				getLocation().clear();
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
			case PromisePackage.MISSION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case PromisePackage.MISSION__ROBOTS:
				return robots != null && !robots.isEmpty();
			case PromisePackage.MISSION__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionImpl
