/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.Context#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference list.
	 * @see promise.PromisePackage#getContext_Robot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getRobot();

} // Context
