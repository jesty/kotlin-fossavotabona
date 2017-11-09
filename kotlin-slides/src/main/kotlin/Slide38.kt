import kotlin.properties.Delegates

/**
 * Created by davidecerbo on 09/11/2017.
 */
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class User2 {
    var n: String by Delegates.observable("empty") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)

    val user = User2()
    user.n = "first"
    user.n = "second"
}

