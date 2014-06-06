package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchWinnerEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupFirstTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupSecondTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchAwayEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchHomeEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamAtGroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.WorldCupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014DiagramEditorPlugin;

/**
 * @generated
 */
public class Wc2014ElementTypes {

	/**
	 * @generated
	 */
	private Wc2014ElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Wc2014DiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType WorldCup_1000 = getElementType("edu.thu.ggxx.hellobrazil.diagram.WorldCup_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EliminationMatch_2001 = getElementType("edu.thu.ggxx.hellobrazil.diagram.EliminationMatch_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Team_2002 = getElementType("edu.thu.ggxx.hellobrazil.diagram.Team_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2003 = getElementType("edu.thu.ggxx.hellobrazil.diagram.Group_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupMatch_2004 = getElementType("edu.thu.ggxx.hellobrazil.diagram.GroupMatch_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupFirstTeam_4001 = getElementType("edu.thu.ggxx.hellobrazil.diagram.GroupFirstTeam_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchHome_4002 = getElementType("edu.thu.ggxx.hellobrazil.diagram.MatchHome_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupSecondTeam_4003 = getElementType("edu.thu.ggxx.hellobrazil.diagram.GroupSecondTeam_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchAway_4004 = getElementType("edu.thu.ggxx.hellobrazil.diagram.MatchAway_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TeamAtGroup_4005 = getElementType("edu.thu.ggxx.hellobrazil.diagram.TeamAtGroup_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EliminationMatchWinner_4006 = getElementType("edu.thu.ggxx.hellobrazil.diagram.EliminationMatchWinner_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WorldCup_1000, Wc2014Package.eINSTANCE.getWorldCup());

			elements.put(EliminationMatch_2001,
					Wc2014Package.eINSTANCE.getEliminationMatch());

			elements.put(Team_2002, Wc2014Package.eINSTANCE.getTeam());

			elements.put(Group_2003, Wc2014Package.eINSTANCE.getGroup());

			elements.put(GroupMatch_2004,
					Wc2014Package.eINSTANCE.getGroupMatch());

			elements.put(GroupFirstTeam_4001,
					Wc2014Package.eINSTANCE.getGroup_FirstTeam());

			elements.put(MatchHome_4002,
					Wc2014Package.eINSTANCE.getMatch_Home());

			elements.put(GroupSecondTeam_4003,
					Wc2014Package.eINSTANCE.getGroup_SecondTeam());

			elements.put(MatchAway_4004,
					Wc2014Package.eINSTANCE.getMatch_Away());

			elements.put(TeamAtGroup_4005,
					Wc2014Package.eINSTANCE.getTeam_AtGroup());

			elements.put(EliminationMatchWinner_4006,
					Wc2014Package.eINSTANCE.getEliminationMatch_Winner());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WorldCup_1000);
			KNOWN_ELEMENT_TYPES.add(EliminationMatch_2001);
			KNOWN_ELEMENT_TYPES.add(Team_2002);
			KNOWN_ELEMENT_TYPES.add(Group_2003);
			KNOWN_ELEMENT_TYPES.add(GroupMatch_2004);
			KNOWN_ELEMENT_TYPES.add(GroupFirstTeam_4001);
			KNOWN_ELEMENT_TYPES.add(MatchHome_4002);
			KNOWN_ELEMENT_TYPES.add(GroupSecondTeam_4003);
			KNOWN_ELEMENT_TYPES.add(MatchAway_4004);
			KNOWN_ELEMENT_TYPES.add(TeamAtGroup_4005);
			KNOWN_ELEMENT_TYPES.add(EliminationMatchWinner_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorldCupEditPart.VISUAL_ID:
			return WorldCup_1000;
		case EliminationMatchEditPart.VISUAL_ID:
			return EliminationMatch_2001;
		case TeamEditPart.VISUAL_ID:
			return Team_2002;
		case GroupEditPart.VISUAL_ID:
			return Group_2003;
		case GroupMatchEditPart.VISUAL_ID:
			return GroupMatch_2004;
		case GroupFirstTeamEditPart.VISUAL_ID:
			return GroupFirstTeam_4001;
		case MatchHomeEditPart.VISUAL_ID:
			return MatchHome_4002;
		case GroupSecondTeamEditPart.VISUAL_ID:
			return GroupSecondTeam_4003;
		case MatchAwayEditPart.VISUAL_ID:
			return MatchAway_4004;
		case TeamAtGroupEditPart.VISUAL_ID:
			return TeamAtGroup_4005;
		case EliminationMatchWinnerEditPart.VISUAL_ID:
			return EliminationMatchWinner_4006;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
