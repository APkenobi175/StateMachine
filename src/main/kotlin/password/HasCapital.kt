package password

import CharacterRules
import Detector
import State

class HasCapital(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            CharacterRules.isSpecial(character) -> detector.changeState(HasCapitalAndSpecialDirtyEnd(detector))
            else -> {} // no op
        }
    }

}