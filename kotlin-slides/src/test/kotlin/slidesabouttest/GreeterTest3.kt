package slidesabouttest

import com.nhaarman.mockito_kotlin.mock
import org.amshove.kluent.`should equal`
import org.amshove.kluent.`should throw`
import org.amshove.kluent.`with message`
import org.junit.Test

class GreeterTest3 {
    val user: User = mock {
        on { fullName() }.then { "Codemotion" }
    }

    val tested: Greeter = Greeter(user)

    @Test
    fun `english greeting is correct`() {
        tested.getGreeting() `should equal` "Hello, Codemotion!"
    }

    @Test
    fun `cannot smoke`() {
        val davide = User("Davide", "Cerbo")
        val davideSmoke = { davide.smoke() }
        davideSmoke `should throw` RuntimeException::class `with message` "Cannot smoke!"
    }
}