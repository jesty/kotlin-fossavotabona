package it.devday.kotlincodemotion

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class KotlinCodemotionApplication

fun <T> Optional<T>.unwrap(): T? = orElse(null)

fun main(args: Array<String>) {
    runApplication<KotlinCodemotionApplication>(*args)
}
