package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.Wc2014EditPartFactory;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.WorldCupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;

/**
 * @generated
 */
public class Wc2014EditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public Wc2014EditPartProvider() {
		super(new Wc2014EditPartFactory(),
				Wc2014VisualIDRegistry.TYPED_INSTANCE,
				WorldCupEditPart.MODEL_ID);
	}

}
