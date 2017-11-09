/**
 * Created by davidecerbo on 09/11/2017.
 */
data class User(val name: String, val age: Int)

val davide = User("Davide", 35)
val davideJunior = davide.copy(age = 0)

fun main(args: Array<String>) {
    val (name, age) = davide
    println("$name $age years old")
}
