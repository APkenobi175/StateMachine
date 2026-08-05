package password
import CharacterRules
import Detector
import State

class HasSpecial(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            CharacterRules.isCapital(character) -> detector.changeState(HasCapitalAndSpecialCleanEnd(detector))
            else -> {} // no op
        }
    }

}