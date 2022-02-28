import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    val y3 = scanner.nextInt()
    var x = ""
    var y = ""
    for (i in 1..5) {
        if (i == x1 || i == x2 || i == x3) {
            continue
        }
        x += i

    }

    for (j in 1..5) {
        if (j == y1 || j == y2 || j == y3) {
            continue
        }
        y += j

    }
    println(x.chunked(1).joinToString(" "))
    println(y.chunked(1).joinToString(" "))
}