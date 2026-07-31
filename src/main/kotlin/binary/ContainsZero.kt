package binary

import Detector
import State

class ContainsZero(detector: Detector) : State(detector){
    override fun consume(character: String) {
        when (character){
            "1" -> detector.changeState(ContainsOne(detector))
            "0" -> {} // no op
            else -> detector.changeState(NotValid(detector))
        }
    }

}
