/**
 * Created by davidecerbo on 09/11/2017.
 */
var testA: String = "ciao"
var testB: String? = "ciao"
//testB = null Errore!!!

val nullableList: List<Int?> = listOf(1, 2, null, 4)

val intList: List<Int> = nullableList.filterNotNull()

fun main(args: Array<String>) {
    println("a0 ${testA.length}")
    println("a1 ${testA?.length}")
    println("a2 ${testA!!.length}")
    //println("b0 ${testB.length}")
// ^ Not safe! Compile time error! ^
    println("b1 ${testB?.length}")
    println("b2 ${testB!!.length}")
// ^ KotlinNullPointerException ^
//            NPE Lovers

}