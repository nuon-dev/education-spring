package org.nuon.ellademo.controller

import org.nuon.ellademo.config.EchoInVoid
import org.nuon.ellademo.model.AppleIPhone
import org.nuon.ellademo.model.SamsungGalaxy
import org.nuon.ellademo.service.MobileShopService
import org.nuon.ellademo.service.ShopInterface
import org.nuon.ellademo.service.TelecomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MobileController(
        // MobileController의 생성자 Injection
        // private val mobileShopService: MobileShopService,
        private val nnn: ShopInterface,
        private val total: List<ShopInterface>, // ShopInterface collection
        private val echoInVoid: EchoInVoid
) {
    @GetMapping("/iphone")
    fun findiPhone(
            @RequestParam model: String
    ): AppleIPhone {
        echoInVoid.echo("message iPhone")
        // Bean 생성해서 호출
        return nnn.findIPhone(model)

        // Bean 생성안하고 그냥 호출한것
        // return MobileShopService().findIPhone(model)
    }

    @GetMapping("/galaxy")
    fun findGalaxy(
            @RequestParam model: String
    ): SamsungGalaxy {
        echoInVoid.echo("message galaxy")
        // Bean 생성해서 호출
        return nnn.findGalaxy(model)

        // Bean 생성안하고 그냥 호출한것
        // return MobileShopService().findGalaxy(model)
    }
}
