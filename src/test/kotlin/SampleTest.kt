import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SampleShould {

    @Test
    fun add_two_numbers() {
        val testSample = Sample()

        val result = testSample.sum(40, 2)

        val expected = 42
        assertEquals(expected, result)
    }
}