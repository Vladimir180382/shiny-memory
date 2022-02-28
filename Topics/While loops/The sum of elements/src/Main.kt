import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    do {
        val n = scanner.nextInt()
        sum += n
    } while (n > 0)
    println(sum)
}


