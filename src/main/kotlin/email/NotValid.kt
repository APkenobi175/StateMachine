package email

import State
import Detector

class NotValid (detector: Detector): State(detector){
    override fun consume(character: String){
        // no op
    }
}
