fun polynomial(x: Int, c: Int, b: Int = 0, a: Int = 0): Int {
    var y = (a * x * x) + (b * x) + c
    if (a == 0 && b == 0 && c != 0 && x == 0) {
        y = c
    } else if (a == 0 && b != 0 && c != 0) {
        y = b * x + c
    }
    if (a != 0 && b != 0 && c != 0) {
        y = a * x * x + b * x + c
    }
    return y
}
