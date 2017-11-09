package slidesabouttest

import com.nhaarman.mockito_kotlin.mock
import junit.framework.Assert.assertEquals
import org.junit.Test

class GreeterTest2 {
    val user: User = mock {
        on { fullName() }.then { "Codemotion" }
    }

    val tested: Greeter = Greeter(user)

    @Test
    fun `english greeting is correct`() {
        assertEquals("Hello, Codemotion!", tested.getGreeting())
    }
}

