package binary

import Detector
import State

class BinaryDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }
}