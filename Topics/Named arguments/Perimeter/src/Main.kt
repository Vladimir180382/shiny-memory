import kotlin.math.*

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x3,
    y4: Double = y3
): Double {
    val sideA = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val sideB = sqrt((x3 - x2).pow(2) + (y3 - y2).pow(2))
    val sideC = sqrt((x4 - x3).pow(2) + (y4 - y3).pow(2))
    val sideD = sqrt((x4 - x1).pow(2) + (y4 - y1).pow(2))
    return sideA + sideB + sideC + sideD
}

fun main() {
    val coordinat = readLine()!!
    val coordinat1 = coordinat.split(" ").map { it.toDouble() }
    val coordCount = coordinat1.chunked(2).count()
    if (coordCount == 3) {
        println(
            perimeter(
                coordinat1[0], coordinat1[1], coordinat1[2], coordinat1[3],
                coordinat1[4], coordinat1[5]
            )
        )
    }
    if (coordCount == 4) {
        println(
            perimeter(
                coordinat1[0], coordinat1[1], coordinat1[2], coordinat1[3],
                coordinat1[4], coordinat1[5], coordinat1[6], coordinat1[7]
            )
        )
    }
}