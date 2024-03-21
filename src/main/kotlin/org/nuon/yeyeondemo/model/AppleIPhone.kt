package org.nuon.yeyeondemo.model

private const val WON_PER_DOLLAR = 1100
private const val TRADE_TAX = 0.1

class AppleIPhone(
        var model: String,

        val priceDollar: Int,

        val phoneNumber: String,

        private var password: String,
) {
    val company: String = "Apple"

    var nickName: String? = null
}