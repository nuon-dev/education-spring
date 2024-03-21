package org.nuon.yeyeondemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyConfig {
    @Bean
    fun echoInVoid(): EchoInVoid {
        println("1")
        return EchoInVoid()
    }
}
