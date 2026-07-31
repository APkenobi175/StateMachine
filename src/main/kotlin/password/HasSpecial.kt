package password
import Detector
import State

class HasSpecial(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(character) -> detector.changeState(HasCapitalAndSpecialCleanEnd(detector))
            else -> {} // no op
        }
    }

}