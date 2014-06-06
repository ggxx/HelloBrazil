/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Cup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getYear <em>Year</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getTeams <em>Teams</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getMatches <em>Matches</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getWorldCup()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WorldCup extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getWorldCup_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link edu.thu.ggxx.hellobrazil.wc2014.Team}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getWorldCup_Teams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link edu.thu.ggxx.hellobrazil.wc2014.Match}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getWorldCup_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link edu.thu.ggxx.hellobrazil.wc2014.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getWorldCup_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

} // WorldCup
