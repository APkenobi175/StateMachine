package password

import CharacterRules
import Detector
import State

class HasCapitalAndSpecialCleanEnd(detector: Detector): State(detector) {
    override val isAccepting = true

    override fun consume(character: String) {
        when {
            CharacterRules.isSpecial(character) -> detector.changeState(HasCapitalAndSpecialDirtyEnd(detector))
            else -> {} // no op
        }
    }

}