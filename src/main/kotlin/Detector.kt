import kotlin.text.iterator

abstract class Detector {
    protected lateinit var currentState: State

    fun test(input: String): Boolean {
        currentState = initialState()
        for (ch in input) {
            currentState.consume(ch.toString())
        }
        return currentState.isAccepting && meetsAdditionalRequirements(input)
    }

    fun changeState(state: State) {
        currentState = state
    }

    protected abstract fun initialState(): State
    protected open fun meetsAdditionalRequirements(input: String): Boolean = true
}