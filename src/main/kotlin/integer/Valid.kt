package integer

import CharacterRules
import Detector
import State

class Valid(detector: Detector): State(detector) {
    override val isAccepting = true

    override fun consume(character: String) {
        if (!CharacterRules.isDigit(character)) {
            detector.changeState(NotValid(detector))
        }
    }
}