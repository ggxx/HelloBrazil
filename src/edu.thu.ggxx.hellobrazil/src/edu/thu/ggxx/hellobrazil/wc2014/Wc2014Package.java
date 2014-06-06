/**
 */
package edu.thu.ggxx.hellobrazil.wc2014;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.thu.ggxx.hellobrazil.wc2014.Wc2014Factory
 * @model kind="package"
 * @generated
 */
public interface Wc2014Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wc2014";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.thu.ggxx.hellobrazil.wc2014/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wc2014";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Wc2014Package eINSTANCE = edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl <em>World Cup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getWorldCup()
	 * @generated
	 */
	int WORLD_CUP = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__MATCHES = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__GROUPS = 3;

	/**
	 * The number of structural features of the '<em>World Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>World Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>At Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__AT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__FLAG = 2;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 2;

	/**
	 * The feature id for the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME = 0;

	/**
	 * The feature id for the '<em><b>Away</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = 2;

	/**
	 * The feature id for the '<em><b>Match Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_DATE = 3;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORES = 4;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__STADIUM = 5;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupMatchImpl <em>Group Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.GroupMatchImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getGroupMatch()
	 * @generated
	 */
	int GROUP_MATCH = 3;

	/**
	 * The feature id for the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__HOME = MATCH__HOME;

	/**
	 * The feature id for the '<em><b>Away</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__AWAY = MATCH__AWAY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__ID = MATCH__ID;

	/**
	 * The feature id for the '<em><b>Match Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__MATCH_DATE = MATCH__MATCH_DATE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__SCORES = MATCH__SCORES;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH__STADIUM = MATCH__STADIUM;

	/**
	 * The number of structural features of the '<em>Group Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH_FEATURE_COUNT = MATCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MATCH_OPERATION_COUNT = MATCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.EliminationMatchImpl <em>Elimination Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.EliminationMatchImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getEliminationMatch()
	 * @generated
	 */
	int ELIMINATION_MATCH = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__HOME = MATCH__HOME;

	/**
	 * The feature id for the '<em><b>Away</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__AWAY = MATCH__AWAY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__ID = MATCH__ID;

	/**
	 * The feature id for the '<em><b>Match Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__MATCH_DATE = MATCH__MATCH_DATE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__SCORES = MATCH__SCORES;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__STADIUM = MATCH__STADIUM;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH__WINNER = MATCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elimination Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH_FEATURE_COUNT = MATCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elimination Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_MATCH_OPERATION_COUNT = MATCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl
	 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_NAME = 0;

	/**
	 * The feature id for the '<em><b>First Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FIRST_TEAM = 1;

	/**
	 * The feature id for the '<em><b>Second Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SECOND_TEAM = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup <em>World Cup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Cup</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.WorldCup
	 * @generated
	 */
	EClass getWorldCup();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getYear()
	 * @see #getWorldCup()
	 * @generated
	 */
	EAttribute getWorldCup_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getTeams()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getMatches()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Matches();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.WorldCup#getGroups()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Groups();

	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Team#getCountry()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Country();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getAtGroup <em>At Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At Group</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Team#getAtGroup()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_AtGroup();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Team#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Team#getFlag()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Flag();

	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getHome()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Home();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getAway <em>Away</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getAway()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Away();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getId()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getMatchDate <em>Match Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Date</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getMatchDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_MatchDate();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scores</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getScores()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Scores();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Match#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stadium</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Match#getStadium()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Stadium();

	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.GroupMatch <em>Group Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Match</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.GroupMatch
	 * @generated
	 */
	EClass getGroupMatch();

	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch <em>Elimination Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elimination Match</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch
	 * @generated
	 */
	EClass getEliminationMatch();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winner</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch#getWinner()
	 * @see #getEliminationMatch()
	 * @generated
	 */
	EReference getEliminationMatch_Winner();

	/**
	 * Returns the meta object for class '{@link edu.thu.ggxx.hellobrazil.wc2014.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Group#getGroupName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_GroupName();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getFirstTeam <em>First Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Team</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Group#getFirstTeam()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_FirstTeam();

	/**
	 * Returns the meta object for the reference '{@link edu.thu.ggxx.hellobrazil.wc2014.Group#getSecondTeam <em>Second Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Team</em>'.
	 * @see edu.thu.ggxx.hellobrazil.wc2014.Group#getSecondTeam()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SecondTeam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Wc2014Factory getWc2014Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl <em>World Cup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getWorldCup()
		 * @generated
		 */
		EClass WORLD_CUP = eINSTANCE.getWorldCup();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_CUP__YEAR = eINSTANCE.getWorldCup_Year();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__TEAMS = eINSTANCE.getWorldCup_Teams();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__MATCHES = eINSTANCE.getWorldCup_Matches();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__GROUPS = eINSTANCE.getWorldCup_Groups();

		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__COUNTRY = eINSTANCE.getTeam_Country();

		/**
		 * The meta object literal for the '<em><b>At Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__AT_GROUP = eINSTANCE.getTeam_AtGroup();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__FLAG = eINSTANCE.getTeam_Flag();

		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME = eINSTANCE.getMatch_Home();

		/**
		 * The meta object literal for the '<em><b>Away</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY = eINSTANCE.getMatch_Away();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ID = eINSTANCE.getMatch_Id();

		/**
		 * The meta object literal for the '<em><b>Match Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MATCH_DATE = eINSTANCE.getMatch_MatchDate();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SCORES = eINSTANCE.getMatch_Scores();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__STADIUM = eINSTANCE.getMatch_Stadium();

		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupMatchImpl <em>Group Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.GroupMatchImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getGroupMatch()
		 * @generated
		 */
		EClass GROUP_MATCH = eINSTANCE.getGroupMatch();

		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.EliminationMatchImpl <em>Elimination Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.EliminationMatchImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getEliminationMatch()
		 * @generated
		 */
		EClass ELIMINATION_MATCH = eINSTANCE.getEliminationMatch();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELIMINATION_MATCH__WINNER = eINSTANCE.getEliminationMatch_Winner();

		/**
		 * The meta object literal for the '{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl
		 * @see edu.thu.ggxx.hellobrazil.wc2014.impl.Wc2014PackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__GROUP_NAME = eINSTANCE.getGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>First Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__FIRST_TEAM = eINSTANCE.getGroup_FirstTeam();

		/**
		 * The meta object literal for the '<em><b>Second Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SECOND_TEAM = eINSTANCE.getGroup_SecondTeam();

	}

} //Wc2014Package
