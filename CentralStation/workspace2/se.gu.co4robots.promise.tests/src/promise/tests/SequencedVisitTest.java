/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.SequencedVisit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequenced Visit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencedVisitTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequencedVisitTest.class);
	}

	/**
	 * Constructs a new Sequenced Visit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencedVisitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequenced Visit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequencedVisit getFixture() {
		return (SequencedVisit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createSequencedVisit());
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

} //SequencedVisitTest
