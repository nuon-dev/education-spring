package org.nuon.JINHOLEEdemo.controller

import org.springframework.web.bind.annotation.*

@RestController
class FirstController {
    @GetMapping("/index")
    fun index(
            @RequestParam message: String
    ): String {
        return "Hello World! message is ${message.toString()}"
    }
    @PostMapping("/index")
    fun post(): String{
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