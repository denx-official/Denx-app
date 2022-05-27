package denx

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import denx.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
    }.start(wait = true)
}
