/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import promise.ParallelOp;
import promise.PromisePackage;
import promise.Robot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.ParallelOpImpl#getInputRobots <em>Input Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelOpImpl extends CompositionOperatorImpl implements ParallelOp {
	/**
	 * The cached value of the '{@link #getInputRobots() <em>Input Robots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> inputRobots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.PARALLEL_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robot> getInputRobots() {
		if (inputRobots == null) {
			inputRobots = new EObjectResolvingEList<Robot>(Robot.class, this, PromisePackage.PARALLEL_OP__INPUT_ROBOTS);
		}
		return inputRobots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromisePackage.PARALLEL_OP__INPUT_ROBOTS:
				return getInputRobots();
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
			case PromisePackage.PARALLEL_OP__INPUT_ROBOTS:
				getInputRobots().clear();
				getInputRobots().addAll((Collection<? extends Robot>)newValue);
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
			case PromisePackage.PARALLEL_OP__INPUT_ROBOTS:
				getInputRobots().clear();
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
			case PromisePackage.PARALLEL_OP__INPUT_ROBOTS:
				return inputRobots != null && !inputRobots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParallelOpImpl
