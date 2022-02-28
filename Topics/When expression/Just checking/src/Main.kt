import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    when (n) {
        1 -> print("No!")
        2 -> print("Yes!")
        3 -> print("No!")
        4 -> print("No!")
        else -> print("Unknown number")
    }
}