package floatingPoint
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("FloatingPointDetector Test")
class FloatingPointDetectorTest {
    private val detector = FloatingPointDetector()

    @Test
    @DisplayName("Accepts valid floating point values")
    fun acceptValidFloats(){
        val valid = listOf("1.0", "123.34", "0.200", "12312312.324523423")
        for (s in valid){
            assertTrue(detector.test(s), "expected \"$s\" to be accepted")
        }
    }

    @Test
    @DisplayName("Rejects all Invalid Floating Point Values")
    fun rejectNotValidFloats(){
        val invalid = listOf("", "123", "123.123.", "123.1a", "123.", "012.3", "0", ".", "1..2", "00.1", " ", " 1.0", " 1.0")
        for (s in invalid){
            assertFalse(detector.test(s), "expected \"$s\" to be rejected")
        }
    }
}

