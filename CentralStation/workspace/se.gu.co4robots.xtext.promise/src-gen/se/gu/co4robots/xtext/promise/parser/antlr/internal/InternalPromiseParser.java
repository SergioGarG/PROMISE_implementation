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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mission'", "'{'", "'conditions'", "'events'", "':'", "','", "'actions'", "'}'", "'robots'", "'locations'", "'ordered'", "'not'", "'operators'", "'fallback'", "'('", "'affecting event'", "')'", "'sequence'", "'parallel'", "'eventHandler'", "'default'", "'except'", "'condition'", "'if'", "'then'", "'delegate'", "'robot'", "'does'", "'stoppingEvents'", "'SimpleAction'", "'Visit'", "'SequencedVisit'", "'OrderedVisit'", "'StrictOrderedVisit'", "'FairVisit'", "'Patrolling'", "'SequencedPatrolling'", "'OrderedPatrolling'", "'StrictOrderedPatrolling'", "'FairPatrolling'", "'UpperRestrictedAvoidance'", "'ExactRestrictedAvoidance'", "'LowerRestrictedAvoidance'", "'FutureAvoidance'", "'GlobalAvoidance'", "'PastAvoidance'", "'Wait'", "'DelayedReaction'", "'InstantReaction'"
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
    // InternalPromise.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* otherlv_19= 'locations' otherlv_20= '{' (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )? (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )? otherlv_32= '}' otherlv_33= 'operators' otherlv_34= '{' ( (lv_operator_35_0= ruleOperator ) ) (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )* otherlv_38= '}' otherlv_39= '}' ) ;
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
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_conditions_6_0 = null;

        EObject lv_conditions_8_0 = null;

        EObject lv_conditions_11_0 = null;

        EObject lv_conditions_13_0 = null;

        EObject lv_robots_16_0 = null;

        EObject lv_robots_18_0 = null;

        EObject lv_location_23_0 = null;

        EObject lv_location_25_0 = null;

        EObject lv_location_29_0 = null;

        EObject lv_location_31_0 = null;

        EObject lv_operator_35_0 = null;

        EObject lv_operator_37_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:77:2: ( (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* otherlv_19= 'locations' otherlv_20= '{' (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )? (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )? otherlv_32= '}' otherlv_33= 'operators' otherlv_34= '{' ( (lv_operator_35_0= ruleOperator ) ) (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )* otherlv_38= '}' otherlv_39= '}' ) )
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* otherlv_19= 'locations' otherlv_20= '{' (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )? (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )? otherlv_32= '}' otherlv_33= 'operators' otherlv_34= '{' ( (lv_operator_35_0= ruleOperator ) ) (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )* otherlv_38= '}' otherlv_39= '}' )
            {
            // InternalPromise.g:78:2: (otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* otherlv_19= 'locations' otherlv_20= '{' (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )? (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )? otherlv_32= '}' otherlv_33= 'operators' otherlv_34= '{' ( (lv_operator_35_0= ruleOperator ) ) (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )* otherlv_38= '}' otherlv_39= '}' )
            // InternalPromise.g:79:3: otherlv_0= 'mission' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )? otherlv_15= 'robots' ( (lv_robots_16_0= ruleRobot ) ) (otherlv_17= ',' ( (lv_robots_18_0= ruleRobot ) ) )* otherlv_19= 'locations' otherlv_20= '{' (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )? (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )? otherlv_32= '}' otherlv_33= 'operators' otherlv_34= '{' ( (lv_operator_35_0= ruleOperator ) ) (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )* otherlv_38= '}' otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPromise.g:87:3: (otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPromise.g:88:4: otherlv_2= 'conditions' otherlv_3= '{' (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )? (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )? otherlv_14= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getConditionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalPromise.g:96:4: (otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalPromise.g:97:5: otherlv_4= 'events' otherlv_5= ':' ( (lv_conditions_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )*
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEventsKeyword_2_2_0());
                            				
                            otherlv_5=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getColonKeyword_2_2_1());
                            				
                            // InternalPromise.g:105:5: ( (lv_conditions_6_0= ruleEvent ) )
                            // InternalPromise.g:106:6: (lv_conditions_6_0= ruleEvent )
                            {
                            // InternalPromise.g:106:6: (lv_conditions_6_0= ruleEvent )
                            // InternalPromise.g:107:7: lv_conditions_6_0= ruleEvent
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getConditionsEventParserRuleCall_2_2_2_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_conditions_6_0=ruleEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"conditions",
                            								lv_conditions_6_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Event");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:124:5: (otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==16) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalPromise.g:125:6: otherlv_7= ',' ( (lv_conditions_8_0= ruleEvent ) )
                            	    {
                            	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getCommaKeyword_2_2_3_0());
                            	    					
                            	    // InternalPromise.g:129:6: ( (lv_conditions_8_0= ruleEvent ) )
                            	    // InternalPromise.g:130:7: (lv_conditions_8_0= ruleEvent )
                            	    {
                            	    // InternalPromise.g:130:7: (lv_conditions_8_0= ruleEvent )
                            	    // InternalPromise.g:131:8: lv_conditions_8_0= ruleEvent
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getConditionsEventParserRuleCall_2_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_conditions_8_0=ruleEvent();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"conditions",
                            	    									lv_conditions_8_0,
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

                    // InternalPromise.g:150:4: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPromise.g:151:5: otherlv_9= 'actions' otherlv_10= ':' ( (lv_conditions_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )*
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getActionsKeyword_2_3_0());
                            				
                            otherlv_10=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getColonKeyword_2_3_1());
                            				
                            // InternalPromise.g:159:5: ( (lv_conditions_11_0= ruleAction ) )
                            // InternalPromise.g:160:6: (lv_conditions_11_0= ruleAction )
                            {
                            // InternalPromise.g:160:6: (lv_conditions_11_0= ruleAction )
                            // InternalPromise.g:161:7: lv_conditions_11_0= ruleAction
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getConditionsActionParserRuleCall_2_3_2_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_conditions_11_0=ruleAction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							add(
                            								current,
                            								"conditions",
                            								lv_conditions_11_0,
                            								"se.gu.co4robots.xtext.promise.Promise.Action");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPromise.g:178:5: (otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==16) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalPromise.g:179:6: otherlv_12= ',' ( (lv_conditions_13_0= ruleAction ) )
                            	    {
                            	    otherlv_12=(Token)match(input,16,FOLLOW_7); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getCommaKeyword_2_3_3_0());
                            	    					
                            	    // InternalPromise.g:183:6: ( (lv_conditions_13_0= ruleAction ) )
                            	    // InternalPromise.g:184:7: (lv_conditions_13_0= ruleAction )
                            	    {
                            	    // InternalPromise.g:184:7: (lv_conditions_13_0= ruleAction )
                            	    // InternalPromise.g:185:8: lv_conditions_13_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getMissionAccess().getConditionsActionParserRuleCall_2_3_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_conditions_13_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMissionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"conditions",
                            	    									lv_conditions_13_0,
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

            otherlv_19=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getLocationsKeyword_6());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalPromise.g:265:3: (otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPromise.g:266:4: otherlv_21= 'ordered' otherlv_22= ':' ( (lv_location_23_0= ruleOrderedLocation ) ) (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )*
                    {
                    otherlv_21=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getOrderedKeyword_8_0());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getColonKeyword_8_1());
                    			
                    // InternalPromise.g:274:4: ( (lv_location_23_0= ruleOrderedLocation ) )
                    // InternalPromise.g:275:5: (lv_location_23_0= ruleOrderedLocation )
                    {
                    // InternalPromise.g:275:5: (lv_location_23_0= ruleOrderedLocation )
                    // InternalPromise.g:276:6: lv_location_23_0= ruleOrderedLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationOrderedLocationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_location_23_0=ruleOrderedLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"location",
                    							lv_location_23_0,
                    							"se.gu.co4robots.xtext.promise.Promise.OrderedLocation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:293:4: (otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPromise.g:294:5: otherlv_24= ',' ( (lv_location_25_0= ruleOrderedLocation ) )
                    	    {
                    	    otherlv_24=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalPromise.g:298:5: ( (lv_location_25_0= ruleOrderedLocation ) )
                    	    // InternalPromise.g:299:6: (lv_location_25_0= ruleOrderedLocation )
                    	    {
                    	    // InternalPromise.g:299:6: (lv_location_25_0= ruleOrderedLocation )
                    	    // InternalPromise.g:300:7: lv_location_25_0= ruleOrderedLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationOrderedLocationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_location_25_0=ruleOrderedLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"location",
                    	    								lv_location_25_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.OrderedLocation");
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

            // InternalPromise.g:319:3: (otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPromise.g:320:4: otherlv_26= 'not' otherlv_27= 'ordered' otherlv_28= ':' ( (lv_location_29_0= ruleNotOrderedLocation ) ) (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )*
                    {
                    otherlv_26=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getNotKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getOrderedKeyword_9_1());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getColonKeyword_9_2());
                    			
                    // InternalPromise.g:332:4: ( (lv_location_29_0= ruleNotOrderedLocation ) )
                    // InternalPromise.g:333:5: (lv_location_29_0= ruleNotOrderedLocation )
                    {
                    // InternalPromise.g:333:5: (lv_location_29_0= ruleNotOrderedLocation )
                    // InternalPromise.g:334:6: lv_location_29_0= ruleNotOrderedLocation
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getLocationNotOrderedLocationParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_location_29_0=ruleNotOrderedLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"location",
                    							lv_location_29_0,
                    							"se.gu.co4robots.xtext.promise.Promise.NotOrderedLocation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:351:4: (otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPromise.g:352:5: otherlv_30= ',' ( (lv_location_31_0= ruleNotOrderedLocation ) )
                    	    {
                    	    otherlv_30=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getMissionAccess().getCommaKeyword_9_4_0());
                    	    				
                    	    // InternalPromise.g:356:5: ( (lv_location_31_0= ruleNotOrderedLocation ) )
                    	    // InternalPromise.g:357:6: (lv_location_31_0= ruleNotOrderedLocation )
                    	    {
                    	    // InternalPromise.g:357:6: (lv_location_31_0= ruleNotOrderedLocation )
                    	    // InternalPromise.g:358:7: lv_location_31_0= ruleNotOrderedLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getLocationNotOrderedLocationParserRuleCall_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_location_31_0=ruleNotOrderedLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"location",
                    	    								lv_location_31_0,
                    	    								"se.gu.co4robots.xtext.promise.Promise.NotOrderedLocation");
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

            otherlv_32=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_32, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_33=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_33, grammarAccess.getMissionAccess().getOperatorsKeyword_11());
            		
            otherlv_34=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_34, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalPromise.g:389:3: ( (lv_operator_35_0= ruleOperator ) )
            // InternalPromise.g:390:4: (lv_operator_35_0= ruleOperator )
            {
            // InternalPromise.g:390:4: (lv_operator_35_0= ruleOperator )
            // InternalPromise.g:391:5: lv_operator_35_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_35_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_35_0,
            						"se.gu.co4robots.xtext.promise.Promise.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:408:3: (otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPromise.g:409:4: otherlv_36= ',' ( (lv_operator_37_0= ruleOperator ) )
            	    {
            	    otherlv_36=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_36, grammarAccess.getMissionAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalPromise.g:413:4: ( (lv_operator_37_0= ruleOperator ) )
            	    // InternalPromise.g:414:5: (lv_operator_37_0= ruleOperator )
            	    {
            	    // InternalPromise.g:414:5: (lv_operator_37_0= ruleOperator )
            	    // InternalPromise.g:415:6: lv_operator_37_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getOperatorOperatorParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_operator_37_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_37_0,
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

            otherlv_38=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_38, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_39=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalPromise.g:445:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalPromise.g:445:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalPromise.g:446:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalPromise.g:452:1: ruleOperator returns [EObject current=null] : (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_FallBackOp_0 = null;

        EObject this_SequenceOp_1 = null;

        EObject this_ParallelOp_2 = null;

        EObject this_EventHandlerOp_3 = null;

        EObject this_ConditionOp_4 = null;

        EObject this_DelegateOp_5 = null;



        	enterRule();

        try {
            // InternalPromise.g:458:2: ( (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp ) )
            // InternalPromise.g:459:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp )
            {
            // InternalPromise.g:459:2: (this_FallBackOp_0= ruleFallBackOp | this_SequenceOp_1= ruleSequenceOp | this_ParallelOp_2= ruleParallelOp | this_EventHandlerOp_3= ruleEventHandlerOp | this_ConditionOp_4= ruleConditionOp | this_DelegateOp_5= ruleDelegateOp )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 36:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPromise.g:460:3: this_FallBackOp_0= ruleFallBackOp
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
                    // InternalPromise.g:469:3: this_SequenceOp_1= ruleSequenceOp
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
                    // InternalPromise.g:478:3: this_ParallelOp_2= ruleParallelOp
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
                    // InternalPromise.g:487:3: this_EventHandlerOp_3= ruleEventHandlerOp
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
                    // InternalPromise.g:496:3: this_ConditionOp_4= ruleConditionOp
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
                    // InternalPromise.g:505:3: this_DelegateOp_5= ruleDelegateOp
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getDelegateOpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelegateOp_5=ruleDelegateOp();

                    state._fsp--;


                    			current = this_DelegateOp_5;
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
    // InternalPromise.g:517:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalPromise.g:517:48: (iv_rulePattern= rulePattern EOF )
            // InternalPromise.g:518:2: iv_rulePattern= rulePattern EOF
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
    // InternalPromise.g:524:1: rulePattern returns [EObject current=null] : (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) ;
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
            // InternalPromise.g:530:2: ( (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction ) )
            // InternalPromise.g:531:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            {
            // InternalPromise.g:531:2: (this_SimpleAction_0= ruleSimpleAction | this_Visit_1= ruleVisit | this_SequencedVisit_2= ruleSequencedVisit | this_OrderderVisit_3= ruleOrderderVisit | this_StrictOrderedVisit_4= ruleStrictOrderedVisit | this_FairVisit_5= ruleFairVisit | this_Patrolling_6= rulePatrolling | this_SequencedPatrolling_7= ruleSequencedPatrolling | this_OrderedPatrolling_8= ruleOrderedPatrolling | this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling | this_FairPatrolling_10= ruleFairPatrolling | this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance | this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance | this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance | this_FutureAvoidance_14= ruleFutureAvoidance | this_GlobalAvoidance_15= ruleGlobalAvoidance | this_PastAvoidance_16= rulePastAvoidance | this_Wait_17= ruleWait | this_DelayedReaction_18= ruleDelayedReaction | this_InstantReaction_19= ruleInstantReaction )
            int alt13=20;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 42:
                {
                alt13=3;
                }
                break;
            case 43:
                {
                alt13=4;
                }
                break;
            case 44:
                {
                alt13=5;
                }
                break;
            case 45:
                {
                alt13=6;
                }
                break;
            case 46:
                {
                alt13=7;
                }
                break;
            case 47:
                {
                alt13=8;
                }
                break;
            case 48:
                {
                alt13=9;
                }
                break;
            case 49:
                {
                alt13=10;
                }
                break;
            case 50:
                {
                alt13=11;
                }
                break;
            case 51:
                {
                alt13=12;
                }
                break;
            case 52:
                {
                alt13=13;
                }
                break;
            case 53:
                {
                alt13=14;
                }
                break;
            case 54:
                {
                alt13=15;
                }
                break;
            case 55:
                {
                alt13=16;
                }
                break;
            case 56:
                {
                alt13=17;
                }
                break;
            case 57:
                {
                alt13=18;
                }
                break;
            case 58:
                {
                alt13=19;
                }
                break;
            case 59:
                {
                alt13=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPromise.g:532:3: this_SimpleAction_0= ruleSimpleAction
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
                    // InternalPromise.g:541:3: this_Visit_1= ruleVisit
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
                    // InternalPromise.g:550:3: this_SequencedVisit_2= ruleSequencedVisit
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
                    // InternalPromise.g:559:3: this_OrderderVisit_3= ruleOrderderVisit
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
                    // InternalPromise.g:568:3: this_StrictOrderedVisit_4= ruleStrictOrderedVisit
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
                    // InternalPromise.g:577:3: this_FairVisit_5= ruleFairVisit
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
                    // InternalPromise.g:586:3: this_Patrolling_6= rulePatrolling
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
                    // InternalPromise.g:595:3: this_SequencedPatrolling_7= ruleSequencedPatrolling
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
                    // InternalPromise.g:604:3: this_OrderedPatrolling_8= ruleOrderedPatrolling
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
                    // InternalPromise.g:613:3: this_StrictOreredPatrolling_9= ruleStrictOreredPatrolling
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
                    // InternalPromise.g:622:3: this_FairPatrolling_10= ruleFairPatrolling
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
                    // InternalPromise.g:631:3: this_UpperRestrictedAvoidance_11= ruleUpperRestrictedAvoidance
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
                    // InternalPromise.g:640:3: this_ExactRestrictedAvoidance_12= ruleExactRestrictedAvoidance
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
                    // InternalPromise.g:649:3: this_LowerRestrictedAvoidance_13= ruleLowerRestrictedAvoidance
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
                    // InternalPromise.g:658:3: this_FutureAvoidance_14= ruleFutureAvoidance
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
                    // InternalPromise.g:667:3: this_GlobalAvoidance_15= ruleGlobalAvoidance
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
                    // InternalPromise.g:676:3: this_PastAvoidance_16= rulePastAvoidance
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
                    // InternalPromise.g:685:3: this_Wait_17= ruleWait
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
                    // InternalPromise.g:694:3: this_DelayedReaction_18= ruleDelayedReaction
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
                    // InternalPromise.g:703:3: this_InstantReaction_19= ruleInstantReaction
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
    // InternalPromise.g:715:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPromise.g:715:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPromise.g:716:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalPromise.g:722:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:728:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalPromise.g:729:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalPromise.g:729:2: ( (lv_name_0_0= ruleEString ) )
            // InternalPromise.g:730:3: (lv_name_0_0= ruleEString )
            {
            // InternalPromise.g:730:3: (lv_name_0_0= ruleEString )
            // InternalPromise.g:731:4: lv_name_0_0= ruleEString
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


    // $ANTLR start "entryRuleOrderedLocation"
    // InternalPromise.g:751:1: entryRuleOrderedLocation returns [EObject current=null] : iv_ruleOrderedLocation= ruleOrderedLocation EOF ;
    public final EObject entryRuleOrderedLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedLocation = null;


        try {
            // InternalPromise.g:751:56: (iv_ruleOrderedLocation= ruleOrderedLocation EOF )
            // InternalPromise.g:752:2: iv_ruleOrderedLocation= ruleOrderedLocation EOF
            {
             newCompositeNode(grammarAccess.getOrderedLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedLocation=ruleOrderedLocation();

            state._fsp--;

             current =iv_ruleOrderedLocation; 
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
    // $ANTLR end "entryRuleOrderedLocation"


    // $ANTLR start "ruleOrderedLocation"
    // InternalPromise.g:758:1: ruleOrderedLocation returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOrderedLocation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPromise.g:764:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPromise.g:765:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPromise.g:765:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:766:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:766:3: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:767:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getOrderedLocationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOrderedLocationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleOrderedLocation"


    // $ANTLR start "entryRuleNotOrderedLocation"
    // InternalPromise.g:786:1: entryRuleNotOrderedLocation returns [EObject current=null] : iv_ruleNotOrderedLocation= ruleNotOrderedLocation EOF ;
    public final EObject entryRuleNotOrderedLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrderedLocation = null;


        try {
            // InternalPromise.g:786:59: (iv_ruleNotOrderedLocation= ruleNotOrderedLocation EOF )
            // InternalPromise.g:787:2: iv_ruleNotOrderedLocation= ruleNotOrderedLocation EOF
            {
             newCompositeNode(grammarAccess.getNotOrderedLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOrderedLocation=ruleNotOrderedLocation();

            state._fsp--;

             current =iv_ruleNotOrderedLocation; 
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
    // $ANTLR end "entryRuleNotOrderedLocation"


    // $ANTLR start "ruleNotOrderedLocation"
    // InternalPromise.g:793:1: ruleNotOrderedLocation returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNotOrderedLocation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPromise.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPromise.g:800:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPromise.g:800:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:801:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:801:3: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:802:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNotOrderedLocationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNotOrderedLocationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleNotOrderedLocation"


    // $ANTLR start "entryRuleEvent"
    // InternalPromise.g:821:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPromise.g:821:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPromise.g:822:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPromise.g:828:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:834:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:835:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:835:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:836:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:836:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:837:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:837:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:838:5: lv_name_0_0= RULE_ID
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
            		
            // InternalPromise.g:858:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:859:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:859:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:860:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:881:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPromise.g:881:47: (iv_ruleAction= ruleAction EOF )
            // InternalPromise.g:882:2: iv_ruleAction= ruleAction EOF
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
    // InternalPromise.g:888:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:894:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalPromise.g:895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalPromise.g:895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalPromise.g:896:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // InternalPromise.g:896:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPromise.g:897:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPromise.g:897:4: (lv_name_0_0= RULE_ID )
            // InternalPromise.g:898:5: lv_name_0_0= RULE_ID
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
            		
            // InternalPromise.g:918:3: ( (lv_description_2_0= ruleEString ) )
            // InternalPromise.g:919:4: (lv_description_2_0= ruleEString )
            {
            // InternalPromise.g:919:4: (lv_description_2_0= ruleEString )
            // InternalPromise.g:920:5: lv_description_2_0= ruleEString
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
    // InternalPromise.g:941:1: entryRuleFallBackOp returns [EObject current=null] : iv_ruleFallBackOp= ruleFallBackOp EOF ;
    public final EObject entryRuleFallBackOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallBackOp = null;


        try {
            // InternalPromise.g:941:51: (iv_ruleFallBackOp= ruleFallBackOp EOF )
            // InternalPromise.g:942:2: iv_ruleFallBackOp= ruleFallBackOp EOF
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
    // InternalPromise.g:948:1: ruleFallBackOp returns [EObject current=null] : (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
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
            // InternalPromise.g:954:2: ( (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:955:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:955:2: (otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:956:3: otherlv_0= 'fallback' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFallBackOpAccess().getFallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFallBackOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:964:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:965:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:965:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:966:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPromise.g:983:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPromise.g:984:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFallBackOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:988:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:989:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:989:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:990:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFallBackOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            // InternalPromise.g:1008:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPromise.g:1009:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getFallBackOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:1013:4: ( ( ruleEString ) )
                    // InternalPromise.g:1014:5: ( ruleEString )
                    {
                    // InternalPromise.g:1014:5: ( ruleEString )
                    // InternalPromise.g:1015:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFallBackOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFallBackOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1029:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPromise.g:1030:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFallBackOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1034:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1035:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1035:6: ( ruleEString )
                    	    // InternalPromise.g:1036:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFallBackOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFallBackOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPromise.g:1060:1: entryRuleSequenceOp returns [EObject current=null] : iv_ruleSequenceOp= ruleSequenceOp EOF ;
    public final EObject entryRuleSequenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOp = null;


        try {
            // InternalPromise.g:1060:51: (iv_ruleSequenceOp= ruleSequenceOp EOF )
            // InternalPromise.g:1061:2: iv_ruleSequenceOp= ruleSequenceOp EOF
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
    // InternalPromise.g:1067:1: ruleSequenceOp returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
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
            // InternalPromise.g:1073:2: ( (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:1074:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:1074:2: (otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:1075:3: otherlv_0= 'sequence' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceOpAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1083:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1084:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1084:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1085:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPromise.g:1102:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPromise.g:1103:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSequenceOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1107:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1108:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1108:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1109:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop17;
                }
            } while (true);

            // InternalPromise.g:1127:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPromise.g:1128:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:1132:4: ( ( ruleEString ) )
                    // InternalPromise.g:1133:5: ( ruleEString )
                    {
                    // InternalPromise.g:1133:5: ( ruleEString )
                    // InternalPromise.g:1134:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1148:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPromise.g:1149:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSequenceOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1153:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1154:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1154:6: ( ruleEString )
                    	    // InternalPromise.g:1155:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPromise.g:1179:1: entryRuleParallelOp returns [EObject current=null] : iv_ruleParallelOp= ruleParallelOp EOF ;
    public final EObject entryRuleParallelOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelOp = null;


        try {
            // InternalPromise.g:1179:51: (iv_ruleParallelOp= ruleParallelOp EOF )
            // InternalPromise.g:1180:2: iv_ruleParallelOp= ruleParallelOp EOF
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
    // InternalPromise.g:1186:1: ruleParallelOp returns [EObject current=null] : (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
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
            // InternalPromise.g:1192:2: ( (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalPromise.g:1193:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalPromise.g:1193:2: (otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalPromise.g:1194:3: otherlv_0= 'parallel' otherlv_1= '(' ( (lv_inputOperators_2_0= ruleOperator ) ) (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )* (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelOpAccess().getParallelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1202:3: ( (lv_inputOperators_2_0= ruleOperator ) )
            // InternalPromise.g:1203:4: (lv_inputOperators_2_0= ruleOperator )
            {
            // InternalPromise.g:1203:4: (lv_inputOperators_2_0= ruleOperator )
            // InternalPromise.g:1204:5: lv_inputOperators_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPromise.g:1221:3: (otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPromise.g:1222:4: otherlv_3= ',' ( (lv_inputOperators_4_0= ruleOperator ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParallelOpAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPromise.g:1226:4: ( (lv_inputOperators_4_0= ruleOperator ) )
            	    // InternalPromise.g:1227:5: (lv_inputOperators_4_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1227:5: (lv_inputOperators_4_0= ruleOperator )
            	    // InternalPromise.g:1228:6: lv_inputOperators_4_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getParallelOpAccess().getInputOperatorsOperatorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop20;
                }
            } while (true);

            // InternalPromise.g:1246:3: (otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPromise.g:1247:4: otherlv_5= 'affecting event' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelOpAccess().getAffectingEventKeyword_4_0());
                    			
                    // InternalPromise.g:1251:4: ( ( ruleEString ) )
                    // InternalPromise.g:1252:5: ( ruleEString )
                    {
                    // InternalPromise.g:1252:5: ( ruleEString )
                    // InternalPromise.g:1253:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelOpAccess().getAffectingEventEventCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1267:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPromise.g:1268:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParallelOpAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPromise.g:1272:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1273:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1273:6: ( ruleEString )
                    	    // InternalPromise.g:1274:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelOpAccess().getAffectingEventEventCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPromise.g:1298:1: entryRuleEventHandlerOp returns [EObject current=null] : iv_ruleEventHandlerOp= ruleEventHandlerOp EOF ;
    public final EObject entryRuleEventHandlerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOp = null;


        try {
            // InternalPromise.g:1298:55: (iv_ruleEventHandlerOp= ruleEventHandlerOp EOF )
            // InternalPromise.g:1299:2: iv_ruleEventHandlerOp= ruleEventHandlerOp EOF
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
    // InternalPromise.g:1305:1: ruleEventHandlerOp returns [EObject current=null] : (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) ;
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
            // InternalPromise.g:1311:2: ( (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' ) )
            // InternalPromise.g:1312:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            {
            // InternalPromise.g:1312:2: (otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' )
            // InternalPromise.g:1313:3: otherlv_0= 'eventHandler' otherlv_1= '(' otherlv_2= 'default' otherlv_3= '(' ( (lv_inputOperators_4_0= ruleOperator ) ) otherlv_5= ')' (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+ (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerOpAccess().getEventHandlerKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEventHandlerOpAccess().getDefaultKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPromise.g:1329:3: ( (lv_inputOperators_4_0= ruleOperator ) )
            // InternalPromise.g:1330:4: (lv_inputOperators_4_0= ruleOperator )
            {
            // InternalPromise.g:1330:4: (lv_inputOperators_4_0= ruleOperator )
            // InternalPromise.g:1331:5: lv_inputOperators_4_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_5=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_5());
            		
            // InternalPromise.g:1352:3: (otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPromise.g:1353:4: otherlv_6= 'except' ( ( ruleEString ) ) otherlv_8= '(' ( (lv_inputOperators_9_0= ruleOperator ) ) otherlv_10= ')'
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventHandlerOpAccess().getExceptKeyword_6_0());
            	    			
            	    // InternalPromise.g:1357:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1358:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1358:5: ( ruleEString )
            	    // InternalPromise.g:1359:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEventHandlerOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputObservedEventsEventCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,25,FOLLOW_17); 

            	    				newLeafNode(otherlv_8, grammarAccess.getEventHandlerOpAccess().getLeftParenthesisKeyword_6_2());
            	    			
            	    // InternalPromise.g:1377:4: ( (lv_inputOperators_9_0= ruleOperator ) )
            	    // InternalPromise.g:1378:5: (lv_inputOperators_9_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1378:5: (lv_inputOperators_9_0= ruleOperator )
            	    // InternalPromise.g:1379:6: lv_inputOperators_9_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getInputOperatorsOperatorParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_23);
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

            	    otherlv_10=(Token)match(input,27,FOLLOW_25); 

            	    				newLeafNode(otherlv_10, grammarAccess.getEventHandlerOpAccess().getRightParenthesisKeyword_6_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalPromise.g:1401:3: (otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPromise.g:1402:4: otherlv_11= 'affecting event' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventHandlerOpAccess().getAffectingEventKeyword_7_0());
                    			
                    // InternalPromise.g:1406:4: ( ( ruleEString ) )
                    // InternalPromise.g:1407:5: ( ruleEString )
                    {
                    // InternalPromise.g:1407:5: ( ruleEString )
                    // InternalPromise.g:1408:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventHandlerOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventHandlerOpAccess().getAffectingEventEventCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1422:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalPromise.g:1423:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEventHandlerOpAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPromise.g:1427:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1428:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1428:6: ( ruleEString )
                    	    // InternalPromise.g:1429:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventHandlerOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventHandlerOpAccess().getAffectingEventEventCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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

            otherlv_15=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPromise.g:1453:1: entryRuleConditionOp returns [EObject current=null] : iv_ruleConditionOp= ruleConditionOp EOF ;
    public final EObject entryRuleConditionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOp = null;


        try {
            // InternalPromise.g:1453:52: (iv_ruleConditionOp= ruleConditionOp EOF )
            // InternalPromise.g:1454:2: iv_ruleConditionOp= ruleConditionOp EOF
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
    // InternalPromise.g:1460:1: ruleConditionOp returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' ) ;
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
            // InternalPromise.g:1466:2: ( (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' ) )
            // InternalPromise.g:1467:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' )
            {
            // InternalPromise.g:1467:2: (otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' )
            // InternalPromise.g:1468:3: otherlv_0= 'condition' otherlv_1= '(' (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+ (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionOpAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPromise.g:1476:3: (otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPromise.g:1477:4: otherlv_2= 'if' ( ( ruleEString ) ) otherlv_4= 'then' otherlv_5= '(' ( (lv_inputOperators_6_0= ruleOperator ) ) otherlv_7= ')'
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionOpAccess().getIfKeyword_2_0());
            	    			
            	    // InternalPromise.g:1481:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1482:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1482:5: ( ruleEString )
            	    // InternalPromise.g:1483:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputEventsEventCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,35,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConditionOpAccess().getThenKeyword_2_2());
            	    			
            	    otherlv_5=(Token)match(input,25,FOLLOW_17); 

            	    				newLeafNode(otherlv_5, grammarAccess.getConditionOpAccess().getLeftParenthesisKeyword_2_3());
            	    			
            	    // InternalPromise.g:1505:4: ( (lv_inputOperators_6_0= ruleOperator ) )
            	    // InternalPromise.g:1506:5: (lv_inputOperators_6_0= ruleOperator )
            	    {
            	    // InternalPromise.g:1506:5: (lv_inputOperators_6_0= ruleOperator )
            	    // InternalPromise.g:1507:6: lv_inputOperators_6_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionOpAccess().getInputOperatorsOperatorParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_23);
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

            	    otherlv_7=(Token)match(input,27,FOLLOW_28); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConditionOpAccess().getRightParenthesisKeyword_2_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalPromise.g:1529:3: (otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPromise.g:1530:4: otherlv_8= 'affecting event' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionOpAccess().getAffectingEventKeyword_3_0());
                    			
                    // InternalPromise.g:1534:4: ( ( ruleEString ) )
                    // InternalPromise.g:1535:5: ( ruleEString )
                    {
                    // InternalPromise.g:1535:5: ( ruleEString )
                    // InternalPromise.g:1536:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionOpAccess().getAffectingEventEventCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1550:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalPromise.g:1551:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConditionOpAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPromise.g:1555:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1556:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1556:6: ( ruleEString )
                    	    // InternalPromise.g:1557:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionOpAccess().getAffectingEventEventCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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


                    }
                    break;

            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPromise.g:1581:1: entryRuleDelegateOp returns [EObject current=null] : iv_ruleDelegateOp= ruleDelegateOp EOF ;
    public final EObject entryRuleDelegateOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegateOp = null;


        try {
            // InternalPromise.g:1581:51: (iv_ruleDelegateOp= ruleDelegateOp EOF )
            // InternalPromise.g:1582:2: iv_ruleDelegateOp= ruleDelegateOp EOF
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
    // InternalPromise.g:1588:1: ruleDelegateOp returns [EObject current=null] : (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= ')' ) ;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_pattern_7_0 = null;



        	enterRule();

        try {
            // InternalPromise.g:1594:2: ( (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= ')' ) )
            // InternalPromise.g:1595:2: (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= ')' )
            {
            // InternalPromise.g:1595:2: (otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= ')' )
            // InternalPromise.g:1596:3: otherlv_0= 'delegate' otherlv_1= '(' otherlv_2= 'robot' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'does' ( (lv_pattern_7_0= rulePattern ) ) (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegateOpAccess().getDelegateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegateOpAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegateOpAccess().getRobotKeyword_2());
            		
            // InternalPromise.g:1608:3: ( ( ruleEString ) )
            // InternalPromise.g:1609:4: ( ruleEString )
            {
            // InternalPromise.g:1609:4: ( ruleEString )
            // InternalPromise.g:1610:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegateOpRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getInputRobotRobotCrossReference_3_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromise.g:1624:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPromise.g:1625:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDelegateOpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPromise.g:1629:4: ( ( ruleEString ) )
            	    // InternalPromise.g:1630:5: ( ruleEString )
            	    {
            	    // InternalPromise.g:1630:5: ( ruleEString )
            	    // InternalPromise.g:1631:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegateOpRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputRobotRobotCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegateOpAccess().getDoesKeyword_5());
            		
            // InternalPromise.g:1650:3: ( (lv_pattern_7_0= rulePattern ) )
            // InternalPromise.g:1651:4: (lv_pattern_7_0= rulePattern )
            {
            // InternalPromise.g:1651:4: (lv_pattern_7_0= rulePattern )
            // InternalPromise.g:1652:5: lv_pattern_7_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getDelegateOpAccess().getPatternPatternParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalPromise.g:1669:3: (otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPromise.g:1670:4: otherlv_8= 'locations' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getDelegateOpAccess().getLocationsKeyword_7_0());
                    			
                    // InternalPromise.g:1674:4: ( ( ruleEString ) )
                    // InternalPromise.g:1675:5: ( ruleEString )
                    {
                    // InternalPromise.g:1675:5: ( ruleEString )
                    // InternalPromise.g:1676:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1690:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalPromise.g:1691:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDelegateOpAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPromise.g:1695:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1696:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1696:6: ( ruleEString )
                    	    // InternalPromise.g:1697:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputLocationsLocationCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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

            // InternalPromise.g:1713:3: (otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPromise.g:1714:4: otherlv_12= 'actions' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelegateOpAccess().getActionsKeyword_8_0());
                    			
                    // InternalPromise.g:1718:4: ( ( ruleEString ) )
                    // InternalPromise.g:1719:5: ( ruleEString )
                    {
                    // InternalPromise.g:1719:5: ( ruleEString )
                    // InternalPromise.g:1720:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1734:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalPromise.g:1735:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDelegateOpAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalPromise.g:1739:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1740:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1740:6: ( ruleEString )
                    	    // InternalPromise.g:1741:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getInputActionActionCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
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

            // InternalPromise.g:1757:3: (otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPromise.g:1758:4: otherlv_16= 'affecting event' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getDelegateOpAccess().getAffectingEventKeyword_9_0());
                    			
                    // InternalPromise.g:1762:4: ( ( ruleEString ) )
                    // InternalPromise.g:1763:5: ( ruleEString )
                    {
                    // InternalPromise.g:1763:5: ( ruleEString )
                    // InternalPromise.g:1764:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getAffectingEventEventCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1778:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalPromise.g:1779:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDelegateOpAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalPromise.g:1783:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1784:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1784:6: ( ruleEString )
                    	    // InternalPromise.g:1785:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getAffectingEventEventCrossReference_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
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

            // InternalPromise.g:1801:3: (otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPromise.g:1802:4: otherlv_20= 'stoppingEvents' otherlv_21= ':' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getDelegateOpAccess().getStoppingEventsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_21, grammarAccess.getDelegateOpAccess().getColonKeyword_10_1());
                    			
                    // InternalPromise.g:1810:4: ( ( ruleEString ) )
                    // InternalPromise.g:1811:5: ( ruleEString )
                    {
                    // InternalPromise.g:1811:5: ( ruleEString )
                    // InternalPromise.g:1812:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelegateOpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromise.g:1826:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalPromise.g:1827:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getDelegateOpAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalPromise.g:1831:5: ( ( ruleEString ) )
                    	    // InternalPromise.g:1832:6: ( ruleEString )
                    	    {
                    	    // InternalPromise.g:1832:6: ( ruleEString )
                    	    // InternalPromise.g:1833:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelegateOpRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelegateOpAccess().getStoppingEventEventCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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


                    }
                    break;

            }

            otherlv_25=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getDelegateOpAccess().getRightParenthesisKeyword_11());
            		

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


    // $ANTLR start "entryRuleSimpleAction"
    // InternalPromise.g:1857:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalPromise.g:1857:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalPromise.g:1858:2: iv_ruleSimpleAction= ruleSimpleAction EOF
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
    // InternalPromise.g:1864:1: ruleSimpleAction returns [EObject current=null] : ( () otherlv_1= 'SimpleAction' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1870:2: ( ( () otherlv_1= 'SimpleAction' ) )
            // InternalPromise.g:1871:2: ( () otherlv_1= 'SimpleAction' )
            {
            // InternalPromise.g:1871:2: ( () otherlv_1= 'SimpleAction' )
            // InternalPromise.g:1872:3: () otherlv_1= 'SimpleAction'
            {
            // InternalPromise.g:1872:3: ()
            // InternalPromise.g:1873:4: 
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
    // InternalPromise.g:1887:1: entryRuleVisit returns [EObject current=null] : iv_ruleVisit= ruleVisit EOF ;
    public final EObject entryRuleVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit = null;


        try {
            // InternalPromise.g:1887:46: (iv_ruleVisit= ruleVisit EOF )
            // InternalPromise.g:1888:2: iv_ruleVisit= ruleVisit EOF
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
    // InternalPromise.g:1894:1: ruleVisit returns [EObject current=null] : ( () otherlv_1= 'Visit' ) ;
    public final EObject ruleVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1900:2: ( ( () otherlv_1= 'Visit' ) )
            // InternalPromise.g:1901:2: ( () otherlv_1= 'Visit' )
            {
            // InternalPromise.g:1901:2: ( () otherlv_1= 'Visit' )
            // InternalPromise.g:1902:3: () otherlv_1= 'Visit'
            {
            // InternalPromise.g:1902:3: ()
            // InternalPromise.g:1903:4: 
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
    // InternalPromise.g:1917:1: entryRuleSequencedVisit returns [EObject current=null] : iv_ruleSequencedVisit= ruleSequencedVisit EOF ;
    public final EObject entryRuleSequencedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedVisit = null;


        try {
            // InternalPromise.g:1917:55: (iv_ruleSequencedVisit= ruleSequencedVisit EOF )
            // InternalPromise.g:1918:2: iv_ruleSequencedVisit= ruleSequencedVisit EOF
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
    // InternalPromise.g:1924:1: ruleSequencedVisit returns [EObject current=null] : ( () otherlv_1= 'SequencedVisit' ) ;
    public final EObject ruleSequencedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1930:2: ( ( () otherlv_1= 'SequencedVisit' ) )
            // InternalPromise.g:1931:2: ( () otherlv_1= 'SequencedVisit' )
            {
            // InternalPromise.g:1931:2: ( () otherlv_1= 'SequencedVisit' )
            // InternalPromise.g:1932:3: () otherlv_1= 'SequencedVisit'
            {
            // InternalPromise.g:1932:3: ()
            // InternalPromise.g:1933:4: 
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
    // InternalPromise.g:1947:1: entryRuleOrderderVisit returns [EObject current=null] : iv_ruleOrderderVisit= ruleOrderderVisit EOF ;
    public final EObject entryRuleOrderderVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderderVisit = null;


        try {
            // InternalPromise.g:1947:54: (iv_ruleOrderderVisit= ruleOrderderVisit EOF )
            // InternalPromise.g:1948:2: iv_ruleOrderderVisit= ruleOrderderVisit EOF
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
    // InternalPromise.g:1954:1: ruleOrderderVisit returns [EObject current=null] : ( () otherlv_1= 'OrderedVisit' ) ;
    public final EObject ruleOrderderVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1960:2: ( ( () otherlv_1= 'OrderedVisit' ) )
            // InternalPromise.g:1961:2: ( () otherlv_1= 'OrderedVisit' )
            {
            // InternalPromise.g:1961:2: ( () otherlv_1= 'OrderedVisit' )
            // InternalPromise.g:1962:3: () otherlv_1= 'OrderedVisit'
            {
            // InternalPromise.g:1962:3: ()
            // InternalPromise.g:1963:4: 
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
    // InternalPromise.g:1977:1: entryRuleStrictOrderedVisit returns [EObject current=null] : iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF ;
    public final EObject entryRuleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOrderedVisit = null;


        try {
            // InternalPromise.g:1977:59: (iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF )
            // InternalPromise.g:1978:2: iv_ruleStrictOrderedVisit= ruleStrictOrderedVisit EOF
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
    // InternalPromise.g:1984:1: ruleStrictOrderedVisit returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedVisit' ) ;
    public final EObject ruleStrictOrderedVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:1990:2: ( ( () otherlv_1= 'StrictOrderedVisit' ) )
            // InternalPromise.g:1991:2: ( () otherlv_1= 'StrictOrderedVisit' )
            {
            // InternalPromise.g:1991:2: ( () otherlv_1= 'StrictOrderedVisit' )
            // InternalPromise.g:1992:3: () otherlv_1= 'StrictOrderedVisit'
            {
            // InternalPromise.g:1992:3: ()
            // InternalPromise.g:1993:4: 
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
    // InternalPromise.g:2007:1: entryRuleFairVisit returns [EObject current=null] : iv_ruleFairVisit= ruleFairVisit EOF ;
    public final EObject entryRuleFairVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairVisit = null;


        try {
            // InternalPromise.g:2007:50: (iv_ruleFairVisit= ruleFairVisit EOF )
            // InternalPromise.g:2008:2: iv_ruleFairVisit= ruleFairVisit EOF
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
    // InternalPromise.g:2014:1: ruleFairVisit returns [EObject current=null] : ( () otherlv_1= 'FairVisit' ) ;
    public final EObject ruleFairVisit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2020:2: ( ( () otherlv_1= 'FairVisit' ) )
            // InternalPromise.g:2021:2: ( () otherlv_1= 'FairVisit' )
            {
            // InternalPromise.g:2021:2: ( () otherlv_1= 'FairVisit' )
            // InternalPromise.g:2022:3: () otherlv_1= 'FairVisit'
            {
            // InternalPromise.g:2022:3: ()
            // InternalPromise.g:2023:4: 
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
    // InternalPromise.g:2037:1: entryRulePatrolling returns [EObject current=null] : iv_rulePatrolling= rulePatrolling EOF ;
    public final EObject entryRulePatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrolling = null;


        try {
            // InternalPromise.g:2037:51: (iv_rulePatrolling= rulePatrolling EOF )
            // InternalPromise.g:2038:2: iv_rulePatrolling= rulePatrolling EOF
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
    // InternalPromise.g:2044:1: rulePatrolling returns [EObject current=null] : ( () otherlv_1= 'Patrolling' ) ;
    public final EObject rulePatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2050:2: ( ( () otherlv_1= 'Patrolling' ) )
            // InternalPromise.g:2051:2: ( () otherlv_1= 'Patrolling' )
            {
            // InternalPromise.g:2051:2: ( () otherlv_1= 'Patrolling' )
            // InternalPromise.g:2052:3: () otherlv_1= 'Patrolling'
            {
            // InternalPromise.g:2052:3: ()
            // InternalPromise.g:2053:4: 
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
    // InternalPromise.g:2067:1: entryRuleSequencedPatrolling returns [EObject current=null] : iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF ;
    public final EObject entryRuleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencedPatrolling = null;


        try {
            // InternalPromise.g:2067:60: (iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF )
            // InternalPromise.g:2068:2: iv_ruleSequencedPatrolling= ruleSequencedPatrolling EOF
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
    // InternalPromise.g:2074:1: ruleSequencedPatrolling returns [EObject current=null] : ( () otherlv_1= 'SequencedPatrolling' ) ;
    public final EObject ruleSequencedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2080:2: ( ( () otherlv_1= 'SequencedPatrolling' ) )
            // InternalPromise.g:2081:2: ( () otherlv_1= 'SequencedPatrolling' )
            {
            // InternalPromise.g:2081:2: ( () otherlv_1= 'SequencedPatrolling' )
            // InternalPromise.g:2082:3: () otherlv_1= 'SequencedPatrolling'
            {
            // InternalPromise.g:2082:3: ()
            // InternalPromise.g:2083:4: 
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
    // InternalPromise.g:2097:1: entryRuleOrderedPatrolling returns [EObject current=null] : iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF ;
    public final EObject entryRuleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedPatrolling = null;


        try {
            // InternalPromise.g:2097:58: (iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF )
            // InternalPromise.g:2098:2: iv_ruleOrderedPatrolling= ruleOrderedPatrolling EOF
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
    // InternalPromise.g:2104:1: ruleOrderedPatrolling returns [EObject current=null] : ( () otherlv_1= 'OrderedPatrolling' ) ;
    public final EObject ruleOrderedPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2110:2: ( ( () otherlv_1= 'OrderedPatrolling' ) )
            // InternalPromise.g:2111:2: ( () otherlv_1= 'OrderedPatrolling' )
            {
            // InternalPromise.g:2111:2: ( () otherlv_1= 'OrderedPatrolling' )
            // InternalPromise.g:2112:3: () otherlv_1= 'OrderedPatrolling'
            {
            // InternalPromise.g:2112:3: ()
            // InternalPromise.g:2113:4: 
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
    // InternalPromise.g:2127:1: entryRuleStrictOreredPatrolling returns [EObject current=null] : iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF ;
    public final EObject entryRuleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictOreredPatrolling = null;


        try {
            // InternalPromise.g:2127:63: (iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF )
            // InternalPromise.g:2128:2: iv_ruleStrictOreredPatrolling= ruleStrictOreredPatrolling EOF
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
    // InternalPromise.g:2134:1: ruleStrictOreredPatrolling returns [EObject current=null] : ( () otherlv_1= 'StrictOrderedPatrolling' ) ;
    public final EObject ruleStrictOreredPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2140:2: ( ( () otherlv_1= 'StrictOrderedPatrolling' ) )
            // InternalPromise.g:2141:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            {
            // InternalPromise.g:2141:2: ( () otherlv_1= 'StrictOrderedPatrolling' )
            // InternalPromise.g:2142:3: () otherlv_1= 'StrictOrderedPatrolling'
            {
            // InternalPromise.g:2142:3: ()
            // InternalPromise.g:2143:4: 
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
    // InternalPromise.g:2157:1: entryRuleFairPatrolling returns [EObject current=null] : iv_ruleFairPatrolling= ruleFairPatrolling EOF ;
    public final EObject entryRuleFairPatrolling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairPatrolling = null;


        try {
            // InternalPromise.g:2157:55: (iv_ruleFairPatrolling= ruleFairPatrolling EOF )
            // InternalPromise.g:2158:2: iv_ruleFairPatrolling= ruleFairPatrolling EOF
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
    // InternalPromise.g:2164:1: ruleFairPatrolling returns [EObject current=null] : ( () otherlv_1= 'FairPatrolling' ) ;
    public final EObject ruleFairPatrolling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2170:2: ( ( () otherlv_1= 'FairPatrolling' ) )
            // InternalPromise.g:2171:2: ( () otherlv_1= 'FairPatrolling' )
            {
            // InternalPromise.g:2171:2: ( () otherlv_1= 'FairPatrolling' )
            // InternalPromise.g:2172:3: () otherlv_1= 'FairPatrolling'
            {
            // InternalPromise.g:2172:3: ()
            // InternalPromise.g:2173:4: 
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
    // InternalPromise.g:2187:1: entryRuleUpperRestrictedAvoidance returns [EObject current=null] : iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF ;
    public final EObject entryRuleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2187:65: (iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF )
            // InternalPromise.g:2188:2: iv_ruleUpperRestrictedAvoidance= ruleUpperRestrictedAvoidance EOF
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
    // InternalPromise.g:2194:1: ruleUpperRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'UpperRestrictedAvoidance' ) ;
    public final EObject ruleUpperRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2200:2: ( ( () otherlv_1= 'UpperRestrictedAvoidance' ) )
            // InternalPromise.g:2201:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            {
            // InternalPromise.g:2201:2: ( () otherlv_1= 'UpperRestrictedAvoidance' )
            // InternalPromise.g:2202:3: () otherlv_1= 'UpperRestrictedAvoidance'
            {
            // InternalPromise.g:2202:3: ()
            // InternalPromise.g:2203:4: 
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
    // InternalPromise.g:2217:1: entryRuleExactRestrictedAvoidance returns [EObject current=null] : iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF ;
    public final EObject entryRuleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2217:65: (iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF )
            // InternalPromise.g:2218:2: iv_ruleExactRestrictedAvoidance= ruleExactRestrictedAvoidance EOF
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
    // InternalPromise.g:2224:1: ruleExactRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'ExactRestrictedAvoidance' ) ;
    public final EObject ruleExactRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2230:2: ( ( () otherlv_1= 'ExactRestrictedAvoidance' ) )
            // InternalPromise.g:2231:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            {
            // InternalPromise.g:2231:2: ( () otherlv_1= 'ExactRestrictedAvoidance' )
            // InternalPromise.g:2232:3: () otherlv_1= 'ExactRestrictedAvoidance'
            {
            // InternalPromise.g:2232:3: ()
            // InternalPromise.g:2233:4: 
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
    // InternalPromise.g:2247:1: entryRuleLowerRestrictedAvoidance returns [EObject current=null] : iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF ;
    public final EObject entryRuleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerRestrictedAvoidance = null;


        try {
            // InternalPromise.g:2247:65: (iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF )
            // InternalPromise.g:2248:2: iv_ruleLowerRestrictedAvoidance= ruleLowerRestrictedAvoidance EOF
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
    // InternalPromise.g:2254:1: ruleLowerRestrictedAvoidance returns [EObject current=null] : ( () otherlv_1= 'LowerRestrictedAvoidance' ) ;
    public final EObject ruleLowerRestrictedAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2260:2: ( ( () otherlv_1= 'LowerRestrictedAvoidance' ) )
            // InternalPromise.g:2261:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            {
            // InternalPromise.g:2261:2: ( () otherlv_1= 'LowerRestrictedAvoidance' )
            // InternalPromise.g:2262:3: () otherlv_1= 'LowerRestrictedAvoidance'
            {
            // InternalPromise.g:2262:3: ()
            // InternalPromise.g:2263:4: 
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
    // InternalPromise.g:2277:1: entryRuleFutureAvoidance returns [EObject current=null] : iv_ruleFutureAvoidance= ruleFutureAvoidance EOF ;
    public final EObject entryRuleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureAvoidance = null;


        try {
            // InternalPromise.g:2277:56: (iv_ruleFutureAvoidance= ruleFutureAvoidance EOF )
            // InternalPromise.g:2278:2: iv_ruleFutureAvoidance= ruleFutureAvoidance EOF
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
    // InternalPromise.g:2284:1: ruleFutureAvoidance returns [EObject current=null] : ( () otherlv_1= 'FutureAvoidance' ) ;
    public final EObject ruleFutureAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2290:2: ( ( () otherlv_1= 'FutureAvoidance' ) )
            // InternalPromise.g:2291:2: ( () otherlv_1= 'FutureAvoidance' )
            {
            // InternalPromise.g:2291:2: ( () otherlv_1= 'FutureAvoidance' )
            // InternalPromise.g:2292:3: () otherlv_1= 'FutureAvoidance'
            {
            // InternalPromise.g:2292:3: ()
            // InternalPromise.g:2293:4: 
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
    // InternalPromise.g:2307:1: entryRuleGlobalAvoidance returns [EObject current=null] : iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF ;
    public final EObject entryRuleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAvoidance = null;


        try {
            // InternalPromise.g:2307:56: (iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF )
            // InternalPromise.g:2308:2: iv_ruleGlobalAvoidance= ruleGlobalAvoidance EOF
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
    // InternalPromise.g:2314:1: ruleGlobalAvoidance returns [EObject current=null] : ( () otherlv_1= 'GlobalAvoidance' ) ;
    public final EObject ruleGlobalAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2320:2: ( ( () otherlv_1= 'GlobalAvoidance' ) )
            // InternalPromise.g:2321:2: ( () otherlv_1= 'GlobalAvoidance' )
            {
            // InternalPromise.g:2321:2: ( () otherlv_1= 'GlobalAvoidance' )
            // InternalPromise.g:2322:3: () otherlv_1= 'GlobalAvoidance'
            {
            // InternalPromise.g:2322:3: ()
            // InternalPromise.g:2323:4: 
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
    // InternalPromise.g:2337:1: entryRulePastAvoidance returns [EObject current=null] : iv_rulePastAvoidance= rulePastAvoidance EOF ;
    public final EObject entryRulePastAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastAvoidance = null;


        try {
            // InternalPromise.g:2337:54: (iv_rulePastAvoidance= rulePastAvoidance EOF )
            // InternalPromise.g:2338:2: iv_rulePastAvoidance= rulePastAvoidance EOF
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
    // InternalPromise.g:2344:1: rulePastAvoidance returns [EObject current=null] : ( () otherlv_1= 'PastAvoidance' ) ;
    public final EObject rulePastAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2350:2: ( ( () otherlv_1= 'PastAvoidance' ) )
            // InternalPromise.g:2351:2: ( () otherlv_1= 'PastAvoidance' )
            {
            // InternalPromise.g:2351:2: ( () otherlv_1= 'PastAvoidance' )
            // InternalPromise.g:2352:3: () otherlv_1= 'PastAvoidance'
            {
            // InternalPromise.g:2352:3: ()
            // InternalPromise.g:2353:4: 
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
    // InternalPromise.g:2367:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalPromise.g:2367:45: (iv_ruleWait= ruleWait EOF )
            // InternalPromise.g:2368:2: iv_ruleWait= ruleWait EOF
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
    // InternalPromise.g:2374:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2380:2: ( ( () otherlv_1= 'Wait' ) )
            // InternalPromise.g:2381:2: ( () otherlv_1= 'Wait' )
            {
            // InternalPromise.g:2381:2: ( () otherlv_1= 'Wait' )
            // InternalPromise.g:2382:3: () otherlv_1= 'Wait'
            {
            // InternalPromise.g:2382:3: ()
            // InternalPromise.g:2383:4: 
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
    // InternalPromise.g:2397:1: entryRuleDelayedReaction returns [EObject current=null] : iv_ruleDelayedReaction= ruleDelayedReaction EOF ;
    public final EObject entryRuleDelayedReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedReaction = null;


        try {
            // InternalPromise.g:2397:56: (iv_ruleDelayedReaction= ruleDelayedReaction EOF )
            // InternalPromise.g:2398:2: iv_ruleDelayedReaction= ruleDelayedReaction EOF
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
    // InternalPromise.g:2404:1: ruleDelayedReaction returns [EObject current=null] : ( () otherlv_1= 'DelayedReaction' ) ;
    public final EObject ruleDelayedReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2410:2: ( ( () otherlv_1= 'DelayedReaction' ) )
            // InternalPromise.g:2411:2: ( () otherlv_1= 'DelayedReaction' )
            {
            // InternalPromise.g:2411:2: ( () otherlv_1= 'DelayedReaction' )
            // InternalPromise.g:2412:3: () otherlv_1= 'DelayedReaction'
            {
            // InternalPromise.g:2412:3: ()
            // InternalPromise.g:2413:4: 
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
    // InternalPromise.g:2427:1: entryRuleInstantReaction returns [EObject current=null] : iv_ruleInstantReaction= ruleInstantReaction EOF ;
    public final EObject entryRuleInstantReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantReaction = null;


        try {
            // InternalPromise.g:2427:56: (iv_ruleInstantReaction= ruleInstantReaction EOF )
            // InternalPromise.g:2428:2: iv_ruleInstantReaction= ruleInstantReaction EOF
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
    // InternalPromise.g:2434:1: ruleInstantReaction returns [EObject current=null] : ( () otherlv_1= 'InstantReaction' ) ;
    public final EObject ruleInstantReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2440:2: ( ( () otherlv_1= 'InstantReaction' ) )
            // InternalPromise.g:2441:2: ( () otherlv_1= 'InstantReaction' )
            {
            // InternalPromise.g:2441:2: ( () otherlv_1= 'InstantReaction' )
            // InternalPromise.g:2442:3: () otherlv_1= 'InstantReaction'
            {
            // InternalPromise.g:2442:3: ()
            // InternalPromise.g:2443:4: 
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
    // InternalPromise.g:2457:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPromise.g:2457:47: (iv_ruleEString= ruleEString EOF )
            // InternalPromise.g:2458:2: iv_ruleEString= ruleEString EOF
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
    // InternalPromise.g:2464:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPromise.g:2470:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPromise.g:2471:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPromise.g:2471:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPromise.g:2472:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPromise.g:2480:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000450000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001271000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000010C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000040C000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0FFFFF0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000800C120000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000800C030000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000800C010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008008010000L});

}