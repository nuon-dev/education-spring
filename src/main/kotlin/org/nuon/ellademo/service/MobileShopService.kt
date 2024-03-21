package org.nuon.ellademo.service

import org.nuon.ellademo.model.AppleIPhone
import org.nuon.ellademo.model.SamsungGalaxy
import org.nuon.ellademo.repository.MobileStorage
import org.springframework.stereotype.Service

@Service
// @Component 라고 해도 무방하긴 함
// 아래 주석은 순환참조 구조 예시를 위한 것
// class MobileShopService(
//        private val telecomService: TelecomService,
//) {
class MobileShopService : ShopInterface {
    override fun findIPhone(model: String): AppleIPhone {
        val iPhone = MobileStorage.findIPhone(model)
        if (iPhone != null) {
            println("아이폰을 찾았습니다. mobileshop")

            return iPhone
        } else {
            println("아이폰을 찾을 수 없습니다.")
            throw NoSuchElementException("아이폰을 찾을 수 없습니다.")
        }
    }

    override fun findGalaxy(model: String): SamsungGalaxy {
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
