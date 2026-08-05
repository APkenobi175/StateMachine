abstract class State(protected val detector: Detector) {

    open val isAccepting: Boolean = false

    abstract fun consume(character: String)
}