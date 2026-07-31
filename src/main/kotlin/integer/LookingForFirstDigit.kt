package integer

import main.Detector
import main.State

class LookingForFirstDigit(detector: Detector): State(detector){
    override fun consume(character: String) {
        if("123456789".contains(character)){
            detector.changeState(Valid(detector))

        } else{
            detector.changeState(Invalid(detector))
        }
    }

}