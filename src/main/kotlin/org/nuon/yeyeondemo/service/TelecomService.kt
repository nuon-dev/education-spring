package org.nuon.yeyeondemo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
class TelecomService {
        @Lazy
        @Autowired
        lateinit var mobileShopService: MobileShopService
        fun method() {
                mobileShopService.findGalaxy("")
        }
}
