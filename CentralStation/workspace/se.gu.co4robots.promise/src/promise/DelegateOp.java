/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegate Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.DelegateOp#getInputRobot <em>Input Robot</em>}</li>
 *   <li>{@link promise.DelegateOp#getPattern <em>Pattern</em>}</li>
 *   <li>{@link promise.DelegateOp#getInputAction <em>Input Action</em>}</li>
 *   <li>{@link promise.DelegateOp#getStoppingEvent <em>Stopping Event</em>}</li>
 *   <li>{@link promise.DelegateOp#getInputLocations <em>Input Locations</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getDelegateOp()
 * @model
 * @generated
 */
public interface DelegateOp extends Operator {
	/**
	 * Returns the value of the '<em><b>Input Robot</b></em>' reference list.
	 * The list contents are of type {@link promise.Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Robot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Robot</em>' reference list.
	 * @see promise.PromisePackage#getDelegateOp_InputRobot()
	 * @model required="true"
	 * @generated
	 */
	EList<Robot> getInputRobot();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see promise.PromisePackage#getDelegateOp_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link promise.DelegateOp#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Input Action</b></em>' reference list.
	 * The list contents are of type {@link promise.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Action</em>' reference list.
	 * @see promise.PromisePackage#getDelegateOp_InputAction()
	 * @model
	 * @generated
	 */
	EList<Action> getInputAction();

	/**
	 * Returns the value of the '<em><b>Stopping Event</b></em>' reference list.
	 * The list contents are of type {@link promise.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stopping Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopping Event</em>' reference list.
	 * @see promise.PromisePackage#getDelegateOp_StoppingEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getStoppingEvent();

	/**
	 * Returns the value of the '<em><b>Input Locations</b></em>' reference list.
	 * The list contents are of type {@link promise.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Locations</em>' reference list.
	 * @see promise.PromisePackage#getDelegateOp_InputLocations()
	 * @model
	 * @generated
	 */
	EList<Location> getInputLocations();

} // DelegateOp
