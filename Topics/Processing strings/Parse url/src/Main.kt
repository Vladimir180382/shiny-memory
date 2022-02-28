fun main() {
    val str = readLine()!! 
    val str1 = str.substringAfterLast("?")
    // получение строки без адреса
    val str1Replace = str1.replace("=&", "=not found&", true)
    val str1Split = str1Replace.split("&")
        .joinToString(" : ")
    // получение строки с разделитилем ":"
    val str1List = str1Split
        .split(":")
        .joinToString(",")
        .replace("=", " : ")
        .trim()
        .split(",")
    //  получение списка строк с разделитилем ":"
    var pasVord = ""
    for (el in str1List) {
        if (Regex("pass") in el) {
            pasVord = el
        }
        println(el.trim())
    }
    if (pasVord.isNotEmpty()) {
        println(pasVord.replace("pass", "password").trim())
    }
}
