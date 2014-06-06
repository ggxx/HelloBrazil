/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.tests;

import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Factory;
import edu.thu.ggxx.hellobrazil.wc2014.WorldCup;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>World Cup</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldCupTest extends TestCase {

	/**
	 * The fixture for this World Cup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorldCupTest.class);
	}

	/**
	 * Constructs a new World Cup test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldCupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this World Cup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorldCup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this World Cup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Wc2014Factory.eINSTANCE.createWorldCup());
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

} //WorldCupTest
