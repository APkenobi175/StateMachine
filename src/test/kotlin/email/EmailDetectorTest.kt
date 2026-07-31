package email

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("EmailDetector Test")
class EmailDetectorTest {
    private val detector = EmailDetector()

    @Test
    @DisplayName("Accepts Valid Email Addresses")
    // examples copied from canvas + some more
    fun acceptValidEmails() {
        val valid = listOf("a@b.c", "joseph.ditton@usu.edu", "{}*\$.&\$*(@*\$%&.*&*", "x.y.z@a.b", "phippsammon175@gmail.com")
        for (s in valid) {
            assertTrue(detector.test(s), "expected \"$s\" to be accepted")
        }
    }

    @Test
    @DisplayName("Rejects Invalid Email Addresses")
    // examples copied from canvas + some more
    fun rejectInvalidEmails() {
        val invalid = listOf("", "@b.c", "a@b@c.com", "a.b@b.b.c", "joseph ditton@usu.edu", "a@.c", "a@b.", "a@bc", "ab.c")
        for (s in invalid) {
            assertFalse(detector.test(s), "expected \"$s\" to be rejected")
        }
    }
}