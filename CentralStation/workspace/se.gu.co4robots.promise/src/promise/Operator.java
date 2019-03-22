/**
 */
package promise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.Operator#getParent <em>Parent</em>}</li>
 *   <li>{@link promise.Operator#getEventAssigned <em>Event Assigned</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link promise.CompositionOperator#getInputOperators <em>Input Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositionOperator)
	 * @see promise.PromisePackage#getOperator_Parent()
	 * @see promise.CompositionOperator#getInputOperators
	 * @model opposite="inputOperators" transient="false"
	 * @generated
	 */
	CompositionOperator getParent();

	/**
	 * Sets the value of the '{@link promise.Operator#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositionOperator value);

	/**
	 * Returns the value of the '<em><b>Event Assigned</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link promise.EventAssignment#getInputOperators <em>Input Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Assigned</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Assigned</em>' container reference.
	 * @see #setEventAssigned(EventAssignment)
	 * @see promise.PromisePackage#getOperator_EventAssigned()
	 * @see promise.EventAssignment#getInputOperators
	 * @model opposite="inputOperators" transient="false"
	 * @generated
	 */
	EventAssignment getEventAssigned();

	/**
	 * Sets the value of the '{@link promise.Operator#getEventAssigned <em>Event Assigned</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Assigned</em>' container reference.
	 * @see #getEventAssigned()
	 * @generated
	 */
	void setEventAssigned(EventAssignment value);

} // Operator
