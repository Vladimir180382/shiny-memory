fun main() {
    val n = readLine()!!.toInt()
    var number = 1
    while (n >= number * number){
        var m = number * number
        number += 1
        println(m)
    }

}