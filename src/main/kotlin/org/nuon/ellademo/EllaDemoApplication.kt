package org.nuon.ellademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EllaDemoApplication

fun main(args: Array<String>) {
	runApplication<EllaDemoApplication>(*args)
}
