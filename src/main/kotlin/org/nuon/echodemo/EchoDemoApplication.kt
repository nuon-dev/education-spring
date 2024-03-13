package org.nuon.echodemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EchoDemoApplication

fun main(args: Array<String>) {
	runApplication<EchoDemoApplication>(*args)
}
