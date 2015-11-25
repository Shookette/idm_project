package istic.m2miage.idm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import istic.m2miage.idm.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_PROBABILITY", "RULE_DURATION", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'mandatory'", "'optional'", "'alternatives'", "'videoseq'"
    };
    public static final int RULE_DURATION=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_PROBABILITY=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g"; }


     
     	private VideoGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVideoGen"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen61);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideoType"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:88:1: entryRuleVideoType : ruleVideoType EOF ;
    public final void entryRuleVideoType() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:89:1: ( ruleVideoType EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:90:1: ruleVideoType EOF
            {
             before(grammarAccess.getVideoTypeRule()); 
            pushFollow(FOLLOW_ruleVideoType_in_entryRuleVideoType121);
            ruleVideoType();

            state._fsp--;

             after(grammarAccess.getVideoTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoType"


    // $ANTLR start "ruleVideoType"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:97:1: ruleVideoType : ( ( rule__VideoType__Alternatives ) ) ;
    public final void ruleVideoType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:101:2: ( ( ( rule__VideoType__Alternatives ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__VideoType__Alternatives ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__VideoType__Alternatives ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:103:1: ( rule__VideoType__Alternatives )
            {
             before(grammarAccess.getVideoTypeAccess().getAlternatives()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:104:1: ( rule__VideoType__Alternatives )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:104:2: rule__VideoType__Alternatives
            {
            pushFollow(FOLLOW_rule__VideoType__Alternatives_in_ruleVideoType154);
            rule__VideoType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "entryRuleMandatory"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( ruleMandatory EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory181);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Mandatory__Group__0 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__Mandatory__Group__0 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory214);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleOptional EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional241);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Optional__Group__0 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__Optional__Group__0 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional274);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternatives"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( ruleAlternatives EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives301);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Alternatives__Group__0 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__Alternatives__Group__0 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives334);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleVideoSeq"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRuleVideoSeq : ruleVideoSeq EOF ;
    public final void entryRuleVideoSeq() throws RecognitionException {
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( ruleVideoSeq EOF )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: ruleVideoSeq EOF
            {
             before(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq361);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: ruleVideoSeq : ( ( rule__VideoSeq__Group__0 ) ) ;
    public final void ruleVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__VideoSeq__Group__0 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__VideoSeq__Group__0 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__VideoSeq__Group__0 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__VideoSeq__Group__0 )
            {
             before(grammarAccess.getVideoSeqAccess().getGroup()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__VideoSeq__Group__0 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__VideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq394);
            rule__VideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "rule__VideoType__Alternatives"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:228:1: rule__VideoType__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) | ( ruleAlternatives ) );
    public final void rule__VideoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:232:1: ( ( ruleMandatory ) | ( ruleOptional ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ruleMandatory )
                    {
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ruleMandatory )
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ruleMandatory
                    {
                     before(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__VideoType__Alternatives430);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleOptional )
                    {
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleOptional )
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:240:1: ruleOptional
                    {
                     before(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptional_in_rule__VideoType__Alternatives447);
                    ruleOptional();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternatives )
                    {
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternatives )
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:246:1: ruleAlternatives
                    {
                     before(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternatives_in_rule__VideoType__Alternatives464);
                    ruleAlternatives();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoType__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:258:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:262:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:263:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:270:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:274:1: ( ( 'VideoGen' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:276:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__VideoGen__Group__0__Impl525); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:289:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:293:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:294:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:301:1: rule__VideoGen__Group__1__Impl : ( '{' ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:305:1: ( ( '{' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( '{' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( '{' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:307:1: '{'
            {
             before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__VideoGen__Group__1__Impl587); 
             after(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:320:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:324:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:325:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2618);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2621);
            rule__VideoGen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:332:1: rule__VideoGen__Group__2__Impl : ( ( rule__VideoGen__VideotypesAssignment_2 )* ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:336:1: ( ( ( rule__VideoGen__VideotypesAssignment_2 )* ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:337:1: ( ( rule__VideoGen__VideotypesAssignment_2 )* )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:337:1: ( ( rule__VideoGen__VideotypesAssignment_2 )* )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:338:1: ( rule__VideoGen__VideotypesAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getVideotypesAssignment_2()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:339:1: ( rule__VideoGen__VideotypesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:339:2: rule__VideoGen__VideotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__VideotypesAssignment_2_in_rule__VideoGen__Group__2__Impl648);
            	    rule__VideoGen__VideotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getVideotypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__Group__3"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:349:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:353:1: ( rule__VideoGen__Group__3__Impl )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:354:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3679);
            rule__VideoGen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3"


    // $ANTLR start "rule__VideoGen__Group__3__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:360:1: rule__VideoGen__Group__3__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:364:1: ( ( '}' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:365:1: ( '}' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:365:1: ( '}' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:366:1: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__VideoGen__Group__3__Impl707); 
             after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:387:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:391:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:392:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__0746);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__0749);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:399:1: rule__Mandatory__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:403:1: ( ( 'mandatory' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:404:1: ( 'mandatory' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:404:1: ( 'mandatory' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:405:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Mandatory__Group__0__Impl777); 
             after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:418:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:422:1: ( rule__Mandatory__Group__1__Impl )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:423:2: rule__Mandatory__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__1808);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:429:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__VideoAssignment_1 ) ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:433:1: ( ( ( rule__Mandatory__VideoAssignment_1 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:434:1: ( ( rule__Mandatory__VideoAssignment_1 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:434:1: ( ( rule__Mandatory__VideoAssignment_1 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:435:1: ( rule__Mandatory__VideoAssignment_1 )
            {
             before(grammarAccess.getMandatoryAccess().getVideoAssignment_1()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:436:1: ( rule__Mandatory__VideoAssignment_1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:436:2: rule__Mandatory__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__Mandatory__VideoAssignment_1_in_rule__Mandatory__Group__1__Impl835);
            rule__Mandatory__VideoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getVideoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:450:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:454:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:455:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__0869);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__0872);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:462:1: rule__Optional__Group__0__Impl : ( 'optional' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:466:1: ( ( 'optional' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:467:1: ( 'optional' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:467:1: ( 'optional' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:468:1: 'optional'
            {
             before(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Optional__Group__0__Impl900); 
             after(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:481:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:485:1: ( rule__Optional__Group__1__Impl )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:486:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__1931);
            rule__Optional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:492:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__VideoAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:496:1: ( ( ( rule__Optional__VideoAssignment_1 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:497:1: ( ( rule__Optional__VideoAssignment_1 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:497:1: ( ( rule__Optional__VideoAssignment_1 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:498:1: ( rule__Optional__VideoAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getVideoAssignment_1()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:499:1: ( rule__Optional__VideoAssignment_1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:499:2: rule__Optional__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__VideoAssignment_1_in_rule__Optional__Group__1__Impl958);
            rule__Optional__VideoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getVideoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:513:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:517:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:518:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__0992);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__0995);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:525:1: rule__Alternatives__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:529:1: ( ( 'alternatives' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:530:1: ( 'alternatives' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:530:1: ( 'alternatives' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:531:1: 'alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Alternatives__Group__0__Impl1023); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:544:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:548:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:549:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11054);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11057);
            rule__Alternatives__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:556:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:560:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:561:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:561:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:562:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:563:1: ( rule__Alternatives__NameAssignment_1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:563:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1084);
            rule__Alternatives__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__2"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:573:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:577:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:578:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21114);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21117);
            rule__Alternatives__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2"


    // $ANTLR start "rule__Alternatives__Group__2__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:585:1: rule__Alternatives__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:589:1: ( ( '{' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:590:1: ( '{' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:590:1: ( '{' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:591:1: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Alternatives__Group__2__Impl1145); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group__3"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:604:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:608:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:609:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31176);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31179);
            rule__Alternatives__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3"


    // $ANTLR start "rule__Alternatives__Group__3__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:616:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__VideosAssignment_3 ) ) ( ( rule__Alternatives__VideosAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:620:1: ( ( ( ( rule__Alternatives__VideosAssignment_3 ) ) ( ( rule__Alternatives__VideosAssignment_3 )* ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:621:1: ( ( ( rule__Alternatives__VideosAssignment_3 ) ) ( ( rule__Alternatives__VideosAssignment_3 )* ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:621:1: ( ( ( rule__Alternatives__VideosAssignment_3 ) ) ( ( rule__Alternatives__VideosAssignment_3 )* ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:622:1: ( ( rule__Alternatives__VideosAssignment_3 ) ) ( ( rule__Alternatives__VideosAssignment_3 )* )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:622:1: ( ( rule__Alternatives__VideosAssignment_3 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:623:1: ( rule__Alternatives__VideosAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getVideosAssignment_3()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:624:1: ( rule__Alternatives__VideosAssignment_3 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:624:2: rule__Alternatives__VideosAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__VideosAssignment_3_in_rule__Alternatives__Group__3__Impl1208);
            rule__Alternatives__VideosAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getVideosAssignment_3()); 

            }

            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:627:1: ( ( rule__Alternatives__VideosAssignment_3 )* )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:628:1: ( rule__Alternatives__VideosAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getVideosAssignment_3()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:629:1: ( rule__Alternatives__VideosAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:629:2: rule__Alternatives__VideosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__VideosAssignment_3_in_rule__Alternatives__Group__3__Impl1220);
            	    rule__Alternatives__VideosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getVideosAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3__Impl"


    // $ANTLR start "rule__Alternatives__Group__4"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:640:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:644:1: ( rule__Alternatives__Group__4__Impl )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:645:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41253);
            rule__Alternatives__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4"


    // $ANTLR start "rule__Alternatives__Group__4__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:651:1: rule__Alternatives__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:655:1: ( ( '}' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:656:1: ( '}' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:656:1: ( '}' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:657:1: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Alternatives__Group__4__Impl1281); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__0"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:680:1: rule__VideoSeq__Group__0 : rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 ;
    public final void rule__VideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:684:1: ( rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:685:2: rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01322);
            rule__VideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01325);
            rule__VideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0"


    // $ANTLR start "rule__VideoSeq__Group__0__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:692:1: rule__VideoSeq__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:696:1: ( ( 'videoseq' ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:697:1: ( 'videoseq' )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:697:1: ( 'videoseq' )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:698:1: 'videoseq'
            {
             before(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeq__Group__0__Impl1353); 
             after(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group__1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:711:1: rule__VideoSeq__Group__1 : rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 ;
    public final void rule__VideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:715:1: ( rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:716:2: rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11384);
            rule__VideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11387);
            rule__VideoSeq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1"


    // $ANTLR start "rule__VideoSeq__Group__1__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:723:1: rule__VideoSeq__Group__1__Impl : ( ( rule__VideoSeq__NameAssignment_1 ) ) ;
    public final void rule__VideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:727:1: ( ( ( rule__VideoSeq__NameAssignment_1 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:728:1: ( ( rule__VideoSeq__NameAssignment_1 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:728:1: ( ( rule__VideoSeq__NameAssignment_1 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:729:1: ( rule__VideoSeq__NameAssignment_1 )
            {
             before(grammarAccess.getVideoSeqAccess().getNameAssignment_1()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:730:1: ( rule__VideoSeq__NameAssignment_1 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:730:2: rule__VideoSeq__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VideoSeq__NameAssignment_1_in_rule__VideoSeq__Group__1__Impl1414);
            rule__VideoSeq__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group__2"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:740:1: rule__VideoSeq__Group__2 : rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 ;
    public final void rule__VideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:744:1: ( rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:745:2: rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21444);
            rule__VideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21447);
            rule__VideoSeq__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2"


    // $ANTLR start "rule__VideoSeq__Group__2__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:752:1: rule__VideoSeq__Group__2__Impl : ( ( rule__VideoSeq__PathAssignment_2 ) ) ;
    public final void rule__VideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:756:1: ( ( ( rule__VideoSeq__PathAssignment_2 ) ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: ( ( rule__VideoSeq__PathAssignment_2 ) )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: ( ( rule__VideoSeq__PathAssignment_2 ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:758:1: ( rule__VideoSeq__PathAssignment_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getPathAssignment_2()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:759:1: ( rule__VideoSeq__PathAssignment_2 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:759:2: rule__VideoSeq__PathAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__PathAssignment_2_in_rule__VideoSeq__Group__2__Impl1474);
            rule__VideoSeq__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group__3"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:769:1: rule__VideoSeq__Group__3 : rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 ;
    public final void rule__VideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:773:1: ( rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:774:2: rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31504);
            rule__VideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31507);
            rule__VideoSeq__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3"


    // $ANTLR start "rule__VideoSeq__Group__3__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:781:1: rule__VideoSeq__Group__3__Impl : ( ( rule__VideoSeq__ProbabiliteAssignment_3 )? ) ;
    public final void rule__VideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:785:1: ( ( ( rule__VideoSeq__ProbabiliteAssignment_3 )? ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:786:1: ( ( rule__VideoSeq__ProbabiliteAssignment_3 )? )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:786:1: ( ( rule__VideoSeq__ProbabiliteAssignment_3 )? )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:787:1: ( rule__VideoSeq__ProbabiliteAssignment_3 )?
            {
             before(grammarAccess.getVideoSeqAccess().getProbabiliteAssignment_3()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:788:1: ( rule__VideoSeq__ProbabiliteAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PROBABILITY) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:788:2: rule__VideoSeq__ProbabiliteAssignment_3
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__ProbabiliteAssignment_3_in_rule__VideoSeq__Group__3__Impl1534);
                    rule__VideoSeq__ProbabiliteAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getProbabiliteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3__Impl"


    // $ANTLR start "rule__VideoSeq__Group__4"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:798:1: rule__VideoSeq__Group__4 : rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 ;
    public final void rule__VideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:802:1: ( rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:803:2: rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41565);
            rule__VideoSeq__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41568);
            rule__VideoSeq__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4"


    // $ANTLR start "rule__VideoSeq__Group__4__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:810:1: rule__VideoSeq__Group__4__Impl : ( ( rule__VideoSeq__DescriptionAssignment_4 )? ) ;
    public final void rule__VideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:814:1: ( ( ( rule__VideoSeq__DescriptionAssignment_4 )? ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:815:1: ( ( rule__VideoSeq__DescriptionAssignment_4 )? )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:815:1: ( ( rule__VideoSeq__DescriptionAssignment_4 )? )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:816:1: ( rule__VideoSeq__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_4()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:817:1: ( rule__VideoSeq__DescriptionAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:817:2: rule__VideoSeq__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__DescriptionAssignment_4_in_rule__VideoSeq__Group__4__Impl1595);
                    rule__VideoSeq__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__5"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:827:1: rule__VideoSeq__Group__5 : rule__VideoSeq__Group__5__Impl ;
    public final void rule__VideoSeq__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:831:1: ( rule__VideoSeq__Group__5__Impl )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:832:2: rule__VideoSeq__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51626);
            rule__VideoSeq__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5"


    // $ANTLR start "rule__VideoSeq__Group__5__Impl"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:838:1: rule__VideoSeq__Group__5__Impl : ( ( rule__VideoSeq__DureeAssignment_5 )? ) ;
    public final void rule__VideoSeq__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:842:1: ( ( ( rule__VideoSeq__DureeAssignment_5 )? ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( ( rule__VideoSeq__DureeAssignment_5 )? )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( ( rule__VideoSeq__DureeAssignment_5 )? )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:844:1: ( rule__VideoSeq__DureeAssignment_5 )?
            {
             before(grammarAccess.getVideoSeqAccess().getDureeAssignment_5()); 
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:845:1: ( rule__VideoSeq__DureeAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DURATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:845:2: rule__VideoSeq__DureeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__DureeAssignment_5_in_rule__VideoSeq__Group__5__Impl1653);
                    rule__VideoSeq__DureeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getDureeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5__Impl"


    // $ANTLR start "rule__VideoGen__VideotypesAssignment_2"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:868:1: rule__VideoGen__VideotypesAssignment_2 : ( ruleVideoType ) ;
    public final void rule__VideoGen__VideotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:872:1: ( ( ruleVideoType ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( ruleVideoType )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( ruleVideoType )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:874:1: ruleVideoType
            {
             before(grammarAccess.getVideoGenAccess().getVideotypesVideoTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVideoType_in_rule__VideoGen__VideotypesAssignment_21701);
            ruleVideoType();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getVideotypesVideoTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__VideotypesAssignment_2"


    // $ANTLR start "rule__Mandatory__VideoAssignment_1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:883:1: rule__Mandatory__VideoAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__Mandatory__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:887:1: ( ( ruleVideoSeq ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:888:1: ( ruleVideoSeq )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:888:1: ( ruleVideoSeq )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:889:1: ruleVideoSeq
            {
             before(grammarAccess.getMandatoryAccess().getVideoVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__Mandatory__VideoAssignment_11732);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getVideoVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__VideoAssignment_1"


    // $ANTLR start "rule__Optional__VideoAssignment_1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:898:1: rule__Optional__VideoAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__Optional__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:902:1: ( ( ruleVideoSeq ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:903:1: ( ruleVideoSeq )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:903:1: ( ruleVideoSeq )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:904:1: ruleVideoSeq
            {
             before(grammarAccess.getOptionalAccess().getVideoVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__Optional__VideoAssignment_11763);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getVideoVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__VideoAssignment_1"


    // $ANTLR start "rule__Alternatives__NameAssignment_1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:913:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:917:1: ( ( RULE_ID ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:918:1: ( RULE_ID )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:918:1: ( RULE_ID )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:919:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_11794); 
             after(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__NameAssignment_1"


    // $ANTLR start "rule__Alternatives__VideosAssignment_3"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:928:1: rule__Alternatives__VideosAssignment_3 : ( ruleVideoSeq ) ;
    public final void rule__Alternatives__VideosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:932:1: ( ( ruleVideoSeq ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:933:1: ( ruleVideoSeq )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:933:1: ( ruleVideoSeq )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:934:1: ruleVideoSeq
            {
             before(grammarAccess.getAlternativesAccess().getVideosVideoSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__Alternatives__VideosAssignment_31825);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getVideosVideoSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__VideosAssignment_3"


    // $ANTLR start "rule__VideoSeq__NameAssignment_1"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:943:1: rule__VideoSeq__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoSeq__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:947:1: ( ( RULE_ID ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:948:1: ( RULE_ID )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:948:1: ( RULE_ID )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:949:1: RULE_ID
            {
             before(grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoSeq__NameAssignment_11856); 
             after(grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__NameAssignment_1"


    // $ANTLR start "rule__VideoSeq__PathAssignment_2"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:958:1: rule__VideoSeq__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:962:1: ( ( RULE_STRING ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:963:1: ( RULE_STRING )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:963:1: ( RULE_STRING )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:964:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__PathAssignment_21887); 
             after(grammarAccess.getVideoSeqAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__PathAssignment_2"


    // $ANTLR start "rule__VideoSeq__ProbabiliteAssignment_3"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:973:1: rule__VideoSeq__ProbabiliteAssignment_3 : ( RULE_PROBABILITY ) ;
    public final void rule__VideoSeq__ProbabiliteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:977:1: ( ( RULE_PROBABILITY ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:978:1: ( RULE_PROBABILITY )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:978:1: ( RULE_PROBABILITY )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:979:1: RULE_PROBABILITY
            {
             before(grammarAccess.getVideoSeqAccess().getProbabiliteProbabilityTerminalRuleCall_3_0()); 
            match(input,RULE_PROBABILITY,FOLLOW_RULE_PROBABILITY_in_rule__VideoSeq__ProbabiliteAssignment_31918); 
             after(grammarAccess.getVideoSeqAccess().getProbabiliteProbabilityTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__ProbabiliteAssignment_3"


    // $ANTLR start "rule__VideoSeq__DescriptionAssignment_4"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:988:1: rule__VideoSeq__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:992:1: ( ( RULE_STRING ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:993:1: ( RULE_STRING )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:993:1: ( RULE_STRING )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:994:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__DescriptionAssignment_41949); 
             after(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DescriptionAssignment_4"


    // $ANTLR start "rule__VideoSeq__DureeAssignment_5"
    // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:1003:1: rule__VideoSeq__DureeAssignment_5 : ( RULE_DURATION ) ;
    public final void rule__VideoSeq__DureeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:1007:1: ( ( RULE_DURATION ) )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:1: ( RULE_DURATION )
            {
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:1: ( RULE_DURATION )
            // ../istic.m2miage.idm.ui/src-gen/istic/m2miage/idm/ui/contentassist/antlr/internal/InternalVideoGen.g:1009:1: RULE_DURATION
            {
             before(grammarAccess.getVideoSeqAccess().getDureeDurationTerminalRuleCall_5_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__VideoSeq__DureeAssignment_51980); 
             after(grammarAccess.getVideoSeqAccess().getDureeDurationTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DureeAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoType_in_entryRuleVideoType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoType__Alternatives_in_ruleVideoType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__VideoType__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__VideoType__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_rule__VideoType__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGen__Group__0__Impl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VideoGen__Group__1__Impl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2618 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__VideotypesAssignment_2_in_rule__VideoGen__Group__2__Impl648 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VideoGen__Group__3__Impl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__0746 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__0749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mandatory__Group__0__Impl777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__VideoAssignment_1_in_rule__Mandatory__Group__1__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__0869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__0872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Optional__Group__0__Impl900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__VideoAssignment_1_in_rule__Optional__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__0992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__0995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Alternatives__Group__0__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11054 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21114 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Alternatives__Group__2__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__VideosAssignment_3_in_rule__Alternatives__Group__3__Impl1208 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Alternatives__VideosAssignment_3_in_rule__Alternatives__Group__3__Impl1220 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Alternatives__Group__4__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeq__Group__0__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__NameAssignment_1_in_rule__VideoSeq__Group__1__Impl1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21444 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__PathAssignment_2_in_rule__VideoSeq__Group__2__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31504 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__ProbabiliteAssignment_3_in_rule__VideoSeq__Group__3__Impl1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41565 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__DescriptionAssignment_4_in_rule__VideoSeq__Group__4__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__DureeAssignment_5_in_rule__VideoSeq__Group__5__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoType_in_rule__VideoGen__VideotypesAssignment_21701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__Mandatory__VideoAssignment_11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__Optional__VideoAssignment_11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__Alternatives__VideosAssignment_31825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoSeq__NameAssignment_11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__PathAssignment_21887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROBABILITY_in_rule__VideoSeq__ProbabiliteAssignment_31918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__DescriptionAssignment_41949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__VideoSeq__DureeAssignment_51980 = new BitSet(new long[]{0x0000000000000002L});

}