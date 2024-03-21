package org.nuon.yeyeondemo.model

private const val WON_PER_DOLLAR = 1100

class SamsungGalaxy(
        var model: String,

        val priceDollar: Int,

        val phoneNumber: String,

        private var password: String,
) {
    val company: String = "Samsung"

    var nickName: String? = null
}
