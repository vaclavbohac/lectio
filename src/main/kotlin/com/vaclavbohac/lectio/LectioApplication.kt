package com.vaclavbohac.lectio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
@SpringBootApplication
class LectioApplication {
    @GetMapping("/")
    fun dashboard(): String {
        return "dashboard"
    }
}

fun main(args: Array<String>) {
	runApplication<LectioApplication>(*args)
}
