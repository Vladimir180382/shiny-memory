import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    var result = 0
    loop@ for (i in str.indices) {
        for (j in str.indices) {
            if (str[i] == str[j] && i != j)
                continue@loop
        }
        result++
    }
    println(result)
}