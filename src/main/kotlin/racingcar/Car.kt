package racingcar

class Car(val name: CarName, var position: Int = 0) {
    fun moveForward(carMoveForwardDecider: CarMoveForwardDecider) {
        if (carMoveForwardDecider.canMoveForward()) {
            position++
        }
    }
}
