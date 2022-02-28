fun main() {
    var chList = intArrayOf()
    do {
        val n = readLine()!!.toInt()
        chList += n
        if (n == 0) {
            var el = chList[0]
            for (el1 in chList) {
                if (el1 > el)
                    el = el1
            }
            println(el)
        }
    } while (n > 0)
}