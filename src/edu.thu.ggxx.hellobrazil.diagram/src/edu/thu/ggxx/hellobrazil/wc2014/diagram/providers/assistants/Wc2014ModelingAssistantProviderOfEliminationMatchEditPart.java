package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ModelingAssistantProvider;

/**
 * @generated
 */
public class Wc2014ModelingAssistantProviderOfEliminationMatchEditPart extends
		Wc2014ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EliminationMatchEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			EliminationMatchEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Wc2014ElementTypes.MatchHome_4002);
		types.add(Wc2014ElementTypes.MatchAway_4004);
		types.add(Wc2014ElementTypes.EliminationMatchWinner_4006);
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
		return doGetRelTypesOnSourceAndTarget(
				(EliminationMatchEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			EliminationMatchEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.MatchHome_4002);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.MatchAway_4004);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.EliminationMatchWinner_4006);
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
		return doGetTypesForTarget((EliminationMatchEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			EliminationMatchEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.MatchHome_4002) {
			types.add(Wc2014ElementTypes.Team_2002);
		} else if (relationshipType == Wc2014ElementTypes.MatchAway_4004) {
			types.add(Wc2014ElementTypes.Team_2002);
		} else if (relationshipType == Wc2014ElementTypes.EliminationMatchWinner_4006) {
			types.add(Wc2014ElementTypes.Team_2002);
		}
		return types;
	}

}
