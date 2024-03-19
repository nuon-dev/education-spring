package org.nuon.ellademo.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

// Annotation
// RestController 이 어노테이션이 붙은 클래스를 Controller Bean 으로 만들어 줌
@RestController
class FirstController {
    // HTTP GET /index
    // 를 선언
    @GetMapping("/index")
    fun index(
            @RequestParam message: String
    ): String {

        return "Hello World! message is $message"
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