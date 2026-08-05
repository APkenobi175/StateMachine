package password

import CharacterRules
import Detector
import State

class LookingForFirstChar(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            CharacterRules.isCapital(character) -> detector.changeState(HasCapital(detector))
            CharacterRules.isSpecial(character) -> detector.changeState(HasSpecial(detector))
            else -> {} // No Op
        }

    }

}