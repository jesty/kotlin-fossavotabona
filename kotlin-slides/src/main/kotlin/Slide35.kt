/**
 * Created by davidecerbo on 09/11/2017.
 */
fun main(args: Array<String>) {
    val davide = Person(testA)
    val mino = Person(testB ?: "Mino")
    println(mino.name)
}