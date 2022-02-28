import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    when (str.length) {
        1 -> print("1")
        2 -> print("2")
        3 -> print("3")
        4 -> print("4")
    }
}