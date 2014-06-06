package edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupFirstTeamCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupFirstTeamReorientCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupSecondTeamCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupSecondTeamReorientCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.TeamAtGroupCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.TeamAtGroupReorientCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupFirstTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupSecondTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamAtGroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;

/**
 * @generated
 */
public class GroupItemSemanticEditPolicy extends
		Wc2014BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupItemSemanticEditPolicy() {
		super(Wc2014ElementTypes.Group_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Wc2014VisualIDRegistry.getVisualID(incomingLink) == TeamAtGroupEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Wc2014VisualIDRegistry.getVisualID(outgoingLink) == GroupFirstTeamEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Wc2014VisualIDRegistry.getVisualID(outgoingLink) == GroupSecondTeamEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Wc2014ElementTypes.GroupFirstTeam_4001 == req.getElementType()) {
			return getGEFWrapper(new GroupFirstTeamCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Wc2014ElementTypes.GroupSecondTeam_4003 == req.getElementType()) {
			return getGEFWrapper(new GroupSecondTeamCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Wc2014ElementTypes.TeamAtGroup_4005 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Wc2014ElementTypes.GroupFirstTeam_4001 == req.getElementType()) {
			return null;
		}
		if (Wc2014ElementTypes.GroupSecondTeam_4003 == req.getElementType()) {
			return null;
		}
		if (Wc2014ElementTypes.TeamAtGroup_4005 == req.getElementType()) {
			return getGEFWrapper(new TeamAtGroupCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GroupFirstTeamEditPart.VISUAL_ID:
			return getGEFWrapper(new GroupFirstTeamReorientCommand(req));
		case GroupSecondTeamEditPart.VISUAL_ID:
			return getGEFWrapper(new GroupSecondTeamReorientCommand(req));
		case TeamAtGroupEditPart.VISUAL_ID:
			return getGEFWrapper(new TeamAtGroupReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
