package email

import State
import Detector

class LookingForFirstChar (detector: Detector): State(detector){
    override fun consume(character: String){
        when (character){
            "@", " " -> detector.changeState(NotValid(detector))
            else -> detector.changeState(PartOne(detector))
        }
    }
}
