/**
 * Created by davidecerbo on 09/11/2017.
 */

fun main(args: Array<String>) {
    forEachTestA()
    forEachTestB()
}

fun forEachTestA() {
    val numbers = 1..100
    numbers.forEach {
        if (it == 25) {
            return
        }
        println("index $it")
    }
    println("Hello")
}

fun forEachTestB() {
    val numbers = 1..100
    numbers.forEach {
        if (it == 25) {
            return@forEach
        }
        println("index $it")
    }
    println("Hello")
}

