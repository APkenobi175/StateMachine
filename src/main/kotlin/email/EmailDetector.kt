package email

import Detector
import State

class EmailDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }

    override fun accepts(input: String): Boolean {
        return currentState is PartThree
    }
}