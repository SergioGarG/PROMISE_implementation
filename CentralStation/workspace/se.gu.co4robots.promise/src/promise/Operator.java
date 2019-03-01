/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link promise.Operator#getAffectingEvent <em>Affecting Event</em>}</li>
 *   <li>{@link promise.Operator#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Affecting Event</b></em>' reference list.
	 * The list contents are of type {@link promise.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affecting Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affecting Event</em>' reference list.
	 * @see promise.PromisePackage#getOperator_AffectingEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getAffectingEvent();

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

} // Operator
