package racingcar

class Car(private val name: CarName, var position: Int = 0) {
    fun moveForward(carMoveForwardDecider: CarMoveForwardDecider) {
        if (carMoveForwardDecider.canMoveForward()) {
            position++
        }
    }

    fun getName(): String {
        return name.value
    }
}
