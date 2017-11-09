/**
 * Created by davidecerbo on 09/11/2017.
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(a: Point) = Point(x + a.x, y + a.y)
}

operator fun Point.unaryMinus() = Point(-x, -y)

fun main(args: Array<String>) {
    val point = Point(10, 20)
    println(point + point + point) //Point(x=30, y=60)
    println(-point) // Point(x=-10, y=-20)
}



