fun main() {
    val str = readLine()!!
    if (str.length % 2 == 0) {
        println(str.substring(0, str.length / 2 - 1) + str.substring(str.length / 2 + 1, str.length))
    } else println(str.substring(0, (str.length + 1) / 2 - 1) + str.substring((str.length + 1) / 2, str.length))
    
}
