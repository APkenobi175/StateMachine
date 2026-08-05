package password

import Detector
import State

class PasswordDetector: Detector() {
    override fun initialState(): State {
        return LookingForFirstChar(this)
    }

    // Length isn't tracked by the state machine per the assignment, so it's checked here.
    override fun meetsAdditionalRequirements(input: String): Boolean {
        return input.length >= 8
    }
}