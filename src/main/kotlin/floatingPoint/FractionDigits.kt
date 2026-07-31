package floatingPoint

import Detector
import State

class FractionDigits(detector: Detector): State(detector) {
    override fun consume(character: String) {
        when {
            (!"0123456789".contains(character)) -> detector.changeState(NotValid(detector))
            else -> {} // no op
        }
    }
}