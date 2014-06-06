/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getFirstTeam <em>First Team</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getSecondTeam <em>Second Team</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getGroup()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Group extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getGroup_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>First Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Team</em>' reference.
	 * @see #setFirstTeam(Team)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getGroup_FirstTeam()
	 * @model
	 * @generated
	 */
	Team getFirstTeam();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getFirstTeam <em>First Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Team</em>' reference.
	 * @see #getFirstTeam()
	 * @generated
	 */
	void setFirstTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Second Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Team</em>' reference.
	 * @see #setSecondTeam(Team)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getGroup_SecondTeam()
	 * @model
	 * @generated
	 */
	Team getSecondTeam();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getSecondTeam <em>Second Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Team</em>' reference.
	 * @see #getSecondTeam()
	 * @generated
	 */
	void setSecondTeam(Team value);

} // Group
