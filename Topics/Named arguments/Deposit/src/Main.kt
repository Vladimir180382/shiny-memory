import kotlin.math.*

fun finalAmount(startingAmount: Int = 1000, yearlyPercent: Int = 5, numberOfYears: Int = 10): Int {
    val percent = yearlyPercent.toDouble()
    var value = percent / 100
    value = (1 + value).pow(numberOfYears.toDouble())
    return (startingAmount * value).toInt()
}

fun main() {
    val nameParametr = readLine()!!
    val valueParametr = readLine()!!.toInt()
    if (nameParametr == "amount") println(finalAmount(valueParametr, 5, 10))
    if (nameParametr == "percent") println(finalAmount(1000, valueParametr, 10))
    if (nameParametr == "years") println(finalAmount(1000, 5, valueParametr))
}