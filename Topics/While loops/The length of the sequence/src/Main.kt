fun main() {
    var str = ""
    do {
        val n = readLine()!!.toInt()
        str += n
        if (n == 0) {
            val str1 = str.substringBefore('0')
            println(str1.length)
        }
    } while (n > 0)
}