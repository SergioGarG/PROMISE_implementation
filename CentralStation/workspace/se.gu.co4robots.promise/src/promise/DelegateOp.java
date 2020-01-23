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
 *   <li>{@link promise.DelegateOp#getTask <em>Task</em>}</li>
 *   <li>{@link promise.DelegateOp#getInputAction <em>Input Action</em>}</li>
 *   <li>{@link promise.DelegateOp#getStoppingEvent <em>Stopping Event</em>}</li>
 *   <li>{@link promise.DelegateOp#getInputLocations <em>Input Locations</em>}</li>
 *   <li>{@link promise.DelegateOp#getInputResource <em>Input Resource</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getDelegateOp()
 * @model
 * @generated
 */
public interface DelegateOp extends Operator {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Tasks)
	 * @see promise.PromisePackage#getDelegateOp_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tasks getTask();

	/**
	 * Sets the value of the '{@link promise.DelegateOp#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Tasks value);

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

	/**
	 * Returns the value of the '<em><b>Input Resource</b></em>' reference list.
	 * The list contents are of type {@link promise.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Resource</em>' reference list.
	 * @see promise.PromisePackage#getDelegateOp_InputResource()
	 * @model
	 * @generated
	 */
	EList<Action> getInputResource();

} // DelegateOp
