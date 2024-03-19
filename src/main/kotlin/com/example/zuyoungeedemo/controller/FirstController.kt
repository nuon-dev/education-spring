package com.example.zuyoungeedemo.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController {

    @GetMapping("/index")
    fun index(
           @RequestParam message: String
    ): String{
        return "Hello World! message is $message"
    }

    @PostMapping("/index")
    fun post(): String{
        return "post"
    }
    @PutMapping("/index")
    fun put(): String{
        return "put"
    }
    @DeleteMapping("/index")
    fun delete(): String{
        return "fun"

    }

}