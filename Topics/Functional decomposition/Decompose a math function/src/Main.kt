import kotlin.Double.Companion.MIN_VALUE
import kotlin.math.*


fun f1(a: Double) = a.pow(2.0) + 1

fun f2(b: Double) = 1 / (b.pow(2.0))

fun f3(c: Double) = c.pow(2.0) - 1
fun f(x: Double): Double {

    var y = MIN_VALUE
    y = if (x > 0 && x < 1) {
        f2(x)
    } else {
        f3(x)
    }
    if (x <= 0) {
        y = f1(x)
    }
    return y
}




