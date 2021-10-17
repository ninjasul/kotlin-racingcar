package racingcar

class CarName(val value: String? = "") {

    companion object {
        const val MAXIMUM_CAR_NAME_LEGNTH = 5
        const val ENTERED_WRONG_CAR_NAME = "잘못된 자동차 이름입니다. ${MAXIMUM_CAR_NAME_LEGNTH}글자 이하의 이름을 입력하세요."
    }

    init {
        require(value != null && value.isNotBlank() && value.length <= MAXIMUM_CAR_NAME_LEGNTH) { ENTERED_WRONG_CAR_NAME }
    }
}
