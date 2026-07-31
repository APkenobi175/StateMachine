package binary
import Detector
import State
class LookingForFirstChar(detector: Detector) : State(detector){
    override fun consume(character: String) {
         if(character == "1"){
             detector.changeState(ContainsOne(detector))
         } else{
             detector.changeState(NotValid(detector))
         }
    }
}