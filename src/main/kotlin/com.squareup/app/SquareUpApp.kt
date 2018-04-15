package com.squareup.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SquareUpApp {

}

fun main(args: Array<String>) {
    SpringApplication.run(SquareUpApp::class.java, *args)
}