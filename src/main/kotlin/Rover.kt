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
            "N" -> moveY(1)
            "E" -> moveX(1)
            "S" -> moveY(-1)
            "W" -> moveX(-1)
            else -> {}
        }
    }

    private fun moveBackwards() {
        when (direction) {
            "N" -> moveY(-1)
            "E" -> moveX(-1)
            "S" -> moveY(1)
            "W" -> moveX(1)
        }
    }

    private fun moveY(distance: Int) {
        y = when {
            y + distance > 9 -> 0
            y + distance < 0 -> 9
            else -> y + distance
        }
    }

    private fun moveX(distance: Int) {
        x = when {
            x + distance > 9 -> 0
            x + distance < 0 -> 9
            else -> x + distance
        }
    }
}