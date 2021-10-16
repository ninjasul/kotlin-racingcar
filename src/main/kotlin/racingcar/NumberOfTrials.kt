package racingcar

data class NumberOfTrials(val value: Int?) {
    companion object {
        const val WRONG_NUMBER_OF_TRIALS_ENTERED = "잘못된 시도 횟수가 입력되었습니다."
    }

    init {
        require(value != null && value > 0) { WRONG_NUMBER_OF_TRIALS_ENTERED }
    }
}
