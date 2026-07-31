package binary
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("BinaryDetector Test")
class BinaryDetectorTest {
    private val detector = BinaryDetector()

    @Test
    @DisplayName("Accepts binary numbers that start and end with 1")
    // examples copied from canvas + some more
    fun acceptValidIntegers(){
        val valid = listOf("1", "11", "101", "11001", "111111", "1000101000111001")
        for (s in valid){
            assertTrue(detector.test(s), "expected \"$s\" to be accepted")
        }
    }

    @Test
    @DisplayName("Rejects all Invalid Binary Numbers")
    // examples copied from canvas kinda + some more
    fun rejectAllIntegers(){
        val invalid = listOf("", "0", "01", "10", "110", "1000010", "11a01", "2", "1 1")
        for (s in invalid){
            assertFalse(detector.test(s), "expected \"$s\" to be rejected")
        }
    }
}