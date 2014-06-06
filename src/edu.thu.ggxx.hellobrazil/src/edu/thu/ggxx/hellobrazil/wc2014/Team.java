/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getCountry <em>Country</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getAtGroup <em>At Group</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getTeam()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Team extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getTeam_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>At Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Group</em>' reference.
	 * @see #setAtGroup(Group)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getTeam_AtGroup()
	 * @model
	 * @generated
	 */
	Group getAtGroup();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getAtGroup <em>At Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Group</em>' reference.
	 * @see #getAtGroup()
	 * @generated
	 */
	void setAtGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' attribute.
	 * @see #setFlag(String)
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package#getTeam_Flag()
	 * @model
	 * @generated
	 */
	String getFlag();

	/**
	 * Sets the value of the '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getFlag <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' attribute.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(String value);

} // Team
