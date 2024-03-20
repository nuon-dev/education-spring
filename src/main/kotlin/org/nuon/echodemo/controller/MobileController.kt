package org.nuon.echodemo.controller

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy
import org.nuon.echodemo.service.MobileShopService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MobileController {
    @GetMapping("/iphone")
    fun findIPhone(
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

    @PostMapping("/iphone")
    fun buyIphone(
        @RequestBody iPhone: AppleIPhone,
    ): AppleIPhone {
        val mobileShopService = MobileShopService()
        val phoneToSell = mobileShopService.findIPhone(iPhone.model)
        mobileShopService.exportIPhone(phoneToSell)
        return phoneToSell
    }

    @PostMapping("/galaxy")
    fun buySamsung(
        @RequestBody galaxy: SamgsungGalaxy,
    ): SamgsungGalaxy {
        val mobileShopService = MobileShopService()
        val phoneToSell = mobileShopService.findGalaxy(galaxy.model)
        mobileShopService.exportGalaxy(phoneToSell)
        return phoneToSell
    }
}
