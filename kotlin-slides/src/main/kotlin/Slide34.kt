/**
 * Created by davidecerbo on 09/11/2017.
 */
data class Person2(val name: String, val age: Int?)

val person: Person2? = Person2("Jack", 1)

fun main(args: Array<String>) {
    if (person?.age != null) {
        println("The person is aged ${person?.age}")
    }

    //oppure

    person?.age?.let {
        println("The person is aged $it")
    }
}
