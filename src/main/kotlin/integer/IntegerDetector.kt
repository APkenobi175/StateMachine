package integer

import Detector
import State

class IntegerDetector: Detector(){
    override fun initialState(): State {
        return LookingForFirstDigit(this)
    }
}