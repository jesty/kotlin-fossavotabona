package slidesabouttest

import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class GreeterTest {
    @Mock
    lateinit var user: User
    lateinit var tested: Greeter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        tested = Greeter(user)
    }

    @Test
    fun englishGreetIsCorrect() {
        whenever(user.fullName()).thenReturn("Codemotion")
        assertEquals("Hello, Codemotion!", tested.getGreeting())
    }
}