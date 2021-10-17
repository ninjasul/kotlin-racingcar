package racingcar

class RacingGame(
    inputView: InputView,
    private val resultView: ResultView,
    private val carMoveForwardStrategy: CarMoveForwardDecider
) {
    private val carNames: CarNames = inputView.getCarNames()
    private val numberOfTrials: NumberOfTrials = inputView.getNumberOfTrials()
    private val cars = Cars(carNames)

    fun proceed() {
        resultView.showTitle()
        repeat(numberOfTrials.value!!) {
            cars.goForward(carMoveForwardStrategy)
            resultView.showStatuses(cars)
        }
        resultView.showWinners(cars)
    }
}
