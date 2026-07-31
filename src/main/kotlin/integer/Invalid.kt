package integer
import main.Detector
import main.State
class Invalid(detector: Detector): State(detector) {
    override fun consume(character: String) {
        // do nothing noop
    }

}