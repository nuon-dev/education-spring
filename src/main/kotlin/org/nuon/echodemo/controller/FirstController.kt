package org.nuon.echodemo.controller

import org.nuon.echodemo.config.EchoInVoid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

// Annotation
// RestController 이 어노테이션이 붙은 클래스를 Controller Bean으로 만들어 줍니다.
@RestController
class FirstController(
    private val echoInVoid: EchoInVoid,
) {
    // HTTP GET /index
    // 를 선언한것
    @GetMapping("/index")
    fun index(
        @RequestParam message: String,
    ): String {
        return "Hello World! message is $message"
    }

    @GetMapping("/echo")
    fun echo(
        @RequestParam message: String,
    ) {
        echoInVoid.echo(message)
    }

    @PostMapping("/index")
    fun post(): String {
        return "post"
    }

    @PutMapping("/index")
    fun put(): String {
        return "put"
    }

    @DeleteMapping("/index")
    fun delete(): String {
        return "delete"
    }
}
