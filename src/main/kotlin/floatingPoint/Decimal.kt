package floatingPoint

import CharacterRules
import Detector
import State

class Decimal(detector: Detector): State(detector){
    override fun consume(character: String) {
        when {
            CharacterRules.isDigit(character) -> detector.changeState(FractionDigits(detector))
            else -> detector.changeState(NotValid(detector))

        }
    }
}