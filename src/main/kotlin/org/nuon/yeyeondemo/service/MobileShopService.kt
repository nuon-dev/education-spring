package org.nuon.yeyeondemo.service

import org.nuon.yeyeondemo.model.AppleIPhone
import org.nuon.yeyeondemo.model.SamsungGalaxy
import org.nuon.yeyeondemo.repository.MobileStorage
import org.springframework.stereotype.Service

@Service
class MobileShopService(
        private val telecomService: TelecomService,
) {
    fun findIPhone(model: String): AppleIPhone {
        val iPhone = MobileStorage.findIPhone(model)
        if (iPhone != null) {
            println("아이폰을 찾았습니다.")

            return iPhone
        } else {
            println("아이폰을 찾을 수 없습니다.")
            throw NoSuchElementException("아이폰을 찾을 수 없습니다.")
        }
    }

    fun findGalaxy(model: String): SamsungGalaxy {
        val samsung = MobileStorage.findSamsung(model)

        if (samsung != null) {
            println("갤럭시를 찾았습니다.")
            return samsung
        } else {
            println("갤럭시를 찾을 수 없습니다.")
            throw NoSuchElementException("갤럭시를 찾을 수 없습니다.")
        }
    }
}
