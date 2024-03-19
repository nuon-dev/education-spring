package org.nuon.gardenerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GardenerDemoApplication

fun main(args: Array<String>) {
	runApplication<GardenerDemoApplication>(*args)
}
