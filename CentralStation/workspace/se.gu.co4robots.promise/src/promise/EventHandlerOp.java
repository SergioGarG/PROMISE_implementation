/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.EventHandlerOp#getInputEvents <em>Input Events</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getEventHandlerOp()
 * @model
 * @generated
 */
public interface EventHandlerOp extends CompositionOperator {
	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' reference list.
	 * The list contents are of type {@link promise.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' reference list.
	 * @see promise.PromisePackage#getEventHandlerOp_InputEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getInputEvents();

} // EventHandlerOp
