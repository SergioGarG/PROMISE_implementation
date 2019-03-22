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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mission'", "'{'", "'conditions'", "'events'", "','", "'actions'", "'}'", "'robots'", "'locations'", "'operators'", "':'", "'fallback'", "'('", "')'", "'sequence'", "'parallel'", "'eventHandler'", "'default'", "'except'", "'condition'", "'if'", "'delegate'", "'stoppingEvents'", "'and'", "'&'", "'AND'", "'or'", "'|'", "'OR'", "'SimpleAction'", "'Visit'", "'SequencedVisit'", "'OrderedVisit'", "'StrictOrderedVisit'", "'FairVisit'", "'Patrolling'", "'SequencedPatrolling'", "'OrderedPatrolling'", "'StrictOrderedPatrolling'", "'FairPatrolling'", "'UpperRestrictedAvoidance'", "'ExactRestrictedAvoidance'", "'LowerRestrictedAvoidance'", "'FutureAvoidance'", "'GlobalAvoidance'", "'PastAvoidance'", "'Wait'", "'DelayedReaction'", "'InstantReaction'"
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
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    // InternalPromise.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )? otherlv_13= 'robots' ( (lv_robots_14_0= ruleRobot ) ) (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )* (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )? otherlv_21= 'operators' otherlv_22= '{' ( (lv_operator_23_0= ruleOperator ) ) (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )* otherlv_26= '}' otherlv_27= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_events_5_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_robots_14_0 = null;

        EObject lv_robots_16_0 = null;

        EObject lv_locations_18_0 = null;

        EObject lv_locations_20_0 = null;

        EObject lv_operator_23_0 = null;

        EObject lv_operator_25_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:77:2: ( (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )? otherlv_13= 'robots' ( (lv_robots_14_0= ruleRobot ) ) (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )* (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )? otherlv_21= 'operators' otherlv_22= '{' ( (lv_operator_23_0= ruleOperator ) ) (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )* otherlv_26= '}' otherlv_27= '}' ) )
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )? otherlv_13= 'robots' ( (lv_robots_14_0= ruleRobot ) ) (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )* (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )? otherlv_21= 'operators' otherlv_22= '{' ( (lv_operator_23_0= ruleOperator ) ) (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )* otherlv_26= '}' otherlv_27= '}' )
            {
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )? otherlv_13= 'robots' ( (lv_robots_14_0= ruleRobot ) ) (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )* (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )? otherlv_21= 'operators' otherlv_22= '{' ( (lv_operator_23_0= ruleOperator ) ) (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )* otherlv_26= '}' otherlv_27= '}' )
            // InternalPromise.g:79:3: otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )? otherlv_13= 'robots' ( (lv_robots_14_0= ruleRobot ) ) (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )* (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )? otherlv_21= 'operators' otherlv_22= '{' ( (lv_operator_23_0= ruleOperator ) ) (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )* otherlv_26= '}' otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPromise.g:87:3: (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPromise.g:88:4: otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? otherlv_12= '}'
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

                    // InternalPromise.g:146:4: (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPromise.g:147:5: otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )*
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getActionsKeyword_2_3_0());
                            				
                            // InternalPromise.g:151:5: ( (lv_actions_9_0= ruleAction ) )
                            // InternalPromise.g:152:6: (lv_actions_9_0= ruleAction )
                            {
                            // InternalPromise.g:152:6: (lv_actions_9_0= ruleAction )
                            // InternalPromise.g:153:7: lv_actions_9_0= ruleAction
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_actions_9_0=ruleAction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"actions",
                            								lv_actions_9_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Action");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:170:5: (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==15) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalPromise.g:171:6: otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) )
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                            	    						newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getCommaKeyword_2_3_2_0());
                            	    					
                            	    // InternalPromise.g:175:6: ( (lv_actions_11_0= ruleAction ) )
                            	    // InternalPromise.g:176:7: (lv_actions_11_0= ruleAction )
                            	    {
                            	    // InternalPromise.g:176:7: (lv_actions_11_0= ruleAction )
                            	    // InternalPromise.g:177:8: lv_actions_11_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_actions_11_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_11_0,
                            	    									"se.gu.co4robots.xtext.promise.Promise.Action");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getRobotsKeyword_3());
            		
            // InternalPromise.g:205:3: ( (lv_robots_14_0= ruleRobot ) )
            // InternalPromise.g:206:4: (lv_robots_14_0= ruleRobot )
            {
            // InternalPromise.g:206:4: (lv_robots_14_0= ruleRobot )
            // InternalPromise.g:207:5: lv_robots_14_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_robots_14_0=ruleRobot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"robots",
            						lv_robots_14_0,
            						"se.gu.co4robots.xtext.promise.Promise.Robot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:224:3: (otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPromise.g:225:4: otherlv_15= ',' ( (lv_robots_16_0= ruleRobot ) )
            	    {
            	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalPromise.g:229:4: ( (lv_robots_16_0= ruleRobot ) )
            	    // InternalPromise.g:230:5: (lv_robots_16_0= ruleRobot )
            	    {
            	    // InternalPromise.g:230:5: (lv_robots_16_0= ruleRobot )
            	    // InternalPromise.g:231:6: lv_robots_16_0= ruleRobot
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_robots_16_0=ruleRobot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"robots",
            	    							lv_robots_16_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Robot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalPromise.g:249:3: (otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPromise.g:250:4: otherlv_17= 'locations' ( (lv_locations_18_0= ruleLocation ) ) (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )*
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getLocationsKeyword_6_0());
                    			
                    // InternalPromise.g:254:4: ( (lv_locations_18_0= ruleLocation ) )
                    // InternalPromise.g:255:5: (lv_locations_18_0= ruleLocation )
                    {
                    // InternalPromise.g:255:5: (lv_locations_18_0= ruleLocation )
                    // InternalPromise.g:256:6: lv_locations_18_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_locations_18_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"locations",
                    							lv_locations_18_0,
                    							"se.gu.co4robots.xtext.promise.Promise.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:273:4: (otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPromise.g:274:5: otherlv_19= ',' ( (lv_locations_20_0= ruleLocation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalPromise.g:278:5: ( (lv_locations_20_0= ruleLocation ) )
                    	    // InternalPromise.g:279:6: (lv_locations_20_0= ruleLocation )
                    	    {
                    	    // InternalPromise.g:279:6: (lv_locations_20_0= ruleLocation )
                    	    // InternalPromise.g:280:7: lv_locations_20_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_locations_20_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locations",
                    	    								lv_locations_20_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getOperatorsKeyword_7());
            		
            otherlv_22=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalPromise.g:307:3: ( (lv_operator_23_0= ruleOperator ) )
            // InternalPromise.g:308:4: (lv_operator_23_0= ruleOperator )
            {
            // InternalPromise.g:308:4: (lv_operator_23_0= ruleOperator )
            // InternalPromise.g:309:5: lv_operator_23_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_23_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_23_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:326:3: (otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPromise.g:327:4: otherlv_24= ',' ( (lv_operator_25_0= ruleOperator ) )
            	    {
            	    otherlv_24=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalPromise.g:331:4: ( (lv_operator_25_0= ruleOperator ) )
            	    // InternalPromise.g:332:5: (lv_operator_25_0= ruleOperator )
            	    {
            	    // InternalPromise.g:332:5: (lv_operator_25_0= ruleOperator )
            	    // InternalPromise.g:333:6: lv_operator_25_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operator_25_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_25_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_26=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_27=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalPromise.g:363:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalPromise.g:363:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalPromise.g:364:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalPromise.g:370:1: ruleOperator returns [EObject current=null] : (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_FallBackOp_0 = null;

        EObject this_SequenceOp_1 = null;

        EObject this_ParallelOp_2 = null;

        EObject this_EventHandlerOp_3 = null;

        EObject this_ConditionOp_4 = null;

        EObject this_DelegateOp_5 = null;

        EObject this_ANDOp_6 = null;

        EObject this_OROp_7 = null;



        	enterRule();

        try {
            // InternalPromise.g:376:2: ( (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp ) )
            // InternalPromise.g:377:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp )
            {
            // InternalPromise.g:377:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            case 32:
                {
                alt10=6;
                }
                break;
            case 34:
                {
                alt10=7;
                }
                break;
            case 37:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPromise.g:378:3: this_FallBackOp_0= ruleFallBackOp
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
                    // InternalPromise.g:387:3: this_SequenceOp_1= ruleSequenceOp
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
                    // InternalPromise.g:396:3: this_ParallelOp_2= ruleParallelOp
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
                    // InternalPromise.g:405:3: this_EventHandlerOp_3= ruleEventHandlerOp
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
                    // InternalPromise.g:414:3: this_ConditionOp_4= ruleConditionOp
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
                    // InternalPromise.g:423:3: this_DelegateOp_5= ruleDelegateOp
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
                    // InternalPromise.g:432:3: this_ANDOp_6= ruleANDOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getANDOpParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANDOp_6=ruleANDOp();

                    state._fsp--;


                    			current = this_ANDOp_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPromise.g:441:3: this_OROp_7= ruleOROp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getOROpParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OROp_7=ruleOROp();

                    state._fsp--;


                    			current = this_OROp_7;
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


    // $ANTLR start "entryRulePattern"
    // InternalPromise.g:453:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalPromise.g:453:48: (iv_rulePattern= rulePattern EOF )
            // InternalPromise.g:454:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalPromise.g:460:1: rulePattern returns [EObject current=null] : (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) ;
    public final EObject rulePattern() throws RecognitionException {
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



        	enterRule();

        try {
            // InternalPromise.g:466:2: ( (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) )
            // InternalPromise.g:467:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            {
            // InternalPromise.g:467:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            int alt11=20;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            case 47:
                {
                alt11=8;
                }
                break;
            case 48:
                {
                alt11=9;
                }
                break;
            case 49:
                {
                alt11=10;
                }
                break;
            case 50:
                {
                alt11=11;
                }
                break;
            case 51:
                {
                alt11=12;
                }
                break;
            case 52:
                {
                alt11=13;
                }
                break;
            case 53:
                {
                alt11=14;
                }
                break;
            case 54:
                {
                alt11=15;
                }
                break;
            case 55:
                {
                alt11=16;
                }
                break;
            case 56:
                {
                alt11=17;
                }
                break;
            case 57:
                {
                alt11=18;
                }
                break;
            case 58:
                {
                alt11=19;
                }
                break;
            case 59:
                {
                alt11=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPromise.g:468:3: this_SimpleAction_0= ruleSimpleAction
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getSimpleActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleAction_0=ruleSimpleAction();

                    state._fsp--;


                    			current = this_SimpleAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:477:3: this_Visit_1= ruleVisit
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getVisitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visit_1=ruleVisit();

                    state._fsp--;


                    			current = this_Visit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPromise.g:486:3: this_SequencedVisit_2= ruleSequencedVisit
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getSequencedVisitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequencedVisit_2=ruleSequencedVisit();

                    state._fsp--;


                    			current = this_SequencedVisit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPromise.g:495:3: this_OrderderVisit_3= ruleOrderderVisit
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getOrderderVisitParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderderVisit_3=ruleOrderderVisit();

                    state._fsp--;


                    			current = this_OrderderVisit_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPromise.g:504:3: this_StrictOrderedVisit_4= ruleStrictOrderedVisit
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getStrictOrderedVisitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrictOrderedVisit_4=ruleStrictOrderedVisit();

                    state._fsp--;


                    			current = this_StrictOrderedVisit_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPromise.g:513:3: this_FairVisit_5= ruleFairVisit
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getFairVisitParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FairVisit_5=ruleFairVisit();

                    state._fsp--;


                    			current = this_FairVisit_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPromise.g:522:3: this_Patrolling_6= rulePatrolling
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getPatrollingParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Patrolling_6=rulePatrolling();

                    state._fsp--;


                    			current = this_Patrolling_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPromise.g:531:3: this_SequencedPatrolling_7= ruleSequencedPatrolling
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getSequencedPatrollingParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequencedPatrolling_7=ruleSequencedPatrolling();

                    state._fsp--;


                    			current = this_SequencedPatrolling_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPromise.g:540:3: this_OrderedPatrolling_8= ruleOrderedPatrolling
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getOrderedPatrollingParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedPatrolling_8=ruleOrderedPatrolling();

                    state._fsp--;


                    			current = this_OrderedPatrolling_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPromise.g:549:3: this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getStrictOreredPatrollingParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrictOreredPatrolling_9=ruleStrictOreredPatrolling();

                    state._fsp--;


                    			current = this_StrictOreredPatrolling_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalPromise.g:558:3: this_FairPatrolling_10= ruleFairPatrolling
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getFairPatrollingParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_FairPatrolling_10=ruleFairPatrolling();

                    state._fsp--;


                    			current = this_FairPatrolling_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalPromise.g:567:3: this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getUpperRestrictedAvoidanceParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperRestrictedAvoidance_11=ruleUpperRestrictedAvoidance();

                    state._fsp--;


                    			current = this_UpperRestrictedAvoidance_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalPromise.g:576:3: this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getExactRestrictedAvoidanceParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactRestrictedAvoidance_12=ruleExactRestrictedAvoidance();

                    state._fsp--;


                    			current = this_ExactRestrictedAvoidance_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalPromise.g:585:3: this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getLowerRestrictedAvoidanceParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerRestrictedAvoidance_13=ruleLowerRestrictedAvoidance();

                    state._fsp--;


                    			current = this_LowerRestrictedAvoidance_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalPromise.g:594:3: this_FutureAvoidance_14= ruleFutureAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getFutureAvoidanceParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_FutureAvoidance_14=ruleFutureAvoidance();

                    state._fsp--;


                    			current = this_FutureAvoidance_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalPromise.g:603:3: this_GlobalAvoidance_15= ruleGlobalAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getGlobalAvoidanceParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalAvoidance_15=ruleGlobalAvoidance();

                    state._fsp--;


                    			current = this_GlobalAvoidance_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalPromise.g:612:3: this_PastAvoidance_16= rulePastAvoidance
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getPastAvoidanceParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_PastAvoidance_16=rulePastAvoidance();

                    state._fsp--;


                    			current = this_PastAvoidance_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalPromise.g:621:3: this_Wait_17= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getWaitParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_17=ruleWait();

                    state._fsp--;


                    			current = this_Wait_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalPromise.g:630:3: this_DelayedReaction_18= ruleDelayedReaction
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getDelayedReactionParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayedReaction_18=ruleDelayedReaction();

                    state._fsp--;


                    			current = this_DelayedReaction_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalPromise.g:639:3: this_InstantReaction_19= ruleInstantReaction
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getInstantReactionParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstantReaction_19=ruleInstantReaction();

                    state._fsp--;


                    			current = this_InstantReaction_19;
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleRobot"
    // InternalPromise.g:651:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPromise.g:651:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPromise.g:652:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalPromise.g:658:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:664:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:665:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:665:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:666:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:666:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:667:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:687:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalPromise.g:687:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalPromise.g:688:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalPromise.g:694:1: ruleLocation returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:700:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:701:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:701:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:702:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:702:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:703:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:723:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPromise.g:723:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPromise.g:724:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPromise.g:730:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:736:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:737:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:737:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:738:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:738:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:739:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:739:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:740:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_1());
            		
            // InternalPromise.g:760:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:761:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:761:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:762:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:783:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPromise.g:783:47: (iv_ruleAction= ruleAction EOF )
            // InternalPromise.g:784:2: iv_ruleAction= ruleAction EOF
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
    // InternalPromise.g:790:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:796:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:797:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:797:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:798:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:798:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:799:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:799:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:800:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonKeyword_1());
            		
            // InternalPromise.g:820:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:821:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:821:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:822:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:843:1: entryRuleFallBackOp returns [EObject current=null] : iv_ruleFallBackOp= ruleFallBackOp EOF ;
    public final EObject entryRuleFallBackOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallBackOp = null;


        try {
            // InternalPromise.g:843:51: (iv_ruleFallBackOp= ruleFallBackOp EOF )
            // InternalPromise.g:844:2: iv_ruleFallBackOp= ruleFallBackOp EOF
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
    // InternalPromise.g:850:1: ruleFallBackOp returns [EObject current=null] : (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
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
            // InternalPromise.g:856:2: ( (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:857:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:857:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:858:3: otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFallBackOpAccess().getFallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFallBackOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:866:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:867:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:867:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:868:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalPromise.g:885:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPromise.g:886:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFallBackOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:890:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:891:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:891:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:892:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPromise.g:918:1: entryRuleSequenceOp returns [EObject current=null] : iv_ruleSequenceOp= ruleSequenceOp EOF ;
    public final EObject entryRuleSequenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOp = null;


        try {
            // InternalPromise.g:918:51: (iv_ruleSequenceOp= ruleSequenceOp EOF )
            // InternalPromise.g:919:2: iv_ruleSequenceOp= ruleSequenceOp EOF
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
    // InternalPromise.g:925:1: ruleSequenceOp returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
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
            // InternalPromise.g:931:2: ( (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:932:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:932:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:933:3: otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceOpAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:941:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:942:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:942:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:943:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalPromise.g:960:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPromise.g:961:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequenceOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:965:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:966:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:966:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:967:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPromise.g:993:1: entryRuleParallelOp returns [EObject current=null] : iv_ruleParallelOp= ruleParallelOp EOF ;
    public final EObject entryRuleParallelOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelOp = null;


        try {
            // InternalPromise.g:993:51: (iv_ruleParallelOp= ruleParallelOp EOF )
            // InternalPromise.g:994:2: iv_ruleParallelOp= ruleParallelOp EOF
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
    // InternalPromise.g:1000:1: ruleParallelOp returns [EObject current=null] : (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleParallelOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1006:2: ( (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:1007:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:1007:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:1008:3: otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelOpAccess().getParallelKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1016:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1017:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1017:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1018:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1035:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPromise.g:1036:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParallelOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1040:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1041:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1041:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1042:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_inputOperators_4_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParallelOpRule());
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalPromise.g:1068:1: entryRuleEventHandlerOp returns [EObject current=null] : iv_ruleEventHandlerOp= ruleEventHandlerOp EOF ;
    public final EObject entryRuleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOp = null;


        try {
            // InternalPromise.g:1068:55: (iv_ruleEventHandlerOp= ruleEventHandlerOp EOF )
            // InternalPromise.g:1069:2: iv_ruleEventHandlerOp= ruleEventHandlerOp EOF
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
    // InternalPromise.g:1075:1: ruleEventHandlerOp returns [EObject current=null] : (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) ;
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
            // InternalPromise.g:1081:2: ( (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) )
            // InternalPromise.g:1082:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            {
            // InternalPromise.g:1082:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            // InternalPromise.g:1083:3: otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerOpAccess().getEventHandlerKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerOpAccess().getDefaultKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPromise.g:1099:3: ( (lv_inputOperators_4_0= ruleOperator ) )
            // InternalPromise.g:1100:4: (lv_inputOperators_4_0= ruleOperator )
            {
            // InternalPromise.g:1100:4: (lv_inputOperators_4_0= ruleOperator )
            // InternalPromise.g:1101:5: lv_inputOperators_4_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_5=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_5());
            		
            // InternalPromise.g:1122:3: (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPromise.g:1123:4: otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventHandlerOpAccess().getExceptKeyword_6_0());
            	    			
            	    // InternalPromise.g:1127:4: ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1128:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1128:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    // InternalPromise.g:1129:6: lv_inputEvents_7_0= ruleEventAssignment
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPromise.g:1155:1: entryRuleConditionOp returns [EObject current=null] : iv_ruleConditionOp= ruleConditionOp EOF ;
    public final EObject entryRuleConditionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOp = null;


        try {
            // InternalPromise.g:1155:52: (iv_ruleConditionOp= ruleConditionOp EOF )
            // InternalPromise.g:1156:2: iv_ruleConditionOp= ruleConditionOp EOF
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
    // InternalPromise.g:1162:1: ruleConditionOp returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleConditionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputEvents_3_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1168:2: ( (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) )
            // InternalPromise.g:1169:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            {
            // InternalPromise.g:1169:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            // InternalPromise.g:1170:3: otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionOpAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1178:3: (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPromise.g:1179:4: otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionOpAccess().getIfKeyword_2_0());
            	    			
            	    // InternalPromise.g:1183:4: ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1184:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1184:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    // InternalPromise.g:1185:6: lv_inputEvents_3_0= ruleEventAssignment
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDelegateOp"
    // InternalPromise.g:1211:1: entryRuleDelegateOp returns [EObject current=null] : iv_ruleDelegateOp= ruleDelegateOp EOF ;
    public final EObject entryRuleDelegateOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateOp = null;


        try {
            // InternalPromise.g:1211:51: (iv_ruleDelegateOp= ruleDelegateOp EOF )
            // InternalPromise.g:1212:2: iv_ruleDelegateOp= ruleDelegateOp EOF
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
    // InternalPromise.g:1218:1: ruleDelegateOp returns [EObject current=null] : (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) ;
    public final EObject ruleDelegateOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1224:2: ( (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) )
            // InternalPromise.g:1225:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            {
            // InternalPromise.g:1225:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            // InternalPromise.g:1226:3: otherlv_0= 'delegate' otherlv_1= '(' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegateOpAccess().getDelegateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegateOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1234:3: ( (lv_pattern_2_0= rulePattern ) )
            // InternalPromise.g:1235:4: (lv_pattern_2_0= rulePattern )
            {
            // InternalPromise.g:1235:4: (lv_pattern_2_0= rulePattern )
            // InternalPromise.g:1236:5: lv_pattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getPatternPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_pattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegateOpRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1253:3: (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPromise.g:1254:4: otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getDelegateOpAccess().getLocationsKeyword_3_0());
                    			
                    // InternalPromise.g:1258:4: ( ( ruleEString ) )
                    // InternalPromise.g:1259:5: ( ruleEString )
                    {
                    // InternalPromise.g:1259:5: ( ruleEString )
                    // InternalPromise.g:1260:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1274:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPromise.g:1275:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDelegateOpAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPromise.g:1279:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1280:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1280:6: ( ruleEString )
                    	    // InternalPromise.g:1281:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1297:3: (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPromise.g:1298:4: otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDelegateOpAccess().getActionsKeyword_4_0());
                    			
                    // InternalPromise.g:1302:4: ( ( ruleEString ) )
                    // InternalPromise.g:1303:5: ( ruleEString )
                    {
                    // InternalPromise.g:1303:5: ( ruleEString )
                    // InternalPromise.g:1304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1318:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPromise.g:1319:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDelegateOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1323:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1324:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1324:6: ( ruleEString )
                    	    // InternalPromise.g:1325:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1341:3: (otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPromise.g:1342:4: otherlv_11= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getDelegateOpAccess().getStoppingEventsKeyword_5_0());
                    			
                    // InternalPromise.g:1346:4: ( ( ruleEString ) )
                    // InternalPromise.g:1347:5: ( ruleEString )
                    {
                    // InternalPromise.g:1347:5: ( ruleEString )
                    // InternalPromise.g:1348:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1362:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPromise.g:1363:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDelegateOpAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPromise.g:1367:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1368:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1368:6: ( ruleEString )
                    	    // InternalPromise.g:1369:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDelegateOpAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuleANDOp"
    // InternalPromise.g:1393:1: entryRuleANDOp returns [EObject current=null] : iv_ruleANDOp= ruleANDOp EOF ;
    public final EObject entryRuleANDOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDOp = null;


        try {
            // InternalPromise.g:1393:46: (iv_ruleANDOp= ruleANDOp EOF )
            // InternalPromise.g:1394:2: iv_ruleANDOp= ruleANDOp EOF
            {
             newCompositeNode(grammarAccess.getANDOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDOp=ruleANDOp();

            state._fsp--;

             current =iv_ruleANDOp; 
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
    // $ANTLR end "entryRuleANDOp"


    // $ANTLR start "ruleANDOp"
    // InternalPromise.g:1400:1: ruleANDOp returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' ) ;
    public final EObject ruleANDOp() throws RecognitionException {
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
            // InternalPromise.g:1406:2: ( (otherlv_0= 'and' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' ) )
            // InternalPromise.g:1407:2: (otherlv_0= 'and' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )
            {
            // InternalPromise.g:1407:2: (otherlv_0= 'and' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )
            // InternalPromise.g:1408:3: otherlv_0= 'and' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getANDOpAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getANDOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1416:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1417:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1417:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1418:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getANDOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1435:3: (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 34:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPromise.g:1436:4: otherlv_3= '&'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getANDOpAccess().getAmpersandKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPromise.g:1441:4: otherlv_4= 'AND'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getANDOpAccess().getANDKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPromise.g:1446:4: otherlv_5= 'and'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getANDOpAccess().getAndKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalPromise.g:1451:3: ( (lv_inputOperators_6_0= ruleOperator ) )
            // InternalPromise.g:1452:4: (lv_inputOperators_6_0= ruleOperator )
            {
            // InternalPromise.g:1452:4: (lv_inputOperators_6_0= ruleOperator )
            // InternalPromise.g:1453:5: lv_inputOperators_6_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getANDOpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_inputOperators_6_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_6_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getANDOpAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleANDOp"


    // $ANTLR start "entryRuleOROp"
    // InternalPromise.g:1478:1: entryRuleOROp returns [EObject current=null] : iv_ruleOROp= ruleOROp EOF ;
    public final EObject entryRuleOROp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOROp = null;


        try {
            // InternalPromise.g:1478:45: (iv_ruleOROp= ruleOROp EOF )
            // InternalPromise.g:1479:2: iv_ruleOROp= ruleOROp EOF
            {
             newCompositeNode(grammarAccess.getOROpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOROp=ruleOROp();

            state._fsp--;

             current =iv_ruleOROp; 
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
    // $ANTLR end "entryRuleOROp"


    // $ANTLR start "ruleOROp"
    // InternalPromise.g:1485:1: ruleOROp returns [EObject current=null] : (otherlv_0= 'or' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' ) ;
    public final EObject ruleOROp() throws RecognitionException {
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
            // InternalPromise.g:1491:2: ( (otherlv_0= 'or' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' ) )
            // InternalPromise.g:1492:2: (otherlv_0= 'or' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )
            {
            // InternalPromise.g:1492:2: (otherlv_0= 'or' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )
            // InternalPromise.g:1493:3: otherlv_0= 'or' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' ) ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOROpAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOROpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1501:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1502:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1502:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1503:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getOROpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_inputOperators_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOROpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_2_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1520:3: (otherlv_3= '|' | otherlv_4= 'OR' | otherlv_5= 'or' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPromise.g:1521:4: otherlv_3= '|'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getOROpAccess().getVerticalLineKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPromise.g:1526:4: otherlv_4= 'OR'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getOROpAccess().getORKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPromise.g:1531:4: otherlv_5= 'or'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getOROpAccess().getOrKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalPromise.g:1536:3: ( (lv_inputOperators_6_0= ruleOperator ) )
            // InternalPromise.g:1537:4: (lv_inputOperators_6_0= ruleOperator )
            {
            // InternalPromise.g:1537:4: (lv_inputOperators_6_0= ruleOperator )
            // InternalPromise.g:1538:5: lv_inputOperators_6_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getOROpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_inputOperators_6_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOROpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_6_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOROpAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOROp"


    // $ANTLR start "entryRuleEventAssignment"
    // InternalPromise.g:1563:1: entryRuleEventAssignment returns [EObject current=null] : iv_ruleEventAssignment= ruleEventAssignment EOF ;
    public final EObject entryRuleEventAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAssignment = null;


        try {
            // InternalPromise.g:1563:56: (iv_ruleEventAssignment= ruleEventAssignment EOF )
            // InternalPromise.g:1564:2: iv_ruleEventAssignment= ruleEventAssignment EOF
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
    // InternalPromise.g:1570:1: ruleEventAssignment returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) ;
    public final EObject ruleEventAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputOperators_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1576:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) )
            // InternalPromise.g:1577:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            {
            // InternalPromise.g:1577:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            // InternalPromise.g:1578:3: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')'
            {
            // InternalPromise.g:1578:3: ( ( ruleEString ) )
            // InternalPromise.g:1579:4: ( ruleEString )
            {
            // InternalPromise.g:1579:4: ( ruleEString )
            // InternalPromise.g:1580:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAssignmentAccess().getInputEventEventCrossReference_0_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAssignmentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1598:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1599:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1599:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1600:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventAssignmentAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPromise.g:1625:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalPromise.g:1625:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalPromise.g:1626:2: iv_ruleSimpleAction= ruleSimpleAction EOF
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
    // InternalPromise.g:1632:1: ruleSimpleAction returns [EObject current=null] : ( () otherlv_1= 'SimpleAction' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1638:2: ( ( () otherlv_1= 'SimpleAction' ) )
            // InternalPromise.g:1639:2: ( () otherlv_1= 'SimpleAction' )
            {
            // InternalPromise.g:1639:2: ( () otherlv_1= 'SimpleAction' )
            // InternalPromise.g:1640:3: () otherlv_1= 'SimpleAction'
            {
            // InternalPromise.g:1640:3: ()
            // InternalPromise.g:1641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleActionAccess().getSimpleActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalPromise.g:1655:1: entryRuleVisit returns [EObject current=null] : iv_ruleVisit= ruleVisit EOF ;
    public final EObject entryRuleVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit = null;


        try {
            // InternalPromise.g:1655:46: (iv_ruleVisit= ruleVisit EOF )
            // InternalPromise.g:1656:2: iv_ruleVisit= ruleVisit EOF
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
    // InternalPromise.g:1662:1: ruleVisit returns [EObject current=null] : ( () otherlv_1= 'Visit' ) ;
    public final EObject ruleVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1668:2: ( ( () otherlv_1= 'Visit' ) )
            // InternalPromise.g:1669:2: ( () otherlv_1= 'Visit' )
            {
            // InternalPromise.g:1669:2: ( () otherlv_1= 'Visit' )
            // InternalPromise.g:1670:3: () otherlv_1= 'Visit'
            {
            // InternalPromise.g:1670:3: ()
            // InternalPromise.g:1671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisitAccess().getVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPromise.g:1685:1: entryRuleSequencedVisit returns [EObject current=null] : iv_ruleSequencedVisit= ruleSequencedVisit EOF ;
    public final EObject entryRuleSequencedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedVisit = null;


        try {
            // InternalPromise.g:1685:55: (iv_ruleSequencedVisit= ruleSequencedVisit EOF )
            // InternalPromise.g:1686:2: iv_ruleSequencedVisit= ruleSequencedVisit EOF
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
    // InternalPromise.g:1692:1: ruleSequencedVisit returns [EObject current=null] : ( () otherlv_1= 'SequencedVisit' ) ;
    public final EObject ruleSequencedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1698:2: ( ( () otherlv_1= 'SequencedVisit' ) )
            // InternalPromise.g:1699:2: ( () otherlv_1= 'SequencedVisit' )
            {
            // InternalPromise.g:1699:2: ( () otherlv_1= 'SequencedVisit' )
            // InternalPromise.g:1700:3: () otherlv_1= 'SequencedVisit'
            {
            // InternalPromise.g:1700:3: ()
            // InternalPromise.g:1701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedVisitAccess().getSequencedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

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
    // InternalPromise.g:1715:1: entryRuleOrderderVisit returns [EObject current=null] : iv_ruleOrderderVisit= ruleOrderderVisit EOF ;
    public final EObject entryRuleOrderderVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderderVisit = null;


        try {
            // InternalPromise.g:1715:54: (iv_ruleOrderderVisit= ruleOrderderVisit EOF )
            // InternalPromise.g:1716:2: iv_ruleOrderderVisit= ruleOrderderVisit EOF
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
    // InternalPromise.g:1722:1: ruleOrderderVisit returns [EObject current=null] : ( () otherlv_1= 'OrderedVisit' ) ;
    public final EObject ruleOrderderVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1728:2: ( ( () otherlv_1= 'OrderedVisit' ) )
            // InternalPromise.g:1729:2: ( () otherlv_1= 'OrderedVisit' )
            {
            // InternalPromise.g:1729:2: ( () otherlv_1= 'OrderedVisit' )
            // InternalPromise.g:1730:3: () otherlv_1= 'OrderedVisit'
            {
            // InternalPromise.g:1730:3: ()
            // InternalPromise.g:1731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderderVisitAccess().getOrderderVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalPromise.g:1745:1: entryRuleStrictOrderedVisit returns [EObject current=null] : iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF ;
    public final EObject entryRuleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOrderedVisit = null;


        try {
            // InternalPromise.g:1745:59: (iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF )
            // InternalPromise.g:1746:2: iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF
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
    // InternalPromise.g:1752:1: ruleStrictOrderedVisit returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedVisit' ) ;
    public final EObject ruleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1758:2: ( ( () otherlv_1= 'StrictOrderedVisit' ) )
            // InternalPromise.g:1759:2: ( () otherlv_1= 'StrictOrderedVisit' )
            {
            // InternalPromise.g:1759:2: ( () otherlv_1= 'StrictOrderedVisit' )
            // InternalPromise.g:1760:3: () otherlv_1= 'StrictOrderedVisit'
            {
            // InternalPromise.g:1760:3: ()
            // InternalPromise.g:1761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOrderedVisitAccess().getStrictOrderedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

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
    // InternalPromise.g:1775:1: entryRuleFairVisit returns [EObject current=null] : iv_ruleFairVisit= ruleFairVisit EOF ;
    public final EObject entryRuleFairVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairVisit = null;


        try {
            // InternalPromise.g:1775:50: (iv_ruleFairVisit= ruleFairVisit EOF )
            // InternalPromise.g:1776:2: iv_ruleFairVisit= ruleFairVisit EOF
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
    // InternalPromise.g:1782:1: ruleFairVisit returns [EObject current=null] : ( () otherlv_1= 'FairVisit' ) ;
    public final EObject ruleFairVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1788:2: ( ( () otherlv_1= 'FairVisit' ) )
            // InternalPromise.g:1789:2: ( () otherlv_1= 'FairVisit' )
            {
            // InternalPromise.g:1789:2: ( () otherlv_1= 'FairVisit' )
            // InternalPromise.g:1790:3: () otherlv_1= 'FairVisit'
            {
            // InternalPromise.g:1790:3: ()
            // InternalPromise.g:1791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairVisitAccess().getFairVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPromise.g:1805:1: entryRulePatrolling returns [EObject current=null] : iv_rulePatrolling= rulePatrolling EOF ;
    public final EObject entryRulePatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrolling = null;


        try {
            // InternalPromise.g:1805:51: (iv_rulePatrolling= rulePatrolling EOF )
            // InternalPromise.g:1806:2: iv_rulePatrolling= rulePatrolling EOF
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
    // InternalPromise.g:1812:1: rulePatrolling returns [EObject current=null] : ( () otherlv_1= 'Patrolling' ) ;
    public final EObject rulePatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1818:2: ( ( () otherlv_1= 'Patrolling' ) )
            // InternalPromise.g:1819:2: ( () otherlv_1= 'Patrolling' )
            {
            // InternalPromise.g:1819:2: ( () otherlv_1= 'Patrolling' )
            // InternalPromise.g:1820:3: () otherlv_1= 'Patrolling'
            {
            // InternalPromise.g:1820:3: ()
            // InternalPromise.g:1821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatrollingAccess().getPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalPromise.g:1835:1: entryRuleSequencedPatrolling returns [EObject current=null] : iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF ;
    public final EObject entryRuleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedPatrolling = null;


        try {
            // InternalPromise.g:1835:60: (iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF )
            // InternalPromise.g:1836:2: iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF
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
    // InternalPromise.g:1842:1: ruleSequencedPatrolling returns [EObject current=null] : ( () otherlv_1= 'SequencedPatrolling' ) ;
    public final EObject ruleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1848:2: ( ( () otherlv_1= 'SequencedPatrolling' ) )
            // InternalPromise.g:1849:2: ( () otherlv_1= 'SequencedPatrolling' )
            {
            // InternalPromise.g:1849:2: ( () otherlv_1= 'SequencedPatrolling' )
            // InternalPromise.g:1850:3: () otherlv_1= 'SequencedPatrolling'
            {
            // InternalPromise.g:1850:3: ()
            // InternalPromise.g:1851:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedPatrollingAccess().getSequencedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalPromise.g:1865:1: entryRuleOrderedPatrolling returns [EObject current=null] : iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF ;
    public final EObject entryRuleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedPatrolling = null;


        try {
            // InternalPromise.g:1865:58: (iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF )
            // InternalPromise.g:1866:2: iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF
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
    // InternalPromise.g:1872:1: ruleOrderedPatrolling returns [EObject current=null] : ( () otherlv_1= 'OrderedPatrolling' ) ;
    public final EObject ruleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1878:2: ( ( () otherlv_1= 'OrderedPatrolling' ) )
            // InternalPromise.g:1879:2: ( () otherlv_1= 'OrderedPatrolling' )
            {
            // InternalPromise.g:1879:2: ( () otherlv_1= 'OrderedPatrolling' )
            // InternalPromise.g:1880:3: () otherlv_1= 'OrderedPatrolling'
            {
            // InternalPromise.g:1880:3: ()
            // InternalPromise.g:1881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedPatrollingAccess().getOrderedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalPromise.g:1895:1: entryRuleStrictOreredPatrolling returns [EObject current=null] : iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF ;
    public final EObject entryRuleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOreredPatrolling = null;


        try {
            // InternalPromise.g:1895:63: (iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF )
            // InternalPromise.g:1896:2: iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF
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
    // InternalPromise.g:1902:1: ruleStrictOreredPatrolling returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedPatrolling' ) ;
    public final EObject ruleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1908:2: ( ( () otherlv_1= 'StrictOrderedPatrolling' ) )
            // InternalPromise.g:1909:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            {
            // InternalPromise.g:1909:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            // InternalPromise.g:1910:3: () otherlv_1= 'StrictOrderedPatrolling'
            {
            // InternalPromise.g:1910:3: ()
            // InternalPromise.g:1911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOreredPatrollingAccess().getStrictOreredPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalPromise.g:1925:1: entryRuleFairPatrolling returns [EObject current=null] : iv_ruleFairPatrolling= ruleFairPatrolling EOF ;
    public final EObject entryRuleFairPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairPatrolling = null;


        try {
            // InternalPromise.g:1925:55: (iv_ruleFairPatrolling= ruleFairPatrolling EOF )
            // InternalPromise.g:1926:2: iv_ruleFairPatrolling= ruleFairPatrolling EOF
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
    // InternalPromise.g:1932:1: ruleFairPatrolling returns [EObject current=null] : ( () otherlv_1= 'FairPatrolling' ) ;
    public final EObject ruleFairPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1938:2: ( ( () otherlv_1= 'FairPatrolling' ) )
            // InternalPromise.g:1939:2: ( () otherlv_1= 'FairPatrolling' )
            {
            // InternalPromise.g:1939:2: ( () otherlv_1= 'FairPatrolling' )
            // InternalPromise.g:1940:3: () otherlv_1= 'FairPatrolling'
            {
            // InternalPromise.g:1940:3: ()
            // InternalPromise.g:1941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairPatrollingAccess().getFairPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUpperRestrictedAvoidance"
    // InternalPromise.g:1955:1: entryRuleUpperRestrictedAvoidance returns [EObject current=null] : iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF ;
    public final EObject entryRuleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperRestrictedAvoidance = null;


        try {
            // InternalPromise.g:1955:65: (iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF )
            // InternalPromise.g:1956:2: iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF
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
    // InternalPromise.g:1962:1: ruleUpperRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'UpperRestrictedAvoidance' ) ;
    public final EObject ruleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1968:2: ( ( () otherlv_1= 'UpperRestrictedAvoidance' ) )
            // InternalPromise.g:1969:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            {
            // InternalPromise.g:1969:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            // InternalPromise.g:1970:3: () otherlv_1= 'UpperRestrictedAvoidance'
            {
            // InternalPromise.g:1970:3: ()
            // InternalPromise.g:1971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpperRestrictedAvoidanceAccess().getUpperRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalPromise.g:1985:1: entryRuleExactRestrictedAvoidance returns [EObject current=null] : iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF ;
    public final EObject entryRuleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactRestrictedAvoidance = null;


        try {
            // InternalPromise.g:1985:65: (iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF )
            // InternalPromise.g:1986:2: iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF
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
    // InternalPromise.g:1992:1: ruleExactRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'ExactRestrictedAvoidance' ) ;
    public final EObject ruleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1998:2: ( ( () otherlv_1= 'ExactRestrictedAvoidance' ) )
            // InternalPromise.g:1999:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            {
            // InternalPromise.g:1999:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            // InternalPromise.g:2000:3: () otherlv_1= 'ExactRestrictedAvoidance'
            {
            // InternalPromise.g:2000:3: ()
            // InternalPromise.g:2001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactRestrictedAvoidanceAccess().getExactRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalPromise.g:2015:1: entryRuleLowerRestrictedAvoidance returns [EObject current=null] : iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF ;
    public final EObject entryRuleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2015:65: (iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF )
            // InternalPromise.g:2016:2: iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF
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
    // InternalPromise.g:2022:1: ruleLowerRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'LowerRestrictedAvoidance' ) ;
    public final EObject ruleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2028:2: ( ( () otherlv_1= 'LowerRestrictedAvoidance' ) )
            // InternalPromise.g:2029:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            {
            // InternalPromise.g:2029:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            // InternalPromise.g:2030:3: () otherlv_1= 'LowerRestrictedAvoidance'
            {
            // InternalPromise.g:2030:3: ()
            // InternalPromise.g:2031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLowerRestrictedAvoidanceAccess().getLowerRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalPromise.g:2045:1: entryRuleFutureAvoidance returns [EObject current=null] : iv_ruleFutureAvoidance= ruleFutureAvoidance EOF ;
    public final EObject entryRuleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureAvoidance = null;


        try {
            // InternalPromise.g:2045:56: (iv_ruleFutureAvoidance= ruleFutureAvoidance EOF )
            // InternalPromise.g:2046:2: iv_ruleFutureAvoidance= ruleFutureAvoidance EOF
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
    // InternalPromise.g:2052:1: ruleFutureAvoidance returns [EObject current=null] : ( () otherlv_1= 'FutureAvoidance' ) ;
    public final EObject ruleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2058:2: ( ( () otherlv_1= 'FutureAvoidance' ) )
            // InternalPromise.g:2059:2: ( () otherlv_1= 'FutureAvoidance' )
            {
            // InternalPromise.g:2059:2: ( () otherlv_1= 'FutureAvoidance' )
            // InternalPromise.g:2060:3: () otherlv_1= 'FutureAvoidance'
            {
            // InternalPromise.g:2060:3: ()
            // InternalPromise.g:2061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureAvoidanceAccess().getFutureAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

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
    // InternalPromise.g:2075:1: entryRuleGlobalAvoidance returns [EObject current=null] : iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF ;
    public final EObject entryRuleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAvoidance = null;


        try {
            // InternalPromise.g:2075:56: (iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF )
            // InternalPromise.g:2076:2: iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF
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
    // InternalPromise.g:2082:1: ruleGlobalAvoidance returns [EObject current=null] : ( () otherlv_1= 'GlobalAvoidance' ) ;
    public final EObject ruleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2088:2: ( ( () otherlv_1= 'GlobalAvoidance' ) )
            // InternalPromise.g:2089:2: ( () otherlv_1= 'GlobalAvoidance' )
            {
            // InternalPromise.g:2089:2: ( () otherlv_1= 'GlobalAvoidance' )
            // InternalPromise.g:2090:3: () otherlv_1= 'GlobalAvoidance'
            {
            // InternalPromise.g:2090:3: ()
            // InternalPromise.g:2091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalAvoidanceAccess().getGlobalAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalPromise.g:2105:1: entryRulePastAvoidance returns [EObject current=null] : iv_rulePastAvoidance= rulePastAvoidance EOF ;
    public final EObject entryRulePastAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastAvoidance = null;


        try {
            // InternalPromise.g:2105:54: (iv_rulePastAvoidance= rulePastAvoidance EOF )
            // InternalPromise.g:2106:2: iv_rulePastAvoidance= rulePastAvoidance EOF
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
    // InternalPromise.g:2112:1: rulePastAvoidance returns [EObject current=null] : ( () otherlv_1= 'PastAvoidance' ) ;
    public final EObject rulePastAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2118:2: ( ( () otherlv_1= 'PastAvoidance' ) )
            // InternalPromise.g:2119:2: ( () otherlv_1= 'PastAvoidance' )
            {
            // InternalPromise.g:2119:2: ( () otherlv_1= 'PastAvoidance' )
            // InternalPromise.g:2120:3: () otherlv_1= 'PastAvoidance'
            {
            // InternalPromise.g:2120:3: ()
            // InternalPromise.g:2121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastAvoidanceAccess().getPastAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalPromise.g:2135:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalPromise.g:2135:45: (iv_ruleWait= ruleWait EOF )
            // InternalPromise.g:2136:2: iv_ruleWait= ruleWait EOF
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
    // InternalPromise.g:2142:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2148:2: ( ( () otherlv_1= 'Wait' ) )
            // InternalPromise.g:2149:2: ( () otherlv_1= 'Wait' )
            {
            // InternalPromise.g:2149:2: ( () otherlv_1= 'Wait' )
            // InternalPromise.g:2150:3: () otherlv_1= 'Wait'
            {
            // InternalPromise.g:2150:3: ()
            // InternalPromise.g:2151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

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
    // InternalPromise.g:2165:1: entryRuleDelayedReaction returns [EObject current=null] : iv_ruleDelayedReaction= ruleDelayedReaction EOF ;
    public final EObject entryRuleDelayedReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedReaction = null;


        try {
            // InternalPromise.g:2165:56: (iv_ruleDelayedReaction= ruleDelayedReaction EOF )
            // InternalPromise.g:2166:2: iv_ruleDelayedReaction= ruleDelayedReaction EOF
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
    // InternalPromise.g:2172:1: ruleDelayedReaction returns [EObject current=null] : ( () otherlv_1= 'DelayedReaction' ) ;
    public final EObject ruleDelayedReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2178:2: ( ( () otherlv_1= 'DelayedReaction' ) )
            // InternalPromise.g:2179:2: ( () otherlv_1= 'DelayedReaction' )
            {
            // InternalPromise.g:2179:2: ( () otherlv_1= 'DelayedReaction' )
            // InternalPromise.g:2180:3: () otherlv_1= 'DelayedReaction'
            {
            // InternalPromise.g:2180:3: ()
            // InternalPromise.g:2181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayedReactionAccess().getDelayedReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalPromise.g:2195:1: entryRuleInstantReaction returns [EObject current=null] : iv_ruleInstantReaction= ruleInstantReaction EOF ;
    public final EObject entryRuleInstantReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantReaction = null;


        try {
            // InternalPromise.g:2195:56: (iv_ruleInstantReaction= ruleInstantReaction EOF )
            // InternalPromise.g:2196:2: iv_ruleInstantReaction= ruleInstantReaction EOF
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
    // InternalPromise.g:2202:1: ruleInstantReaction returns [EObject current=null] : ( () otherlv_1= 'InstantReaction' ) ;
    public final EObject ruleInstantReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2208:2: ( ( () otherlv_1= 'InstantReaction' ) )
            // InternalPromise.g:2209:2: ( () otherlv_1= 'InstantReaction' )
            {
            // InternalPromise.g:2209:2: ( () otherlv_1= 'InstantReaction' )
            // InternalPromise.g:2210:3: () otherlv_1= 'InstantReaction'
            {
            // InternalPromise.g:2210:3: ()
            // InternalPromise.g:2211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstantReactionAccess().getInstantReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalPromise.g:2225:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPromise.g:2225:47: (iv_ruleEString= ruleEString EOF )
            // InternalPromise.g:2226:2: iv_ruleEString= ruleEString EOF
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
    // InternalPromise.g:2232:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2238:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPromise.g:2239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPromise.g:2239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPromise.g:2240:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2248:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000254E400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0FFFFF0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000201090000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000201018000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000201008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000E000000000L});

}