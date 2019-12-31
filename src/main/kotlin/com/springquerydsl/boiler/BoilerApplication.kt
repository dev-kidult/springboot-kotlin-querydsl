package com.springquerydsl.boiler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoilerApplication

fun main(args: Array<String>) {
    runApplication<BoilerApplication>(*args)
}
