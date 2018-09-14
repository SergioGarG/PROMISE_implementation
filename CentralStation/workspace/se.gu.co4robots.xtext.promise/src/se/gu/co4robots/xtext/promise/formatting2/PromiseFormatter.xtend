/*
 * generated by Xtext 2.12.0
 */
package se.gu.co4robots.xtext.promise.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import promise.Condition
import promise.FallBackOp
import promise.Location
import promise.Mission
import promise.Operator
import promise.Robot
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess

class PromiseFormatter extends AbstractFormatter2 {
	
	@Inject extension PromiseGrammarAccess

	def dispatch void format(Mission mission, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Condition condition : mission.getConditions()) {
			condition.format;
		}
		for (Robot robot : mission.getRobots()) {
			robot.format;
		}
		for (Location location : mission.getLocation()) {
			location.format;
		}
		for (Operator operator : mission.getOperator()) {
			operator.format;
		}
	}

	def dispatch void format(FallBackOp fallBackOp, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Operator operator : fallBackOp.getInputOperators()) {
			operator.format;
		}
	}
	
	// TODO: implement for SequenceOp, ParallelOp, EventHandlerOp, ConditionOp, DelegateOp
}
