package org.nuon.ellademo.service

import org.nuon.ellademo.model.AppleIPhone
import org.nuon.ellademo.model.SamsungGalaxy

interface ShopInterface {
    fun findIPhone(model: String): AppleIPhone

    fun findGalaxy(model: String): SamsungGalaxy
}