class Slide27 {
    data class Point(val x: Int, val y: Int)

    val a = Point(1, 2)
    val b = Point(1, 2)
    val c = a

    fun main(args: Array<String>) {
        println(a === b) // false
        println(a == b) // true
        println(a === c) // true
        println(a == c) // true
    }

}