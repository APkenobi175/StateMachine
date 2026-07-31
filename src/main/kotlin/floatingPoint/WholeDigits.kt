package floatingPoint

import Detector
import State

class WholeDigits(detector: Detector): State(detector){
    override fun consume(character: String){
        when {
            "0123456789".contains(character) -> {} // no op
            character == "." -> detector.changeState(Decimal(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }
}