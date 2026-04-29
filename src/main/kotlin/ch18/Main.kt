package ch18

fun main() {
    val day = 4

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Invalid Day"
    }

    println("Day: $dayName")
}