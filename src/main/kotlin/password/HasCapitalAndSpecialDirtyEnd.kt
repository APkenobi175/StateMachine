package password
import Detector
import State

class HasCapitalAndSpecialDirtyEnd(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            "!@#\$%&*".contains(character) -> {} //  no op
            else -> detector.changeState(HasCapitalAndSpecialCleanEnd(detector))
        }
    }

}