class Rover {
    private var x: Int = 0
    private var y: Int = 0
    private var direction: String = "N"

    fun processCommands(commands: String): String {
        for (command in commands.split("")) {
            when (command) {
                "L" -> rotateLeft()
                "R" -> rotateRight()
                "M" -> moveForwards()
                "B" -> moveBackwards()
            }
        }

        return "${x}.${y}.${direction}"
    }

    private fun rotateLeft() {
        when (direction) {
            "N" -> direction = "W"
            "W" -> direction = "S"
            "S" -> direction = "E"
            "E" -> direction = "N"
        }
    }

    private fun rotateRight() {
        when (direction) {
            "N" -> direction = "E"
            "E" -> direction = "S"
            "S" -> direction = "W"
            "W" -> direction = "N"
        }
    }

    private fun moveForwards() {
        when (direction) {
            "N" -> y++
            "E" -> x++
            "S" -> y--
            "W" -> x--
            else -> {}
        }
    }

    private fun moveBackwards() {
        when (direction) {
            "N" -> y--
            "E" -> x--
            "S" -> y++
            "W" -> x++
        }
    }
}