/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.CompositionOperator#getInputOperators <em>Input Operators</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getCompositionOperator()
 * @model abstract="true"
 * @generated
 */
public interface CompositionOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Input Operators</b></em>' containment reference list.
	 * The list contents are of type {@link promise.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Operators</em>' containment reference list.
	 * @see promise.PromisePackage#getCompositionOperator_InputOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operator> getInputOperators();

} // CompositionOperator
