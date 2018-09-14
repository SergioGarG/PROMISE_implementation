/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.Mission#getOperator <em>Operator</em>}</li>
 *   <li>{@link promise.Mission#getConditions <em>Conditions</em>}</li>
 *   <li>{@link promise.Mission#getRobots <em>Robots</em>}</li>
 *   <li>{@link promise.Mission#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference list.
	 * @see promise.PromisePackage#getMission_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operator> getOperator();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see promise.PromisePackage#getMission_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see promise.PromisePackage#getMission_Robots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Robot> getRobots();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see promise.PromisePackage#getMission_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Location> getLocation();

} // Mission
