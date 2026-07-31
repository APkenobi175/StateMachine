package integer

import Detector
import State

class LookingForFirstDigit(detector: Detector): State(detector){
    override fun consume(character: String) {
        if("123456789".contains(character)){
            detector.changeState(Valid(detector))

        } else{
            detector.changeState(NotValid(detector))
        }
    }

}

