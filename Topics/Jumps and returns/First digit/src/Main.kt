fun main() {
    val str = readLine()!!.toString()
    var str1 = ""
    for (i in str.indices) {
        if (str[i].isDigit())
            break
        str1 += str[i]
    }
    val str2 = str.substringAfter(str1)
    println(str2.first())
}