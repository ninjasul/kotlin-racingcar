package racingcar

class Cars(carNames: CarNames) {
    private var racingCars: List<Car> = ArrayList()

    init {
        racingCars = carNames
            .getCarNames()
            .map { name -> Car(name) }
            .toList()
    }

    fun goForward(carMoveForwardDecider: CarMoveForwardDecider) {
        racingCars
            .forEach { car -> car.moveForward(carMoveForwardDecider) }
    }

    fun getCars(): List<Car> {
        return this.racingCars
    }

    fun getWinners(): List<Car> {
        val maximumPosition = this.racingCars
            .map { it -> it.position }
            .maxOrNull()

        val (winners, _) = racingCars.partition { it.position == maximumPosition }
        return winners
    }
}
