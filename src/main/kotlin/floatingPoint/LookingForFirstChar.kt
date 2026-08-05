package floatingPoint

import CharacterRules
import Detector
import State

class LookingForFirstChar(detector: Detector): State(detector){

    override fun consume(character: String) {
        when {
            character == "0" -> detector.changeState(LeadingZero(detector))
            character == "." -> detector.changeState(Decimal(detector))
            CharacterRules.isNonZeroDigit(character) -> detector.changeState(WholeDigits(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }

}