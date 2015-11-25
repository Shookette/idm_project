package istic.m2miage.idm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import istic.m2miage.idm.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;
     	
        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:67:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:68:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:69:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:76:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videotypes_2_0= ruleVideoType ) )* otherlv_3= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_videotypes_2_0 = null;


         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:79:28: ( (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videotypes_2_0= ruleVideoType ) )* otherlv_3= '}' ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videotypes_2_0= ruleVideoType ) )* otherlv_3= '}' )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videotypes_2_0= ruleVideoType ) )* otherlv_3= '}' )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:80:3: otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videotypes_2_0= ruleVideoType ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleVideoGen134); 

                	newLeafNode(otherlv_1, grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:88:1: ( (lv_videotypes_2_0= ruleVideoType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_videotypes_2_0= ruleVideoType )
            	    {
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_videotypes_2_0= ruleVideoType )
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:90:3: lv_videotypes_2_0= ruleVideoType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getVideotypesVideoTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideoType_in_ruleVideoGen155);
            	    lv_videotypes_2_0=ruleVideoType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videotypes",
            	            		lv_videotypes_2_0, 
            	            		"VideoType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVideoGen168); 

                	newLeafNode(otherlv_3, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideoType"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:118:1: entryRuleVideoType returns [EObject current=null] : iv_ruleVideoType= ruleVideoType EOF ;
    public final EObject entryRuleVideoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoType = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:119:2: (iv_ruleVideoType= ruleVideoType EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:120:2: iv_ruleVideoType= ruleVideoType EOF
            {
             newCompositeNode(grammarAccess.getVideoTypeRule()); 
            pushFollow(FOLLOW_ruleVideoType_in_entryRuleVideoType204);
            iv_ruleVideoType=ruleVideoType();

            state._fsp--;

             current =iv_ruleVideoType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoType214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoType"


    // $ANTLR start "ruleVideoType"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:127:1: ruleVideoType returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives ) ;
    public final EObject ruleVideoType() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;

        EObject this_Alternatives_2 = null;


         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:130:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:131:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:131:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:132:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleVideoType261);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:142:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleVideoType288);
                    this_Optional_1=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:152:5: this_Alternatives_2= ruleAlternatives
                    {
                     
                            newCompositeNode(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternatives_in_ruleVideoType315);
                    this_Alternatives_2=ruleAlternatives();

                    state._fsp--;

                     
                            current = this_Alternatives_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "entryRuleMandatory"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:168:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:169:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:170:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory350);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:177:1: ruleMandatory returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:180:28: ( (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideoSeq ) ) ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideoSeq ) ) )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideoSeq ) ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:181:3: otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMandatory397); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:185:1: ( (lv_video_1_0= ruleVideoSeq ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_video_1_0= ruleVideoSeq )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_video_1_0= ruleVideoSeq )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:187:3: lv_video_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getVideoVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleMandatory418);
            lv_video_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		add(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"VideoSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:211:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:212:2: (iv_ruleOptional= ruleOptional EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:213:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional454);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:220:1: ruleOptional returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:223:28: ( (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideoSeq ) ) ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideoSeq ) ) )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideoSeq ) ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:224:3: otherlv_0= 'optional' ( (lv_video_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOptional501); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:228:1: ( (lv_video_1_0= ruleVideoSeq ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:229:1: (lv_video_1_0= ruleVideoSeq )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:229:1: (lv_video_1_0= ruleVideoSeq )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:230:3: lv_video_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getVideoVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleOptional522);
            lv_video_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		add(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"VideoSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternatives"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:254:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:255:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:256:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives558);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:263:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videos_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videos_3_0 = null;


         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:266:28: ( (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videos_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:267:1: (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videos_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:267:1: (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videos_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:267:3: otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videos_3_0= ruleVideoSeq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAlternatives605); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:271:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_name_1_0= RULE_ID )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_name_1_0= RULE_ID )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternatives622); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAlternatives639); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:293:1: ( (lv_videos_3_0= ruleVideoSeq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:294:1: (lv_videos_3_0= ruleVideoSeq )
            	    {
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:294:1: (lv_videos_3_0= ruleVideoSeq )
            	    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:295:3: lv_videos_3_0= ruleVideoSeq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getVideosVideoSeqParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideoSeq_in_ruleAlternatives660);
            	    lv_videos_3_0=ruleVideoSeq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_3_0, 
            	            		"VideoSeq");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAlternatives673); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleVideoSeq"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:323:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:324:2: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:325:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq709);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:332:1: ruleVideoSeq returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) ) ( (lv_probabilite_3_0= RULE_PROBABILITY ) )? ( (lv_description_4_0= RULE_STRING ) )? ( (lv_duree_5_0= RULE_DURATION ) )? ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_path_2_0=null;
        Token lv_probabilite_3_0=null;
        Token lv_description_4_0=null;
        Token lv_duree_5_0=null;

         enterRule(); 
            
        try {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:335:28: ( (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) ) ( (lv_probabilite_3_0= RULE_PROBABILITY ) )? ( (lv_description_4_0= RULE_STRING ) )? ( (lv_duree_5_0= RULE_DURATION ) )? ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) ) ( (lv_probabilite_3_0= RULE_PROBABILITY ) )? ( (lv_description_4_0= RULE_STRING ) )? ( (lv_duree_5_0= RULE_DURATION ) )? )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) ) ( (lv_probabilite_3_0= RULE_PROBABILITY ) )? ( (lv_description_4_0= RULE_STRING ) )? ( (lv_duree_5_0= RULE_DURATION ) )? )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:336:3: otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) ) ( (lv_probabilite_3_0= RULE_PROBABILITY ) )? ( (lv_description_4_0= RULE_STRING ) )? ( (lv_duree_5_0= RULE_DURATION ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeq756); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0());
                
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:340:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_name_1_0= RULE_ID )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_name_1_0= RULE_ID )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideoSeq773); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:358:2: ( (lv_path_2_0= RULE_STRING ) )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_path_2_0= RULE_STRING )
            {
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_path_2_0= RULE_STRING )
            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:360:3: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq795); 

            			newLeafNode(lv_path_2_0, grammarAccess.getVideoSeqAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:376:2: ( (lv_probabilite_3_0= RULE_PROBABILITY ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PROBABILITY) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:377:1: (lv_probabilite_3_0= RULE_PROBABILITY )
                    {
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:377:1: (lv_probabilite_3_0= RULE_PROBABILITY )
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:378:3: lv_probabilite_3_0= RULE_PROBABILITY
                    {
                    lv_probabilite_3_0=(Token)match(input,RULE_PROBABILITY,FOLLOW_RULE_PROBABILITY_in_ruleVideoSeq817); 

                    			newLeafNode(lv_probabilite_3_0, grammarAccess.getVideoSeqAccess().getProbabiliteProbabilityTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probabilite",
                            		lv_probabilite_3_0, 
                            		"Probability");
                    	    

                    }


                    }
                    break;

            }

            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:394:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:395:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:395:1: (lv_description_4_0= RULE_STRING )
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:396:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq840); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:412:3: ( (lv_duree_5_0= RULE_DURATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DURATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:413:1: (lv_duree_5_0= RULE_DURATION )
                    {
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:413:1: (lv_duree_5_0= RULE_DURATION )
                    // ../istic.m2miage.idm/src-gen/istic/m2miage/idm/parser/antlr/internal/InternalVideoGen.g:414:3: lv_duree_5_0= RULE_DURATION
                    {
                    lv_duree_5_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleVideoSeq863); 

                    			newLeafNode(lv_duree_5_0, grammarAccess.getVideoSeqAccess().getDureeDurationTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duree",
                            		lv_duree_5_0, 
                            		"Duration");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoSeq"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVideoGen134 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_ruleVideoType_in_ruleVideoGen155 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_15_in_ruleVideoGen168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoType_in_entryRuleVideoType204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleVideoType261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleVideoType288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleVideoType315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMandatory397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleMandatory418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOptional501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleOptional522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAlternatives605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternatives622 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAlternatives639 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleAlternatives660 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleAlternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeq756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideoSeq773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq795 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_PROBABILITY_in_ruleVideoSeq817 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq840 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleVideoSeq863 = new BitSet(new long[]{0x0000000000000002L});

}