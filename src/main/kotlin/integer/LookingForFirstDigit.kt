package integer

import CharacterRules
import Detector
import State

class LookingForFirstDigit(detector: Detector): State(detector){
    override fun consume(character: String) {
        if(CharacterRules.isNonZeroDigit(character)){
            detector.changeState(Valid(detector))

        } else{
            detector.changeState(NotValid(detector))
        }
    }

}

