/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.SequencedPatrolling;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequenced Patrolling</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencedPatrollingTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequencedPatrollingTest.class);
	}

	/**
	 * Constructs a new Sequenced Patrolling test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencedPatrollingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequenced Patrolling test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequencedPatrolling getFixture() {
		return (SequencedPatrolling)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createSequencedPatrolling());
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

} //SequencedPatrollingTest
