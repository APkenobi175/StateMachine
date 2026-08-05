package floatingPoint

import CharacterRules
import Detector
import State

class FractionDigits(detector: Detector): State(detector) {
    override val isAccepting = true

    override fun consume(character: String) {
        when {
            (!CharacterRules.isDigit(character)) -> detector.changeState(NotValid(detector))
            else -> {} // no op
        }
    }
}