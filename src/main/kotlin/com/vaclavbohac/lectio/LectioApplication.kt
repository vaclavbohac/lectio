package com.vaclavbohac.lectio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class LectioApplication {
    @RequestMapping("/")
    fun home() {}
}

fun main(args: Array<String>) {
	runApplication<LectioApplication>(*args)
}
