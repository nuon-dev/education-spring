package org.nuon.echodemo.repository

import org.nuon.echodemo.model.AppleIPhone
import org.nuon.echodemo.model.SamgsungGalaxy

object MobileStorage {
    private val iPhoneContainer: MutableList<AppleIPhone> = mutableListOf(
        AppleIPhone("iPhone XS Max", 500, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 13", 1000, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 13", 1000, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 14 Pro", 1200, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 15 Pro Max", 1300, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 15 Pro Max", 1300, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 15 Pro Max", 1300, "010-1234-5678", "1234"),
        AppleIPhone("iPhone 15 Pro Max", 1300, "010-1234-5678", "1234"),
    )

    private val samsungContainer: MutableList<SamgsungGalaxy> = mutableListOf(
        SamgsungGalaxy("Galaxy S21", 1000, "010-1234-5678", "1234"),
        SamgsungGalaxy("Galaxy S21 Ultra", 1200, "010-1234-5678", "1234"),
        SamgsungGalaxy("Galaxy S24 Ultra", 1600, "010-1234-5678", "1234"),
        SamgsungGalaxy("Galaxy S24 Ultra", 1600, "010-1234-5678", "1234"),
    )

    fun findIPhone(model: String): AppleIPhone? {
        return iPhoneContainer.find { it.model == model }
    }

    fun findSamsung(model: String): SamgsungGalaxy? {
        return samsungContainer.find { it.model == model }
    }
}
