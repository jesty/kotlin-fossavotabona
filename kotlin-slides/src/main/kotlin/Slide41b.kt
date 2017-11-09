import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Created by davidecerbo on 09/11/2017.
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async { doSomethingUsefulAsyncOne() }
        val two = async { doSomethingUsefulAsyncTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulAsyncOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulAsyncTwo(): Int {
    delay(1000L)
    return 29
}

