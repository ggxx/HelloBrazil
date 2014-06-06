package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ModelingAssistantProvider;

/**
 * @generated
 */
public class Wc2014ModelingAssistantProviderOfTeamEditPart extends
		Wc2014ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TeamEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(TeamEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Wc2014ElementTypes.TeamAtGroup_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TeamEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TeamEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GroupEditPart) {
			types.add(Wc2014ElementTypes.TeamAtGroup_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TeamEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(TeamEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.TeamAtGroup_4005) {
			types.add(Wc2014ElementTypes.Group_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TeamEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(TeamEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(Wc2014ElementTypes.GroupFirstTeam_4001);
		types.add(Wc2014ElementTypes.MatchHome_4002);
		types.add(Wc2014ElementTypes.GroupSecondTeam_4003);
		types.add(Wc2014ElementTypes.MatchAway_4004);
		types.add(Wc2014ElementTypes.EliminationMatchWinner_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TeamEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(TeamEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.GroupFirstTeam_4001) {
			types.add(Wc2014ElementTypes.Group_2003);
		} else if (relationshipType == Wc2014ElementTypes.MatchHome_4002) {
			types.add(Wc2014ElementTypes.EliminationMatch_2001);
			types.add(Wc2014ElementTypes.GroupMatch_2004);
		} else if (relationshipType == Wc2014ElementTypes.GroupSecondTeam_4003) {
			types.add(Wc2014ElementTypes.Group_2003);
		} else if (relationshipType == Wc2014ElementTypes.MatchAway_4004) {
			types.add(Wc2014ElementTypes.EliminationMatch_2001);
			types.add(Wc2014ElementTypes.GroupMatch_2004);
		} else if (relationshipType == Wc2014ElementTypes.EliminationMatchWinner_4006) {
			types.add(Wc2014ElementTypes.EliminationMatch_2001);
		}
		return types;
	}

}
