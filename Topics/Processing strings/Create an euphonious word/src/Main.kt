fun main() {
    val str = readLine()!!
    var chneed = 0 // счет необходимого символа
    var countVowels = 0 // счет гласных
    var  countConsonant = 0 //счет согласных
    for (i in 0..str.length - 1) {
        val ch = str[i]
        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')) { // Гласные: a, e, i, o, u, y.
            countVowels ++
            countConsonant = 0
        } else { // Остальные буквы-согласные.
            countConsonant ++
            countVowels = 0
        }
        if (countVowels >= 3 || countConsonant >= 3) {
            if ((countVowels % 2) != 0) {
                chneed ++
            }
            if ((countConsonant % 2) != 0) {
                chneed ++
            }
        }

    }
    println(chneed)
}