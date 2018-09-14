/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.LowerRestrictedAvoidance;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Restricted Avoidance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerRestrictedAvoidanceTest extends AvoidancePatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowerRestrictedAvoidanceTest.class);
	}

	/**
	 * Constructs a new Lower Restricted Avoidance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerRestrictedAvoidanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lower Restricted Avoidance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LowerRestrictedAvoidance getFixture() {
		return (LowerRestrictedAvoidance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createLowerRestrictedAvoidance());
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

} //LowerRestrictedAvoidanceTest
