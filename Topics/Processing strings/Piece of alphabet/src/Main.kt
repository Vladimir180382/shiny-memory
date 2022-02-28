fun main() {
    val str = readLine()!!
    var ch = str[0]
    for (index in str.indices) {
        if (str[index] == ch) {
            ch = str[index] + 1
        } else {
            println("false")
            return
        }
    }
    println("true")
}
