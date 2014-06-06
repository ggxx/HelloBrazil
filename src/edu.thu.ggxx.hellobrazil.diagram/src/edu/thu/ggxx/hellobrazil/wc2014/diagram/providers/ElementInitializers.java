package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014DiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Wc2014DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			Wc2014DiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
