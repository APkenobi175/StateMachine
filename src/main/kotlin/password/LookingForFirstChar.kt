package password

import Detector
import State

class LookingForFirstChar(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(character) -> detector.changeState(HasCapital(detector))
            "!@#\$%&*".contains(character) -> detector.changeState(HasSpecial(detector))
            else -> {} // No Op
        }

    }

}