package slidesabouttest

/**
 * Created by davidecerbo on 07/11/2017.
 */
open class User(
        private val firstName: String,
        private val lastName: String) {

    open fun fullName(): String = "$firstName $lastName"

    fun smoke() {
        throw RuntimeException("Cannot smoke!")
    }
}