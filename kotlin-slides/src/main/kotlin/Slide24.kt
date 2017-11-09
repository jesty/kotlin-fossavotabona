/**
 * Created by davidecerbo on 09/11/2017.
 */
open class Person(val name: String) {
    init {
        println("init…")
    }

    open fun speak() {
        println("Hi $name!")
    }

    infix fun and(o: Person) = "Hi ${o.name} & ${this.name}"
}

fun main(args: Array<String>) {
    Person("Davide") and Person("Valentina")
    val p = Person("Ciccio")
    p.speak()
}

