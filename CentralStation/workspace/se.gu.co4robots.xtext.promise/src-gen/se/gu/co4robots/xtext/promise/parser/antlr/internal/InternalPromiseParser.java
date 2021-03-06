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
    // InternalPromise.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )? otherlv_17= 'robots' ( (lv_robots_18_0= ruleRobot ) ) (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )* (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )? otherlv_25= 'operators' otherlv_26= '{' ( (lv_operator_27_0= ruleOperator ) ) (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_events_5_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_actions_15_0 = null;

        EObject lv_robots_18_0 = null;

        EObject lv_robots_20_0 = null;

        EObject lv_locations_22_0 = null;

        EObject lv_locations_24_0 = null;

        EObject lv_operator_27_0 = null;

        EObject lv_operator_29_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:77:2: ( (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )? otherlv_17= 'robots' ( (lv_robots_18_0= ruleRobot ) ) (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )* (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )? otherlv_25= 'operators' otherlv_26= '{' ( (lv_operator_27_0= ruleOperator ) ) (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )? otherlv_17= 'robots' ( (lv_robots_18_0= ruleRobot ) ) (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )* (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )? otherlv_25= 'operators' otherlv_26= '{' ( (lv_operator_27_0= ruleOperator ) ) (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )? otherlv_17= 'robots' ( (lv_robots_18_0= ruleRobot ) ) (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )* (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )? otherlv_25= 'operators' otherlv_26= '{' ( (lv_operator_27_0= ruleOperator ) ) (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalPromise.g:79:3: otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )? otherlv_17= 'robots' ( (lv_robots_18_0= ruleRobot ) ) (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )* (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )? otherlv_25= 'operators' otherlv_26= '{' ( (lv_operator_27_0= ruleOperator ) ) (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPromise.g:87:3: (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPromise.g:88:4: otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* )? (otherlv_8= 'actions' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* )? (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )? otherlv_16= '}'
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

                    // InternalPromise.g:196:4: (otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPromise.g:197:5: otherlv_12= 'resources' ( (lv_actions_13_0= ruleAction ) ) (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )*
                            {
                            otherlv_12=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getResourcesKeyword_2_4_0());
                            				
                            // InternalPromise.g:201:5: ( (lv_actions_13_0= ruleAction ) )
                            // InternalPromise.g:202:6: (lv_actions_13_0= ruleAction )
                            {
                            // InternalPromise.g:202:6: (lv_actions_13_0= ruleAction )
                            // InternalPromise.g:203:7: lv_actions_13_0= ruleAction
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_4_1_0());
                            						
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

                            // InternalPromise.g:220:5: (otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==15) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalPromise.g:221:6: otherlv_14= ',' ( (lv_actions_15_0= ruleAction ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getCommaKeyword_2_4_2_0());
                            	    					
                            	    // InternalPromise.g:225:6: ( (lv_actions_15_0= ruleAction ) )
                            	    // InternalPromise.g:226:7: (lv_actions_15_0= ruleAction )
                            	    {
                            	    // InternalPromise.g:226:7: (lv_actions_15_0= ruleAction )
                            	    // InternalPromise.g:227:8: lv_actions_15_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_2_4_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_actions_15_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_15_0,
                            	    									"se.gu.co4robots.xtext.promise.Promise.Action");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_2_5());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getRobotsKeyword_3());
            		
            // InternalPromise.g:255:3: ( (lv_robots_18_0= ruleRobot ) )
            // InternalPromise.g:256:4: (lv_robots_18_0= ruleRobot )
            {
            // InternalPromise.g:256:4: (lv_robots_18_0= ruleRobot )
            // InternalPromise.g:257:5: lv_robots_18_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalPromise.g:274:3: (otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPromise.g:275:4: otherlv_19= ',' ( (lv_robots_20_0= ruleRobot ) )
            	    {
            	    otherlv_19=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalPromise.g:279:4: ( (lv_robots_20_0= ruleRobot ) )
            	    // InternalPromise.g:280:5: (lv_robots_20_0= ruleRobot )
            	    {
            	    // InternalPromise.g:280:5: (lv_robots_20_0= ruleRobot )
            	    // InternalPromise.g:281:6: lv_robots_20_0= ruleRobot
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getRobotsRobotParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_robots_20_0=ruleRobot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"robots",
            	    							lv_robots_20_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Robot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPromise.g:299:3: (otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPromise.g:300:4: otherlv_21= 'locations' ( (lv_locations_22_0= ruleLocation ) ) (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )*
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getLocationsKeyword_6_0());
                    			
                    // InternalPromise.g:304:4: ( (lv_locations_22_0= ruleLocation ) )
                    // InternalPromise.g:305:5: (lv_locations_22_0= ruleLocation )
                    {
                    // InternalPromise.g:305:5: (lv_locations_22_0= ruleLocation )
                    // InternalPromise.g:306:6: lv_locations_22_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_locations_22_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"locations",
                    							lv_locations_22_0,
                    							"se.gu.co4robots.xtext.promise.Promise.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:323:4: (otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPromise.g:324:5: otherlv_23= ',' ( (lv_locations_24_0= ruleLocation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalPromise.g:328:5: ( (lv_locations_24_0= ruleLocation ) )
                    	    // InternalPromise.g:329:6: (lv_locations_24_0= ruleLocation )
                    	    {
                    	    // InternalPromise.g:329:6: (lv_locations_24_0= ruleLocation )
                    	    // InternalPromise.g:330:7: lv_locations_24_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationsLocationParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_locations_24_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locations",
                    	    								lv_locations_24_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_25, grammarAccess.getMissionAccess().getOperatorsKeyword_7());
            		
            otherlv_26=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalPromise.g:357:3: ( (lv_operator_27_0= ruleOperator ) )
            // InternalPromise.g:358:4: (lv_operator_27_0= ruleOperator )
            {
            // InternalPromise.g:358:4: (lv_operator_27_0= ruleOperator )
            // InternalPromise.g:359:5: lv_operator_27_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_27_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_27_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:376:3: (otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPromise.g:377:4: otherlv_28= ',' ( (lv_operator_29_0= ruleOperator ) )
            	    {
            	    otherlv_28=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalPromise.g:381:4: ( (lv_operator_29_0= ruleOperator ) )
            	    // InternalPromise.g:382:5: (lv_operator_29_0= ruleOperator )
            	    {
            	    // InternalPromise.g:382:5: (lv_operator_29_0= ruleOperator )
            	    // InternalPromise.g:383:6: lv_operator_29_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_operator_29_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_29_0,
            	    							"se.gu.co4robots.xtext.promise.Promise.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_30=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_30, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_31=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalPromise.g:413:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalPromise.g:413:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalPromise.g:414:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalPromise.g:420:1: ruleOperator returns [EObject current=null] : (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp ) ;
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
            // InternalPromise.g:426:2: ( (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp ) )
            // InternalPromise.g:427:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp )
            {
            // InternalPromise.g:427:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp | this_TaskCombinationOp_6= ruleTaskCombinationOp )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            case 37:
                {
                alt12=6;
                }
                break;
            case 33:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPromise.g:428:3: this_FallBackOp_0= ruleFallBackOp
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
                    // InternalPromise.g:437:3: this_SequenceOp_1= ruleSequenceOp
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
                    // InternalPromise.g:446:3: this_ParallelOp_2= ruleParallelOp
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
                    // InternalPromise.g:455:3: this_EventHandlerOp_3= ruleEventHandlerOp
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
                    // InternalPromise.g:464:3: this_ConditionOp_4= ruleConditionOp
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
                    // InternalPromise.g:473:3: this_DelegateOp_5= ruleDelegateOp
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
                    // InternalPromise.g:482:3: this_TaskCombinationOp_6= ruleTaskCombinationOp
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
    // InternalPromise.g:494:1: entryRuleTasks returns [EObject current=null] : iv_ruleTasks= ruleTasks EOF ;
    public final EObject entryRuleTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasks = null;


        try {
            // InternalPromise.g:494:46: (iv_ruleTasks= ruleTasks EOF )
            // InternalPromise.g:495:2: iv_ruleTasks= ruleTasks EOF
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
    // InternalPromise.g:501:1: ruleTasks returns [EObject current=null] : (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs ) ;
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
            // InternalPromise.g:507:2: ( (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs ) )
            // InternalPromise.g:508:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs )
            {
            // InternalPromise.g:508:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction | this_Check_20= ruleCheck | this_CheckAndDeliver_21= ruleCheckAndDeliver | this_CheckSupplies_22= ruleCheckSupplies | this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh | this_TestITAAPAs_24= ruleTestITAAPAs )
            int alt13=25;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt13=1;
                }
                break;
            case 40:
                {
                alt13=2;
                }
                break;
            case 41:
                {
                alt13=3;
                }
                break;
            case 42:
                {
                alt13=4;
                }
                break;
            case 43:
                {
                alt13=5;
                }
                break;
            case 44:
                {
                alt13=6;
                }
                break;
            case 45:
                {
                alt13=7;
                }
                break;
            case 46:
                {
                alt13=8;
                }
                break;
            case 47:
                {
                alt13=9;
                }
                break;
            case 48:
                {
                alt13=10;
                }
                break;
            case 49:
                {
                alt13=11;
                }
                break;
            case 55:
                {
                alt13=12;
                }
                break;
            case 56:
                {
                alt13=13;
                }
                break;
            case 57:
                {
                alt13=14;
                }
                break;
            case 58:
                {
                alt13=15;
                }
                break;
            case 59:
                {
                alt13=16;
                }
                break;
            case 60:
                {
                alt13=17;
                }
                break;
            case 61:
                {
                alt13=18;
                }
                break;
            case 62:
                {
                alt13=19;
                }
                break;
            case 63:
                {
                alt13=20;
                }
                break;
            case 50:
                {
                alt13=21;
                }
                break;
            case 51:
                {
                alt13=22;
                }
                break;
            case 52:
                {
                alt13=23;
                }
                break;
            case 53:
                {
                alt13=24;
                }
                break;
            case 54:
                {
                alt13=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPromise.g:509:3: this_SimpleAction_0= ruleSimpleAction
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
                    // InternalPromise.g:518:3: this_Visit_1= ruleVisit
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
                    // InternalPromise.g:527:3: this_SequencedVisit_2= ruleSequencedVisit
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
                    // InternalPromise.g:536:3: this_OrderderVisit_3= ruleOrderderVisit
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
                    // InternalPromise.g:545:3: this_StrictOrderedVisit_4= ruleStrictOrderedVisit
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
                    // InternalPromise.g:554:3: this_FairVisit_5= ruleFairVisit
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
                    // InternalPromise.g:563:3: this_Patrolling_6= rulePatrolling
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
                    // InternalPromise.g:572:3: this_SequencedPatrolling_7= ruleSequencedPatrolling
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
                    // InternalPromise.g:581:3: this_OrderedPatrolling_8= ruleOrderedPatrolling
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
                    // InternalPromise.g:590:3: this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling
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
                    // InternalPromise.g:599:3: this_FairPatrolling_10= ruleFairPatrolling
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
                    // InternalPromise.g:608:3: this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance
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
                    // InternalPromise.g:617:3: this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance
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
                    // InternalPromise.g:626:3: this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance
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
                    // InternalPromise.g:635:3: this_FutureAvoidance_14= ruleFutureAvoidance
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
                    // InternalPromise.g:644:3: this_GlobalAvoidance_15= ruleGlobalAvoidance
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
                    // InternalPromise.g:653:3: this_PastAvoidance_16= rulePastAvoidance
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
                    // InternalPromise.g:662:3: this_Wait_17= ruleWait
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
                    // InternalPromise.g:671:3: this_DelayedReaction_18= ruleDelayedReaction
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
                    // InternalPromise.g:680:3: this_InstantReaction_19= ruleInstantReaction
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
                    // InternalPromise.g:689:3: this_Check_20= ruleCheck
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
                    // InternalPromise.g:698:3: this_CheckAndDeliver_21= ruleCheckAndDeliver
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
                    // InternalPromise.g:707:3: this_CheckSupplies_22= ruleCheckSupplies
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
                    // InternalPromise.g:716:3: this_CheckAndDeliverQCh_23= ruleCheckAndDeliverQCh
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
                    // InternalPromise.g:725:3: this_TestITAAPAs_24= ruleTestITAAPAs
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
    // InternalPromise.g:737:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPromise.g:737:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPromise.g:738:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalPromise.g:744:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:750:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:751:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:751:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:752:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:752:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:753:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:773:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalPromise.g:773:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalPromise.g:774:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalPromise.g:780:1: ruleLocation returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:786:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:787:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:787:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:788:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:788:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:789:4: lv_name_0_0= ruleEString
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
    // InternalPromise.g:809:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPromise.g:809:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPromise.g:810:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPromise.g:816:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:822:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:823:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:823:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:824:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:824:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:825:4: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:825:4: (lv_name_0_0= ruleEString )
            // InternalPromise.g:826:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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
            		
            // InternalPromise.g:847:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:848:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:848:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:849:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:870:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPromise.g:870:47: (iv_ruleAction= ruleAction EOF )
            // InternalPromise.g:871:2: iv_ruleAction= ruleAction EOF
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
    // InternalPromise.g:877:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:883:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:884:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:884:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:885:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:885:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:886:4: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:886:4: (lv_name_0_0= ruleEString )
            // InternalPromise.g:887:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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
            		
            // InternalPromise.g:908:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:909:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:909:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:910:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:931:1: entryRuleFallBackOp returns [EObject current=null] : iv_ruleFallBackOp= ruleFallBackOp EOF ;
    public final EObject entryRuleFallBackOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallBackOp = null;


        try {
            // InternalPromise.g:931:51: (iv_ruleFallBackOp= ruleFallBackOp EOF )
            // InternalPromise.g:932:2: iv_ruleFallBackOp= ruleFallBackOp EOF
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
    // InternalPromise.g:938:1: ruleFallBackOp returns [EObject current=null] : (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
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
            // InternalPromise.g:944:2: ( (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:945:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:945:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:946:3: otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFallBackOpAccess().getFallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFallBackOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:954:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:955:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:955:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:956:5: lv_inputOperators_2_0= ruleOperator
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

            // InternalPromise.g:973:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPromise.g:974:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFallBackOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:978:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:979:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:979:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:980:6: lv_inputOperators_4_0= ruleOperator
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
            	    break loop14;
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
    // InternalPromise.g:1006:1: entryRuleSequenceOp returns [EObject current=null] : iv_ruleSequenceOp= ruleSequenceOp EOF ;
    public final EObject entryRuleSequenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOp = null;


        try {
            // InternalPromise.g:1006:51: (iv_ruleSequenceOp= ruleSequenceOp EOF )
            // InternalPromise.g:1007:2: iv_ruleSequenceOp= ruleSequenceOp EOF
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
    // InternalPromise.g:1013:1: ruleSequenceOp returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) ;
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
            // InternalPromise.g:1019:2: ( (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' ) )
            // InternalPromise.g:1020:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            {
            // InternalPromise.g:1020:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')' )
            // InternalPromise.g:1021:3: otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceOpAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1029:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1030:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1030:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1031:5: lv_inputOperators_2_0= ruleOperator
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

            // InternalPromise.g:1048:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPromise.g:1049:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequenceOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1053:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1054:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1054:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1055:6: lv_inputOperators_4_0= ruleOperator
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
    // InternalPromise.g:1081:1: entryRuleParallelOp returns [EObject current=null] : iv_ruleParallelOp= ruleParallelOp EOF ;
    public final EObject entryRuleParallelOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelOp = null;


        try {
            // InternalPromise.g:1081:51: (iv_ruleParallelOp= ruleParallelOp EOF )
            // InternalPromise.g:1082:2: iv_ruleParallelOp= ruleParallelOp EOF
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
    // InternalPromise.g:1088:1: ruleParallelOp returns [EObject current=null] : ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' ) ;
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
            // InternalPromise.g:1094:2: ( ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' ) )
            // InternalPromise.g:1095:2: ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' )
            {
            // InternalPromise.g:1095:2: ( () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}' )
            // InternalPromise.g:1096:3: () otherlv_1= 'parallel' otherlv_2= '{' ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )? otherlv_12= '}'
            {
            // InternalPromise.g:1096:3: ()
            // InternalPromise.g:1097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelOpAccess().getParallelOpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelOpAccess().getParallelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelOpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPromise.g:1111:3: ( ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPromise.g:1112:4: ( ( ruleEString ) ) otherlv_4= '(' ( (lv_inputOperators_5_0= ruleOperator ) ) otherlv_6= ')' (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )*
                    {
                    // InternalPromise.g:1112:4: ( ( ruleEString ) )
                    // InternalPromise.g:1113:5: ( ruleEString )
                    {
                    // InternalPromise.g:1113:5: ( ruleEString )
                    // InternalPromise.g:1114:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputRobotsRobotCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalPromise.g:1132:4: ( (lv_inputOperators_5_0= ruleOperator ) )
                    // InternalPromise.g:1133:5: (lv_inputOperators_5_0= ruleOperator )
                    {
                    // InternalPromise.g:1133:5: (lv_inputOperators_5_0= ruleOperator )
                    // InternalPromise.g:1134:6: lv_inputOperators_5_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    otherlv_6=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_3_3());
                    			
                    // InternalPromise.g:1155:4: (otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPromise.g:1156:5: otherlv_7= ',' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_inputOperators_10_0= ruleOperator ) ) otherlv_11= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelOpAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalPromise.g:1160:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1161:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1161:6: ( ruleEString )
                    	    // InternalPromise.g:1162:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getInputRobotsRobotCrossReference_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_3_4_2());
                    	    				
                    	    // InternalPromise.g:1180:5: ( (lv_inputOperators_10_0= ruleOperator ) )
                    	    // InternalPromise.g:1181:6: (lv_inputOperators_10_0= ruleOperator )
                    	    {
                    	    // InternalPromise.g:1181:6: (lv_inputOperators_10_0= ruleOperator )
                    	    // InternalPromise.g:1182:7: lv_inputOperators_10_0= ruleOperator
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    	    otherlv_11=(Token)match(input,25,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getParallelOpAccess().getRightParenthesisKeyword_3_4_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // InternalPromise.g:1213:1: entryRuleEventHandlerOp returns [EObject current=null] : iv_ruleEventHandlerOp= ruleEventHandlerOp EOF ;
    public final EObject entryRuleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOp = null;


        try {
            // InternalPromise.g:1213:55: (iv_ruleEventHandlerOp= ruleEventHandlerOp EOF )
            // InternalPromise.g:1214:2: iv_ruleEventHandlerOp= ruleEventHandlerOp EOF
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
    // InternalPromise.g:1220:1: ruleEventHandlerOp returns [EObject current=null] : (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) ;
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
            // InternalPromise.g:1226:2: ( (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' ) )
            // InternalPromise.g:1227:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            {
            // InternalPromise.g:1227:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')' )
            // InternalPromise.g:1228:3: otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerOpAccess().getEventHandlerKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerOpAccess().getDefaultKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPromise.g:1244:3: ( (lv_inputOperators_4_0= ruleOperator ) )
            // InternalPromise.g:1245:4: (lv_inputOperators_4_0= ruleOperator )
            {
            // InternalPromise.g:1245:4: (lv_inputOperators_4_0= ruleOperator )
            // InternalPromise.g:1246:5: lv_inputOperators_4_0= ruleOperator
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

            otherlv_5=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_5());
            		
            // InternalPromise.g:1267:3: (otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPromise.g:1268:4: otherlv_6= 'except' ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventHandlerOpAccess().getExceptKeyword_6_0());
            	    			
            	    // InternalPromise.g:1272:4: ( (lv_inputEvents_7_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1273:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1273:5: (lv_inputEvents_7_0= ruleEventAssignment )
            	    // InternalPromise.g:1274:6: lv_inputEvents_7_0= ruleEventAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputEventsEventAssignmentParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalPromise.g:1300:1: entryRuleConditionOp returns [EObject current=null] : iv_ruleConditionOp= ruleConditionOp EOF ;
    public final EObject entryRuleConditionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOp = null;


        try {
            // InternalPromise.g:1300:52: (iv_ruleConditionOp= ruleConditionOp EOF )
            // InternalPromise.g:1301:2: iv_ruleConditionOp= ruleConditionOp EOF
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
    // InternalPromise.g:1307:1: ruleConditionOp returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleConditionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputEvents_3_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1313:2: ( (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' ) )
            // InternalPromise.g:1314:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            {
            // InternalPromise.g:1314:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')' )
            // InternalPromise.g:1315:3: otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionOpAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1323:3: (otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPromise.g:1324:4: otherlv_2= 'if' ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionOpAccess().getIfKeyword_2_0());
            	    			
            	    // InternalPromise.g:1328:4: ( (lv_inputEvents_3_0= ruleEventAssignment ) )
            	    // InternalPromise.g:1329:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    {
            	    // InternalPromise.g:1329:5: (lv_inputEvents_3_0= ruleEventAssignment )
            	    // InternalPromise.g:1330:6: lv_inputEvents_3_0= ruleEventAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputEventsEventAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalPromise.g:1356:1: entryRuleTaskCombinationOp returns [EObject current=null] : iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF ;
    public final EObject entryRuleTaskCombinationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskCombinationOp = null;


        try {
            // InternalPromise.g:1356:58: (iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF )
            // InternalPromise.g:1357:2: iv_ruleTaskCombinationOp= ruleTaskCombinationOp EOF
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
    // InternalPromise.g:1363:1: ruleTaskCombinationOp returns [EObject current=null] : (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' ) ;
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
            // InternalPromise.g:1369:2: ( (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' ) )
            // InternalPromise.g:1370:2: (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' )
            {
            // InternalPromise.g:1370:2: (otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')' )
            // InternalPromise.g:1371:3: otherlv_0= 'combination' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+ otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskCombinationOpAccess().getCombinationKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskCombinationOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1379:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1380:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1380:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1381:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getTaskCombinationOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalPromise.g:1398:3: ( (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=34 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPromise.g:1399:4: (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' ) ( (lv_inputOperators_6_0= ruleOperator ) )
            	    {
            	    // InternalPromise.g:1399:4: (otherlv_3= '&' | otherlv_4= 'AND' | otherlv_5= 'and' )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalPromise.g:1400:5: otherlv_3= '&'
            	            {
            	            otherlv_3=(Token)match(input,34,FOLLOW_13); 

            	            					newLeafNode(otherlv_3, grammarAccess.getTaskCombinationOpAccess().getAmpersandKeyword_3_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalPromise.g:1405:5: otherlv_4= 'AND'
            	            {
            	            otherlv_4=(Token)match(input,35,FOLLOW_13); 

            	            					newLeafNode(otherlv_4, grammarAccess.getTaskCombinationOpAccess().getANDKeyword_3_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalPromise.g:1410:5: otherlv_5= 'and'
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_13); 

            	            					newLeafNode(otherlv_5, grammarAccess.getTaskCombinationOpAccess().getAndKeyword_3_0_2());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalPromise.g:1415:4: ( (lv_inputOperators_6_0= ruleOperator ) )
            	    // InternalPromise.g:1416:5: (lv_inputOperators_6_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1416:5: (lv_inputOperators_6_0= ruleOperator )
            	    // InternalPromise.g:1417:6: lv_inputOperators_6_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getTaskCombinationOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalPromise.g:1443:1: entryRuleDelegateOp returns [EObject current=null] : iv_ruleDelegateOp= ruleDelegateOp EOF ;
    public final EObject entryRuleDelegateOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateOp = null;


        try {
            // InternalPromise.g:1443:51: (iv_ruleDelegateOp= ruleDelegateOp EOF )
            // InternalPromise.g:1444:2: iv_ruleDelegateOp= ruleDelegateOp EOF
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
    // InternalPromise.g:1450:1: ruleDelegateOp returns [EObject current=null] : (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? otherlv_19= ')' ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_task_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1456:2: ( (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? otherlv_19= ')' ) )
            // InternalPromise.g:1457:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? otherlv_19= ')' )
            {
            // InternalPromise.g:1457:2: (otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? otherlv_19= ')' )
            // InternalPromise.g:1458:3: otherlv_0= 'delegate' otherlv_1= '(' ( (lv_task_2_0= ruleTasks ) ) (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? otherlv_19= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegateOpAccess().getDelegateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegateOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1466:3: ( (lv_task_2_0= ruleTasks ) )
            // InternalPromise.g:1467:4: (lv_task_2_0= ruleTasks )
            {
            // InternalPromise.g:1467:4: (lv_task_2_0= ruleTasks )
            // InternalPromise.g:1468:5: lv_task_2_0= ruleTasks
            {

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getTaskTasksParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalPromise.g:1485:3: (otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPromise.g:1486:4: otherlv_3= 'locations' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDelegateOpAccess().getLocationsKeyword_3_0());
                    			
                    // InternalPromise.g:1490:4: ( ( ruleEString ) )
                    // InternalPromise.g:1491:5: ( ruleEString )
                    {
                    // InternalPromise.g:1491:5: ( ruleEString )
                    // InternalPromise.g:1492:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1506:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalPromise.g:1507:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDelegateOpAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPromise.g:1511:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1512:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1512:6: ( ruleEString )
                    	    // InternalPromise.g:1513:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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

            // InternalPromise.g:1529:3: (otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPromise.g:1530:4: otherlv_7= 'actions' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getDelegateOpAccess().getActionsKeyword_4_0());
                    			
                    // InternalPromise.g:1534:4: ( ( ruleEString ) )
                    // InternalPromise.g:1535:5: ( ruleEString )
                    {
                    // InternalPromise.g:1535:5: ( ruleEString )
                    // InternalPromise.g:1536:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1550:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalPromise.g:1551:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDelegateOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1555:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1556:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1556:6: ( ruleEString )
                    	    // InternalPromise.g:1557:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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

            // InternalPromise.g:1573:3: (otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPromise.g:1574:4: otherlv_11= 'resources' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getDelegateOpAccess().getResourcesKeyword_5_0());
                    			
                    // InternalPromise.g:1578:4: ( ( ruleEString ) )
                    // InternalPromise.g:1579:5: ( ruleEString )
                    {
                    // InternalPromise.g:1579:5: ( ruleEString )
                    // InternalPromise.g:1580:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputResourceActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1594:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalPromise.g:1595:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDelegateOpAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPromise.g:1599:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1600:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1600:6: ( ruleEString )
                    	    // InternalPromise.g:1601:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputResourceActionCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

            // InternalPromise.g:1617:3: (otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPromise.g:1618:4: otherlv_15= 'stoppingEvents' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getDelegateOpAccess().getStoppingEventsKeyword_6_0());
                    			
                    // InternalPromise.g:1622:4: ( ( ruleEString ) )
                    // InternalPromise.g:1623:5: ( ruleEString )
                    {
                    // InternalPromise.g:1623:5: ( ruleEString )
                    // InternalPromise.g:1624:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1638:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPromise.g:1639:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDelegateOpAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalPromise.g:1643:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1644:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1644:6: ( ruleEString )
                    	    // InternalPromise.g:1645:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

            otherlv_19=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getDelegateOpAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalPromise.g:1669:1: entryRuleEventAssignment returns [EObject current=null] : iv_ruleEventAssignment= ruleEventAssignment EOF ;
    public final EObject entryRuleEventAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAssignment = null;


        try {
            // InternalPromise.g:1669:56: (iv_ruleEventAssignment= ruleEventAssignment EOF )
            // InternalPromise.g:1670:2: iv_ruleEventAssignment= ruleEventAssignment EOF
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
    // InternalPromise.g:1676:1: ruleEventAssignment returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) ;
    public final EObject ruleEventAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputOperators_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1682:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' ) )
            // InternalPromise.g:1683:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            {
            // InternalPromise.g:1683:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')' )
            // InternalPromise.g:1684:3: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) otherlv_3= ')'
            {
            // InternalPromise.g:1684:3: ( ( ruleEString ) )
            // InternalPromise.g:1685:4: ( ruleEString )
            {
            // InternalPromise.g:1685:4: ( ruleEString )
            // InternalPromise.g:1686:5: ruleEString
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

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAssignmentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1704:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1705:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1705:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1706:5: lv_inputOperators_2_0= ruleOperator
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
    // InternalPromise.g:1731:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalPromise.g:1731:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalPromise.g:1732:2: iv_ruleSimpleAction= ruleSimpleAction EOF
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
    // InternalPromise.g:1738:1: ruleSimpleAction returns [EObject current=null] : ( () otherlv_1= 'SimpleAction' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1744:2: ( ( () otherlv_1= 'SimpleAction' ) )
            // InternalPromise.g:1745:2: ( () otherlv_1= 'SimpleAction' )
            {
            // InternalPromise.g:1745:2: ( () otherlv_1= 'SimpleAction' )
            // InternalPromise.g:1746:3: () otherlv_1= 'SimpleAction'
            {
            // InternalPromise.g:1746:3: ()
            // InternalPromise.g:1747:4: 
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
    // InternalPromise.g:1761:1: entryRuleVisit returns [EObject current=null] : iv_ruleVisit= ruleVisit EOF ;
    public final EObject entryRuleVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit = null;


        try {
            // InternalPromise.g:1761:46: (iv_ruleVisit= ruleVisit EOF )
            // InternalPromise.g:1762:2: iv_ruleVisit= ruleVisit EOF
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
    // InternalPromise.g:1768:1: ruleVisit returns [EObject current=null] : ( () otherlv_1= 'Visit' ) ;
    public final EObject ruleVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1774:2: ( ( () otherlv_1= 'Visit' ) )
            // InternalPromise.g:1775:2: ( () otherlv_1= 'Visit' )
            {
            // InternalPromise.g:1775:2: ( () otherlv_1= 'Visit' )
            // InternalPromise.g:1776:3: () otherlv_1= 'Visit'
            {
            // InternalPromise.g:1776:3: ()
            // InternalPromise.g:1777:4: 
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
    // InternalPromise.g:1791:1: entryRuleSequencedVisit returns [EObject current=null] : iv_ruleSequencedVisit= ruleSequencedVisit EOF ;
    public final EObject entryRuleSequencedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedVisit = null;


        try {
            // InternalPromise.g:1791:55: (iv_ruleSequencedVisit= ruleSequencedVisit EOF )
            // InternalPromise.g:1792:2: iv_ruleSequencedVisit= ruleSequencedVisit EOF
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
    // InternalPromise.g:1798:1: ruleSequencedVisit returns [EObject current=null] : ( () otherlv_1= 'SequencedVisit' ) ;
    public final EObject ruleSequencedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1804:2: ( ( () otherlv_1= 'SequencedVisit' ) )
            // InternalPromise.g:1805:2: ( () otherlv_1= 'SequencedVisit' )
            {
            // InternalPromise.g:1805:2: ( () otherlv_1= 'SequencedVisit' )
            // InternalPromise.g:1806:3: () otherlv_1= 'SequencedVisit'
            {
            // InternalPromise.g:1806:3: ()
            // InternalPromise.g:1807:4: 
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
    // InternalPromise.g:1821:1: entryRuleOrderderVisit returns [EObject current=null] : iv_ruleOrderderVisit= ruleOrderderVisit EOF ;
    public final EObject entryRuleOrderderVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderderVisit = null;


        try {
            // InternalPromise.g:1821:54: (iv_ruleOrderderVisit= ruleOrderderVisit EOF )
            // InternalPromise.g:1822:2: iv_ruleOrderderVisit= ruleOrderderVisit EOF
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
    // InternalPromise.g:1828:1: ruleOrderderVisit returns [EObject current=null] : ( () otherlv_1= 'OrderedVisit' ) ;
    public final EObject ruleOrderderVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1834:2: ( ( () otherlv_1= 'OrderedVisit' ) )
            // InternalPromise.g:1835:2: ( () otherlv_1= 'OrderedVisit' )
            {
            // InternalPromise.g:1835:2: ( () otherlv_1= 'OrderedVisit' )
            // InternalPromise.g:1836:3: () otherlv_1= 'OrderedVisit'
            {
            // InternalPromise.g:1836:3: ()
            // InternalPromise.g:1837:4: 
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
    // InternalPromise.g:1851:1: entryRuleStrictOrderedVisit returns [EObject current=null] : iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF ;
    public final EObject entryRuleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOrderedVisit = null;


        try {
            // InternalPromise.g:1851:59: (iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF )
            // InternalPromise.g:1852:2: iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF
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
    // InternalPromise.g:1858:1: ruleStrictOrderedVisit returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedVisit' ) ;
    public final EObject ruleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1864:2: ( ( () otherlv_1= 'StrictOrderedVisit' ) )
            // InternalPromise.g:1865:2: ( () otherlv_1= 'StrictOrderedVisit' )
            {
            // InternalPromise.g:1865:2: ( () otherlv_1= 'StrictOrderedVisit' )
            // InternalPromise.g:1866:3: () otherlv_1= 'StrictOrderedVisit'
            {
            // InternalPromise.g:1866:3: ()
            // InternalPromise.g:1867:4: 
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
    // InternalPromise.g:1881:1: entryRuleFairVisit returns [EObject current=null] : iv_ruleFairVisit= ruleFairVisit EOF ;
    public final EObject entryRuleFairVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairVisit = null;


        try {
            // InternalPromise.g:1881:50: (iv_ruleFairVisit= ruleFairVisit EOF )
            // InternalPromise.g:1882:2: iv_ruleFairVisit= ruleFairVisit EOF
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
    // InternalPromise.g:1888:1: ruleFairVisit returns [EObject current=null] : ( () otherlv_1= 'FairVisit' ) ;
    public final EObject ruleFairVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1894:2: ( ( () otherlv_1= 'FairVisit' ) )
            // InternalPromise.g:1895:2: ( () otherlv_1= 'FairVisit' )
            {
            // InternalPromise.g:1895:2: ( () otherlv_1= 'FairVisit' )
            // InternalPromise.g:1896:3: () otherlv_1= 'FairVisit'
            {
            // InternalPromise.g:1896:3: ()
            // InternalPromise.g:1897:4: 
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
    // InternalPromise.g:1911:1: entryRulePatrolling returns [EObject current=null] : iv_rulePatrolling= rulePatrolling EOF ;
    public final EObject entryRulePatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrolling = null;


        try {
            // InternalPromise.g:1911:51: (iv_rulePatrolling= rulePatrolling EOF )
            // InternalPromise.g:1912:2: iv_rulePatrolling= rulePatrolling EOF
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
    // InternalPromise.g:1918:1: rulePatrolling returns [EObject current=null] : ( () otherlv_1= 'Patrolling' ) ;
    public final EObject rulePatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1924:2: ( ( () otherlv_1= 'Patrolling' ) )
            // InternalPromise.g:1925:2: ( () otherlv_1= 'Patrolling' )
            {
            // InternalPromise.g:1925:2: ( () otherlv_1= 'Patrolling' )
            // InternalPromise.g:1926:3: () otherlv_1= 'Patrolling'
            {
            // InternalPromise.g:1926:3: ()
            // InternalPromise.g:1927:4: 
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
    // InternalPromise.g:1941:1: entryRuleSequencedPatrolling returns [EObject current=null] : iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF ;
    public final EObject entryRuleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedPatrolling = null;


        try {
            // InternalPromise.g:1941:60: (iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF )
            // InternalPromise.g:1942:2: iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF
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
    // InternalPromise.g:1948:1: ruleSequencedPatrolling returns [EObject current=null] : ( () otherlv_1= 'SequencedPatrolling' ) ;
    public final EObject ruleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1954:2: ( ( () otherlv_1= 'SequencedPatrolling' ) )
            // InternalPromise.g:1955:2: ( () otherlv_1= 'SequencedPatrolling' )
            {
            // InternalPromise.g:1955:2: ( () otherlv_1= 'SequencedPatrolling' )
            // InternalPromise.g:1956:3: () otherlv_1= 'SequencedPatrolling'
            {
            // InternalPromise.g:1956:3: ()
            // InternalPromise.g:1957:4: 
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
    // InternalPromise.g:1971:1: entryRuleOrderedPatrolling returns [EObject current=null] : iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF ;
    public final EObject entryRuleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedPatrolling = null;


        try {
            // InternalPromise.g:1971:58: (iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF )
            // InternalPromise.g:1972:2: iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF
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
    // InternalPromise.g:1978:1: ruleOrderedPatrolling returns [EObject current=null] : ( () otherlv_1= 'OrderedPatrolling' ) ;
    public final EObject ruleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1984:2: ( ( () otherlv_1= 'OrderedPatrolling' ) )
            // InternalPromise.g:1985:2: ( () otherlv_1= 'OrderedPatrolling' )
            {
            // InternalPromise.g:1985:2: ( () otherlv_1= 'OrderedPatrolling' )
            // InternalPromise.g:1986:3: () otherlv_1= 'OrderedPatrolling'
            {
            // InternalPromise.g:1986:3: ()
            // InternalPromise.g:1987:4: 
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
    // InternalPromise.g:2001:1: entryRuleStrictOreredPatrolling returns [EObject current=null] : iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF ;
    public final EObject entryRuleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOreredPatrolling = null;


        try {
            // InternalPromise.g:2001:63: (iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF )
            // InternalPromise.g:2002:2: iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF
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
    // InternalPromise.g:2008:1: ruleStrictOreredPatrolling returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedPatrolling' ) ;
    public final EObject ruleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2014:2: ( ( () otherlv_1= 'StrictOrderedPatrolling' ) )
            // InternalPromise.g:2015:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            {
            // InternalPromise.g:2015:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            // InternalPromise.g:2016:3: () otherlv_1= 'StrictOrderedPatrolling'
            {
            // InternalPromise.g:2016:3: ()
            // InternalPromise.g:2017:4: 
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
    // InternalPromise.g:2031:1: entryRuleFairPatrolling returns [EObject current=null] : iv_ruleFairPatrolling= ruleFairPatrolling EOF ;
    public final EObject entryRuleFairPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairPatrolling = null;


        try {
            // InternalPromise.g:2031:55: (iv_ruleFairPatrolling= ruleFairPatrolling EOF )
            // InternalPromise.g:2032:2: iv_ruleFairPatrolling= ruleFairPatrolling EOF
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
    // InternalPromise.g:2038:1: ruleFairPatrolling returns [EObject current=null] : ( () otherlv_1= 'FairPatrolling' ) ;
    public final EObject ruleFairPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2044:2: ( ( () otherlv_1= 'FairPatrolling' ) )
            // InternalPromise.g:2045:2: ( () otherlv_1= 'FairPatrolling' )
            {
            // InternalPromise.g:2045:2: ( () otherlv_1= 'FairPatrolling' )
            // InternalPromise.g:2046:3: () otherlv_1= 'FairPatrolling'
            {
            // InternalPromise.g:2046:3: ()
            // InternalPromise.g:2047:4: 
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
    // InternalPromise.g:2061:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalPromise.g:2061:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalPromise.g:2062:2: iv_ruleCheck= ruleCheck EOF
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
    // InternalPromise.g:2068:1: ruleCheck returns [EObject current=null] : ( () otherlv_1= 'Check' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2074:2: ( ( () otherlv_1= 'Check' ) )
            // InternalPromise.g:2075:2: ( () otherlv_1= 'Check' )
            {
            // InternalPromise.g:2075:2: ( () otherlv_1= 'Check' )
            // InternalPromise.g:2076:3: () otherlv_1= 'Check'
            {
            // InternalPromise.g:2076:3: ()
            // InternalPromise.g:2077:4: 
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
    // InternalPromise.g:2091:1: entryRuleCheckAndDeliver returns [EObject current=null] : iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF ;
    public final EObject entryRuleCheckAndDeliver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckAndDeliver = null;


        try {
            // InternalPromise.g:2091:56: (iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF )
            // InternalPromise.g:2092:2: iv_ruleCheckAndDeliver= ruleCheckAndDeliver EOF
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
    // InternalPromise.g:2098:1: ruleCheckAndDeliver returns [EObject current=null] : ( () otherlv_1= 'CheckAndDeliver' ) ;
    public final EObject ruleCheckAndDeliver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2104:2: ( ( () otherlv_1= 'CheckAndDeliver' ) )
            // InternalPromise.g:2105:2: ( () otherlv_1= 'CheckAndDeliver' )
            {
            // InternalPromise.g:2105:2: ( () otherlv_1= 'CheckAndDeliver' )
            // InternalPromise.g:2106:3: () otherlv_1= 'CheckAndDeliver'
            {
            // InternalPromise.g:2106:3: ()
            // InternalPromise.g:2107:4: 
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
    // InternalPromise.g:2121:1: entryRuleCheckSupplies returns [EObject current=null] : iv_ruleCheckSupplies= ruleCheckSupplies EOF ;
    public final EObject entryRuleCheckSupplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckSupplies = null;


        try {
            // InternalPromise.g:2121:54: (iv_ruleCheckSupplies= ruleCheckSupplies EOF )
            // InternalPromise.g:2122:2: iv_ruleCheckSupplies= ruleCheckSupplies EOF
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
    // InternalPromise.g:2128:1: ruleCheckSupplies returns [EObject current=null] : ( () otherlv_1= 'CheckSupplies' ) ;
    public final EObject ruleCheckSupplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2134:2: ( ( () otherlv_1= 'CheckSupplies' ) )
            // InternalPromise.g:2135:2: ( () otherlv_1= 'CheckSupplies' )
            {
            // InternalPromise.g:2135:2: ( () otherlv_1= 'CheckSupplies' )
            // InternalPromise.g:2136:3: () otherlv_1= 'CheckSupplies'
            {
            // InternalPromise.g:2136:3: ()
            // InternalPromise.g:2137:4: 
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
    // InternalPromise.g:2151:1: entryRuleCheckAndDeliverQCh returns [EObject current=null] : iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF ;
    public final EObject entryRuleCheckAndDeliverQCh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckAndDeliverQCh = null;


        try {
            // InternalPromise.g:2151:59: (iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF )
            // InternalPromise.g:2152:2: iv_ruleCheckAndDeliverQCh= ruleCheckAndDeliverQCh EOF
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
    // InternalPromise.g:2158:1: ruleCheckAndDeliverQCh returns [EObject current=null] : ( () otherlv_1= 'CheckAndDeliverQCh' ) ;
    public final EObject ruleCheckAndDeliverQCh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2164:2: ( ( () otherlv_1= 'CheckAndDeliverQCh' ) )
            // InternalPromise.g:2165:2: ( () otherlv_1= 'CheckAndDeliverQCh' )
            {
            // InternalPromise.g:2165:2: ( () otherlv_1= 'CheckAndDeliverQCh' )
            // InternalPromise.g:2166:3: () otherlv_1= 'CheckAndDeliverQCh'
            {
            // InternalPromise.g:2166:3: ()
            // InternalPromise.g:2167:4: 
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
    // InternalPromise.g:2181:1: entryRuleTestITAAPAs returns [EObject current=null] : iv_ruleTestITAAPAs= ruleTestITAAPAs EOF ;
    public final EObject entryRuleTestITAAPAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestITAAPAs = null;


        try {
            // InternalPromise.g:2181:52: (iv_ruleTestITAAPAs= ruleTestITAAPAs EOF )
            // InternalPromise.g:2182:2: iv_ruleTestITAAPAs= ruleTestITAAPAs EOF
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
    // InternalPromise.g:2188:1: ruleTestITAAPAs returns [EObject current=null] : ( () otherlv_1= 'TestITAAPAs' ) ;
    public final EObject ruleTestITAAPAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2194:2: ( ( () otherlv_1= 'TestITAAPAs' ) )
            // InternalPromise.g:2195:2: ( () otherlv_1= 'TestITAAPAs' )
            {
            // InternalPromise.g:2195:2: ( () otherlv_1= 'TestITAAPAs' )
            // InternalPromise.g:2196:3: () otherlv_1= 'TestITAAPAs'
            {
            // InternalPromise.g:2196:3: ()
            // InternalPromise.g:2197:4: 
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
    // InternalPromise.g:2211:1: entryRuleUpperRestrictedAvoidance returns [EObject current=null] : iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF ;
    public final EObject entryRuleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2211:65: (iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF )
            // InternalPromise.g:2212:2: iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF
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
    // InternalPromise.g:2218:1: ruleUpperRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'UpperRestrictedAvoidance' ) ;
    public final EObject ruleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2224:2: ( ( () otherlv_1= 'UpperRestrictedAvoidance' ) )
            // InternalPromise.g:2225:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            {
            // InternalPromise.g:2225:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            // InternalPromise.g:2226:3: () otherlv_1= 'UpperRestrictedAvoidance'
            {
            // InternalPromise.g:2226:3: ()
            // InternalPromise.g:2227:4: 
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
    // InternalPromise.g:2241:1: entryRuleExactRestrictedAvoidance returns [EObject current=null] : iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF ;
    public final EObject entryRuleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2241:65: (iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF )
            // InternalPromise.g:2242:2: iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF
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
    // InternalPromise.g:2248:1: ruleExactRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'ExactRestrictedAvoidance' ) ;
    public final EObject ruleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2254:2: ( ( () otherlv_1= 'ExactRestrictedAvoidance' ) )
            // InternalPromise.g:2255:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            {
            // InternalPromise.g:2255:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            // InternalPromise.g:2256:3: () otherlv_1= 'ExactRestrictedAvoidance'
            {
            // InternalPromise.g:2256:3: ()
            // InternalPromise.g:2257:4: 
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
    // InternalPromise.g:2271:1: entryRuleLowerRestrictedAvoidance returns [EObject current=null] : iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF ;
    public final EObject entryRuleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2271:65: (iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF )
            // InternalPromise.g:2272:2: iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF
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
    // InternalPromise.g:2278:1: ruleLowerRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'LowerRestrictedAvoidance' ) ;
    public final EObject ruleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2284:2: ( ( () otherlv_1= 'LowerRestrictedAvoidance' ) )
            // InternalPromise.g:2285:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            {
            // InternalPromise.g:2285:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            // InternalPromise.g:2286:3: () otherlv_1= 'LowerRestrictedAvoidance'
            {
            // InternalPromise.g:2286:3: ()
            // InternalPromise.g:2287:4: 
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
    // InternalPromise.g:2301:1: entryRuleFutureAvoidance returns [EObject current=null] : iv_ruleFutureAvoidance= ruleFutureAvoidance EOF ;
    public final EObject entryRuleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureAvoidance = null;


        try {
            // InternalPromise.g:2301:56: (iv_ruleFutureAvoidance= ruleFutureAvoidance EOF )
            // InternalPromise.g:2302:2: iv_ruleFutureAvoidance= ruleFutureAvoidance EOF
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
    // InternalPromise.g:2308:1: ruleFutureAvoidance returns [EObject current=null] : ( () otherlv_1= 'FutureAvoidance' ) ;
    public final EObject ruleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2314:2: ( ( () otherlv_1= 'FutureAvoidance' ) )
            // InternalPromise.g:2315:2: ( () otherlv_1= 'FutureAvoidance' )
            {
            // InternalPromise.g:2315:2: ( () otherlv_1= 'FutureAvoidance' )
            // InternalPromise.g:2316:3: () otherlv_1= 'FutureAvoidance'
            {
            // InternalPromise.g:2316:3: ()
            // InternalPromise.g:2317:4: 
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
    // InternalPromise.g:2331:1: entryRuleGlobalAvoidance returns [EObject current=null] : iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF ;
    public final EObject entryRuleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAvoidance = null;


        try {
            // InternalPromise.g:2331:56: (iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF )
            // InternalPromise.g:2332:2: iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF
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
    // InternalPromise.g:2338:1: ruleGlobalAvoidance returns [EObject current=null] : ( () otherlv_1= 'GlobalAvoidance' ) ;
    public final EObject ruleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2344:2: ( ( () otherlv_1= 'GlobalAvoidance' ) )
            // InternalPromise.g:2345:2: ( () otherlv_1= 'GlobalAvoidance' )
            {
            // InternalPromise.g:2345:2: ( () otherlv_1= 'GlobalAvoidance' )
            // InternalPromise.g:2346:3: () otherlv_1= 'GlobalAvoidance'
            {
            // InternalPromise.g:2346:3: ()
            // InternalPromise.g:2347:4: 
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
    // InternalPromise.g:2361:1: entryRulePastAvoidance returns [EObject current=null] : iv_rulePastAvoidance= rulePastAvoidance EOF ;
    public final EObject entryRulePastAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastAvoidance = null;


        try {
            // InternalPromise.g:2361:54: (iv_rulePastAvoidance= rulePastAvoidance EOF )
            // InternalPromise.g:2362:2: iv_rulePastAvoidance= rulePastAvoidance EOF
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
    // InternalPromise.g:2368:1: rulePastAvoidance returns [EObject current=null] : ( () otherlv_1= 'PastAvoidance' ) ;
    public final EObject rulePastAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2374:2: ( ( () otherlv_1= 'PastAvoidance' ) )
            // InternalPromise.g:2375:2: ( () otherlv_1= 'PastAvoidance' )
            {
            // InternalPromise.g:2375:2: ( () otherlv_1= 'PastAvoidance' )
            // InternalPromise.g:2376:3: () otherlv_1= 'PastAvoidance'
            {
            // InternalPromise.g:2376:3: ()
            // InternalPromise.g:2377:4: 
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
    // InternalPromise.g:2391:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalPromise.g:2391:45: (iv_ruleWait= ruleWait EOF )
            // InternalPromise.g:2392:2: iv_ruleWait= ruleWait EOF
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
    // InternalPromise.g:2398:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2404:2: ( ( () otherlv_1= 'Wait' ) )
            // InternalPromise.g:2405:2: ( () otherlv_1= 'Wait' )
            {
            // InternalPromise.g:2405:2: ( () otherlv_1= 'Wait' )
            // InternalPromise.g:2406:3: () otherlv_1= 'Wait'
            {
            // InternalPromise.g:2406:3: ()
            // InternalPromise.g:2407:4: 
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
    // InternalPromise.g:2421:1: entryRuleDelayedReaction returns [EObject current=null] : iv_ruleDelayedReaction= ruleDelayedReaction EOF ;
    public final EObject entryRuleDelayedReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedReaction = null;


        try {
            // InternalPromise.g:2421:56: (iv_ruleDelayedReaction= ruleDelayedReaction EOF )
            // InternalPromise.g:2422:2: iv_ruleDelayedReaction= ruleDelayedReaction EOF
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
    // InternalPromise.g:2428:1: ruleDelayedReaction returns [EObject current=null] : ( () otherlv_1= 'DelayedReaction' ) ;
    public final EObject ruleDelayedReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2434:2: ( ( () otherlv_1= 'DelayedReaction' ) )
            // InternalPromise.g:2435:2: ( () otherlv_1= 'DelayedReaction' )
            {
            // InternalPromise.g:2435:2: ( () otherlv_1= 'DelayedReaction' )
            // InternalPromise.g:2436:3: () otherlv_1= 'DelayedReaction'
            {
            // InternalPromise.g:2436:3: ()
            // InternalPromise.g:2437:4: 
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
    // InternalPromise.g:2451:1: entryRuleInstantReaction returns [EObject current=null] : iv_ruleInstantReaction= ruleInstantReaction EOF ;
    public final EObject entryRuleInstantReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantReaction = null;


        try {
            // InternalPromise.g:2451:56: (iv_ruleInstantReaction= ruleInstantReaction EOF )
            // InternalPromise.g:2452:2: iv_ruleInstantReaction= ruleInstantReaction EOF
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
    // InternalPromise.g:2458:1: ruleInstantReaction returns [EObject current=null] : ( () otherlv_1= 'InstantReaction' ) ;
    public final EObject ruleInstantReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2464:2: ( ( () otherlv_1= 'InstantReaction' ) )
            // InternalPromise.g:2465:2: ( () otherlv_1= 'InstantReaction' )
            {
            // InternalPromise.g:2465:2: ( () otherlv_1= 'InstantReaction' )
            // InternalPromise.g:2466:3: () otherlv_1= 'InstantReaction'
            {
            // InternalPromise.g:2466:3: ()
            // InternalPromise.g:2467:4: 
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
    // InternalPromise.g:2481:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPromise.g:2481:47: (iv_ruleEString= ruleEString EOF )
            // InternalPromise.g:2482:2: iv_ruleEString= ruleEString EOF
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
    // InternalPromise.g:2488:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2494:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPromise.g:2495:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPromise.g:2495:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPromise.g:2496:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2504:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000229C800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C02000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFFFFFF8000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004002130000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004002038000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004002028000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004002008000L});

}