// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val str = "abce"
    var ch = str[0]
    for (index in str.indices) {
        if (str[index] == ch) {
            ch = str[index] + 1
            println("true")
        } else println("false")

    }
}
