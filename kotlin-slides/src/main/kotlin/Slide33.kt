/**
 * Created by davidecerbo on 09/11/2017.
 */
fun main(args: Array<String>) {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull() // [1, 2, 4]

    var b = null

    val aInt: Int? = b as? Int
// Se b é null (NullPointerException) o b è di un tipo diverso (ClassCastException), allora, aInt sarà uguale a null


}