package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*


import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.engine.*
import io.ktor.server.cio.*


fun main() {
    embeddedServer(CIO, port = 8080)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()
}
