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
public class Wc2014ModelingAssistantProviderOfGroupEditPart extends
		Wc2014ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((GroupEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(GroupEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Wc2014ElementTypes.GroupFirstTeam_4001);
		types.add(Wc2014ElementTypes.GroupSecondTeam_4003);
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
		return doGetRelTypesOnSourceAndTarget((GroupEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			GroupEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.GroupFirstTeam_4001);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(Wc2014ElementTypes.GroupSecondTeam_4003);
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
		return doGetTypesForTarget((GroupEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(GroupEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.GroupFirstTeam_4001) {
			types.add(Wc2014ElementTypes.Team_2002);
		} else if (relationshipType == Wc2014ElementTypes.GroupSecondTeam_4003) {
			types.add(Wc2014ElementTypes.Team_2002);
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
		return doGetRelTypesOnTarget((GroupEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(GroupEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Wc2014ElementTypes.TeamAtGroup_4005);
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
		return doGetTypesForSource((GroupEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(GroupEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Wc2014ElementTypes.TeamAtGroup_4005) {
			types.add(Wc2014ElementTypes.Team_2002);
		}
		return types;
	}

}
