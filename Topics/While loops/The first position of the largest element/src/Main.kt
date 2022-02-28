import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbList = mutableListOf<Int>()
    while (scanner.hasNextInt()) {
        numbList += scanner.nextInt()
    }
    val maxEl = numbList.maxOrNull()
    val position = numbList.indexOf(maxEl) + 1
    print("$maxEl ")
    print(position)

}