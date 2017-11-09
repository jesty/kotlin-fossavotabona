/**
 * Created by davidecerbo on 09/11/2017.
 */
fun main(args: Array<String>) {
    arrayOf("Valentina", "Davide").forEach { println("Hello $it!") }
    val ints = arrayOf(1, 2, 3)
    val logger = { msg: Any -> println("log $msg") }
    ints.map { value -> value * 2 }.map { v -> logger(v) }
    ints.map { it * 2 }.map { logger(it) }
}
