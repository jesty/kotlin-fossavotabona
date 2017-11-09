/**
 * Created by davidecerbo on 09/11/2017.
 */
fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}

fun main(args: Array<String>) {
    describe(Person("davide"))
}
