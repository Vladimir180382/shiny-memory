import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt() // кол-во прописных букв
    val b = scanner.nextInt() // кол-во строчных букв
    val c = scanner.nextInt() //кол-во цифр
    val n = scanner.nextInt() // длина пароля


    val upperCase = ('A'..'Z').toList()
    val lowerCase = ('a'..'z').toList()
    val digits = ('0'..'9').toList()
    var password = ""

    repeat(a) {
        password += upperCase.random()
    }
    repeat(b) {
        password += lowerCase.random()
    }
    repeat(c) {
        password += digits.random()
    }

    if (a + b + c < n) {
        repeat(n - (a + b + c)) {
            password += upperCase.random()
        }
    }

    var password1 = password.toList()
        .shuffled()
        .joinToString("")
    // перемешиваемаем эл-ты и переводим в строку


    for (i in 0 until password1.count()) {
        if (i + 1 < password1.count()) {
            if (password1[i] == password1[i + 1]) {
                if (password1[i] in upperCase) {
                    var res: Char = ' '
                    for (j in 0 until upperCase.count()) {
                        if (upperCase[j] != password1[i]
                            && ((i - 1 >= 0)
                                    && (upperCase[j] != password1[i - 1]))
                        ) {
                            res = upperCase[j]
                            break
                        }
                    }

                    var chars = password1.toCharArray()
                    chars[i] = res
                    password1 = String(chars)
                }
                if (password1[i] in lowerCase) {
                    var res: Char = ' '
                    for (j in 0 until lowerCase.count()) {
                        if (lowerCase[j] != password1[i] && ((i - 1 >= 0) && (lowerCase[j] != password1[i - 1]))) {
                            res = lowerCase[j]
                            break
                        }
                    }

                    var chars = password1.toCharArray()
                    chars[i] = res
                    password1 = String(chars)
                }
                if (password1[i] in digits) {
                    var res: Char = ' '
                    for (j in 0 until digits.count()) {
                        if (digits[j] != password1[i] && ((i - 1 >= 0) && (digits[j] != password1[i - 1]))) {
                            res = digits[j]
                            break
                        }
                    }

                    var chars = password1.toCharArray()
                    chars[i] = res
                    password1 = String(chars)
                }

            }
        }
    }

    println(password1)
}
