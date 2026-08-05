object CharacterRules {
    const val DIGITS = "0123456789"
    const val NON_ZERO_DIGITS = "123456789"
    const val CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    const val SPECIALS = "!@#\$%&*"

    fun isDigit(character: String) = DIGITS.contains(character)
    fun isNonZeroDigit(character: String) = NON_ZERO_DIGITS.contains(character)
    fun isCapital(character: String) = CAPITALS.contains(character)
    fun isSpecial(character: String) = SPECIALS.contains(character)
}