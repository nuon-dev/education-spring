package org.nuon.echodemo.service

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy
import org.nuon.echodemo.repository.TelecomStorage


// interface와 구현체
class TelecomShopService {
    fun findIPhone(model: String): AppleIPhone {
        val iPhone = TelecomStorage.findIPhone(model)
        if (iPhone != null) {
            println("아이폰을 찾았습니다.")

            return iPhone
        } else {
            println("아이폰을 찾을 수 없습니다.")
            throw NoSuchElementException("아이폰을 찾을 수 없습니다.")
        }
    }

    fun findGalaxy(model: String): SamgsungGalaxy {
        val samsung = TelecomStorage.findSamsung(model)

        if (samsung != null) {
            println("갤럭시를 찾았습니다.")
            return samsung
        } else {
            println("갤럭시를 찾을 수 없습니다.")
            throw NoSuchElementException("갤럭시를 찾을 수 없습니다.")
        }
    }

    // 아이폰 재고를 내보냅니다.
    fun exportIPhone(iPhone: AppleIPhone) {
        TelecomStorage.removeIPhone(iPhone)
        println("아이폰 재고를 제거했습니다.")
        println("통신요금이 할인되었습니다.")
    }

    // 갤럭시 재고를 내보냅니다.
    fun exportGalaxy(galaxy: SamgsungGalaxy) {
        TelecomStorage.removeGalaxy(galaxy)
        println("갤럭시 재고를 제거했습니다.")
        println("통신요금이 할인되었습니다.")
    }
}
