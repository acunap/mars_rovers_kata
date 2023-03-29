class Rover {
    private var x: Int = 0
    private var y: Int = 0
    private var direction: String = "N"

    fun processCommands(commands: String): String {
        for (command in commands.split("")) {
            if (command == "L") {
                when (direction) {
                    "N" -> direction = "W"
                    "W" -> direction = "S"
                    "S" -> direction = "E"
                    "E" -> direction = "N"
                }
            } else if (command == "R") {
                when (direction) {
                    "N" -> direction = "E"
                    "E" -> direction = "S"
                    "S" -> direction = "W"
                    "W" -> direction = "N"
                }
            }
        }

        return "0.0.${direction}"
    }
}