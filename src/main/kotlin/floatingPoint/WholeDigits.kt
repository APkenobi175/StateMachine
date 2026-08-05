package floatingPoint

import CharacterRules
import Detector
import State

class WholeDigits(detector: Detector): State(detector){
    override fun consume(character: String){
        when {
            CharacterRules.isDigit(character) -> {} // no op
            character == "." -> detector.changeState(Decimal(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }
}