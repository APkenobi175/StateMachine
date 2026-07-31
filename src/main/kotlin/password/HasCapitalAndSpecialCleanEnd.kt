package password

import Detector
import State

class HasCapitalAndSpecialCleanEnd(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            "!@#\$%&*".contains(character) -> detector.changeState(HasCapitalAndSpecialDirtyEnd(detector))
            else -> {} // no op
        }
    }

}