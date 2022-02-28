class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    val proizv = rectangle.width * rectangle.height
    println(proizv)
}