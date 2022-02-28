fun main() {
    val str = readLine()!!.toString()  
    val mutableStr = str.split(" ").toMutableList()
    var maxLen = 0
    var positionMaxLenWord = 0
    for (i in 0 until mutableStr.count()) {   
        if (mutableStr[i].length > maxLen) {
            maxLen = mutableStr[i].length
            positionMaxLenWord = i
        }
    }
    println("${mutableStr[positionMaxLenWord]}")
}
