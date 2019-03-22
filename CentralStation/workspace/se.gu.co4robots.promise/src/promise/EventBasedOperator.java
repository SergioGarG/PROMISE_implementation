/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.EventBasedOperator#getInputEvents <em>Input Events</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getEventBasedOperator()
 * @model abstract="true"
 * @generated
 */
public interface EventBasedOperator extends CompositionOperator {
	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' containment reference list.
	 * The list contents are of type {@link promise.EventAssignment}.
	 * It is bidirectional and its opposite is '{@link promise.EventAssignment#getParent_event <em>Parent event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' containment reference list.
	 * @see promise.PromisePackage#getEventBasedOperator_InputEvents()
	 * @see promise.EventAssignment#getParent_event
	 * @model opposite="parent_event" containment="true"
	 * @generated
	 */
	EList<EventAssignment> getInputEvents();

} // EventBasedOperator
