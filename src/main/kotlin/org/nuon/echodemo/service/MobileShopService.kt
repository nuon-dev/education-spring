package org.nuon.echodemo.service

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy
import org.nuon.echodemo.repository.MobileStorage

class MobileShopService {
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

    fun findGalaxy(model: String): SamgsungGalaxy {
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
