fun main() { 
    val str = readLine()!!
    val substr = readLine()!!
    val split1 = str.split(substr).joinToString()
    val outWhiteSpace = str.replace("\\s".toRegex(), "")
    val outWhiteSpace1 = split1.replace("\\s".toRegex(), "")
    val outComma = outWhiteSpace1.replace(",".toRegex(), "")
    val frequency = (outWhiteSpace.length - outComma.length) / substr.length
    println(frequency)
}
