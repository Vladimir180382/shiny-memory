fun main() {
    var n = readLine()!!.toInt()
    var chisAr = mutableListOf(n)
    if (n == 1) {
        chisAr = mutableListOf(n)
    } else {
        do {
            if (n % 2 == 0) {
                val m = n / 2
                chisAr += m
                n = m
            } else {
                val m = n * 3 + 1
                chisAr += m
                n = m
            }
        } while (n != 1)
    }
    val strCh = chisAr.joinToString(" ")
    println(strCh)
}