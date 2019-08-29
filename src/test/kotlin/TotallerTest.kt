import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TotallerTest {

    @Test
    fun `should Be Able To Add 3 And 4`() {
        val totaller = Totaller()

        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }

}