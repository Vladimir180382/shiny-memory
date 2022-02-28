fun main() {
    val str = readLine()!!.toString()
    val str1 = str.substring(0, str.length / 2)
    val str2 = str.substring(str.length / 2)
    val arrstr1 = str1.toList().map({ it.toString().toInt() })
    val sum1 = arrstr1.sum()
    val arrstr2 = str2.toList().map({ it.toString().toInt() })
    val sum2 = arrstr2.sum()
    if (sum1 == sum2) {
        println("YES")
    } else println("NO")
    
}
