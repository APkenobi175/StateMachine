package floatingPoint

import Detector
import State

class LookingForFirstChar(detector: Detector): State(detector){

    override fun consume(character: String) {
        when {
            character == "0" -> detector.changeState(LeadingZero(detector))
            character == "." -> detector.changeState(Decimal(detector))
            "123456789".contains(character) -> detector.changeState(WholeDigits(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }

}