/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.StrictOrderedVisit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strict Ordered Visit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrictOrderedVisitTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StrictOrderedVisitTest.class);
	}

	/**
	 * Constructs a new Strict Ordered Visit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictOrderedVisitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Strict Ordered Visit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StrictOrderedVisit getFixture() {
		return (StrictOrderedVisit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createStrictOrderedVisit());
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

} //StrictOrderedVisitTest
