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
        "M,0.1.N",
        "B,0.9.N",
        "MMMMMMMMMMMM,0.2.N",
        "RRM,0.9.S",
        "RRBBBBBBBBBBBB,0.2.S",
        "RB,9.0.E",
        "LM,9.0.W",
        "LBBBBBBBBBBBB,2.0.W",
        "RMMMMMMMMMMMM,2.0.E",
        "BBRMMLM,2.9.N"
    )
    fun `rover should return a position based on the commands`(commands: String, expectedPosition: String) {
        val rover = Rover()
        assertEquals(expectedPosition, rover.processCommands(commands))
    }
}