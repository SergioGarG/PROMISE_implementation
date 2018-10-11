/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.ParallelOp;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parallel Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParallelOpTest extends CompositionOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParallelOpTest.class);
	}

	/**
	 * Constructs a new Parallel Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parallel Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParallelOp getFixture() {
		return (ParallelOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createParallelOp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParallelOpTest
