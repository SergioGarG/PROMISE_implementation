lexer grammar InternalPromise;

@header {
package se.gu.co4robots.xtext.promise.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

T__11 : 'mission' ;
T__12 : '{' ;
T__13 : 'robots' ;
T__14 : 'locations' ;
T__15 : '}' ;
T__16 : 'operators' ;
T__17 : 'conditions' ;
T__18 : 'events' ;
T__19 : ':' ;
T__20 : ',' ;
T__21 : 'actions' ;
T__22 : 'ordered' ;
T__23 : 'not' ;
T__24 : 'fallback' ;
T__25 : '(' ;
T__26 : ')' ;
T__27 : 'affecting event' ;
T__28 : 'sequence' ;
T__29 : 'parallel' ;
T__30 : 'eventHandler' ;
T__31 : 'default' ;
T__32 : 'except' ;
T__33 : 'condition' ;
T__34 : 'if' ;
T__35 : 'then' ;
T__36 : 'delegate' ;
T__37 : 'robot' ;
T__38 : 'does' ;
T__39 : 'stoppingEvents' ;
T__40 : 'SimpleAction' ;
T__41 : 'Visit' ;
T__42 : 'SequencedVisit' ;
T__43 : 'OrderedVisit' ;
T__44 : 'StrictOrderedVisit' ;
T__45 : 'FairVisit' ;
T__46 : 'Patrolling' ;
T__47 : 'SequencedPatrolling' ;
T__48 : 'OrderedPatrolling' ;
T__49 : 'StrictOrderedPatrolling' ;
T__50 : 'FairPatrolling' ;
T__51 : 'UpperRestrictedAvoidance' ;
T__52 : 'ExactRestrictedAvoidance' ;
T__53 : 'LowerRestrictedAvoidance' ;
T__54 : 'FutureAvoidance' ;
T__55 : 'GlobalAvoidance' ;
T__56 : 'PastAvoidance' ;
T__57 : 'Wait' ;
T__58 : 'DelayedReaction' ;
T__59 : 'InstantReaction' ;

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7524
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7526
RULE_INT : ('0'..'9')+;

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7528
RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7530
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7532
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7534
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../se.gu.co4robots.xtext.promise.ide/src-gen/se/gu/co4robots/xtext/promise/ide/contentassist/antlr/internal/InternalPromise.g" 7536
RULE_ANY_OTHER : .;
