package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupGroupNameEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamCountryEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.parsers.MessageFormatParser;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;

/**
 * @generated
 */
public class Wc2014ParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eliminationMatchId_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEliminationMatchId_5001Parser() {
		if (eliminationMatchId_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Wc2014Package.eINSTANCE
					.getMatch_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eliminationMatchId_5001Parser = parser;
		}
		return eliminationMatchId_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser teamCountry_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTeamCountry_5002Parser() {
		if (teamCountry_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Wc2014Package.eINSTANCE
					.getTeam_Country() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamCountry_5002Parser = parser;
		}
		return teamCountry_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupGroupName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getGroupGroupName_5003Parser() {
		if (groupGroupName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Wc2014Package.eINSTANCE
					.getGroup_GroupName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupGroupName_5003Parser = parser;
		}
		return groupGroupName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupMatchId_5004Parser;

	/**
	 * @generated
	 */
	private IParser getGroupMatchId_5004Parser() {
		if (groupMatchId_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Wc2014Package.eINSTANCE
					.getMatch_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupMatchId_5004Parser = parser;
		}
		return groupMatchId_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EliminationMatchIdEditPart.VISUAL_ID:
			return getEliminationMatchId_5001Parser();
		case TeamCountryEditPart.VISUAL_ID:
			return getTeamCountry_5002Parser();
		case GroupGroupNameEditPart.VISUAL_ID:
			return getGroupGroupName_5003Parser();
		case GroupMatchIdEditPart.VISUAL_ID:
			return getGroupMatchId_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Wc2014VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Wc2014VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Wc2014ElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
