import java.math.BigInteger

/**
 * Created by davidecerbo on 09/11/2017.
 */
tailrec fun factorial(n: BigInteger, accumulator: BigInteger = BigInteger.ONE): BigInteger = if (n <= BigInteger.ONE)
    accumulator
else
    factorial(n - BigInteger.ONE, accumulator * n)

fun main(args: Array<String>) {
    println(factorial(BigInteger("100000")))
}
