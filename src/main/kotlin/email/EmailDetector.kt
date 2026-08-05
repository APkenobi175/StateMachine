package email

import Detector
import State

class EmailDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }
}