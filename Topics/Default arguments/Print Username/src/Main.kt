fun userName(username: String = "HIDDEN"): String {
    return username
}

fun main() {
    var username = readLine()!!
    if (username == "HIDDEN") println("Hello, ${userName("secret user")}!")
    else println("Hello, $username!")
}