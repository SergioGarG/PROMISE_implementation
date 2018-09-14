/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.StrictOreredPatrolling;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strict Orered Patrolling</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrictOreredPatrollingTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StrictOreredPatrollingTest.class);
	}

	/**
	 * Constructs a new Strict Orered Patrolling test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictOreredPatrollingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Strict Orered Patrolling test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StrictOreredPatrolling getFixture() {
		return (StrictOreredPatrolling)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createStrictOreredPatrolling());
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

} //StrictOreredPatrollingTest
