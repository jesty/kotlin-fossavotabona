package slidesabouttest

class Greeter(
        private val user: User) {

    fun getGreeting() = "Hello, ${user.fullName()}!"
}