package integer
import Detector
import State
class NotValid(detector: Detector): State(detector) {
    override fun consume(character: String) {
        // do nothing noop
    }

}