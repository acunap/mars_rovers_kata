import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RoverTests {
    @ParameterizedTest(name = "rover should return {1} based on the command {0}")
    @CsvSource(
        "L,0.0.W",
        "LL,0.0.S",
        "LLL,0.0.E",
        "LLLL,0.0.N",
        "R,0.0.E",
        "RR,0.0.S",
        "RRR,0.0.W",
        "RRRR,0.0.N",
    )
    fun `rover should return a position based on the commands`(commands: String, expectedPosition: String) {
        val rover = Rover()
        assertEquals(expectedPosition, rover.processCommands(commands))
    }
}