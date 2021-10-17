package racingcar

interface ResultView {
    fun showTitle()
    fun showStatuses(cars: Cars)
    fun showWinners(cars: Cars)
}
