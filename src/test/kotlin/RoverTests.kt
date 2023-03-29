import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class RoverTests {
    @Test
    fun `rover should return an exception because is not implemented yet`() {
        val rover = Rover()
        assertThrows<NotImplementedError> { rover.processCommands("") }
    }
}