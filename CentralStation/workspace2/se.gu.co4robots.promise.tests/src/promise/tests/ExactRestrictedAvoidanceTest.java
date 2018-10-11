/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.ExactRestrictedAvoidance;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exact Restricted Avoidance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExactRestrictedAvoidanceTest extends AvoidancePatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExactRestrictedAvoidanceTest.class);
	}

	/**
	 * Constructs a new Exact Restricted Avoidance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactRestrictedAvoidanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exact Restricted Avoidance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExactRestrictedAvoidance getFixture() {
		return (ExactRestrictedAvoidance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createExactRestrictedAvoidance());
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

} //ExactRestrictedAvoidanceTest
