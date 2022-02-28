fun main() {
   val n = readLine()!!.toInt()
    var tekChis = 1   //хранение текущего числа
    var i = 1
    var kol = 0   //номер позиции в последовательности одного числа
    while (i < n + 1) {
        if (tekChis == kol + 1) {   //условие перехода к след. числу
            print("$tekChis ")
            i += 1
            kol = 0
            tekChis += 1
            continue
        } else {
            print("$tekChis ")
            kol += 1
            i += 1
        }
    }
}