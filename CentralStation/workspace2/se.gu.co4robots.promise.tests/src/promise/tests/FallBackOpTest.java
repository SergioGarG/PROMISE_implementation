/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.FallBackOp;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fall Back Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FallBackOpTest extends CompositionOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FallBackOpTest.class);
	}

	/**
	 * Constructs a new Fall Back Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FallBackOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fall Back Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FallBackOp getFixture() {
		return (FallBackOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createFallBackOp());
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

} //FallBackOpTest
