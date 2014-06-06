/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.tests;

import edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elimination Match</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EliminationMatchTest extends MatchTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EliminationMatchTest.class);
	}

	/**
	 * Constructs a new Elimination Match test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EliminationMatchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elimination Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EliminationMatch getFixture() {
		return (EliminationMatch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Wc2014Factory.eINSTANCE.createEliminationMatch());
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

} //EliminationMatchTest
