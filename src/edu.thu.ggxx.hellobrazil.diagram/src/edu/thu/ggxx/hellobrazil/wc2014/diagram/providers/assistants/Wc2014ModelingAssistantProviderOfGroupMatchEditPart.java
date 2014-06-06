package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ModelingAssistantProvider;

/**
 * @generated
 */
public class Wc2014ModelingAssistantProviderOfGroupMatchEditPart extends
		Wc2014ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((GroupMatchEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(GroupMatchEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Wc2014ElementTypes.MatchHome_4002);
		types.add(Wc2014ElementTypes.MatchAway_4004);
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
				(GroupMatchEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			GroupMatchEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.MatchHome_4002);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.MatchAway_4004);
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
		return doGetTypesForTarget((GroupMatchEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(GroupMatchEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.MatchHome_4002) {
			types.add(Wc2014ElementTypes.Team_2002);
		} else if (relationshipType == Wc2014ElementTypes.MatchAway_4004) {
			types.add(Wc2014ElementTypes.Team_2002);
		}
		return types;
	}

}
