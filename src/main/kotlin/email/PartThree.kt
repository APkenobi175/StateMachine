package email

import State
import Detector

class PartThree (detector: Detector): State(detector){
    override val isAccepting = true

    override fun consume(character: String){
        when(character){
            ".", "@", " " -> detector.changeState(NotValid(detector))
            else -> {} // no op
        }
    }
}
