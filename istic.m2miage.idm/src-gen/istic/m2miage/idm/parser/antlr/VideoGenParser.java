/*
 * generated by Xtext
 */
package istic.m2miage.idm.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import istic.m2miage.idm.services.VideoGenGrammarAccess;

public class VideoGenParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected istic.m2miage.idm.parser.antlr.internal.InternalVideoGenParser createParser(XtextTokenStream stream) {
		return new istic.m2miage.idm.parser.antlr.internal.InternalVideoGenParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "VideoGen";
	}
	
	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}