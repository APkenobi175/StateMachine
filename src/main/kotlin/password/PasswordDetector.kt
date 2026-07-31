package password

import Detector
import State

class PasswordDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }

    override fun accepts(input: String): Boolean {
        return currentState is HasCapitalAndSpecialCleanEnd && input.length >=8 // make sure its long enough
    }
}