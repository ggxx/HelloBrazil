/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elimination Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch#getWinner <em>Winner</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getEliminationMatch()
 * @model
 * @generated
 */
public interface EliminationMatch extends Match {
	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Team)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getEliminationMatch_Winner()
	 * @model
	 * @generated
	 */
	Team getWinner();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Team value);

} // EliminationMatch
