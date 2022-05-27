package app.netlify.denx

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import app.netlify.denx.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureMonitoring()
        configureSerialization()
        configureAdministration()
    }.start(wait = true)
}
