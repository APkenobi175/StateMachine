import kotlin.text.iterator

abstract class Detector {
    protected lateinit var currentState: State

    fun test(input: String): Boolean {
        currentState = initialState()
        for (ch in input) {
            currentState.consume(ch.toString())
        }
        return accepts(input)
    }

    fun changeState(state: State) {
        currentState = state
    }

    protected abstract fun initialState(): State
    protected abstract fun accepts(input: String): Boolean
}