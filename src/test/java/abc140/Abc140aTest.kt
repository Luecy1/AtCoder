package abc140

import abc140a
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

class Abc140aTest {

    @Test
    fun abc140a1Test() {

        val input = "2"
        val output = "8\n"

        assertIO(input.removeSuffix("\n"), output.removeSuffix("\n"))
    }

    @Test
    fun abc140a2Test() {

        val input = "1"
        val output = "1\n"

        assertIO(input.removeSuffix("\n"), output.removeSuffix("\n"))
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val result = abc140a().toString()

        assertEquals(result, output)
    }
}