package utils

/*
Sorry, this class has been copied from
https://raw.githubusercontent.com/JetBrains/kotlinconf-app/master/web/src/main/kotlin/org/jetbrains/kotlinconf/api/ajaxUtil.kt
 */

import org.w3c.xhr.XMLHttpRequest
import kotlin.coroutines.experimental.*
import kotlin.js.Promise

suspend fun httpGet(url: String): String = suspendCoroutine { c ->
    val xhr = XMLHttpRequest()
    xhr.onreadystatechange = {
        if (xhr.readyState == XMLHttpRequest.DONE) {
            if (xhr.status / 100 == 2) {
                c.resume(xhr.response as String)
            } else {
                c.resumeWithException(RuntimeException("HTTP error: ${xhr.status}"))
            }
        }
        null
    }
    xhr.open("GET", url)
    xhr.send()
}

fun <T> async(x: suspend () -> T): Promise<T> {
    return Promise { resolve, reject ->
        x.startCoroutine(object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resume(value: T) {
                resolve(value)
            }

            override fun resumeWithException(exception: Throwable) {
                reject(exception)
            }
        })
    }
}