package org.nuon.echodemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyConfig {
    @Bean
    fun echoInVoid(): EchoInVoid {
        return EchoInVoid()
    }
}
