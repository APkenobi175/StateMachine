package email

import State
import Detector

class PartOne (detector: Detector): State(detector){
    override fun consume(character: String){
        when (character){
            "@" -> detector.changeState(HitAt(detector))
            " " -> detector.changeState(NotValid(detector))
            else -> {} // no op
        }
    }
}
