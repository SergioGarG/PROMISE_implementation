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

} // Operator
