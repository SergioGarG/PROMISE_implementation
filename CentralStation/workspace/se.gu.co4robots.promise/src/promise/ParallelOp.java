/**
 */
package promise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.ParallelOp#getInputRobots <em>Input Robots</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getParallelOp()
 * @model
 * @generated
 */
public interface ParallelOp extends CompositionOperator {
	/**
	 * Returns the value of the '<em><b>Input Robots</b></em>' reference list.
	 * The list contents are of type {@link promise.Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Robots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Robots</em>' reference list.
	 * @see promise.PromisePackage#getParallelOp_InputRobots()
	 * @model
	 * @generated
	 */
	EList<Robot> getInputRobots();

} // ParallelOp
