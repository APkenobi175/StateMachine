package integer
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("IntegerDetector Test")
class IntegerDetectorTest {
    private val detector = IntegerDetector()

    @Test
    @DisplayName("Test Integer Detector Accepts Valid Integers")
    // examples copied from canvas + some more
    fun acceptValidIntegers(){
        val valid = listOf("1", "123", "9", "10", "100", "324234232342344")
        for (s in valid){
            assertTrue(detector.test(s), "expected \"$s\" to be accepted")
        }
    }

    @Test
    @DisplayName("Rejects all Invalid Integers")
    // examples copied from canvas + some more
    fun rejectAllIntegers(){
        val invalid = listOf("", "0", "0123", "01", "12.3", " 12", "12 ", "-1", "abc", "fsdkjl3245fj32890fnsdn")
        for (s in invalid){
            assertFalse(detector.test(s), "expected \"$s\" to be rejected")
        }
    }
}

