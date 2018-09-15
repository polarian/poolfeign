package io.polarian.poolfeign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoolfeignApplication

fun main(args: Array<String>) {
    runApplication<PoolfeignApplication>(*args)
}
