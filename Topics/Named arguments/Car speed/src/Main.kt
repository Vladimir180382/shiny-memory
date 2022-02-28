fun exceeds(speed: Int, limit: String = "60"): Int {

    return speed - limit.toInt()
}

fun main(args: Array<String>) {
    val speedCar = readLine()!!.toInt()
    val limitCar = readLine()!!
    if (limitCar.all { it.isDigit() }) {
        if (speedCar > limitCar.toInt()) {
            println("Exceeds the limit by ${exceeds(speedCar, limitCar)} kilometers per hour")
        }
        if (speedCar <= limitCar.toInt()) {
            println("Within the limit")
        }
    }
    if (limitCar == "no limit") {
        if (speedCar > 60) println("Exceeds the limit by ${exceeds(speedCar)} kilometers per hour")
        if (speedCar <= 60) println("Within the limit")
    }

}