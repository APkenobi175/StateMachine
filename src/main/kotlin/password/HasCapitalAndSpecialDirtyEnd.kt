package password
import CharacterRules
import Detector
import State

class HasCapitalAndSpecialDirtyEnd(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            CharacterRules.isSpecial(character) -> {} //  no op
            else -> detector.changeState(HasCapitalAndSpecialCleanEnd(detector))
        }
    }

}