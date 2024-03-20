package org.nuon.echodemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GUIController {
    @GetMapping("/hello")
    fun helloWorld(
        @RequestParam(defaultValue = "default message", required = false) message: String,
        model: Model,
    ): String {
        model.addAttribute("message", message)
        return "index"
    }
}
