import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val str1 = "abcdefghijklmnopqrstuvwxyz"
    var str2 = ""
    for (i in str1) {
        if (str.contains(i))
            continue
        str2 += str1.filter { it == i }
    }
    println(str2)
}