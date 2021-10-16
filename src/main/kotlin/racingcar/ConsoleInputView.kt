package racingcar

class ConsoleInputView : InputView {
    companion object {
        const val RECEIVE_NUMBER_OF_CARS_MESSAGE = "자동차 대수는 몇 대인가요?"
        const val RECEIVE_NUMBER_OF_TRIALS_MESSAGE = "시도할 횟수는 몇 회인가요?"
        const val WRONG_NUMBER_OF_CARS = "잘못된 자동차 대수입니다."
        const val WRONG_NUMBER_OF_TRIALS = "잘못된 시도 횟수입니다."
    }

    override fun getNumberOfCars(): Int {
        println(RECEIVE_NUMBER_OF_CARS_MESSAGE)
        val numberOfCars: Int? = readLine()?.toIntOrNull()
        require(numberOfCars != null && numberOfCars > 0) { WRONG_NUMBER_OF_CARS }

        return numberOfCars
    }

    override fun getNumberOfTrials(): Int {
        println(RECEIVE_NUMBER_OF_TRIALS_MESSAGE)
        val numberOfTrials: Int? = readLine()?.toIntOrNull()
        require(numberOfTrials != null && numberOfTrials > 0) { WRONG_NUMBER_OF_TRIALS }

        return numberOfTrials
    }
}
