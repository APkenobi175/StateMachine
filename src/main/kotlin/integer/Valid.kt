package integer

import Detector
import State

class Valid(detector: Detector): State(detector) {
    override fun consume(character: String) {
        if (!"0123456789".contains(character)) {
            detector.changeState(NotValid(detector))

        }
    }
}