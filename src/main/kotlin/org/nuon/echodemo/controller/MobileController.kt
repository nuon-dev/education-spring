package org.nuon.echodemo.controller

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy
import org.nuon.echodemo.service.MobileShopService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MobileController {
    @GetMapping("/iphone")
    fun findiPhone(
        @RequestParam model: String,
    ): AppleIPhone {
        return MobileShopService().findIPhone(model)
    }

    @GetMapping("/galaxy")
    fun findGalaxy(
        @RequestParam model: String,
    ): SamgsungGalaxy {
        return MobileShopService().findGalaxy(model)
    }
}
