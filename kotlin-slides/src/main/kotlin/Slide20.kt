class Slide20 {
    fun hello(name: String, city: String = "Salerno") = println("Ciao $name da $city")
    //fun Int.multilpy(x: Int): Int = this * x // 5.multilpy(10)
    infix fun Int.multilpy(x: Int): Int = this * x // 5 multilpy 10

    fun main(args: Array<String>) {
        hello("Davide", "Salerno")
        hello(name = "Davide")
        hello(city = "Salerno", name = "Valentina")
    }

}


