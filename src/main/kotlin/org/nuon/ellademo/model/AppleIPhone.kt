package org.nuon.ellademo.model

private const val WON_PER_DOLLAR = 1100
class AppleIPhone(
        var model: String,

        val priceDollar: Int,

        val phoneNumber: String,

        private var password: String,
) {
    val company: String = "Apple"

    var nickName: String? = null
}