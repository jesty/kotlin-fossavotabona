/**
 * Created by davidecerbo on 09/11/2017.
 */
class CustomerObject(val name: String) {
    fun forEach(action: (char: Char) -> Unit) = name.forEach(action)
    fun hello(callback: (name: String) -> Unit) = callback(name)
    fun upperCaseAndConcat(callback: () -> String) = "${callback()} $name".toUpperCase()
}

fun main(args: Array<String>) {
    val customer = CustomerObject("Davide")
    customer.hello { println("Ciao $it") }
    println(customer.upperCaseAndConcat { "Cerbo" })
    customer.forEach { println(it) }
}
