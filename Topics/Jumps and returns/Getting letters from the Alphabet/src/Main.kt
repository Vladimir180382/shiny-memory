import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ch = scanner.nextLine().first()
    val str = "abcdefghijklmnopqrstuvwxyz"
    var str1 = ""
    for (i in str.indices) {
        if (ch.equals(str[i])) break
        str1 += str[i]
    }
    println(str1)

}