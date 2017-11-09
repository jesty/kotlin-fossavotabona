/**
 * Created by davidecerbo on 09/11/2017.
 */
class Strange(var value: Long) {
    var strangeValue: Long
        get() = value * 2
        set(value) {
            if (value > 5) this.value = value
        }
}

fun main(args: Array<String>) {
    val customer = Strange(10)
    println(customer.strangeValue) //20
    customer.strangeValue = 3
    println(customer.strangeValue) //20
    customer.strangeValue = 6
    println(customer.strangeValue) //12
}
