package email

import State
import Detector

class HitAt (detector: Detector): State(detector){
    override fun consume(character: String){
        when (character){
            ".", "@", " " -> detector.changeState(NotValid(detector))
            else -> detector.changeState(PartTwo(detector))
        }
    }
}
