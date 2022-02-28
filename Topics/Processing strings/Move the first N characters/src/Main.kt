fun main() {
    val s = readLine()!!
    val s1 = s.replace("[^0-9]".toRegex(), "")
    val n = s1.toInt()
    if (n > s.length) println(s)
    else {
        val subs = s.substringBefore(' ')

        if (subs.length > n) {
            val subsTakeLast = subs.takeLast(subs.length - n)

            val resultstr = subsTakeLast + subs.substring(0, n)
            println(resultstr)
        } else println(subs)
    }

}