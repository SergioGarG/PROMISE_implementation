/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PastAvoidance;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Past Avoidance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PastAvoidanceTest extends AvoidancePatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PastAvoidanceTest.class);
	}

	/**
	 * Constructs a new Past Avoidance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastAvoidanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Past Avoidance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PastAvoidance getFixture() {
		return (PastAvoidance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createPastAvoidance());
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

} //PastAvoidanceTest
