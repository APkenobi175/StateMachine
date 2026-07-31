package floatingPoint
import Detector
import State

class LeadingZero(detector: Detector): State(detector){

    override fun consume(character: String) {
        when {
            character == "." -> detector.changeState(Decimal(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }
}
