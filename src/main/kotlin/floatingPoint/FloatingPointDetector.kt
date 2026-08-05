package floatingPoint

import Detector
import State

class FloatingPointDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }
}