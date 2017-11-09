/**
 * Created by davidecerbo on 09/11/2017.
 */
class Customer(name: String) : Person(name) {
    override fun speak() {
        println("Welcome $name!")
    }
}

class CustomerDavide : Person("Davide") {
    override fun speak() {
        println("Welcome $name!")
    }
}

