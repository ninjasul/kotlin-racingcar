package racingcar

data class NumberOfCars(val value: Int?) {
    companion object {
        const val WRONG_NUMBER_OF_CARS_ENTERED = "잘못된 자동차 대수가 입력되었습니다."
    }

    init {
        require(value != null && value > 0) { WRONG_NUMBER_OF_CARS_ENTERED }
    }
}
