package org.nuon.echodemo.model

// 환율
private const val WON_PER_DOLLAR = 1100

class SamgsungGalaxy(
    // 모델명
    var model: String,

    // 가격(달러)
    val priceDollar: Int,

    // 전화번호
    val phoneNumber: String,

    // 비밀번호
    private var password: String,
) {
    // 제조사
    val company: String = "Samsung"

    // 닉네임
    var nickName: String? = null

    /***
     * 가격을 원화로 변환합니다.
     */
    fun getPriceInWon(): Int {
        return priceDollar * WON_PER_DOLLAR
    }

    /**
     * 잠금을 해제합니다.
     */
    fun unlock(password: String): Boolean {
        if (this.password == password) {
            println("잠금 해제 되었습니다.")
            return true
        } else {
            println("비밀번호가 틀렸습니다.")
            return false
        }
    }

    /**
     * 비밀번호를 변경합니다.
     */
    fun changePassword(oldPassword: String, newPassword: String) {
        if (unlock(oldPassword)) {
            password = newPassword
            println("비밀번호가 변경되었습니다.")
        } else {
            println("암호가 틀립니다. 비밀번호 변경에 실패했습니다.")
        }
    }
}
