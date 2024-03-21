package org.nuon.yeyeondemo.controller

import org.nuon.yeyeondemo.config.EchoInVoid
import org.nuon.yeyeondemo.model.AppleIPhone
import org.nuon.yeyeondemo.model.SamsungGalaxy
import org.nuon.yeyeondemo.service.MobileShopService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MobileController(
        // MobileController의 생성자 Injection
        private val mobileShopService: MobileShopService,
        private val echoInVoid: EchoInVoid
) {
    @GetMapping("/iphone")
    fun findiPhone(
            @RequestParam model: String
    ): AppleIPhone {
        echoInVoid.echo("message1")
        return mobileShopService.findIPhone(model)
    }

    @GetMapping("/galaxy")
    fun findGalaxy(
            @RequestParam model: String
    ): SamsungGalaxy {
        echoInVoid.echo("message2")
        return mobileShopService.findGalaxy(model)
    }

    // ...
}
