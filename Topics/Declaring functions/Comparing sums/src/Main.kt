fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean {
    val sum1 = number1 + number2
    val sum2 = number3 + number4
    return (sum1) > (sum2)
}// write your function here

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}