package binary

import Detector
import State

class BinaryDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }

    override fun accepts(input: String): Boolean {
        return currentState is ContainsOne
    }
}