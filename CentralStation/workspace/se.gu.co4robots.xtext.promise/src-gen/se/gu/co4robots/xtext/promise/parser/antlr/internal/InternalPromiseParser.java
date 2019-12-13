package se.gu.co4robots.xtext.promise.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPromiseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mission'", "'{'", "'conditions'", "'events'", "','", "'actions'", "'resources'", "'}'", "'robots'", "'locations'", "'operators'", "':'", "'fallback'", "'('", "')'", "'sequence'", "'parallel'", "'eventHandler'", "'default'", "'except'", "'condition'", "'if'", "'combination'", "'&'", "'AND'", "'and'", "'delegate'", "'stoppingEvents'", "'SimpleAction'", "'Visit'", "'SequencedVisit'", "'OrderedVisit'", "'StrictOrderedVisit'", "'FairVisit'", "'Patrolling'", "'SequencedPatrolling'", "'OrderedPatrolling'", "'StrictOrderedPatrolling'", "'FairPatrolling'", "'Check'", "'CheckAndDeliver'", "'CheckSupplies'", "'CheckAndDeliverQCh'", "'TestITAAPAs'", "'UpperRestrictedAvoidance'", "'ExactRestrictedAvoidance'", "'LowerRestrictedAvoidance'", "'FutureAvoidance'", "'GlobalAvoidance'", "'PastAvoidance'", "'Wait'", "'DelayedReaction'", "'InstantReaction'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPromiseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPromiseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPromiseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPromise.g"; }



     	private PromiseGrammarAccess grammarAccess;

        public InternalPromiseParser(TokenStream input, PromiseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mission";
       	}

       	@Override
       	protected PromiseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalPromise.g:64:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalPromise.g:64:48: (iv_ruleMission= ruleMission EOF )
            // InternalPromise.g:65:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalPromise.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )? otherlv_14= 'robots' ( (lv_robots_15_0= ruleRobot ) ) (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )* (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )? otherlv_22= 'operators' otherlv_23= '{' ( (lv_operator_24_0= ruleOperator ) ) (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )* otherlv_27= '}' otherlv_28= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_events_5_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_robots_15_0 = null;

        EObject lv_robots_17_0 = null;

        EObject lv_locations_19_0 = null;

        EObject lv_locations_21_0 = null;

        EObject lv_operator_24_0 = null;

        EObject lv_operator_26_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:77:2: ( (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )? otherlv_14= 'robots' ( (lv_robots_15_0= ruleRobot ) ) (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )* (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )? otherlv_22= 'operators' otherlv_23= '{' ( (lv_operator_24_0= ruleOperator ) ) (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )* otherlv_27= '}' otherlv_28= '}' ) )
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )? otherlv_14= 'robots' ( (lv_robots_15_0= ruleRobot ) ) (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )* (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )? otherlv_22= 'operators' otherlv_23= '{' ( (lv_operator_24_0= ruleOperator ) ) (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )* otherlv_27= '}' otherlv_28= '}' )
            {
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )? otherlv_14= 'robots' ( (lv_robots_15_0= ruleRobot ) ) (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )* (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )? otherlv_22= 'operators' otherlv_23= '{' ( (lv_operator_24_0= ruleOperator ) ) (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )* otherlv_27= '}' otherlv_28= '}' )
            // InternalPromise.g:79:3: otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )? otherlv_14= 'robots' ( (lv_robots_15_0= ruleRobot ) ) (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )* (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )? otherlv_22= 'operators' otherlv_23= '{' ( (lv_operator_24_0= ruleOperator ) ) (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )* otherlv_27= '}' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPromise.g:87:3: (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPromise.g:88:4: otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )? otherlv_13= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getConditionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalPromise.g:96:4: (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalPromise.g:97:5: otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )*
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEventsKeyword_2_2_0());
                            				
                            // InternalPromise.g:101:5: ( (lv_events_5_0= ruleEvent ) )
                            // InternalPromise.g:102:6: (lv_events_5_0= ruleEvent )
                            {
                            // InternalPromise.g:102:6: (lv_events_5_0= ruleEvent )
                            // InternalPromise.g:103:7: lv_events_5_0= ruleEvent
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getEventsEventParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_events_5_0=ruleEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"events",
                            								lv_events_5_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Event");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:120:5: (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalPromise.g:121:6: otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) )
                            	    {
                            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getCommaKeyword_2_2_2_0());
                            	    					
                            	    // InternalPromise.g:125:6: ( (lv_events_7_0= ruleEvent ) )
                            	    // InternalPromise.g:126:7: (lv_events_7_0= ruleEvent )
                            	    {
                            	    // InternalPromise.g:126:7: (lv_events_7_0= ruleEvent )
                            	    // InternalPromise.g:127:8: lv_events_7_0= ruleEvent
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getEventsEventParserRuleCall_2_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_7);
                            	    lv_events_7_0=ruleEvent();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"events",
                            	    									lv_events_7_0,
                            	    									"se.gu.co4robots.xtext.promise.Promise.Event");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPromise.g:146:4: ( (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPromise.g:147:5: (otherlv_8= 'actions' | otherlv_9= 'resources' ) ( (lv_actions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )*
                            {
                            // InternalPromise.g:147:5: (otherlv_8= 'actions' | otherlv_9= 'resources' )
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==16) ) {
                                alt3=1;
                            }
                            else if ( (LA3_0==17) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 0, input);

                                throw nvae;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalPromise.g:148:6: otherlv_8= 'actions'
                                    {
                                    otherlv_8=(Token)match(input,16,FOLLOW_6); 

                                    						newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getActionsKeyword_2_3_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalPromise.g:153:6: otherlv_9= 'resources'
                                    {
                                    otherlv_9=(Token)match(input,17,FOLLOW_6); 

                                    						newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getResourcesKeyword_2_3_0_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalPromise.g:158:5: ( (lv_actions_10_0= ruleAction ) )
                            // InternalPromise.g:159:6: (lv_actions_10_0= ruleAction )
                            {
                            // InternalPromise.g:159:6: (lv_actions_10_0= ruleAction )
                            // InternalPromise.g:160:7: lv_actions_10_0= ruleAction
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_actions_10_0=ruleAction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"actions",
                            								lv_actions_10_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Action");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:177:5: (otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==15) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalPromise.g:178:6: otherlv_11= ',' ( (lv_actions_12_0= ruleAction ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_6); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getCommaKeyword_2_3_2_0());
                            	    					
                            	    // InternalPromise.g:182:6: ( (lv_actions_12_0= ruleAction ) )
                            	    // InternalPromise.g:183:7: (lv_actions_12_0= ruleAction )
                            	    {
                            	    // InternalPromise.g:183:7: (lv_actions_12_0= ruleAction )
                            	    // InternalPromise.g:184:8: lv_actions_12_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_actions_12_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_12_0,
                            	    									"se.gu.co4robots.xtext.promise.Promise.Action");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getRobotsKeyword_3());
            		
            // InternalPromise.g:212:3: ( (lv_robots_15_0= ruleRobot ) )
            // InternalPromise.g:213:4: (lv_robots_15_0= ruleRobot )
            {
            // InternalPromise.g:213:4: (lv_robots_15_0= ruleRobot )
            // InternalPromise.g:214:5: lv_robots_15_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_robots_15_0=ruleRobot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"robots",
            						lv_robots_15_0,
            						"se.gu.co4robots.xtext.promise.Promise.Robot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:231:3: (otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPromise.g:232:4: otherlv_16= ',' ( (lv_robots_17_0= ruleRobot ) )
            	    {
            	    otherlv_16=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalPromise.g:236:4: ( (lv_robots_17_0= ruleRobot ) )
            	    // InternalPromise.g:237:5: (lv_robots_17_0= ruleRobot )
            	    {
            	    // InternalPromise.g:237:5: (lv_robots_17_0= ruleRobot )
            	    // InternalPromise.g:238:6: lv_robots_17_0= ruleRobot
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_robots_17_0=ruleRobot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"robots",
            	    							lv_robots_17_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Robot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPromise.g:256:3: (otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPromise.g:257:4: otherlv_18= 'locations' ( (lv_locations_19_0= ruleLocation ) ) (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )*
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getLocationsKeyword_6_0());
                    			
                    // InternalPromise.g:261:4: ( (lv_locations_19_0= ruleLocation ) )
                    // InternalPromise.g:262:5: (lv_locations_19_0= ruleLocation )
                    {
                    // InternalPromise.g:262:5: (lv_locations_19_0= ruleLocation )
                    // InternalPromise.g:263:6: lv_locations_19_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_locations_19_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"locations",
                    							lv_locations_19_0,
                    							"se.gu.co4robots.xtext.promise.Promise.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:280:4: (otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPromise.g:281:5: otherlv_20= ',' ( (lv_locations_21_0= ruleLocation ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalPromise.g:285:5: ( (lv_locations_21_0= ruleLocation ) )
                    	    // InternalPromise.g:286:6: (lv_locations_21_0= ruleLocation )
                    	    {
                    	    // InternalPromise.g:286:6: (lv_locations_21_0= ruleLocation )
                    	    // InternalPromise.g:287:7: lv_locations_21_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_locations_21_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locations",
                    	    								lv_locations_21_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getOperatorsKeyword_7());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalPromise.g:314:3: ( (lv_operator_24_0= ruleOperator ) )
            // InternalPromise.g:315:4: (lv_operator_24_0= ruleOperator )
            {
            // InternalPromise.g:315:4: (lv_operator_24_0= ruleOperator )
            // InternalPromise.g:316:5: lv_operator_24_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_24_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_24_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:333:3: (otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPromise.g:334:4: otherlv_25= ',' ( (lv_operator_26_0= ruleOperator ) )
            	    {
            	    otherlv_25=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_25, grammarAccess.getMissionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalPromise.g:338:4: ( (lv_operator_26_0= ruleOperator ) )
            	    // InternalPromise.g:339:5: (lv_operator_26_0= ruleOperator )
            	    {
            	    // InternalPromise.g:339:5: (lv_operator_26_0= ruleOperator )
            	    // InternalPromise.g:340:6: lv_operator_26_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operator_26_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_26_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_27=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_28=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleOperator"
    // InternalPromise.g:370:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalPromise.g:370:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalPromise.g:371:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalPromise.g:377:1: ruleOperator returns [EObject current=null] : (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_FallBackOp_0 = null;

        EObject this_SequenceOp_1 = null;

        EObject this_ParallelOp_2 = null;

        EObject this_EventHandlerOp_3 = null;

        EObject this_ConditionOp_4 = null;

        EObject this_DelegateOp_5 = null;

        EObject this_TaskCombinationOp_6 = null;



        	enterRule();

        try {
            // InternalPromise.g:383:2: ( (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp ) )
            // InternalPromise.g:384:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp )
            {
            // InternalPromise.g:384:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 37:
                {
                alt11=6;
                }
                break;
            case 33:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPromise.g:385:3: this_FallBackOp_0= ruleFallBackOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getFallBackOpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FallBackOp_0=ruleFallBackOp();

                    state._fsp--;


                    			current = this_FallBackOp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:394:3: this_SequenceOp_1= ruleSequenceOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getSequenceOpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceOp_1=ruleSequenceOp();

                    state._fsp--;


                    			current = this_SequenceOp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPromise.g:403:3: this_ParallelOp_2= ruleParallelOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getParallelOpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelOp_2=ruleParallelOp();

                    state._fsp--;


                    			current = this_ParallelOp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPromise.g:412:3: this_EventHandlerOp_3= ruleEventHandlerOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getEventHandlerOpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventHandlerOp_3=ruleEventHandlerOp();

                    state._fsp--;


                    			current = this_EventHandlerOp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPromise.g:421:3: this_ConditionOp_4= ruleConditionOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getConditionOpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionOp_4=ruleConditionOp();

                    state._fsp--;


                    			current = this_ConditionOp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPromise.g:430:3: this_DelegateOp_5= ruleDelegateOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getDelegateOpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelegateOp_5=ruleDelegateOp();

                    state._fsp--;


                    			current = this_DelegateOp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPromise.g:439:3: this_TaskCombinationOp_6= ruleTaskCombinationOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getTaskCombinationOpParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskCombinationOp_6=ruleTaskCombinationOp();

                    state._fsp--;


                    			current = this_TaskCombinationOp_6;
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleTasks"
    // InternalPromise.g:451:1: entryRuleTasks returns [EObject current=null] : iv_ruleTasks= ruleTasks EOF ;
    public final EObject entryRuleTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasks = null;


        try {
            // InternalPromise.g:451:46: (iv_ruleTasks= ruleTasks EOF )
            // InternalPromise.g:452:2: iv_ruleTasks= ruleTasks EOF
            {
             newCompositeNode(grammarAccess.getTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTasks=ruleTasks();

            state._fsp--;

             current =iv_ruleTasks; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTasks"


    // $ANTLR start "ruleTasks"
    // InternalPromise.g:458:1: ruleTasks returns [EObject current=null] : (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs ) ;
    public final EObject ruleTasks() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAction_0 = null;

        EObject this_Visit_1 = null;

        EObject this_SequencedVisit_2 = null;

        EObject this_OrderderVisit_3 = null;

        EObject this_StrictOrderedVisit_4 = null;

        EObject this_FairVisit_5 = null;

        EObject this_Patrolling_6 = null;

        EObject this_SequencedPatrolling_7 = null;

        EObject this_OrderedPatrolling_8 = null;

        EObject this_StrictOreredPatrolling_9 = null;

        EObject this_FairPatrolling_10 = null;

        EObject this_UpperRestrictedAvoidance_11 = null;

        EObject this_ExactRestrictedAvoidance_12 = null;

        EObject this_LowerRestrictedAvoidance_13 = null;

        EObject this_FutureAvoidance_14 = null;

        EObject this_GlobalAvoidance_15 = null;

        EObject this_PastAvoidance_16 = null;

        EObject this_Wait_17 = null;

        EObject this_DelayedReaction_18 = null;

        EObject this_InstantReaction_19 = null;

        EObject this_Check_20 = null;

        EObject this_CheckAndDeliver_21 = null;

        EObject this_CheckSupplies_22 = null;

        EObject this_CheckAndDeliverQCh_23 = null;

        EObject this_TestITAAPAs_24 = null;



        	enterRule();

        try {
            // InternalPromise.g:464:2: ( (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs ) )
            // InternalPromise.g:465:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs )
            {
            // InternalPromise.g:465:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs )
            int alt12=25;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            case 43:
                {
                alt12=5;
                }
                break;
            case 44:
                {
                alt12=6;
                }
                break;
            case 45:
                {
                alt12=7;
                }
                break;
            case 46:
                {
                alt12=8;
                }
                break;
            case 47:
                {
                alt12=9;
                }
                break;
            case 48:
                {
                alt12=10;
                }
                break;
            case 49:
                {
                alt12=11;
                }
                break;
            case 55:
                {
                alt12=12;
                }
                break;
            case 56:
                {
                alt12=13;
                }
                break;
            case 57:
                {
                alt12=14;
                }
                break;
            case 58:
                {
                alt12=15;
                }
                break;
            case 59:
                {
                alt12=16;
                }
                break;
            case 60:
                {
                alt12=17;
                }
                break;
            case 61:
                {
                alt12=18;
                }
                break;
            case 62:
                {
                alt12=19;
                }
                break;
            case 63:
                {
                alt12=20;
                }
                break;
            case 50:
                {
                alt12=21;
                }
                break;
            case 51:
                {
                alt12=22;
                }
                break;
            case 52:
                {
                alt12=23;
                }
                break;
            case 53:
                {
                alt12=24;
                }
                break;
            case 54:
                {
                alt12=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPromise.g:466:3: this_SimpleAction_0= ruleSimpleAction
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getSimpleActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleAction_0=ruleSimpleAction();

                    state._fsp--;


                    			current = this_SimpleAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:475:3: this_Visit_1= ruleVisit
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getVisitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visit_1=ruleVisit();

                    state._fsp--;


                    			current = this_Visit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPromise.g:484:3: this_SequencedVisit_2= ruleSequencedVisit
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getSequencedVisitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequencedVisit_2=ruleSequencedVisit();

                    state._fsp--;


                    			current = this_SequencedVisit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPromise.g:493:3: this_OrderderVisit_3= ruleOrderderVisit
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getOrderderVisitParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderderVisit_3=ruleOrderderVisit();

                    state._fsp--;


                    			current = this_OrderderVisit_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPromise.g:502:3: this_StrictOrderedVisit_4= ruleStrictOrderedVisit
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getStrictOrderedVisitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrictOrderedVisit_4=ruleStrictOrderedVisit();

                    state._fsp--;


                    			current = this_StrictOrderedVisit_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPromise.g:511:3: this_FairVisit_5= ruleFairVisit
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getFairVisitParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FairVisit_5=ruleFairVisit();

                    state._fsp--;


                    			current = this_FairVisit_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPromise.g:520:3: this_Patrolling_6= rulePatrolling
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getPatrollingParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Patrolling_6=rulePatrolling();

                    state._fsp--;


                    			current = this_Patrolling_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPromise.g:529:3: this_SequencedPatrolling_7= ruleSequencedPatrolling
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getSequencedPatrollingParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequencedPatrolling_7=ruleSequencedPatrolling();

                    state._fsp--;


                    			current = this_SequencedPatrolling_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPromise.g:538:3: this_OrderedPatrolling_8= ruleOrderedPatrolling
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getOrderedPatrollingParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedPatrolling_8=ruleOrderedPatrolling();

                    state._fsp--;


                    			current = this_OrderedPatrolling_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPromise.g:547:3: this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getStrictOreredPatrollingParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrictOreredPatrolling_9=ruleStrictOreredPatrolling();

                    state._fsp--;


                    			current = this_StrictOreredPatrolling_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalPromise.g:556:3: this_FairPatrolling_10= ruleFairPatrolling
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getFairPatrollingParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_FairPatrolling_10=ruleFairPatrolling();

                    state._fsp--;


                    			current = this_FairPatrolling_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalPromise.g:565:3: this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getUpperRestrictedAvoidanceParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperRestrictedAvoidance_11=ruleUpperRestrictedAvoidance();

                    state._fsp--;


                    			current = this_UpperRestrictedAvoidance_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalPromise.g:574:3: this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getExactRestrictedAvoidanceParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactRestrictedAvoidance_12=ruleExactRestrictedAvoidance();

                    state._fsp--;


                    			current = this_ExactRestrictedAvoidance_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalPromise.g:583:3: this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getLowerRestrictedAvoidanceParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerRestrictedAvoidance_13=ruleLowerRestrictedAvoidance();

                    state._fsp--;


                    			current = this_LowerRestrictedAvoidance_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalPromise.g:592:3: this_FutureAvoidance_14= ruleFutureAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getFutureAvoidanceParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_FutureAvoidance_14=ruleFutureAvoidance();

                    state._fsp--;


                    			current = this_FutureAvoidance_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalPromise.g:601:3: this_GlobalAvoidance_15= ruleGlobalAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getGlobalAvoidanceParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalAvoidance_15=ruleGlobalAvoidance();

                    state._fsp--;


                    			current = this_GlobalAvoidance_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalPromise.g:610:3: this_PastAvoidance_16= rulePastAvoidance
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getPastAvoidanceParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_PastAvoidance_16=rulePastAvoidance();

                    state._fsp--;


                    			current = this_PastAvoidance_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalPromise.g:619:3: this_Wait_17= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getWaitParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_17=ruleWait();

                    state._fsp--;


                    			current = this_Wait_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalPromise.g:628:3: this_DelayedReaction_18= ruleDelayedReaction
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getDelayedReactionParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayedReaction_18=ruleDelayedReaction();

                    state._fsp--;


                    			current = this_DelayedReaction_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalPromise.g:637:3: this_InstantReaction_19= ruleInstantReaction
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getInstantReactionParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstantReaction_19=ruleInstantReaction();

                    state._fsp--;


                    			current = this_InstantReaction_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalPromise.g:646:3: this_Check_20= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getCheckParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_20=ruleCheck();

                    state._fsp--;


                    			current = this_Check_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalPromise.g:655:3: this_CheckAndDeliver_21= ruleCheckAndDeliver
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getCheckAndDeliverParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckAndDeliver_21=ruleCheckAndDeliver();

                    state._fsp--;


                    			current = this_CheckAndDeliver_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalPromise.g:664:3: this_CheckSupplies_22= ruleCheckSupplies
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getCheckSuppliesParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckSupplies_22=ruleCheckSupplies();

                    state._fsp--;


                    			current = this_CheckSupplies_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalPromise.g:673:3: this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getCheckAndDeliverQChParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckAndDeliverQCh_23=ruleCheckAndDeliverQCh();

                    state._fsp--;


                    			current = this_CheckAndDeliverQCh_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalPromise.g:682:3: this_TestITAAPAs_24= ruleTestITAAPAs
                    {

                    			newCompositeNode(grammarAccess.getTasksAccess().getTestITAAPAsParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestITAAPAs_24=ruleTestITAAPAs();

                    state._fsp--;


                    			current = this_TestITAAPAs_24;
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
    // $ANTLR end "ruleTasks"


    // $ANTLR start "entryRuleRobot"
    // InternalPromise.g:694:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPromise.g:694:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPromise.g:695:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalPromise.g:701:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:707:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:708:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:708:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:709:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:709:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:710:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRobotRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"se.gu.co4robots.xtext.promise.Promise.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleLocation"
    // InternalPromise.g:730:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalPromise.g:730:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalPromise.g:731:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalPromise.g:737:1: ruleLocation returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:743:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:744:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:744:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:745:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:745:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:746:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLocationRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"se.gu.co4robots.xtext.promise.Promise.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleEvent"
    // InternalPromise.g:766:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPromise.g:766:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPromise.g:767:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalPromise.g:773:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:779:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:780:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:780:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:781:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:781:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:782:4: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:782:4: (lv_name_0_0= ruleEString )
            // InternalPromise.g:783:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"se.gu.co4robots.xtext.promise.Promise.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_1());
            		
            // InternalPromise.g:804:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:805:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:805:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:806:5: lv_description_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getDescriptionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.EString");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalPromise.g:827:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPromise.g:827:47: (iv_ruleAction= ruleAction EOF )
            // InternalPromise.g:828:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPromise.g:834:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:840:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:841:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:841:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:842:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:842:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:843:4: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:843:4: (lv_name_0_0= ruleEString )
            // InternalPromise.g:844:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"se.gu.co4robots.xtext.promise.Promise.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonKeyword_1());
            		
            // InternalPromise.g:865:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:866:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:866:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:867:5: lv_description_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getDescriptionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.EString");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleFallBackOp"
    // InternalPromise.g:888:1: entryRuleFallBackOp returns [EObject current=null] : iv_ruleFallBackOp= ruleFallBackOp EOF ;
    public final EObject entryRuleFallBackOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallBackOp = null;


        try {
            // InternalPromise.g:888:51: (iv_ruleFallBackOp= ruleFallBackOp EOF )
            // InternalPromise.g:889:2: iv_ruleFallBackOp= ruleFallBackOp EOF
            {
             newCompositeNode(grammarAccess.getFallBackOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFallBackOp=ruleFallBackOp();

            state._fsp--;

             current =iv_ruleFallBackOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFallBackOp"


    // $ANTLR start "ruleFallBackOp"
    // InternalPromise.g:895:1: ruleFallBackOp returns [EObject current=null] : (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFallBackOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:901:2: ( (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:902:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:902:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:903:3: otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFallBackOpAccess().getFallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFallBackOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:911:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:912:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:912:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:913:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFallBackOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:930:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPromise.g:931:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFallBackOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:935:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:936:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:936:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:937:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_inputOperators_4_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFallBackOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputOperators",
            	    							lv_inputOperators_4_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFallBackOpAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFallBackOp"


    // $ANTLR start "entryRuleSequenceOp"
    // InternalPromise.g:963:1: entryRuleSequenceOp returns [EObject current=null] : iv_ruleSequenceOp= ruleSequenceOp EOF ;
    public final EObject entryRuleSequenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOp = null;


        try {
            // InternalPromise.g:963:51: (iv_ruleSequenceOp= ruleSequenceOp EOF )
            // InternalPromise.g:964:2: iv_ruleSequenceOp= ruleSequenceOp EOF
            {
             newCompositeNode(grammarAccess.getSequenceOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceOp=ruleSequenceOp();

            state._fsp--;

             current =iv_ruleSequenceOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequenceOp"


    // $ANTLR start "ruleSequenceOp"
    // InternalPromise.g:970:1: ruleSequenceOp returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSequenceOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:976:2: ( (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:977:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:977:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:978:3: otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceOpAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:986:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:987:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:987:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:988:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1005:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPromise.g:1006:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequenceOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1010:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1011:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1011:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1012:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_inputOperators_4_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputOperators",
            	    							lv_inputOperators_4_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceOpAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSequenceOp"


    // $ANTLR start "entryRuleParallelOp"
    // InternalPromise.g:1038:1: entryRuleParallelOp returns [EObject current=null] : iv_ruleParallelOp= ruleParallelOp EOF ;
    public final EObject entryRuleParallelOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelOp = null;


        try {
            // InternalPromise.g:1038:51: (iv_ruleParallelOp= ruleParallelOp EOF )
            // InternalPromise.g:1039:2: iv_ruleParallelOp= ruleParallelOp EOF
            {
             newCompositeNode(grammarAccess.getParallelOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelOp=ruleParallelOp();

            state._fsp--;

             current =iv_ruleParallelOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParallelOp"


    // $ANTLR start "ruleParallelOp"
    // InternalPromise.g:1045:1: ruleParallelOp returns [EObject current=null] : ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' ) ;
    public final EObject ruleParallelOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_inputOperators_5_0 = null;

        EObject lv_inputOperators_10_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1051:2: ( ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' ) )
            // InternalPromise.g:1052:2: ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' )
            {
            // InternalPromise.g:1052:2: ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' )
            // InternalPromise.g:1053:3: () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}'
            {
            // InternalPromise.g:1053:3: ()
            // InternalPromise.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelOpAccess().getParallelOpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelOpAccess().getParallelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelOpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPromise.g:1068:3: ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPromise.g:1069:4: ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )*
                    {
                    // InternalPromise.g:1069:4: ( ( ruleEString ) )
                    // InternalPromise.g:1070:5: ( ruleEString )
                    {
                    // InternalPromise.g:1070:5: ( ruleEString )
                    // InternalPromise.g:1071:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputRobotsRobotCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalPromise.g:1089:4: ( (lv_inputOperators_5_0= ruleOperator ) )
                    // InternalPromise.g:1090:5: (lv_inputOperators_5_0= ruleOperator )
                    {
                    // InternalPromise.g:1090:5: (lv_inputOperators_5_0= ruleOperator )
                    // InternalPromise.g:1091:6: lv_inputOperators_5_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_inputOperators_5_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelOpRule());
                    						}
                    						add(
                    							current,
                    							"inputOperators",
                    							lv_inputOperators_5_0,
                    							"se.gu.co4robots.xtext.promise.Promise.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_3_3());
                    			
                    // InternalPromise.g:1112:4: (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPromise.g:1113:5: otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelOpAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalPromise.g:1117:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1118:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1118:6: ( ruleEString )
                    	    // InternalPromise.g:1119:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getInputRobotsRobotCrossReference_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,24,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_3_4_2());
                    	    				
                    	    // InternalPromise.g:1137:5: ( (lv_inputOperators_10_0= ruleOperator ) )
                    	    // InternalPromise.g:1138:6: (lv_inputOperators_10_0= ruleOperator )
                    	    {
                    	    // InternalPromise.g:1138:6: (lv_inputOperators_10_0= ruleOperator )
                    	    // InternalPromise.g:1139:7: lv_inputOperators_10_0= ruleOperator
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_inputOperators_10_0=ruleOperator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelOpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputOperators",
                    	    								lv_inputOperators_10_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.Operator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,25,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_3_4_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getParallelOpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParallelOp"


    // $ANTLR start "entryRuleEventHandlerOp"
    // InternalPromise.g:1170:1: entryRuleEventHandlerOp returns [EObject current=null] : iv_ruleEventHandlerOp= ruleEventHandlerOp EOF ;
    public final EObject entryRuleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOp = null;


        try {
            // InternalPromise.g:1170:55: (iv_ruleEventHandlerOp= ruleEventHandlerOp EOF )
            // InternalPromise.g:1171:2: iv_ruleEventHandlerOp= ruleEventHandlerOp EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandlerOp=ruleEventHandlerOp();

            state._fsp--;

             current =iv_ruleEventHandlerOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventHandlerOp"


    // $ANTLR start "ruleEventHandlerOp"
    // InternalPromise.g:1177:1: ruleEventHandlerOp returns [EObject current=null] : (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) ;
    public final EObject ruleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_inputOperators_4_0 = null;

        EObject lv_inputEvents_7_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1183:2: ( (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) )
            // InternalPromise.g:1184:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            {
            // InternalPromise.g:1184:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            // InternalPromise.g:1185:3: otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerOpAccess().getEventHandlerKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerOpAccess().getDefaultKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPromise.g:1201:3: ( (lv_inputOperators_4_0= ruleOperator ) )
            // InternalPromise.g:1202:4: (lv_inputOperators_4_0= ruleOperator )
            {
            // InternalPromise.g:1202:4: (lv_inputOperators_4_0= ruleOperator )
            // InternalPromise.g:1203:5: lv_inputOperators_4_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_inputOperators_4_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventHandlerOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_4_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_5());
            		
            // InternalPromise.g:1224:3: (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPromise.g:1225:4: otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventHandlerOpAccess().getExceptKeyword_6_0());
            	    			
            	    // InternalPromise.g:1229:4: ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1230:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1230:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    // InternalPromise.g:1231:6: lv_inputEvents_7_0= ruleEventAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputEventsEventAssignmentParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_inputEvents_7_0=ruleEventAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventHandlerOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputEvents",
            	    							lv_inputEvents_7_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.EventAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleEventHandlerOp"


    // $ANTLR start "entryRuleConditionOp"
    // InternalPromise.g:1257:1: entryRuleConditionOp returns [EObject current=null] : iv_ruleConditionOp= ruleConditionOp EOF ;
    public final EObject entryRuleConditionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOp = null;


        try {
            // InternalPromise.g:1257:52: (iv_ruleConditionOp= ruleConditionOp EOF )
            // InternalPromise.g:1258:2: iv_ruleConditionOp= ruleConditionOp EOF
            {
             newCompositeNode(grammarAccess.getConditionOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionOp=ruleConditionOp();

            state._fsp--;

             current =iv_ruleConditionOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionOp"


    // $ANTLR start "ruleConditionOp"
    // InternalPromise.g:1264:1: ruleConditionOp returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleConditionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputEvents_3_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1270:2: ( (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) )
            // InternalPromise.g:1271:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            {
            // InternalPromise.g:1271:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            // InternalPromise.g:1272:3: otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionOpAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1280:3: (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPromise.g:1281:4: otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionOpAccess().getIfKeyword_2_0());
            	    			
            	    // InternalPromise.g:1285:4: ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1286:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1286:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    // InternalPromise.g:1287:6: lv_inputEvents_3_0= ruleEventAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputEventsEventAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_inputEvents_3_0=ruleEventAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputEvents",
            	    							lv_inputEvents_3_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.EventAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionOpAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleConditionOp"


    // $ANTLR start "entryRuleTaskCombinationOp"
    // InternalPromise.g:1313:1: entryRuleTaskCombinationOp returns [EObject current=null] : iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF ;
    public final EObject entryRuleTaskCombinationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskCombinationOp = null;


        try {
            // InternalPromise.g:1313:58: (iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF )
            // InternalPromise.g:1314:2: iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF
            {
             newCompositeNode(grammarAccess.getTaskCombinationOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskCombinationOp=ruleTaskCombinationOp();

            state._fsp--;

             current =iv_ruleTaskCombinationOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskCombinationOp"


    // $ANTLR start "ruleTaskCombinationOp"
    // InternalPromise.g:1320:1: ruleTaskCombinationOp returns [EObject current=null] : (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' ) ;
    public final EObject ruleTaskCombinationOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_6_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1326:2: ( (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' ) )
            // InternalPromise.g:1327:2: (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' )
            {
            // InternalPromise.g:1327:2: (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' )
            // InternalPromise.g:1328:3: otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskCombinationOpAccess().getCombinationKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskCombinationOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1336:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1337:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1337:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1338:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getTaskCombinationOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskCombinationOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1355:3: ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=36)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPromise.g:1356:4: (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) )
            	    {
            	    // InternalPromise.g:1356:4: (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalPromise.g:1357:5: otherlv_3= '&'
            	            {
            	            otherlv_3=(Token)match(input,34,FOLLOW_12); 

            	            					newLeafNode(otherlv_3, grammarAccess.getTaskCombinationOpAccess().getAmpersandKeyword_3_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalPromise.g:1362:5: otherlv_4= 'AND'
            	            {
            	            otherlv_4=(Token)match(input,35,FOLLOW_12); 

            	            					newLeafNode(otherlv_4, grammarAccess.getTaskCombinationOpAccess().getANDKeyword_3_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalPromise.g:1367:5: otherlv_5= 'and'
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_12); 

            	            					newLeafNode(otherlv_5, grammarAccess.getTaskCombinationOpAccess().getAndKeyword_3_0_2());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalPromise.g:1372:4: ( (lv_inputOperators_6_0= ruleOperator ) )
            	    // InternalPromise.g:1373:5: (lv_inputOperators_6_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1373:5: (lv_inputOperators_6_0= ruleOperator )
            	    // InternalPromise.g:1374:6: lv_inputOperators_6_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getTaskCombinationOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_inputOperators_6_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskCombinationOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputOperators",
            	    							lv_inputOperators_6_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskCombinationOpAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleTaskCombinationOp"


    // $ANTLR start "entryRuleDelegateOp"
    // InternalPromise.g:1400:1: entryRuleDelegateOp returns [EObject current=null] : iv_ruleDelegateOp= ruleDelegateOp EOF ;
    public final EObject entryRuleDelegateOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateOp = null;


        try {
            // InternalPromise.g:1400:51: (iv_ruleDelegateOp= ruleDelegateOp EOF )
            // InternalPromise.g:1401:2: iv_ruleDelegateOp= ruleDelegateOp EOF
            {
             newCompositeNode(grammarAccess.getDelegateOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegateOp=ruleDelegateOp();

            state._fsp--;

             current =iv_ruleDelegateOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelegateOp"


    // $ANTLR start "ruleDelegateOp"
    // InternalPromise.g:1407:1: ruleDelegateOp returns [EObject current=null] : (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? otherlv_16= ')' ) ;
    public final EObject ruleDelegateOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_task_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1413:2: ( (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? otherlv_16= ')' ) )
            // InternalPromise.g:1414:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? otherlv_16= ')' )
            {
            // InternalPromise.g:1414:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? otherlv_16= ')' )
            // InternalPromise.g:1415:3: otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegateOpAccess().getDelegateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegateOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1423:3: ( (lv_task_2_0= ruleTasks ) )
            // InternalPromise.g:1424:4: (lv_task_2_0= ruleTasks )
            {
            // InternalPromise.g:1424:4: (lv_task_2_0= ruleTasks )
            // InternalPromise.g:1425:5: lv_task_2_0= ruleTasks
            {

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getTaskTasksParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_task_2_0=ruleTasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegateOpRule());
            					}
            					set(
            						current,
            						"task",
            						lv_task_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Tasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1442:3: (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPromise.g:1443:4: otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDelegateOpAccess().getLocationsKeyword_3_0());
                    			
                    // InternalPromise.g:1447:4: ( ( ruleEString ) )
                    // InternalPromise.g:1448:5: ( ruleEString )
                    {
                    // InternalPromise.g:1448:5: ( ruleEString )
                    // InternalPromise.g:1449:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1463:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPromise.g:1464:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDelegateOpAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPromise.g:1468:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1469:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1469:6: ( ruleEString )
                    	    // InternalPromise.g:1470:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1486:3: ( (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=16 && LA25_0<=17)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPromise.g:1487:4: (otherlv_7= 'actions' | otherlv_8= 'resources' ) ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalPromise.g:1487:4: (otherlv_7= 'actions' | otherlv_8= 'resources' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==17) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPromise.g:1488:5: otherlv_7= 'actions'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getDelegateOpAccess().getActionsKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPromise.g:1493:5: otherlv_8= 'resources'
                            {
                            otherlv_8=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getDelegateOpAccess().getResourcesKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPromise.g:1498:4: ( ( ruleEString ) )
                    // InternalPromise.g:1499:5: ( ruleEString )
                    {
                    // InternalPromise.g:1499:5: ( ruleEString )
                    // InternalPromise.g:1500:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1514:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalPromise.g:1515:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDelegateOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1519:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1520:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1520:6: ( ruleEString )
                    	    // InternalPromise.g:1521:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1537:3: (otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPromise.g:1538:4: otherlv_12= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelegateOpAccess().getStoppingEventsKeyword_5_0());
                    			
                    // InternalPromise.g:1542:4: ( ( ruleEString ) )
                    // InternalPromise.g:1543:5: ( ruleEString )
                    {
                    // InternalPromise.g:1543:5: ( ruleEString )
                    // InternalPromise.g:1544:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1558:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalPromise.g:1559:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDelegateOpAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPromise.g:1563:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1564:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1564:6: ( ruleEString )
                    	    // InternalPromise.g:1565:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDelegateOpAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleDelegateOp"


    // $ANTLR start "entryRuleEventAssignment"
    // InternalPromise.g:1589:1: entryRuleEventAssignment returns [EObject current=null] : iv_ruleEventAssignment= ruleEventAssignment EOF ;
    public final EObject entryRuleEventAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAssignment = null;


        try {
            // InternalPromise.g:1589:56: (iv_ruleEventAssignment= ruleEventAssignment EOF )
            // InternalPromise.g:1590:2: iv_ruleEventAssignment= ruleEventAssignment EOF
            {
             newCompositeNode(grammarAccess.getEventAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventAssignment=ruleEventAssignment();

            state._fsp--;

             current =iv_ruleEventAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventAssignment"


    // $ANTLR start "ruleEventAssignment"
    // InternalPromise.g:1596:1: ruleEventAssignment returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) ;
    public final EObject ruleEventAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputOperators_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1602:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) )
            // InternalPromise.g:1603:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            {
            // InternalPromise.g:1603:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            // InternalPromise.g:1604:3: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')'
            {
            // InternalPromise.g:1604:3: ( ( ruleEString ) )
            // InternalPromise.g:1605:4: ( ruleEString )
            {
            // InternalPromise.g:1605:4: ( ruleEString )
            // InternalPromise.g:1606:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAssignmentAccess().getInputEventEventCrossReference_0_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAssignmentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1624:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1625:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1625:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1626:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventAssignmentAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventAssignmentRule());
            					}
            					set(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAssignmentAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEventAssignment"


    // $ANTLR start "entryRuleSimpleAction"
    // InternalPromise.g:1651:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalPromise.g:1651:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalPromise.g:1652:2: iv_ruleSimpleAction= ruleSimpleAction EOF
            {
             newCompositeNode(grammarAccess.getSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAction=ruleSimpleAction();

            state._fsp--;

             current =iv_ruleSimpleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleAction"


    // $ANTLR start "ruleSimpleAction"
    // InternalPromise.g:1658:1: ruleSimpleAction returns [EObject current=null] : ( () otherlv_1= 'SimpleAction' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1664:2: ( ( () otherlv_1= 'SimpleAction' ) )
            // InternalPromise.g:1665:2: ( () otherlv_1= 'SimpleAction' )
            {
            // InternalPromise.g:1665:2: ( () otherlv_1= 'SimpleAction' )
            // InternalPromise.g:1666:3: () otherlv_1= 'SimpleAction'
            {
            // InternalPromise.g:1666:3: ()
            // InternalPromise.g:1667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleActionAccess().getSimpleActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleActionAccess().getSimpleActionKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleAction"


    // $ANTLR start "entryRuleVisit"
    // InternalPromise.g:1681:1: entryRuleVisit returns [EObject current=null] : iv_ruleVisit= ruleVisit EOF ;
    public final EObject entryRuleVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit = null;


        try {
            // InternalPromise.g:1681:46: (iv_ruleVisit= ruleVisit EOF )
            // InternalPromise.g:1682:2: iv_ruleVisit= ruleVisit EOF
            {
             newCompositeNode(grammarAccess.getVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisit=ruleVisit();

            state._fsp--;

             current =iv_ruleVisit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVisit"


    // $ANTLR start "ruleVisit"
    // InternalPromise.g:1688:1: ruleVisit returns [EObject current=null] : ( () otherlv_1= 'Visit' ) ;
    public final EObject ruleVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1694:2: ( ( () otherlv_1= 'Visit' ) )
            // InternalPromise.g:1695:2: ( () otherlv_1= 'Visit' )
            {
            // InternalPromise.g:1695:2: ( () otherlv_1= 'Visit' )
            // InternalPromise.g:1696:3: () otherlv_1= 'Visit'
            {
            // InternalPromise.g:1696:3: ()
            // InternalPromise.g:1697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisitAccess().getVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVisitAccess().getVisitKeyword_1());
            		

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
    // $ANTLR end "ruleVisit"


    // $ANTLR start "entryRuleSequencedVisit"
    // InternalPromise.g:1711:1: entryRuleSequencedVisit returns [EObject current=null] : iv_ruleSequencedVisit= ruleSequencedVisit EOF ;
    public final EObject entryRuleSequencedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedVisit = null;


        try {
            // InternalPromise.g:1711:55: (iv_ruleSequencedVisit= ruleSequencedVisit EOF )
            // InternalPromise.g:1712:2: iv_ruleSequencedVisit= ruleSequencedVisit EOF
            {
             newCompositeNode(grammarAccess.getSequencedVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequencedVisit=ruleSequencedVisit();

            state._fsp--;

             current =iv_ruleSequencedVisit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequencedVisit"


    // $ANTLR start "ruleSequencedVisit"
    // InternalPromise.g:1718:1: ruleSequencedVisit returns [EObject current=null] : ( () otherlv_1= 'SequencedVisit' ) ;
    public final EObject ruleSequencedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1724:2: ( ( () otherlv_1= 'SequencedVisit' ) )
            // InternalPromise.g:1725:2: ( () otherlv_1= 'SequencedVisit' )
            {
            // InternalPromise.g:1725:2: ( () otherlv_1= 'SequencedVisit' )
            // InternalPromise.g:1726:3: () otherlv_1= 'SequencedVisit'
            {
            // InternalPromise.g:1726:3: ()
            // InternalPromise.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedVisitAccess().getSequencedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSequencedVisitAccess().getSequencedVisitKeyword_1());
            		

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
    // $ANTLR end "ruleSequencedVisit"


    // $ANTLR start "entryRuleOrderderVisit"
    // InternalPromise.g:1741:1: entryRuleOrderderVisit returns [EObject current=null] : iv_ruleOrderderVisit= ruleOrderderVisit EOF ;
    public final EObject entryRuleOrderderVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderderVisit = null;


        try {
            // InternalPromise.g:1741:54: (iv_ruleOrderderVisit= ruleOrderderVisit EOF )
            // InternalPromise.g:1742:2: iv_ruleOrderderVisit= ruleOrderderVisit EOF
            {
             newCompositeNode(grammarAccess.getOrderderVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderderVisit=ruleOrderderVisit();

            state._fsp--;

             current =iv_ruleOrderderVisit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderderVisit"


    // $ANTLR start "ruleOrderderVisit"
    // InternalPromise.g:1748:1: ruleOrderderVisit returns [EObject current=null] : ( () otherlv_1= 'OrderedVisit' ) ;
    public final EObject ruleOrderderVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1754:2: ( ( () otherlv_1= 'OrderedVisit' ) )
            // InternalPromise.g:1755:2: ( () otherlv_1= 'OrderedVisit' )
            {
            // InternalPromise.g:1755:2: ( () otherlv_1= 'OrderedVisit' )
            // InternalPromise.g:1756:3: () otherlv_1= 'OrderedVisit'
            {
            // InternalPromise.g:1756:3: ()
            // InternalPromise.g:1757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderderVisitAccess().getOrderderVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderderVisitAccess().getOrderedVisitKeyword_1());
            		

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
    // $ANTLR end "ruleOrderderVisit"


    // $ANTLR start "entryRuleStrictOrderedVisit"
    // InternalPromise.g:1771:1: entryRuleStrictOrderedVisit returns [EObject current=null] : iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF ;
    public final EObject entryRuleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOrderedVisit = null;


        try {
            // InternalPromise.g:1771:59: (iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF )
            // InternalPromise.g:1772:2: iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF
            {
             newCompositeNode(grammarAccess.getStrictOrderedVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrictOrderedVisit=ruleStrictOrderedVisit();

            state._fsp--;

             current =iv_ruleStrictOrderedVisit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrictOrderedVisit"


    // $ANTLR start "ruleStrictOrderedVisit"
    // InternalPromise.g:1778:1: ruleStrictOrderedVisit returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedVisit' ) ;
    public final EObject ruleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1784:2: ( ( () otherlv_1= 'StrictOrderedVisit' ) )
            // InternalPromise.g:1785:2: ( () otherlv_1= 'StrictOrderedVisit' )
            {
            // InternalPromise.g:1785:2: ( () otherlv_1= 'StrictOrderedVisit' )
            // InternalPromise.g:1786:3: () otherlv_1= 'StrictOrderedVisit'
            {
            // InternalPromise.g:1786:3: ()
            // InternalPromise.g:1787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOrderedVisitAccess().getStrictOrderedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStrictOrderedVisitAccess().getStrictOrderedVisitKeyword_1());
            		

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
    // $ANTLR end "ruleStrictOrderedVisit"


    // $ANTLR start "entryRuleFairVisit"
    // InternalPromise.g:1801:1: entryRuleFairVisit returns [EObject current=null] : iv_ruleFairVisit= ruleFairVisit EOF ;
    public final EObject entryRuleFairVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairVisit = null;


        try {
            // InternalPromise.g:1801:50: (iv_ruleFairVisit= ruleFairVisit EOF )
            // InternalPromise.g:1802:2: iv_ruleFairVisit= ruleFairVisit EOF
            {
             newCompositeNode(grammarAccess.getFairVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFairVisit=ruleFairVisit();

            state._fsp--;

             current =iv_ruleFairVisit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFairVisit"


    // $ANTLR start "ruleFairVisit"
    // InternalPromise.g:1808:1: ruleFairVisit returns [EObject current=null] : ( () otherlv_1= 'FairVisit' ) ;
    public final EObject ruleFairVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1814:2: ( ( () otherlv_1= 'FairVisit' ) )
            // InternalPromise.g:1815:2: ( () otherlv_1= 'FairVisit' )
            {
            // InternalPromise.g:1815:2: ( () otherlv_1= 'FairVisit' )
            // InternalPromise.g:1816:3: () otherlv_1= 'FairVisit'
            {
            // InternalPromise.g:1816:3: ()
            // InternalPromise.g:1817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairVisitAccess().getFairVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFairVisitAccess().getFairVisitKeyword_1());
            		

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
    // $ANTLR end "ruleFairVisit"


    // $ANTLR start "entryRulePatrolling"
    // InternalPromise.g:1831:1: entryRulePatrolling returns [EObject current=null] : iv_rulePatrolling= rulePatrolling EOF ;
    public final EObject entryRulePatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrolling = null;


        try {
            // InternalPromise.g:1831:51: (iv_rulePatrolling= rulePatrolling EOF )
            // InternalPromise.g:1832:2: iv_rulePatrolling= rulePatrolling EOF
            {
             newCompositeNode(grammarAccess.getPatrollingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatrolling=rulePatrolling();

            state._fsp--;

             current =iv_rulePatrolling; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatrolling"


    // $ANTLR start "rulePatrolling"
    // InternalPromise.g:1838:1: rulePatrolling returns [EObject current=null] : ( () otherlv_1= 'Patrolling' ) ;
    public final EObject rulePatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1844:2: ( ( () otherlv_1= 'Patrolling' ) )
            // InternalPromise.g:1845:2: ( () otherlv_1= 'Patrolling' )
            {
            // InternalPromise.g:1845:2: ( () otherlv_1= 'Patrolling' )
            // InternalPromise.g:1846:3: () otherlv_1= 'Patrolling'
            {
            // InternalPromise.g:1846:3: ()
            // InternalPromise.g:1847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatrollingAccess().getPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPatrollingAccess().getPatrollingKeyword_1());
            		

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
    // $ANTLR end "rulePatrolling"


    // $ANTLR start "entryRuleSequencedPatrolling"
    // InternalPromise.g:1861:1: entryRuleSequencedPatrolling returns [EObject current=null] : iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF ;
    public final EObject entryRuleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedPatrolling = null;


        try {
            // InternalPromise.g:1861:60: (iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF )
            // InternalPromise.g:1862:2: iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF
            {
             newCompositeNode(grammarAccess.getSequencedPatrollingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequencedPatrolling=ruleSequencedPatrolling();

            state._fsp--;

             current =iv_ruleSequencedPatrolling; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequencedPatrolling"


    // $ANTLR start "ruleSequencedPatrolling"
    // InternalPromise.g:1868:1: ruleSequencedPatrolling returns [EObject current=null] : ( () otherlv_1= 'SequencedPatrolling' ) ;
    public final EObject ruleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1874:2: ( ( () otherlv_1= 'SequencedPatrolling' ) )
            // InternalPromise.g:1875:2: ( () otherlv_1= 'SequencedPatrolling' )
            {
            // InternalPromise.g:1875:2: ( () otherlv_1= 'SequencedPatrolling' )
            // InternalPromise.g:1876:3: () otherlv_1= 'SequencedPatrolling'
            {
            // InternalPromise.g:1876:3: ()
            // InternalPromise.g:1877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedPatrollingAccess().getSequencedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSequencedPatrollingAccess().getSequencedPatrollingKeyword_1());
            		

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
    // $ANTLR end "ruleSequencedPatrolling"


    // $ANTLR start "entryRuleOrderedPatrolling"
    // InternalPromise.g:1891:1: entryRuleOrderedPatrolling returns [EObject current=null] : iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF ;
    public final EObject entryRuleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedPatrolling = null;


        try {
            // InternalPromise.g:1891:58: (iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF )
            // InternalPromise.g:1892:2: iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF
            {
             newCompositeNode(grammarAccess.getOrderedPatrollingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedPatrolling=ruleOrderedPatrolling();

            state._fsp--;

             current =iv_ruleOrderedPatrolling; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderedPatrolling"


    // $ANTLR start "ruleOrderedPatrolling"
    // InternalPromise.g:1898:1: ruleOrderedPatrolling returns [EObject current=null] : ( () otherlv_1= 'OrderedPatrolling' ) ;
    public final EObject ruleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1904:2: ( ( () otherlv_1= 'OrderedPatrolling' ) )
            // InternalPromise.g:1905:2: ( () otherlv_1= 'OrderedPatrolling' )
            {
            // InternalPromise.g:1905:2: ( () otherlv_1= 'OrderedPatrolling' )
            // InternalPromise.g:1906:3: () otherlv_1= 'OrderedPatrolling'
            {
            // InternalPromise.g:1906:3: ()
            // InternalPromise.g:1907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedPatrollingAccess().getOrderedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedPatrollingAccess().getOrderedPatrollingKeyword_1());
            		

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
    // $ANTLR end "ruleOrderedPatrolling"


    // $ANTLR start "entryRuleStrictOreredPatrolling"
    // InternalPromise.g:1921:1: entryRuleStrictOreredPatrolling returns [EObject current=null] : iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF ;
    public final EObject entryRuleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOreredPatrolling = null;


        try {
            // InternalPromise.g:1921:63: (iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF )
            // InternalPromise.g:1922:2: iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF
            {
             newCompositeNode(grammarAccess.getStrictOreredPatrollingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrictOreredPatrolling=ruleStrictOreredPatrolling();

            state._fsp--;

             current =iv_ruleStrictOreredPatrolling; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrictOreredPatrolling"


    // $ANTLR start "ruleStrictOreredPatrolling"
    // InternalPromise.g:1928:1: ruleStrictOreredPatrolling returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedPatrolling' ) ;
    public final EObject ruleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1934:2: ( ( () otherlv_1= 'StrictOrderedPatrolling' ) )
            // InternalPromise.g:1935:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            {
            // InternalPromise.g:1935:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            // InternalPromise.g:1936:3: () otherlv_1= 'StrictOrderedPatrolling'
            {
            // InternalPromise.g:1936:3: ()
            // InternalPromise.g:1937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOreredPatrollingAccess().getStrictOreredPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStrictOreredPatrollingAccess().getStrictOrderedPatrollingKeyword_1());
            		

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
    // $ANTLR end "ruleStrictOreredPatrolling"


    // $ANTLR start "entryRuleFairPatrolling"
    // InternalPromise.g:1951:1: entryRuleFairPatrolling returns [EObject current=null] : iv_ruleFairPatrolling= ruleFairPatrolling EOF ;
    public final EObject entryRuleFairPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairPatrolling = null;


        try {
            // InternalPromise.g:1951:55: (iv_ruleFairPatrolling= ruleFairPatrolling EOF )
            // InternalPromise.g:1952:2: iv_ruleFairPatrolling= ruleFairPatrolling EOF
            {
             newCompositeNode(grammarAccess.getFairPatrollingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFairPatrolling=ruleFairPatrolling();

            state._fsp--;

             current =iv_ruleFairPatrolling; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFairPatrolling"


    // $ANTLR start "ruleFairPatrolling"
    // InternalPromise.g:1958:1: ruleFairPatrolling returns [EObject current=null] : ( () otherlv_1= 'FairPatrolling' ) ;
    public final EObject ruleFairPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1964:2: ( ( () otherlv_1= 'FairPatrolling' ) )
            // InternalPromise.g:1965:2: ( () otherlv_1= 'FairPatrolling' )
            {
            // InternalPromise.g:1965:2: ( () otherlv_1= 'FairPatrolling' )
            // InternalPromise.g:1966:3: () otherlv_1= 'FairPatrolling'
            {
            // InternalPromise.g:1966:3: ()
            // InternalPromise.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairPatrollingAccess().getFairPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFairPatrollingAccess().getFairPatrollingKeyword_1());
            		

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
    // $ANTLR end "ruleFairPatrolling"


    // $ANTLR start "entryRuleCheck"
    // InternalPromise.g:1981:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalPromise.g:1981:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalPromise.g:1982:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalPromise.g:1988:1: ruleCheck returns [EObject current=null] : ( () otherlv_1= 'Check' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1994:2: ( ( () otherlv_1= 'Check' ) )
            // InternalPromise.g:1995:2: ( () otherlv_1= 'Check' )
            {
            // InternalPromise.g:1995:2: ( () otherlv_1= 'Check' )
            // InternalPromise.g:1996:3: () otherlv_1= 'Check'
            {
            // InternalPromise.g:1996:3: ()
            // InternalPromise.g:1997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckAccess().getCheckAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckAccess().getCheckKeyword_1());
            		

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleCheckAndDeliver"
    // InternalPromise.g:2011:1: entryRuleCheckAndDeliver returns [EObject current=null] : iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF ;
    public final EObject entryRuleCheckAndDeliver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckAndDeliver = null;


        try {
            // InternalPromise.g:2011:56: (iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF )
            // InternalPromise.g:2012:2: iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF
            {
             newCompositeNode(grammarAccess.getCheckAndDeliverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckAndDeliver=ruleCheckAndDeliver();

            state._fsp--;

             current =iv_ruleCheckAndDeliver; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckAndDeliver"


    // $ANTLR start "ruleCheckAndDeliver"
    // InternalPromise.g:2018:1: ruleCheckAndDeliver returns [EObject current=null] : ( () otherlv_1= 'CheckAndDeliver' ) ;
    public final EObject ruleCheckAndDeliver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2024:2: ( ( () otherlv_1= 'CheckAndDeliver' ) )
            // InternalPromise.g:2025:2: ( () otherlv_1= 'CheckAndDeliver' )
            {
            // InternalPromise.g:2025:2: ( () otherlv_1= 'CheckAndDeliver' )
            // InternalPromise.g:2026:3: () otherlv_1= 'CheckAndDeliver'
            {
            // InternalPromise.g:2026:3: ()
            // InternalPromise.g:2027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckAndDeliverAccess().getCheckAndDeliverAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckAndDeliverAccess().getCheckAndDeliverKeyword_1());
            		

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
    // $ANTLR end "ruleCheckAndDeliver"


    // $ANTLR start "entryRuleCheckSupplies"
    // InternalPromise.g:2041:1: entryRuleCheckSupplies returns [EObject current=null] : iv_ruleCheckSupplies= ruleCheckSupplies EOF ;
    public final EObject entryRuleCheckSupplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckSupplies = null;


        try {
            // InternalPromise.g:2041:54: (iv_ruleCheckSupplies= ruleCheckSupplies EOF )
            // InternalPromise.g:2042:2: iv_ruleCheckSupplies= ruleCheckSupplies EOF
            {
             newCompositeNode(grammarAccess.getCheckSuppliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckSupplies=ruleCheckSupplies();

            state._fsp--;

             current =iv_ruleCheckSupplies; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckSupplies"


    // $ANTLR start "ruleCheckSupplies"
    // InternalPromise.g:2048:1: ruleCheckSupplies returns [EObject current=null] : ( () otherlv_1= 'CheckSupplies' ) ;
    public final EObject ruleCheckSupplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2054:2: ( ( () otherlv_1= 'CheckSupplies' ) )
            // InternalPromise.g:2055:2: ( () otherlv_1= 'CheckSupplies' )
            {
            // InternalPromise.g:2055:2: ( () otherlv_1= 'CheckSupplies' )
            // InternalPromise.g:2056:3: () otherlv_1= 'CheckSupplies'
            {
            // InternalPromise.g:2056:3: ()
            // InternalPromise.g:2057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckSuppliesAccess().getCheckSuppliesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckSuppliesAccess().getCheckSuppliesKeyword_1());
            		

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
    // $ANTLR end "ruleCheckSupplies"


    // $ANTLR start "entryRuleCheckAndDeliverQCh"
    // InternalPromise.g:2071:1: entryRuleCheckAndDeliverQCh returns [EObject current=null] : iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF ;
    public final EObject entryRuleCheckAndDeliverQCh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckAndDeliverQCh = null;


        try {
            // InternalPromise.g:2071:59: (iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF )
            // InternalPromise.g:2072:2: iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF
            {
             newCompositeNode(grammarAccess.getCheckAndDeliverQChRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckAndDeliverQCh=ruleCheckAndDeliverQCh();

            state._fsp--;

             current =iv_ruleCheckAndDeliverQCh; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckAndDeliverQCh"


    // $ANTLR start "ruleCheckAndDeliverQCh"
    // InternalPromise.g:2078:1: ruleCheckAndDeliverQCh returns [EObject current=null] : ( () otherlv_1= 'CheckAndDeliverQCh' ) ;
    public final EObject ruleCheckAndDeliverQCh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2084:2: ( ( () otherlv_1= 'CheckAndDeliverQCh' ) )
            // InternalPromise.g:2085:2: ( () otherlv_1= 'CheckAndDeliverQCh' )
            {
            // InternalPromise.g:2085:2: ( () otherlv_1= 'CheckAndDeliverQCh' )
            // InternalPromise.g:2086:3: () otherlv_1= 'CheckAndDeliverQCh'
            {
            // InternalPromise.g:2086:3: ()
            // InternalPromise.g:2087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckAndDeliverQChAccess().getCheckAndDeliverQChAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckAndDeliverQChAccess().getCheckAndDeliverQChKeyword_1());
            		

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
    // $ANTLR end "ruleCheckAndDeliverQCh"


    // $ANTLR start "entryRuleTestITAAPAs"
    // InternalPromise.g:2101:1: entryRuleTestITAAPAs returns [EObject current=null] : iv_ruleTestITAAPAs= ruleTestITAAPAs EOF ;
    public final EObject entryRuleTestITAAPAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestITAAPAs = null;


        try {
            // InternalPromise.g:2101:52: (iv_ruleTestITAAPAs= ruleTestITAAPAs EOF )
            // InternalPromise.g:2102:2: iv_ruleTestITAAPAs= ruleTestITAAPAs EOF
            {
             newCompositeNode(grammarAccess.getTestITAAPAsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestITAAPAs=ruleTestITAAPAs();

            state._fsp--;

             current =iv_ruleTestITAAPAs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestITAAPAs"


    // $ANTLR start "ruleTestITAAPAs"
    // InternalPromise.g:2108:1: ruleTestITAAPAs returns [EObject current=null] : ( () otherlv_1= 'TestITAAPAs' ) ;
    public final EObject ruleTestITAAPAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2114:2: ( ( () otherlv_1= 'TestITAAPAs' ) )
            // InternalPromise.g:2115:2: ( () otherlv_1= 'TestITAAPAs' )
            {
            // InternalPromise.g:2115:2: ( () otherlv_1= 'TestITAAPAs' )
            // InternalPromise.g:2116:3: () otherlv_1= 'TestITAAPAs'
            {
            // InternalPromise.g:2116:3: ()
            // InternalPromise.g:2117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestITAAPAsAccess().getTestITAAPAsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTestITAAPAsAccess().getTestITAAPAsKeyword_1());
            		

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
    // $ANTLR end "ruleTestITAAPAs"


    // $ANTLR start "entryRuleUpperRestrictedAvoidance"
    // InternalPromise.g:2131:1: entryRuleUpperRestrictedAvoidance returns [EObject current=null] : iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF ;
    public final EObject entryRuleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2131:65: (iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF )
            // InternalPromise.g:2132:2: iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF
            {
             newCompositeNode(grammarAccess.getUpperRestrictedAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperRestrictedAvoidance=ruleUpperRestrictedAvoidance();

            state._fsp--;

             current =iv_ruleUpperRestrictedAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpperRestrictedAvoidance"


    // $ANTLR start "ruleUpperRestrictedAvoidance"
    // InternalPromise.g:2138:1: ruleUpperRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'UpperRestrictedAvoidance' ) ;
    public final EObject ruleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2144:2: ( ( () otherlv_1= 'UpperRestrictedAvoidance' ) )
            // InternalPromise.g:2145:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            {
            // InternalPromise.g:2145:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            // InternalPromise.g:2146:3: () otherlv_1= 'UpperRestrictedAvoidance'
            {
            // InternalPromise.g:2146:3: ()
            // InternalPromise.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpperRestrictedAvoidanceAccess().getUpperRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperRestrictedAvoidanceAccess().getUpperRestrictedAvoidanceKeyword_1());
            		

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
    // $ANTLR end "ruleUpperRestrictedAvoidance"


    // $ANTLR start "entryRuleExactRestrictedAvoidance"
    // InternalPromise.g:2161:1: entryRuleExactRestrictedAvoidance returns [EObject current=null] : iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF ;
    public final EObject entryRuleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2161:65: (iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF )
            // InternalPromise.g:2162:2: iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF
            {
             newCompositeNode(grammarAccess.getExactRestrictedAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactRestrictedAvoidance=ruleExactRestrictedAvoidance();

            state._fsp--;

             current =iv_ruleExactRestrictedAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExactRestrictedAvoidance"


    // $ANTLR start "ruleExactRestrictedAvoidance"
    // InternalPromise.g:2168:1: ruleExactRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'ExactRestrictedAvoidance' ) ;
    public final EObject ruleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2174:2: ( ( () otherlv_1= 'ExactRestrictedAvoidance' ) )
            // InternalPromise.g:2175:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            {
            // InternalPromise.g:2175:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            // InternalPromise.g:2176:3: () otherlv_1= 'ExactRestrictedAvoidance'
            {
            // InternalPromise.g:2176:3: ()
            // InternalPromise.g:2177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactRestrictedAvoidanceAccess().getExactRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExactRestrictedAvoidanceAccess().getExactRestrictedAvoidanceKeyword_1());
            		

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
    // $ANTLR end "ruleExactRestrictedAvoidance"


    // $ANTLR start "entryRuleLowerRestrictedAvoidance"
    // InternalPromise.g:2191:1: entryRuleLowerRestrictedAvoidance returns [EObject current=null] : iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF ;
    public final EObject entryRuleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2191:65: (iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF )
            // InternalPromise.g:2192:2: iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF
            {
             newCompositeNode(grammarAccess.getLowerRestrictedAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerRestrictedAvoidance=ruleLowerRestrictedAvoidance();

            state._fsp--;

             current =iv_ruleLowerRestrictedAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLowerRestrictedAvoidance"


    // $ANTLR start "ruleLowerRestrictedAvoidance"
    // InternalPromise.g:2198:1: ruleLowerRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'LowerRestrictedAvoidance' ) ;
    public final EObject ruleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2204:2: ( ( () otherlv_1= 'LowerRestrictedAvoidance' ) )
            // InternalPromise.g:2205:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            {
            // InternalPromise.g:2205:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            // InternalPromise.g:2206:3: () otherlv_1= 'LowerRestrictedAvoidance'
            {
            // InternalPromise.g:2206:3: ()
            // InternalPromise.g:2207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLowerRestrictedAvoidanceAccess().getLowerRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerRestrictedAvoidanceAccess().getLowerRestrictedAvoidanceKeyword_1());
            		

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
    // $ANTLR end "ruleLowerRestrictedAvoidance"


    // $ANTLR start "entryRuleFutureAvoidance"
    // InternalPromise.g:2221:1: entryRuleFutureAvoidance returns [EObject current=null] : iv_ruleFutureAvoidance= ruleFutureAvoidance EOF ;
    public final EObject entryRuleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureAvoidance = null;


        try {
            // InternalPromise.g:2221:56: (iv_ruleFutureAvoidance= ruleFutureAvoidance EOF )
            // InternalPromise.g:2222:2: iv_ruleFutureAvoidance= ruleFutureAvoidance EOF
            {
             newCompositeNode(grammarAccess.getFutureAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFutureAvoidance=ruleFutureAvoidance();

            state._fsp--;

             current =iv_ruleFutureAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFutureAvoidance"


    // $ANTLR start "ruleFutureAvoidance"
    // InternalPromise.g:2228:1: ruleFutureAvoidance returns [EObject current=null] : ( () otherlv_1= 'FutureAvoidance' ) ;
    public final EObject ruleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2234:2: ( ( () otherlv_1= 'FutureAvoidance' ) )
            // InternalPromise.g:2235:2: ( () otherlv_1= 'FutureAvoidance' )
            {
            // InternalPromise.g:2235:2: ( () otherlv_1= 'FutureAvoidance' )
            // InternalPromise.g:2236:3: () otherlv_1= 'FutureAvoidance'
            {
            // InternalPromise.g:2236:3: ()
            // InternalPromise.g:2237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureAvoidanceAccess().getFutureAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureAvoidanceAccess().getFutureAvoidanceKeyword_1());
            		

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
    // $ANTLR end "ruleFutureAvoidance"


    // $ANTLR start "entryRuleGlobalAvoidance"
    // InternalPromise.g:2251:1: entryRuleGlobalAvoidance returns [EObject current=null] : iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF ;
    public final EObject entryRuleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAvoidance = null;


        try {
            // InternalPromise.g:2251:56: (iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF )
            // InternalPromise.g:2252:2: iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF
            {
             newCompositeNode(grammarAccess.getGlobalAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalAvoidance=ruleGlobalAvoidance();

            state._fsp--;

             current =iv_ruleGlobalAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobalAvoidance"


    // $ANTLR start "ruleGlobalAvoidance"
    // InternalPromise.g:2258:1: ruleGlobalAvoidance returns [EObject current=null] : ( () otherlv_1= 'GlobalAvoidance' ) ;
    public final EObject ruleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2264:2: ( ( () otherlv_1= 'GlobalAvoidance' ) )
            // InternalPromise.g:2265:2: ( () otherlv_1= 'GlobalAvoidance' )
            {
            // InternalPromise.g:2265:2: ( () otherlv_1= 'GlobalAvoidance' )
            // InternalPromise.g:2266:3: () otherlv_1= 'GlobalAvoidance'
            {
            // InternalPromise.g:2266:3: ()
            // InternalPromise.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalAvoidanceAccess().getGlobalAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAvoidanceAccess().getGlobalAvoidanceKeyword_1());
            		

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
    // $ANTLR end "ruleGlobalAvoidance"


    // $ANTLR start "entryRulePastAvoidance"
    // InternalPromise.g:2281:1: entryRulePastAvoidance returns [EObject current=null] : iv_rulePastAvoidance= rulePastAvoidance EOF ;
    public final EObject entryRulePastAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastAvoidance = null;


        try {
            // InternalPromise.g:2281:54: (iv_rulePastAvoidance= rulePastAvoidance EOF )
            // InternalPromise.g:2282:2: iv_rulePastAvoidance= rulePastAvoidance EOF
            {
             newCompositeNode(grammarAccess.getPastAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastAvoidance=rulePastAvoidance();

            state._fsp--;

             current =iv_rulePastAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePastAvoidance"


    // $ANTLR start "rulePastAvoidance"
    // InternalPromise.g:2288:1: rulePastAvoidance returns [EObject current=null] : ( () otherlv_1= 'PastAvoidance' ) ;
    public final EObject rulePastAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2294:2: ( ( () otherlv_1= 'PastAvoidance' ) )
            // InternalPromise.g:2295:2: ( () otherlv_1= 'PastAvoidance' )
            {
            // InternalPromise.g:2295:2: ( () otherlv_1= 'PastAvoidance' )
            // InternalPromise.g:2296:3: () otherlv_1= 'PastAvoidance'
            {
            // InternalPromise.g:2296:3: ()
            // InternalPromise.g:2297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastAvoidanceAccess().getPastAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPastAvoidanceAccess().getPastAvoidanceKeyword_1());
            		

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
    // $ANTLR end "rulePastAvoidance"


    // $ANTLR start "entryRuleWait"
    // InternalPromise.g:2311:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalPromise.g:2311:45: (iv_ruleWait= ruleWait EOF )
            // InternalPromise.g:2312:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalPromise.g:2318:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2324:2: ( ( () otherlv_1= 'Wait' ) )
            // InternalPromise.g:2325:2: ( () otherlv_1= 'Wait' )
            {
            // InternalPromise.g:2325:2: ( () otherlv_1= 'Wait' )
            // InternalPromise.g:2326:3: () otherlv_1= 'Wait'
            {
            // InternalPromise.g:2326:3: ()
            // InternalPromise.g:2327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
            		

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleDelayedReaction"
    // InternalPromise.g:2341:1: entryRuleDelayedReaction returns [EObject current=null] : iv_ruleDelayedReaction= ruleDelayedReaction EOF ;
    public final EObject entryRuleDelayedReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedReaction = null;


        try {
            // InternalPromise.g:2341:56: (iv_ruleDelayedReaction= ruleDelayedReaction EOF )
            // InternalPromise.g:2342:2: iv_ruleDelayedReaction= ruleDelayedReaction EOF
            {
             newCompositeNode(grammarAccess.getDelayedReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayedReaction=ruleDelayedReaction();

            state._fsp--;

             current =iv_ruleDelayedReaction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelayedReaction"


    // $ANTLR start "ruleDelayedReaction"
    // InternalPromise.g:2348:1: ruleDelayedReaction returns [EObject current=null] : ( () otherlv_1= 'DelayedReaction' ) ;
    public final EObject ruleDelayedReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2354:2: ( ( () otherlv_1= 'DelayedReaction' ) )
            // InternalPromise.g:2355:2: ( () otherlv_1= 'DelayedReaction' )
            {
            // InternalPromise.g:2355:2: ( () otherlv_1= 'DelayedReaction' )
            // InternalPromise.g:2356:3: () otherlv_1= 'DelayedReaction'
            {
            // InternalPromise.g:2356:3: ()
            // InternalPromise.g:2357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayedReactionAccess().getDelayedReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDelayedReactionAccess().getDelayedReactionKeyword_1());
            		

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
    // $ANTLR end "ruleDelayedReaction"


    // $ANTLR start "entryRuleInstantReaction"
    // InternalPromise.g:2371:1: entryRuleInstantReaction returns [EObject current=null] : iv_ruleInstantReaction= ruleInstantReaction EOF ;
    public final EObject entryRuleInstantReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantReaction = null;


        try {
            // InternalPromise.g:2371:56: (iv_ruleInstantReaction= ruleInstantReaction EOF )
            // InternalPromise.g:2372:2: iv_ruleInstantReaction= ruleInstantReaction EOF
            {
             newCompositeNode(grammarAccess.getInstantReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstantReaction=ruleInstantReaction();

            state._fsp--;

             current =iv_ruleInstantReaction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstantReaction"


    // $ANTLR start "ruleInstantReaction"
    // InternalPromise.g:2378:1: ruleInstantReaction returns [EObject current=null] : ( () otherlv_1= 'InstantReaction' ) ;
    public final EObject ruleInstantReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2384:2: ( ( () otherlv_1= 'InstantReaction' ) )
            // InternalPromise.g:2385:2: ( () otherlv_1= 'InstantReaction' )
            {
            // InternalPromise.g:2385:2: ( () otherlv_1= 'InstantReaction' )
            // InternalPromise.g:2386:3: () otherlv_1= 'InstantReaction'
            {
            // InternalPromise.g:2386:3: ()
            // InternalPromise.g:2387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstantReactionAccess().getInstantReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInstantReactionAccess().getInstantReactionKeyword_1());
            		

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
    // $ANTLR end "ruleInstantReaction"


    // $ANTLR start "entryRuleEString"
    // InternalPromise.g:2401:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPromise.g:2401:47: (iv_ruleEString= ruleEString EOF )
            // InternalPromise.g:2402:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPromise.g:2408:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2414:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPromise.g:2415:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPromise.g:2415:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPromise.g:2416:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2424:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000229C800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001C02000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFFFFFF8000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004002130000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004002038000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004002008000L});

}