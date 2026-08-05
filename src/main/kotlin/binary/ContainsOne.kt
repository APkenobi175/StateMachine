package binary
import Detector
import State

class ContainsOne(detector: Detector) : State(detector) {
    override val isAccepting = true

    override fun consume(character: String) {
        when (character){
            "1" -> {} // self loop do nothing
            "0" -> detector.changeState(ContainsZero(detector))
            else -> detector.changeState(NotValid(detector))
        }
    }
}