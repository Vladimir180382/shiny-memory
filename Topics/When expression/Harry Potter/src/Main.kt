import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()!!
    when (str) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}