package racingcar

import java.util.stream.Collectors.toList

class CarNames(input: String?) {
    private var carNames: List<CarName> = ArrayList()

    companion object {
        const val CAR_NAME_DELIMITER = ","
        const val ENTERED_WRONG_CAR_NAMES = "자동차 이름들을 올바르게 입력하세요."
    }

    init {
        require(input != null && input.isNotBlank()) { ENTERED_WRONG_CAR_NAMES }

        this.carNames = input.split(CAR_NAME_DELIMITER)
            .stream()
            .map { CarName(it.trim()) }
            .collect(toList())
    }

    fun getCarNames(): List<CarName> {
        return carNames
    }

    fun getSize(): Int {
        return carNames.size
    }
}
