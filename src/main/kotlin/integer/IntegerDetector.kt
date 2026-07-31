package integer

import main.Detector
import main.State

class IntegerDetector: Detector(){
    override fun initialState(): State {
        return LookingForFirstDigit(this)

    }

    override fun accepts(input: String): Boolean {
        return currentState is Valid
    }


}