import java.util.*

fun main() {
    val purchase = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt() // начальный баланс
    while (scanner.hasNextInt()) {
        purchase += scanner.nextInt() // наполняем список суммами покупок

    }

    for(el in purchase) {
        if ((balance - el) < 0) {
            println("Error, insufficient funds for the purchase. Your balance is ${balance}, but you need ${el}.")
            return
        }
        balance -= el
    }

    println("Thank you for choosing us to manage your account! Your balance is ${balance}.")
}