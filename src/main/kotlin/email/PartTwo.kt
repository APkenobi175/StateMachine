package email

import State
import Detector

class PartTwo (detector: Detector): State(detector){
    override fun consume(character: String){
        when (character){
            "." -> detector.changeState(HitPeriod(detector))
            "@", " " -> detector.changeState(NotValid(detector))
            else -> {} // no op
        }
    }
}
