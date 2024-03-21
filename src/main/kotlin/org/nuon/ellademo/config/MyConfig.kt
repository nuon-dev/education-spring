package org.nuon.ellademo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyConfig {
    @Bean
    // @Bean 이라고 적은 것만 IoC가 Bean으로 생성함
    fun echoInVoid(): EchoInVoid {
        println("run app once")
        return EchoInVoid()
    }

    // 1. 리턴 타입을 보고 빈 주입
    // 2. 타입이 동일한 빈이 있을 경우 빈의 이름 보고 주입(함수명, Bean() ex)Bean("stringBean"))
}
