package org.nuon.ellademo.service

import org.nuon.ellademo.model.AppleIPhone
import org.nuon.ellademo.model.SamsungGalaxy
import org.nuon.ellademo.repository.MobileStorage
import org.nuon.ellademo.repository.TelecomStorage
import org.springframework.stereotype.Service

@Service("nnn")
class TelecomService : ShopInterface {
    override fun findIPhone(model: String): AppleIPhone {
        val iPhone = TelecomStorage.findIPhone(model)
        if (iPhone != null) {
            println("아이폰을 찾았습니다. telecom")

            return iPhone
        } else {
            println("아이폰을 찾을 수 없습니다.")
            throw NoSuchElementException("아이폰을 찾을 수 없습니다.")
        }
    }

    override fun findGalaxy(model: String): SamsungGalaxy {
        val samsung = TelecomStorage.findSamsung(model)

        if (samsung != null) {
            println("갤럭시를 찾았습니다.")
            return samsung
        } else {
            println("갤럭시를 찾을 수 없습니다.")
            throw NoSuchElementException("갤럭시를 찾을 수 없습니다.")
        }
    }
}

// 필드 주입 형식
// class TelecomService {
//    @Lazy
//    @Autowired
//    lateinit var mobileShopService: MobileShopService
//    fun method() {
//        mobileShopService.findGalxy("")
//    }
//}

// 생성자 주입 형식
// class TelecomService(
//        @Lazy
        // 지양해야하는 구조임, 설계자체가 잘못됨, 한쪽으로 몰거나 암튼 바꿔야함
        // 순환참조 구조에서 나중에 만들 것을 지정해주는 것 @Lazy
        // 처음에는 mock으로 들어갔다가 진짜 사용할 때 실제를 넣어줌
//        private val mobileShopService: MobileShopService
//) {
//}
