/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getHome <em>Home</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getAway <em>Away</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getId <em>Id</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getMatchDate <em>Match Date</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getScores <em>Scores</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getStadium <em>Stadium</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Match extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' reference.
	 * @see #setHome(Team)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_Home()
	 * @model
	 * @generated
	 */
	Team getHome();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getHome <em>Home</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(Team value);

	/**
	 * Returns the value of the '<em><b>Away</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Away</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away</em>' reference.
	 * @see #setAway(Team)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_Away()
	 * @model
	 * @generated
	 */
	Team getAway();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getAway <em>Away</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away</em>' reference.
	 * @see #getAway()
	 * @generated
	 */
	void setAway(Team value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Match Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Date</em>' attribute.
	 * @see #setMatchDate(Date)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_MatchDate()
	 * @model
	 * @generated
	 */
	Date getMatchDate();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getMatchDate <em>Match Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Date</em>' attribute.
	 * @see #getMatchDate()
	 * @generated
	 */
	void setMatchDate(Date value);

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' attribute.
	 * @see #setScores(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_Scores()
	 * @model
	 * @generated
	 */
	String getScores();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getScores <em>Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scores</em>' attribute.
	 * @see #getScores()
	 * @generated
	 */
	void setScores(String value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadium</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' attribute.
	 * @see #setStadium(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getMatch_Stadium()
	 * @model
	 * @generated
	 */
	String getStadium();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getStadium <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' attribute.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(String value);

} // Match
