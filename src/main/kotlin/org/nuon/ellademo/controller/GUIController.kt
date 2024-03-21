package org.nuon.ellademo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
// RestController json 응답
// Controller gui 응답
// resources > templeates > index.html
class GUIController {
    @GetMapping("/gui")
    fun index(
            @RequestParam message: String,
            model: Model,
    ): String {
        model.addAttribute("message", message)
        return "index"
    }
}