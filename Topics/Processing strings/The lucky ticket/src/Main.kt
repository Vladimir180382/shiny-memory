fun main() {
    val str = readLine()!!.toString()
    val a = str.toString().toInt()
    val b1 = a % 10
    val b2 = a % 100 / 10
    val b3 = a % 1000 / 100
    val sum1 = b1 + b2 + b3
    val b4 = a % 10000 / 1000
    val b5 = a % 100000 / 10000
    val b6 = a% 1000000 / 100000
    val sum2 = b4 + b5 + b6
    if (sum1 == sum2) println("Lucky") 
    else println("Regular")
 }
