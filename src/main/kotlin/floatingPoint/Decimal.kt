package floatingPoint

import Detector
import State

class Decimal(detector: Detector): State(detector){
    override fun consume(character: String) {
        when {
            "0123456789".contains(character) -> detector.changeState(FractionDigits(detector))
            else -> detector.changeState(NotValid(detector))

        }
    }
}