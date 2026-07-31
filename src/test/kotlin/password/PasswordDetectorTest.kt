package password

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("PasswordDetector Test")
class PasswordDetectorTest {
    private val detector = PasswordDetector()

    @Test
    @DisplayName("Accepts Valid Passwords")
    fun acceptValidPasswords() {
        val valid = listOf(
            "aaaaH!aa",
            "1234567*9J",
            "asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH",
            "H!aaaaaa",
            "password!A"
        )
        for (s in valid) {
            assertTrue(detector.test(s), "expected \"$s\" to be accepted")
        }
    }

    @Test
    @DisplayName("Rejects Invalid Passwords")
    fun rejectInvalidPasswords() {
        val invalid = listOf(
            "",
            "a",
            "aaaaaaa!",
            "aaaHaaaaa",
            "Abbbbbbb!",
            "H!aaaaa",
            "Password"
        )
        for (s in invalid) {
            assertFalse(detector.test(s), "expected \"$s\" to be rejected")
        }
    }
}