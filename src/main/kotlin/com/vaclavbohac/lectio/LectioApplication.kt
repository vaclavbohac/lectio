package com.vaclavbohac.lectio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LectioApplication

fun main(args: Array<String>) {
	runApplication<LectioApplication>(*args)
}
