package edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;

/**
 * @generated
 */
public class MatchHomeItemSemanticEditPolicy extends
		Wc2014BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchHomeItemSemanticEditPolicy() {
		super(Wc2014ElementTypes.MatchHome_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
