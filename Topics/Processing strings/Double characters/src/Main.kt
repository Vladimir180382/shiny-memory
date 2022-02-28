fun main() {
    val str = readLine()!!.toString()
    for (index in str.indices) {
        print("${str[index]}${str[index]}")
    }
}
