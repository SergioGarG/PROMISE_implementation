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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mission'", "'{'", "'conditions'", "'events'", "':'", "','", "'actions'", "'}'", "'robots'", "'locations'", "'operators'", "'fallback'", "'('", "'affecting event'", "')'", "'sequence'", "'parallel'", "'eventHandler'", "'default'", "'except'", "'condition'", "'if'", "'then'", "'delegate'", "'robot'", "'does'", "'stoppingEvents'", "'and'", "'affectingEvent'", "'&'", "'AND'", "'or'", "'|'", "'OR'", "'SimpleAction'", "'Visit'", "'SequencedVisit'", "'OrderedVisit'", "'StrictOrderedVisit'", "'FairVisit'", "'Patrolling'", "'SequencedPatrolling'", "'OrderedPatrolling'", "'StrictOrderedPatrolling'", "'FairPatrolling'", "'UpperRestrictedAvoidance'", "'ExactRestrictedAvoidance'", "'LowerRestrictedAvoidance'", "'FutureAvoidance'", "'GlobalAvoidance'", "'PastAvoidance'", "'Wait'", "'DelayedReaction'", "'InstantReaction'"
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalPromise.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )? otherlv_24= 'operators' otherlv_25= '{' ( (lv_operator_26_0= ruleOperator ) ) (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )* otherlv_29= '}' otherlv_30= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_events_6_0 = null;

        EObject lv_events_8_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_robots_16_0 = null;

        EObject lv_robots_18_0 = null;

        EObject lv_locations_21_0 = null;

        EObject lv_locations_23_0 = null;

        EObject lv_operator_26_0 = null;

        EObject lv_operator_28_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:77:2: ( (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )? otherlv_24= 'operators' otherlv_25= '{' ( (lv_operator_26_0= ruleOperator ) ) (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )* otherlv_29= '}' otherlv_30= '}' ) )
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )? otherlv_24= 'operators' otherlv_25= '{' ( (lv_operator_26_0= ruleOperator ) ) (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )* otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )? otherlv_24= 'operators' otherlv_25= '{' ( (lv_operator_26_0= ruleOperator ) ) (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )* otherlv_29= '}' otherlv_30= '}' )
            // InternalPromise.g:79:3: otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )? otherlv_24= 'operators' otherlv_25= '{' ( (lv_operator_26_0= ruleOperator ) ) (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )* otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPromise.g:87:3: (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPromise.g:88:4: otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )? otherlv_14= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getConditionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalPromise.g:96:4: (otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalPromise.g:97:5: otherlv_4= 'events' otherlv_5= ':' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )*
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEventsKeyword_2_2_0());
                            				
                            otherlv_5=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getColonKeyword_2_2_1());
                            				
                            // InternalPromise.g:105:5: ( (lv_events_6_0= ruleEvent ) )
                            // InternalPromise.g:106:6: (lv_events_6_0= ruleEvent )
                            {
                            // InternalPromise.g:106:6: (lv_events_6_0= ruleEvent )
                            // InternalPromise.g:107:7: lv_events_6_0= ruleEvent
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getEventsEventParserRuleCall_2_2_2_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_events_6_0=ruleEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"events",
                            								lv_events_6_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Event");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:124:5: (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==16) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalPromise.g:125:6: otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) )
                            	    {
                            	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getCommaKeyword_2_2_3_0());
                            	    					
                            	    // InternalPromise.g:129:6: ( (lv_events_8_0= ruleEvent ) )
                            	    // InternalPromise.g:130:7: (lv_events_8_0= ruleEvent )
                            	    {
                            	    // InternalPromise.g:130:7: (lv_events_8_0= ruleEvent )
                            	    // InternalPromise.g:131:8: lv_events_8_0= ruleEvent
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getEventsEventParserRuleCall_2_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_events_8_0=ruleEvent();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"events",
                            	    									lv_events_8_0,
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

                    // InternalPromise.g:150:4: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPromise.g:151:5: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )*
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getActionsKeyword_2_3_0());
                            				
                            otherlv_10=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getColonKeyword_2_3_1());
                            				
                            // InternalPromise.g:159:5: ( (lv_actions_11_0= ruleAction ) )
                            // InternalPromise.g:160:6: (lv_actions_11_0= ruleAction )
                            {
                            // InternalPromise.g:160:6: (lv_actions_11_0= ruleAction )
                            // InternalPromise.g:161:7: lv_actions_11_0= ruleAction
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_2_0());
                            						
                            pushFollow(FOLLOW_9);
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

                            // InternalPromise.g:178:5: (otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==16) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalPromise.g:179:6: otherlv_12= ',' ( (lv_actions_13_0= ruleAction ) )
                            	    {
                            	    otherlv_12=(Token)match(input,16,FOLLOW_7); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getCommaKeyword_2_3_3_0());
                            	    					
                            	    // InternalPromise.g:183:6: ( (lv_actions_13_0= ruleAction ) )
                            	    // InternalPromise.g:184:7: (lv_actions_13_0= ruleAction )
                            	    {
                            	    // InternalPromise.g:184:7: (lv_actions_13_0= ruleAction )
                            	    // InternalPromise.g:185:8: lv_actions_13_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_3_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_actions_13_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_13_0,
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

                    otherlv_14=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getRobotsKeyword_3());
            		
            // InternalPromise.g:213:3: ( (lv_robots_16_0= ruleRobot ) )
            // InternalPromise.g:214:4: (lv_robots_16_0= ruleRobot )
            {
            // InternalPromise.g:214:4: (lv_robots_16_0= ruleRobot )
            // InternalPromise.g:215:5: lv_robots_16_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalPromise.g:232:3: (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPromise.g:233:4: otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) )
            	    {
            	    otherlv_17=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalPromise.g:237:4: ( (lv_robots_18_0= ruleRobot ) )
            	    // InternalPromise.g:238:5: (lv_robots_18_0= ruleRobot )
            	    {
            	    // InternalPromise.g:238:5: (lv_robots_18_0= ruleRobot )
            	    // InternalPromise.g:239:6: lv_robots_18_0= ruleRobot
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_robots_18_0=ruleRobot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"robots",
            	    							lv_robots_18_0,
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

            // InternalPromise.g:257:3: (otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPromise.g:258:4: otherlv_19= 'locations' otherlv_20= ':' ( (lv_locations_21_0= ruleLocation ) ) (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )*
                    {
                    otherlv_19=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getLocationsKeyword_6_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getColonKeyword_6_1());
                    			
                    // InternalPromise.g:266:4: ( (lv_locations_21_0= ruleLocation ) )
                    // InternalPromise.g:267:5: (lv_locations_21_0= ruleLocation )
                    {
                    // InternalPromise.g:267:5: (lv_locations_21_0= ruleLocation )
                    // InternalPromise.g:268:6: lv_locations_21_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalPromise.g:285:4: (otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPromise.g:286:5: otherlv_22= ',' ( (lv_locations_23_0= ruleLocation ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPromise.g:290:5: ( (lv_locations_23_0= ruleLocation ) )
                    	    // InternalPromise.g:291:6: (lv_locations_23_0= ruleLocation )
                    	    {
                    	    // InternalPromise.g:291:6: (lv_locations_23_0= ruleLocation )
                    	    // InternalPromise.g:292:7: lv_locations_23_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_locations_23_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locations",
                    	    								lv_locations_23_0,
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

            otherlv_24=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getOperatorsKeyword_7());
            		
            otherlv_25=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_25, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalPromise.g:319:3: ( (lv_operator_26_0= ruleOperator ) )
            // InternalPromise.g:320:4: (lv_operator_26_0= ruleOperator )
            {
            // InternalPromise.g:320:4: (lv_operator_26_0= ruleOperator )
            // InternalPromise.g:321:5: lv_operator_26_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalPromise.g:338:3: (otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPromise.g:339:4: otherlv_27= ',' ( (lv_operator_28_0= ruleOperator ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalPromise.g:343:4: ( (lv_operator_28_0= ruleOperator ) )
            	    // InternalPromise.g:344:5: (lv_operator_28_0= ruleOperator )
            	    {
            	    // InternalPromise.g:344:5: (lv_operator_28_0= ruleOperator )
            	    // InternalPromise.g:345:6: lv_operator_28_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_operator_28_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_28_0,
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

            otherlv_29=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_29, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_30=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalPromise.g:375:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalPromise.g:375:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalPromise.g:376:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalPromise.g:382:1: ruleOperator returns [EObject current=null] : (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp ) ;
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
            // InternalPromise.g:388:2: ( (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp ) )
            // InternalPromise.g:389:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp )
            {
            // InternalPromise.g:389:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_ANDOp_6= ruleANDOp | this_OROp_7= ruleOROp )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 31:
                {
                alt10=5;
                }
                break;
            case 34:
                {
                alt10=6;
                }
                break;
            case 38:
                {
                alt10=7;
                }
                break;
            case 42:
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
                    // InternalPromise.g:390:3: this_FallBackOp_0= ruleFallBackOp
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
                    // InternalPromise.g:399:3: this_SequenceOp_1= ruleSequenceOp
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
                    // InternalPromise.g:408:3: this_ParallelOp_2= ruleParallelOp
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
                    // InternalPromise.g:417:3: this_EventHandlerOp_3= ruleEventHandlerOp
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
                    // InternalPromise.g:426:3: this_ConditionOp_4= ruleConditionOp
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
                    // InternalPromise.g:435:3: this_DelegateOp_5= ruleDelegateOp
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
                    // InternalPromise.g:444:3: this_ANDOp_6= ruleANDOp
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
                    // InternalPromise.g:453:3: this_OROp_7= ruleOROp
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
    // InternalPromise.g:465:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalPromise.g:465:48: (iv_rulePattern= rulePattern EOF )
            // InternalPromise.g:466:2: iv_rulePattern= rulePattern EOF
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
    // InternalPromise.g:472:1: rulePattern returns [EObject current=null] : (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) ;
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
            // InternalPromise.g:478:2: ( (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) )
            // InternalPromise.g:479:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            {
            // InternalPromise.g:479:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            int alt11=20;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 47:
                {
                alt11=3;
                }
                break;
            case 48:
                {
                alt11=4;
                }
                break;
            case 49:
                {
                alt11=5;
                }
                break;
            case 50:
                {
                alt11=6;
                }
                break;
            case 51:
                {
                alt11=7;
                }
                break;
            case 52:
                {
                alt11=8;
                }
                break;
            case 53:
                {
                alt11=9;
                }
                break;
            case 54:
                {
                alt11=10;
                }
                break;
            case 55:
                {
                alt11=11;
                }
                break;
            case 56:
                {
                alt11=12;
                }
                break;
            case 57:
                {
                alt11=13;
                }
                break;
            case 58:
                {
                alt11=14;
                }
                break;
            case 59:
                {
                alt11=15;
                }
                break;
            case 60:
                {
                alt11=16;
                }
                break;
            case 61:
                {
                alt11=17;
                }
                break;
            case 62:
                {
                alt11=18;
                }
                break;
            case 63:
                {
                alt11=19;
                }
                break;
            case 64:
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
                    // InternalPromise.g:480:3: this_SimpleAction_0= ruleSimpleAction
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
                    // InternalPromise.g:489:3: this_Visit_1= ruleVisit
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
                    // InternalPromise.g:498:3: this_SequencedVisit_2= ruleSequencedVisit
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
                    // InternalPromise.g:507:3: this_OrderderVisit_3= ruleOrderderVisit
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
                    // InternalPromise.g:516:3: this_StrictOrderedVisit_4= ruleStrictOrderedVisit
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
                    // InternalPromise.g:525:3: this_FairVisit_5= ruleFairVisit
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
                    // InternalPromise.g:534:3: this_Patrolling_6= rulePatrolling
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
                    // InternalPromise.g:543:3: this_SequencedPatrolling_7= ruleSequencedPatrolling
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
                    // InternalPromise.g:552:3: this_OrderedPatrolling_8= ruleOrderedPatrolling
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
                    // InternalPromise.g:561:3: this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling
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
                    // InternalPromise.g:570:3: this_FairPatrolling_10= ruleFairPatrolling
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
                    // InternalPromise.g:579:3: this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance
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
                    // InternalPromise.g:588:3: this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance
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
                    // InternalPromise.g:597:3: this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance
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
                    // InternalPromise.g:606:3: this_FutureAvoidance_14= ruleFutureAvoidance
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
                    // InternalPromise.g:615:3: this_GlobalAvoidance_15= ruleGlobalAvoidance
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
                    // InternalPromise.g:624:3: this_PastAvoidance_16= rulePastAvoidance
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
                    // InternalPromise.g:633:3: this_Wait_17= ruleWait
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
                    // InternalPromise.g:642:3: this_DelayedReaction_18= ruleDelayedReaction
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
                    // InternalPromise.g:651:3: this_InstantReaction_19= ruleInstantReaction
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
    // InternalPromise.g:663:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPromise.g:663:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPromise.g:664:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalPromise.g:670:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:676:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:677:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:677:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:678:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:678:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:679:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:699:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalPromise.g:699:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalPromise.g:700:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalPromise.g:706:1: ruleLocation returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:712:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:713:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:713:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:714:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:714:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:715:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:735:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPromise.g:735:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPromise.g:736:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPromise.g:742:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:748:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:749:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:749:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:750:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:750:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:751:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:751:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:752:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_1());
            		
            // InternalPromise.g:772:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:773:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:773:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:774:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:795:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPromise.g:795:47: (iv_ruleAction= ruleAction EOF )
            // InternalPromise.g:796:2: iv_ruleAction= ruleAction EOF
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
    // InternalPromise.g:802:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:808:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:809:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:809:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:810:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:810:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:811:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:811:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:812:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonKeyword_1());
            		
            // InternalPromise.g:832:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:833:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:833:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:834:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:855:1: entryRuleFallBackOp returns [EObject current=null] : iv_ruleFallBackOp= ruleFallBackOp EOF ;
    public final EObject entryRuleFallBackOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallBackOp = null;


        try {
            // InternalPromise.g:855:51: (iv_ruleFallBackOp= ruleFallBackOp EOF )
            // InternalPromise.g:856:2: iv_ruleFallBackOp= ruleFallBackOp EOF
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
    // InternalPromise.g:862:1: ruleFallBackOp returns [EObject current=null] : (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleFallBackOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:868:2: ( (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:869:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:869:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:870:3: otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFallBackOpAccess().getFallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFallBackOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:878:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:879:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:879:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:880:5: lv_inputOperators_2_0= ruleOperator
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

            // InternalPromise.g:897:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPromise.g:898:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFallBackOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:902:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:903:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:903:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:904:6: lv_inputOperators_4_0= ruleOperator
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

            // InternalPromise.g:922:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPromise.g:923:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getFallBackOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:927:4: ( ( ruleEString ) )
                    // InternalPromise.g:928:5: ( ruleEString )
                    {
                    // InternalPromise.g:928:5: ( ruleEString )
                    // InternalPromise.g:929:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFallBackOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFallBackOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:943:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPromise.g:944:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFallBackOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:948:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:949:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:949:6: ( ruleEString )
                    	    // InternalPromise.g:950:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFallBackOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFallBackOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFallBackOpAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalPromise.g:974:1: entryRuleSequenceOp returns [EObject current=null] : iv_ruleSequenceOp= ruleSequenceOp EOF ;
    public final EObject entryRuleSequenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOp = null;


        try {
            // InternalPromise.g:974:51: (iv_ruleSequenceOp= ruleSequenceOp EOF )
            // InternalPromise.g:975:2: iv_ruleSequenceOp= ruleSequenceOp EOF
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
    // InternalPromise.g:981:1: ruleSequenceOp returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleSequenceOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:987:2: ( (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:988:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:988:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:989:3: otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceOpAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:997:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:998:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:998:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:999:5: lv_inputOperators_2_0= ruleOperator
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

            // InternalPromise.g:1016:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPromise.g:1017:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequenceOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1021:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1022:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1022:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1023:6: lv_inputOperators_4_0= ruleOperator
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
            	    break loop15;
                }
            } while (true);

            // InternalPromise.g:1041:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPromise.g:1042:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:1046:4: ( ( ruleEString ) )
                    // InternalPromise.g:1047:5: ( ruleEString )
                    {
                    // InternalPromise.g:1047:5: ( ruleEString )
                    // InternalPromise.g:1048:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1062:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPromise.g:1063:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSequenceOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1067:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1068:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1068:6: ( ruleEString )
                    	    // InternalPromise.g:1069:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSequenceOpAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalPromise.g:1093:1: entryRuleParallelOp returns [EObject current=null] : iv_ruleParallelOp= ruleParallelOp EOF ;
    public final EObject entryRuleParallelOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelOp = null;


        try {
            // InternalPromise.g:1093:51: (iv_ruleParallelOp= ruleParallelOp EOF )
            // InternalPromise.g:1094:2: iv_ruleParallelOp= ruleParallelOp EOF
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
    // InternalPromise.g:1100:1: ruleParallelOp returns [EObject current=null] : (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleParallelOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inputOperators_2_0 = null;

        EObject lv_inputOperators_4_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1106:2: ( (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:1107:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:1107:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:1108:3: otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelOpAccess().getParallelKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1116:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1117:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1117:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1118:5: lv_inputOperators_2_0= ruleOperator
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

            // InternalPromise.g:1135:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPromise.g:1136:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParallelOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1140:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1141:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1141:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1142:6: lv_inputOperators_4_0= ruleOperator
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
            	    break loop18;
                }
            } while (true);

            // InternalPromise.g:1160:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPromise.g:1161:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:1165:4: ( ( ruleEString ) )
                    // InternalPromise.g:1166:5: ( ruleEString )
                    {
                    // InternalPromise.g:1166:5: ( ruleEString )
                    // InternalPromise.g:1167:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1181:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPromise.g:1182:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1186:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1187:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1187:6: ( ruleEString )
                    	    // InternalPromise.g:1188:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalPromise.g:1212:1: entryRuleEventHandlerOp returns [EObject current=null] : iv_ruleEventHandlerOp= ruleEventHandlerOp EOF ;
    public final EObject entryRuleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOp = null;


        try {
            // InternalPromise.g:1212:55: (iv_ruleEventHandlerOp= ruleEventHandlerOp EOF )
            // InternalPromise.g:1213:2: iv_ruleEventHandlerOp= ruleEventHandlerOp EOF
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
    // InternalPromise.g:1219:1: ruleEventHandlerOp returns [EObject current=null] : (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) ;
    public final EObject ruleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_inputOperators_4_0 = null;

        EObject lv_inputOperators_9_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1225:2: ( (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) )
            // InternalPromise.g:1226:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            {
            // InternalPromise.g:1226:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            // InternalPromise.g:1227:3: otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerOpAccess().getEventHandlerKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerOpAccess().getDefaultKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPromise.g:1243:3: ( (lv_inputOperators_4_0= ruleOperator ) )
            // InternalPromise.g:1244:4: (lv_inputOperators_4_0= ruleOperator )
            {
            // InternalPromise.g:1244:4: (lv_inputOperators_4_0= ruleOperator )
            // InternalPromise.g:1245:5: lv_inputOperators_4_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_5());
            		
            // InternalPromise.g:1266:3: (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPromise.g:1267:4: otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventHandlerOpAccess().getExceptKeyword_6_0());
            	    			
            	    // InternalPromise.g:1271:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1272:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1272:5: ( ruleEString )
            	    // InternalPromise.g:1273:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEventHandlerOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputObservedEventsEventCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_8, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_6_2());
            	    			
            	    // InternalPromise.g:1291:4: ( (lv_inputOperators_9_0= ruleOperator ) )
            	    // InternalPromise.g:1292:5: (lv_inputOperators_9_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1292:5: (lv_inputOperators_9_0= ruleOperator )
            	    // InternalPromise.g:1293:6: lv_inputOperators_9_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_inputOperators_9_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventHandlerOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputOperators",
            	    							lv_inputOperators_9_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_10, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_6_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalPromise.g:1315:3: (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPromise.g:1316:4: otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventHandlerOpAccess().getAffectingEventKeyword_7_0());
                    			
                    // InternalPromise.g:1320:4: ( ( ruleEString ) )
                    // InternalPromise.g:1321:5: ( ruleEString )
                    {
                    // InternalPromise.g:1321:5: ( ruleEString )
                    // InternalPromise.g:1322:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventHandlerOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getAffectingEventEventCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1336:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalPromise.g:1337:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEventHandlerOpAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPromise.g:1341:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1342:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1342:6: ( ruleEString )
                    	    // InternalPromise.g:1343:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventHandlerOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventHandlerOpAccess().getAffectingEventEventCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalPromise.g:1367:1: entryRuleConditionOp returns [EObject current=null] : iv_ruleConditionOp= ruleConditionOp EOF ;
    public final EObject entryRuleConditionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOp = null;


        try {
            // InternalPromise.g:1367:52: (iv_ruleConditionOp= ruleConditionOp EOF )
            // InternalPromise.g:1368:2: iv_ruleConditionOp= ruleConditionOp EOF
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
    // InternalPromise.g:1374:1: ruleConditionOp returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' ) ;
    public final EObject ruleConditionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_inputOperators_6_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1380:2: ( (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' ) )
            // InternalPromise.g:1381:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' )
            {
            // InternalPromise.g:1381:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' )
            // InternalPromise.g:1382:3: otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionOpAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1390:3: (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPromise.g:1391:4: otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionOpAccess().getIfKeyword_2_0());
            	    			
            	    // InternalPromise.g:1395:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1396:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1396:5: ( ruleEString )
            	    // InternalPromise.g:1397:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputEventsEventCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConditionOpAccess().getThenKeyword_2_2());
            	    			
            	    otherlv_5=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_2_3());
            	    			
            	    // InternalPromise.g:1419:4: ( (lv_inputOperators_6_0= ruleOperator ) )
            	    // InternalPromise.g:1420:5: (lv_inputOperators_6_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1420:5: (lv_inputOperators_6_0= ruleOperator )
            	    // InternalPromise.g:1421:6: lv_inputOperators_6_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputOperatorsOperatorParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_inputOperators_6_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionOpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputOperators",
            	    							lv_inputOperators_6_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,25,FOLLOW_25); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConditionOpAccess().getRightParenthesisKeyword_2_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalPromise.g:1443:3: (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPromise.g:1444:4: otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionOpAccess().getAffectingEventKeyword_3_0());
                    			
                    // InternalPromise.g:1448:4: ( ( ruleEString ) )
                    // InternalPromise.g:1449:5: ( ruleEString )
                    {
                    // InternalPromise.g:1449:5: ( ruleEString )
                    // InternalPromise.g:1450:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionOpAccess().getAffectingEventEventCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1464:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalPromise.g:1465:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConditionOpAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPromise.g:1469:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1470:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1470:6: ( ruleEString )
                    	    // InternalPromise.g:1471:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionOpAccess().getAffectingEventEventCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionOpAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalPromise.g:1495:1: entryRuleDelegateOp returns [EObject current=null] : iv_ruleDelegateOp= ruleDelegateOp EOF ;
    public final EObject entryRuleDelegateOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateOp = null;


        try {
            // InternalPromise.g:1495:51: (iv_ruleDelegateOp= ruleDelegateOp EOF )
            // InternalPromise.g:1496:2: iv_ruleDelegateOp= ruleDelegateOp EOF
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
    // InternalPromise.g:1502:1: ruleDelegateOp returns [EObject current=null] : (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? otherlv_24= ')' ) ;
    public final EObject ruleDelegateOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_pattern_7_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1508:2: ( (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? otherlv_24= ')' ) )
            // InternalPromise.g:1509:2: (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? otherlv_24= ')' )
            {
            // InternalPromise.g:1509:2: (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? otherlv_24= ')' )
            // InternalPromise.g:1510:3: otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? otherlv_24= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegateOpAccess().getDelegateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegateOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegateOpAccess().getRobotKeyword_2());
            		
            // InternalPromise.g:1522:3: ( ( ruleEString ) )
            // InternalPromise.g:1523:4: ( ruleEString )
            {
            // InternalPromise.g:1523:4: ( ruleEString )
            // InternalPromise.g:1524:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegateOpRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getInputRobotRobotCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1538:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPromise.g:1539:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDelegateOpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPromise.g:1543:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1544:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1544:5: ( ruleEString )
            	    // InternalPromise.g:1545:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegateOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputRobotRobotCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegateOpAccess().getDoesKeyword_5());
            		
            // InternalPromise.g:1564:3: ( (lv_pattern_7_0= rulePattern ) )
            // InternalPromise.g:1565:4: (lv_pattern_7_0= rulePattern )
            {
            // InternalPromise.g:1565:4: (lv_pattern_7_0= rulePattern )
            // InternalPromise.g:1566:5: lv_pattern_7_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getPatternPatternParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_pattern_7_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegateOpRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_7_0,
            						"se.gu.co4robots.xtext.promise.Promise.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1583:3: (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPromise.g:1584:4: otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getDelegateOpAccess().getLocationsKeyword_7_0());
                    			
                    // InternalPromise.g:1588:4: ( ( ruleEString ) )
                    // InternalPromise.g:1589:5: ( ruleEString )
                    {
                    // InternalPromise.g:1589:5: ( ruleEString )
                    // InternalPromise.g:1590:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1604:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPromise.g:1605:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDelegateOpAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPromise.g:1609:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1610:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1610:6: ( ruleEString )
                    	    // InternalPromise.g:1611:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1627:3: (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPromise.g:1628:4: otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelegateOpAccess().getActionsKeyword_8_0());
                    			
                    // InternalPromise.g:1632:4: ( ( ruleEString ) )
                    // InternalPromise.g:1633:5: ( ruleEString )
                    {
                    // InternalPromise.g:1633:5: ( ruleEString )
                    // InternalPromise.g:1634:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1648:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalPromise.g:1649:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDelegateOpAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalPromise.g:1653:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1654:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1654:6: ( ruleEString )
                    	    // InternalPromise.g:1655:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1671:3: (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPromise.g:1672:4: otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getDelegateOpAccess().getAffectingEventKeyword_9_0());
                    			
                    // InternalPromise.g:1676:4: ( ( ruleEString ) )
                    // InternalPromise.g:1677:5: ( ruleEString )
                    {
                    // InternalPromise.g:1677:5: ( ruleEString )
                    // InternalPromise.g:1678:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getAffectingEventEventCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1692:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalPromise.g:1693:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDelegateOpAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalPromise.g:1697:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1698:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1698:6: ( ruleEString )
                    	    // InternalPromise.g:1699:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getAffectingEventEventCrossReference_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPromise.g:1715:3: (otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPromise.g:1716:4: otherlv_20= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getDelegateOpAccess().getStoppingEventsKeyword_10_0());
                    			
                    // InternalPromise.g:1720:4: ( ( ruleEString ) )
                    // InternalPromise.g:1721:5: ( ruleEString )
                    {
                    // InternalPromise.g:1721:5: ( ruleEString )
                    // InternalPromise.g:1722:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1736:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalPromise.g:1737:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getDelegateOpAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalPromise.g:1741:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1742:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1742:6: ( ruleEString )
                    	    // InternalPromise.g:1743:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDelegateOpAccess().getRightParenthesisKeyword_11());
            		

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
    // InternalPromise.g:1767:1: entryRuleANDOp returns [EObject current=null] : iv_ruleANDOp= ruleANDOp EOF ;
    public final EObject entryRuleANDOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDOp = null;


        try {
            // InternalPromise.g:1767:46: (iv_ruleANDOp= ruleANDOp EOF )
            // InternalPromise.g:1768:2: iv_ruleANDOp= ruleANDOp EOF
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
    // InternalPromise.g:1774:1: ruleANDOp returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' ) ;
    public final EObject ruleANDOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_inputOperators_8_0 = null;

        EObject lv_inputOperators_12_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1780:2: ( (otherlv_0= 'and' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' ) )
            // InternalPromise.g:1781:2: (otherlv_0= 'and' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' )
            {
            // InternalPromise.g:1781:2: (otherlv_0= 'and' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' )
            // InternalPromise.g:1782:3: otherlv_0= 'and' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getANDOpAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getANDOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1790:3: (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPromise.g:1791:4: otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getANDOpAccess().getAffectingEventKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getANDOpAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalPromise.g:1799:4: ( ( ruleEString ) )
                    // InternalPromise.g:1800:5: ( ruleEString )
                    {
                    // InternalPromise.g:1800:5: ( ruleEString )
                    // InternalPromise.g:1801:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getANDOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getANDOpAccess().getAffectingEventEventCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1815:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalPromise.g:1816:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getANDOpAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalPromise.g:1820:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1821:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1821:6: ( ruleEString )
                    	    // InternalPromise.g:1822:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getANDOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getANDOpAccess().getAffectingEventEventCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getANDOpAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalPromise.g:1842:3: ( (lv_inputOperators_8_0= ruleOperator ) )
            // InternalPromise.g:1843:4: (lv_inputOperators_8_0= ruleOperator )
            {
            // InternalPromise.g:1843:4: (lv_inputOperators_8_0= ruleOperator )
            // InternalPromise.g:1844:5: lv_inputOperators_8_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getANDOpAccess().getInputOperatorsOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_inputOperators_8_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_8_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1861:3: (otherlv_9= '&' | otherlv_10= 'AND' | otherlv_11= 'and' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt38=1;
                }
                break;
            case 41:
                {
                alt38=2;
                }
                break;
            case 38:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPromise.g:1862:4: otherlv_9= '&'
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getANDOpAccess().getAmpersandKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPromise.g:1867:4: otherlv_10= 'AND'
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getANDOpAccess().getANDKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPromise.g:1872:4: otherlv_11= 'and'
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getANDOpAccess().getAndKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalPromise.g:1877:3: ( (lv_inputOperators_12_0= ruleOperator ) )
            // InternalPromise.g:1878:4: (lv_inputOperators_12_0= ruleOperator )
            {
            // InternalPromise.g:1878:4: (lv_inputOperators_12_0= ruleOperator )
            // InternalPromise.g:1879:5: lv_inputOperators_12_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getANDOpAccess().getInputOperatorsOperatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_inputOperators_12_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDOpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_12_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getANDOpAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalPromise.g:1904:1: entryRuleOROp returns [EObject current=null] : iv_ruleOROp= ruleOROp EOF ;
    public final EObject entryRuleOROp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOROp = null;


        try {
            // InternalPromise.g:1904:45: (iv_ruleOROp= ruleOROp EOF )
            // InternalPromise.g:1905:2: iv_ruleOROp= ruleOROp EOF
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
    // InternalPromise.g:1911:1: ruleOROp returns [EObject current=null] : (otherlv_0= 'or' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' ) ;
    public final EObject ruleOROp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_inputOperators_8_0 = null;

        EObject lv_inputOperators_12_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1917:2: ( (otherlv_0= 'or' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' ) )
            // InternalPromise.g:1918:2: (otherlv_0= 'or' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' )
            {
            // InternalPromise.g:1918:2: (otherlv_0= 'or' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')' )
            // InternalPromise.g:1919:3: otherlv_0= 'or' otherlv_1= '(' (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? ( (lv_inputOperators_8_0= ruleOperator ) ) (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' ) ( (lv_inputOperators_12_0= ruleOperator ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOROpAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getOROpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1927:3: (otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPromise.g:1928:4: otherlv_2= 'affectingEvent' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getOROpAccess().getAffectingEventKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getOROpAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalPromise.g:1936:4: ( ( ruleEString ) )
                    // InternalPromise.g:1937:5: ( ruleEString )
                    {
                    // InternalPromise.g:1937:5: ( ruleEString )
                    // InternalPromise.g:1938:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOROpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOROpAccess().getAffectingEventEventCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1952:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==16) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalPromise.g:1953:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOROpAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalPromise.g:1957:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1958:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1958:6: ( ruleEString )
                    	    // InternalPromise.g:1959:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOROpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOROpAccess().getAffectingEventEventCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getOROpAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalPromise.g:1979:3: ( (lv_inputOperators_8_0= ruleOperator ) )
            // InternalPromise.g:1980:4: (lv_inputOperators_8_0= ruleOperator )
            {
            // InternalPromise.g:1980:4: (lv_inputOperators_8_0= ruleOperator )
            // InternalPromise.g:1981:5: lv_inputOperators_8_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getOROpAccess().getInputOperatorsOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_inputOperators_8_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOROpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_8_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1998:3: (otherlv_9= '|' | otherlv_10= 'OR' | otherlv_11= 'or' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt41=1;
                }
                break;
            case 44:
                {
                alt41=2;
                }
                break;
            case 42:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalPromise.g:1999:4: otherlv_9= '|'
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getOROpAccess().getVerticalLineKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2004:4: otherlv_10= 'OR'
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getOROpAccess().getORKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPromise.g:2009:4: otherlv_11= 'or'
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getOROpAccess().getOrKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalPromise.g:2014:3: ( (lv_inputOperators_12_0= ruleOperator ) )
            // InternalPromise.g:2015:4: (lv_inputOperators_12_0= ruleOperator )
            {
            // InternalPromise.g:2015:4: (lv_inputOperators_12_0= ruleOperator )
            // InternalPromise.g:2016:5: lv_inputOperators_12_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getOROpAccess().getInputOperatorsOperatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_inputOperators_12_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOROpRule());
            					}
            					add(
            						current,
            						"inputOperators",
            						lv_inputOperators_12_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getOROpAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuleSimpleAction"
    // InternalPromise.g:2041:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalPromise.g:2041:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalPromise.g:2042:2: iv_ruleSimpleAction= ruleSimpleAction EOF
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
    // InternalPromise.g:2048:1: ruleSimpleAction returns [EObject current=null] : ( () otherlv_1= 'SimpleAction' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2054:2: ( ( () otherlv_1= 'SimpleAction' ) )
            // InternalPromise.g:2055:2: ( () otherlv_1= 'SimpleAction' )
            {
            // InternalPromise.g:2055:2: ( () otherlv_1= 'SimpleAction' )
            // InternalPromise.g:2056:3: () otherlv_1= 'SimpleAction'
            {
            // InternalPromise.g:2056:3: ()
            // InternalPromise.g:2057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleActionAccess().getSimpleActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPromise.g:2071:1: entryRuleVisit returns [EObject current=null] : iv_ruleVisit= ruleVisit EOF ;
    public final EObject entryRuleVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit = null;


        try {
            // InternalPromise.g:2071:46: (iv_ruleVisit= ruleVisit EOF )
            // InternalPromise.g:2072:2: iv_ruleVisit= ruleVisit EOF
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
    // InternalPromise.g:2078:1: ruleVisit returns [EObject current=null] : ( () otherlv_1= 'Visit' ) ;
    public final EObject ruleVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2084:2: ( ( () otherlv_1= 'Visit' ) )
            // InternalPromise.g:2085:2: ( () otherlv_1= 'Visit' )
            {
            // InternalPromise.g:2085:2: ( () otherlv_1= 'Visit' )
            // InternalPromise.g:2086:3: () otherlv_1= 'Visit'
            {
            // InternalPromise.g:2086:3: ()
            // InternalPromise.g:2087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisitAccess().getVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalPromise.g:2101:1: entryRuleSequencedVisit returns [EObject current=null] : iv_ruleSequencedVisit= ruleSequencedVisit EOF ;
    public final EObject entryRuleSequencedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedVisit = null;


        try {
            // InternalPromise.g:2101:55: (iv_ruleSequencedVisit= ruleSequencedVisit EOF )
            // InternalPromise.g:2102:2: iv_ruleSequencedVisit= ruleSequencedVisit EOF
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
    // InternalPromise.g:2108:1: ruleSequencedVisit returns [EObject current=null] : ( () otherlv_1= 'SequencedVisit' ) ;
    public final EObject ruleSequencedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2114:2: ( ( () otherlv_1= 'SequencedVisit' ) )
            // InternalPromise.g:2115:2: ( () otherlv_1= 'SequencedVisit' )
            {
            // InternalPromise.g:2115:2: ( () otherlv_1= 'SequencedVisit' )
            // InternalPromise.g:2116:3: () otherlv_1= 'SequencedVisit'
            {
            // InternalPromise.g:2116:3: ()
            // InternalPromise.g:2117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedVisitAccess().getSequencedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalPromise.g:2131:1: entryRuleOrderderVisit returns [EObject current=null] : iv_ruleOrderderVisit= ruleOrderderVisit EOF ;
    public final EObject entryRuleOrderderVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderderVisit = null;


        try {
            // InternalPromise.g:2131:54: (iv_ruleOrderderVisit= ruleOrderderVisit EOF )
            // InternalPromise.g:2132:2: iv_ruleOrderderVisit= ruleOrderderVisit EOF
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
    // InternalPromise.g:2138:1: ruleOrderderVisit returns [EObject current=null] : ( () otherlv_1= 'OrderedVisit' ) ;
    public final EObject ruleOrderderVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2144:2: ( ( () otherlv_1= 'OrderedVisit' ) )
            // InternalPromise.g:2145:2: ( () otherlv_1= 'OrderedVisit' )
            {
            // InternalPromise.g:2145:2: ( () otherlv_1= 'OrderedVisit' )
            // InternalPromise.g:2146:3: () otherlv_1= 'OrderedVisit'
            {
            // InternalPromise.g:2146:3: ()
            // InternalPromise.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderderVisitAccess().getOrderderVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalPromise.g:2161:1: entryRuleStrictOrderedVisit returns [EObject current=null] : iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF ;
    public final EObject entryRuleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOrderedVisit = null;


        try {
            // InternalPromise.g:2161:59: (iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF )
            // InternalPromise.g:2162:2: iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF
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
    // InternalPromise.g:2168:1: ruleStrictOrderedVisit returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedVisit' ) ;
    public final EObject ruleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2174:2: ( ( () otherlv_1= 'StrictOrderedVisit' ) )
            // InternalPromise.g:2175:2: ( () otherlv_1= 'StrictOrderedVisit' )
            {
            // InternalPromise.g:2175:2: ( () otherlv_1= 'StrictOrderedVisit' )
            // InternalPromise.g:2176:3: () otherlv_1= 'StrictOrderedVisit'
            {
            // InternalPromise.g:2176:3: ()
            // InternalPromise.g:2177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOrderedVisitAccess().getStrictOrderedVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalPromise.g:2191:1: entryRuleFairVisit returns [EObject current=null] : iv_ruleFairVisit= ruleFairVisit EOF ;
    public final EObject entryRuleFairVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairVisit = null;


        try {
            // InternalPromise.g:2191:50: (iv_ruleFairVisit= ruleFairVisit EOF )
            // InternalPromise.g:2192:2: iv_ruleFairVisit= ruleFairVisit EOF
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
    // InternalPromise.g:2198:1: ruleFairVisit returns [EObject current=null] : ( () otherlv_1= 'FairVisit' ) ;
    public final EObject ruleFairVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2204:2: ( ( () otherlv_1= 'FairVisit' ) )
            // InternalPromise.g:2205:2: ( () otherlv_1= 'FairVisit' )
            {
            // InternalPromise.g:2205:2: ( () otherlv_1= 'FairVisit' )
            // InternalPromise.g:2206:3: () otherlv_1= 'FairVisit'
            {
            // InternalPromise.g:2206:3: ()
            // InternalPromise.g:2207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairVisitAccess().getFairVisitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalPromise.g:2221:1: entryRulePatrolling returns [EObject current=null] : iv_rulePatrolling= rulePatrolling EOF ;
    public final EObject entryRulePatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrolling = null;


        try {
            // InternalPromise.g:2221:51: (iv_rulePatrolling= rulePatrolling EOF )
            // InternalPromise.g:2222:2: iv_rulePatrolling= rulePatrolling EOF
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
    // InternalPromise.g:2228:1: rulePatrolling returns [EObject current=null] : ( () otherlv_1= 'Patrolling' ) ;
    public final EObject rulePatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2234:2: ( ( () otherlv_1= 'Patrolling' ) )
            // InternalPromise.g:2235:2: ( () otherlv_1= 'Patrolling' )
            {
            // InternalPromise.g:2235:2: ( () otherlv_1= 'Patrolling' )
            // InternalPromise.g:2236:3: () otherlv_1= 'Patrolling'
            {
            // InternalPromise.g:2236:3: ()
            // InternalPromise.g:2237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatrollingAccess().getPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalPromise.g:2251:1: entryRuleSequencedPatrolling returns [EObject current=null] : iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF ;
    public final EObject entryRuleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedPatrolling = null;


        try {
            // InternalPromise.g:2251:60: (iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF )
            // InternalPromise.g:2252:2: iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF
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
    // InternalPromise.g:2258:1: ruleSequencedPatrolling returns [EObject current=null] : ( () otherlv_1= 'SequencedPatrolling' ) ;
    public final EObject ruleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2264:2: ( ( () otherlv_1= 'SequencedPatrolling' ) )
            // InternalPromise.g:2265:2: ( () otherlv_1= 'SequencedPatrolling' )
            {
            // InternalPromise.g:2265:2: ( () otherlv_1= 'SequencedPatrolling' )
            // InternalPromise.g:2266:3: () otherlv_1= 'SequencedPatrolling'
            {
            // InternalPromise.g:2266:3: ()
            // InternalPromise.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequencedPatrollingAccess().getSequencedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalPromise.g:2281:1: entryRuleOrderedPatrolling returns [EObject current=null] : iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF ;
    public final EObject entryRuleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedPatrolling = null;


        try {
            // InternalPromise.g:2281:58: (iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF )
            // InternalPromise.g:2282:2: iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF
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
    // InternalPromise.g:2288:1: ruleOrderedPatrolling returns [EObject current=null] : ( () otherlv_1= 'OrderedPatrolling' ) ;
    public final EObject ruleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2294:2: ( ( () otherlv_1= 'OrderedPatrolling' ) )
            // InternalPromise.g:2295:2: ( () otherlv_1= 'OrderedPatrolling' )
            {
            // InternalPromise.g:2295:2: ( () otherlv_1= 'OrderedPatrolling' )
            // InternalPromise.g:2296:3: () otherlv_1= 'OrderedPatrolling'
            {
            // InternalPromise.g:2296:3: ()
            // InternalPromise.g:2297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedPatrollingAccess().getOrderedPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalPromise.g:2311:1: entryRuleStrictOreredPatrolling returns [EObject current=null] : iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF ;
    public final EObject entryRuleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOreredPatrolling = null;


        try {
            // InternalPromise.g:2311:63: (iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF )
            // InternalPromise.g:2312:2: iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF
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
    // InternalPromise.g:2318:1: ruleStrictOreredPatrolling returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedPatrolling' ) ;
    public final EObject ruleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2324:2: ( ( () otherlv_1= 'StrictOrderedPatrolling' ) )
            // InternalPromise.g:2325:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            {
            // InternalPromise.g:2325:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            // InternalPromise.g:2326:3: () otherlv_1= 'StrictOrderedPatrolling'
            {
            // InternalPromise.g:2326:3: ()
            // InternalPromise.g:2327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrictOreredPatrollingAccess().getStrictOreredPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

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
    // InternalPromise.g:2341:1: entryRuleFairPatrolling returns [EObject current=null] : iv_ruleFairPatrolling= ruleFairPatrolling EOF ;
    public final EObject entryRuleFairPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairPatrolling = null;


        try {
            // InternalPromise.g:2341:55: (iv_ruleFairPatrolling= ruleFairPatrolling EOF )
            // InternalPromise.g:2342:2: iv_ruleFairPatrolling= ruleFairPatrolling EOF
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
    // InternalPromise.g:2348:1: ruleFairPatrolling returns [EObject current=null] : ( () otherlv_1= 'FairPatrolling' ) ;
    public final EObject ruleFairPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2354:2: ( ( () otherlv_1= 'FairPatrolling' ) )
            // InternalPromise.g:2355:2: ( () otherlv_1= 'FairPatrolling' )
            {
            // InternalPromise.g:2355:2: ( () otherlv_1= 'FairPatrolling' )
            // InternalPromise.g:2356:3: () otherlv_1= 'FairPatrolling'
            {
            // InternalPromise.g:2356:3: ()
            // InternalPromise.g:2357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFairPatrollingAccess().getFairPatrollingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalPromise.g:2371:1: entryRuleUpperRestrictedAvoidance returns [EObject current=null] : iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF ;
    public final EObject entryRuleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2371:65: (iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF )
            // InternalPromise.g:2372:2: iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF
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
    // InternalPromise.g:2378:1: ruleUpperRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'UpperRestrictedAvoidance' ) ;
    public final EObject ruleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2384:2: ( ( () otherlv_1= 'UpperRestrictedAvoidance' ) )
            // InternalPromise.g:2385:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            {
            // InternalPromise.g:2385:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            // InternalPromise.g:2386:3: () otherlv_1= 'UpperRestrictedAvoidance'
            {
            // InternalPromise.g:2386:3: ()
            // InternalPromise.g:2387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpperRestrictedAvoidanceAccess().getUpperRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalPromise.g:2401:1: entryRuleExactRestrictedAvoidance returns [EObject current=null] : iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF ;
    public final EObject entryRuleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2401:65: (iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF )
            // InternalPromise.g:2402:2: iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF
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
    // InternalPromise.g:2408:1: ruleExactRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'ExactRestrictedAvoidance' ) ;
    public final EObject ruleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2414:2: ( ( () otherlv_1= 'ExactRestrictedAvoidance' ) )
            // InternalPromise.g:2415:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            {
            // InternalPromise.g:2415:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            // InternalPromise.g:2416:3: () otherlv_1= 'ExactRestrictedAvoidance'
            {
            // InternalPromise.g:2416:3: ()
            // InternalPromise.g:2417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactRestrictedAvoidanceAccess().getExactRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

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
    // InternalPromise.g:2431:1: entryRuleLowerRestrictedAvoidance returns [EObject current=null] : iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF ;
    public final EObject entryRuleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2431:65: (iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF )
            // InternalPromise.g:2432:2: iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF
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
    // InternalPromise.g:2438:1: ruleLowerRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'LowerRestrictedAvoidance' ) ;
    public final EObject ruleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2444:2: ( ( () otherlv_1= 'LowerRestrictedAvoidance' ) )
            // InternalPromise.g:2445:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            {
            // InternalPromise.g:2445:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            // InternalPromise.g:2446:3: () otherlv_1= 'LowerRestrictedAvoidance'
            {
            // InternalPromise.g:2446:3: ()
            // InternalPromise.g:2447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLowerRestrictedAvoidanceAccess().getLowerRestrictedAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalPromise.g:2461:1: entryRuleFutureAvoidance returns [EObject current=null] : iv_ruleFutureAvoidance= ruleFutureAvoidance EOF ;
    public final EObject entryRuleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureAvoidance = null;


        try {
            // InternalPromise.g:2461:56: (iv_ruleFutureAvoidance= ruleFutureAvoidance EOF )
            // InternalPromise.g:2462:2: iv_ruleFutureAvoidance= ruleFutureAvoidance EOF
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
    // InternalPromise.g:2468:1: ruleFutureAvoidance returns [EObject current=null] : ( () otherlv_1= 'FutureAvoidance' ) ;
    public final EObject ruleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2474:2: ( ( () otherlv_1= 'FutureAvoidance' ) )
            // InternalPromise.g:2475:2: ( () otherlv_1= 'FutureAvoidance' )
            {
            // InternalPromise.g:2475:2: ( () otherlv_1= 'FutureAvoidance' )
            // InternalPromise.g:2476:3: () otherlv_1= 'FutureAvoidance'
            {
            // InternalPromise.g:2476:3: ()
            // InternalPromise.g:2477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureAvoidanceAccess().getFutureAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalPromise.g:2491:1: entryRuleGlobalAvoidance returns [EObject current=null] : iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF ;
    public final EObject entryRuleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAvoidance = null;


        try {
            // InternalPromise.g:2491:56: (iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF )
            // InternalPromise.g:2492:2: iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF
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
    // InternalPromise.g:2498:1: ruleGlobalAvoidance returns [EObject current=null] : ( () otherlv_1= 'GlobalAvoidance' ) ;
    public final EObject ruleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2504:2: ( ( () otherlv_1= 'GlobalAvoidance' ) )
            // InternalPromise.g:2505:2: ( () otherlv_1= 'GlobalAvoidance' )
            {
            // InternalPromise.g:2505:2: ( () otherlv_1= 'GlobalAvoidance' )
            // InternalPromise.g:2506:3: () otherlv_1= 'GlobalAvoidance'
            {
            // InternalPromise.g:2506:3: ()
            // InternalPromise.g:2507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalAvoidanceAccess().getGlobalAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

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
    // InternalPromise.g:2521:1: entryRulePastAvoidance returns [EObject current=null] : iv_rulePastAvoidance= rulePastAvoidance EOF ;
    public final EObject entryRulePastAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastAvoidance = null;


        try {
            // InternalPromise.g:2521:54: (iv_rulePastAvoidance= rulePastAvoidance EOF )
            // InternalPromise.g:2522:2: iv_rulePastAvoidance= rulePastAvoidance EOF
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
    // InternalPromise.g:2528:1: rulePastAvoidance returns [EObject current=null] : ( () otherlv_1= 'PastAvoidance' ) ;
    public final EObject rulePastAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2534:2: ( ( () otherlv_1= 'PastAvoidance' ) )
            // InternalPromise.g:2535:2: ( () otherlv_1= 'PastAvoidance' )
            {
            // InternalPromise.g:2535:2: ( () otherlv_1= 'PastAvoidance' )
            // InternalPromise.g:2536:3: () otherlv_1= 'PastAvoidance'
            {
            // InternalPromise.g:2536:3: ()
            // InternalPromise.g:2537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastAvoidanceAccess().getPastAvoidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalPromise.g:2551:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalPromise.g:2551:45: (iv_ruleWait= ruleWait EOF )
            // InternalPromise.g:2552:2: iv_ruleWait= ruleWait EOF
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
    // InternalPromise.g:2558:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2564:2: ( ( () otherlv_1= 'Wait' ) )
            // InternalPromise.g:2565:2: ( () otherlv_1= 'Wait' )
            {
            // InternalPromise.g:2565:2: ( () otherlv_1= 'Wait' )
            // InternalPromise.g:2566:3: () otherlv_1= 'Wait'
            {
            // InternalPromise.g:2566:3: ()
            // InternalPromise.g:2567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

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
    // InternalPromise.g:2581:1: entryRuleDelayedReaction returns [EObject current=null] : iv_ruleDelayedReaction= ruleDelayedReaction EOF ;
    public final EObject entryRuleDelayedReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedReaction = null;


        try {
            // InternalPromise.g:2581:56: (iv_ruleDelayedReaction= ruleDelayedReaction EOF )
            // InternalPromise.g:2582:2: iv_ruleDelayedReaction= ruleDelayedReaction EOF
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
    // InternalPromise.g:2588:1: ruleDelayedReaction returns [EObject current=null] : ( () otherlv_1= 'DelayedReaction' ) ;
    public final EObject ruleDelayedReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2594:2: ( ( () otherlv_1= 'DelayedReaction' ) )
            // InternalPromise.g:2595:2: ( () otherlv_1= 'DelayedReaction' )
            {
            // InternalPromise.g:2595:2: ( () otherlv_1= 'DelayedReaction' )
            // InternalPromise.g:2596:3: () otherlv_1= 'DelayedReaction'
            {
            // InternalPromise.g:2596:3: ()
            // InternalPromise.g:2597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayedReactionAccess().getDelayedReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

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
    // InternalPromise.g:2611:1: entryRuleInstantReaction returns [EObject current=null] : iv_ruleInstantReaction= ruleInstantReaction EOF ;
    public final EObject entryRuleInstantReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantReaction = null;


        try {
            // InternalPromise.g:2611:56: (iv_ruleInstantReaction= ruleInstantReaction EOF )
            // InternalPromise.g:2612:2: iv_ruleInstantReaction= ruleInstantReaction EOF
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
    // InternalPromise.g:2618:1: ruleInstantReaction returns [EObject current=null] : ( () otherlv_1= 'InstantReaction' ) ;
    public final EObject ruleInstantReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2624:2: ( ( () otherlv_1= 'InstantReaction' ) )
            // InternalPromise.g:2625:2: ( () otherlv_1= 'InstantReaction' )
            {
            // InternalPromise.g:2625:2: ( () otherlv_1= 'InstantReaction' )
            // InternalPromise.g:2626:3: () otherlv_1= 'InstantReaction'
            {
            // InternalPromise.g:2626:3: ()
            // InternalPromise.g:2627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstantReactionAccess().getInstantReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalPromise.g:2641:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPromise.g:2641:47: (iv_ruleEString= ruleEString EOF )
            // InternalPromise.g:2642:2: iv_ruleEString= ruleEString EOF
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
    // InternalPromise.g:2648:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2654:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPromise.g:2655:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPromise.g:2655:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPromise.g:2656:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2664:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000004449C400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000043000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000103000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFFFFE00000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002003120000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002003030000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002003010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002002010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000004C49C400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001C0000000000L});

}