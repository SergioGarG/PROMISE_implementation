/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.FutureAvoidance;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Future Avoidance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FutureAvoidanceTest extends AvoidancePatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FutureAvoidanceTest.class);
	}

	/**
	 * Constructs a new Future Avoidance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FutureAvoidanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Future Avoidance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FutureAvoidance getFixture() {
		return (FutureAvoidance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createFutureAvoidance());
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

} //FutureAvoidanceTest
