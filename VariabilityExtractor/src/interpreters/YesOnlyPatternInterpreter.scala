package interpreters

import java.util.regex.Matcher
import scala.collection.immutable.List
import pcmmm.PcmmmFactory
import pcmmm.Product
import pcmmm.Feature
import pcmmm.Constraint

class YesOnlyPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
  
 
  override def createConstraint(s: String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Option[Constraint] = {
		  val constraint = PcmmmFactory.eINSTANCE.createYesOnly()
		  constraint.setName(s)
		  Some(constraint)
  }

}