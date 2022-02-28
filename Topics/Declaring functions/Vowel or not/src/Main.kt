fun isVowel(letter: Char): Boolean {

    return letter == 'A' || letter == 'E' || letter == 'I'
            || letter == 'O' || letter == 'U' || letter == 'a'
            || letter == 'e' || letter == 'i' || letter == 'o'
            || letter == 'o' || letter == 'u'

}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}