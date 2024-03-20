package org.nuon.echodemo.service

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy

interface ShopService {
    fun findIPhone(model: String): AppleIPhone
    fun findGalaxy(model: String): SamgsungGalaxy
    fun exportIPhone(iPhone: AppleIPhone)
    fun exportGalaxy(galaxy: SamgsungGalaxy)
}
