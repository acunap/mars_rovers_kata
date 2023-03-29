class Rover {
    private var x: Int = 0
    private var y: Int = 0
    private var direction: String = "N"

    fun processCommands(commands: String): String {
        for (command in commands.split("")) {
            if (command == "L") {
                if (direction == "N") {
                    direction = "W"
                } else if (direction == "W") {
                    direction = "S"
                } else if (direction == "S") {
                    direction = "E"
                } else if (direction == "E") {
                    direction = "N"
                }
            }
        }

        return "0.0.${direction}"
    }
}