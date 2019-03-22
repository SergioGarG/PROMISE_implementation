/**
 */
package promise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.EventAssignment#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link promise.EventAssignment#getInputOperators <em>Input Operators</em>}</li>
 *   <li>{@link promise.EventAssignment#getParent_event <em>Parent event</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getEventAssignment()
 * @model
 * @generated
 */
public interface EventAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' reference.
	 * @see #setInputEvent(Event)
	 * @see promise.PromisePackage#getEventAssignment_InputEvent()
	 * @model
	 * @generated
	 */
	Event getInputEvent();

	/**
	 * Sets the value of the '{@link promise.EventAssignment#getInputEvent <em>Input Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' reference.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Input Operators</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link promise.Operator#getEventAssigned <em>Event Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Operators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Operators</em>' containment reference.
	 * @see #setInputOperators(Operator)
	 * @see promise.PromisePackage#getEventAssignment_InputOperators()
	 * @see promise.Operator#getEventAssigned
	 * @model opposite="eventAssigned" containment="true"
	 * @generated
	 */
	Operator getInputOperators();

	/**
	 * Sets the value of the '{@link promise.EventAssignment#getInputOperators <em>Input Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Operators</em>' containment reference.
	 * @see #getInputOperators()
	 * @generated
	 */
	void setInputOperators(Operator value);

	/**
	 * Returns the value of the '<em><b>Parent event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link promise.EventBasedOperator#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent event</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent event</em>' container reference.
	 * @see #setParent_event(EventBasedOperator)
	 * @see promise.PromisePackage#getEventAssignment_Parent_event()
	 * @see promise.EventBasedOperator#getInputEvents
	 * @model opposite="inputEvents" transient="false"
	 * @generated
	 */
	EventBasedOperator getParent_event();

	/**
	 * Sets the value of the '{@link promise.EventAssignment#getParent_event <em>Parent event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent event</em>' container reference.
	 * @see #getParent_event()
	 * @generated
	 */
	void setParent_event(EventBasedOperator value);

} // EventAssignment
