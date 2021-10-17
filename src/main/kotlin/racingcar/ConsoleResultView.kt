package racingcar

import java.util.stream.Collectors.joining

class ConsoleResultView : ResultView {
    companion object {
        private const val CAR_POSITION_CHARACTER = "-"
        private const val RESULT_TITLE = "실행 결과"
        private const val WINNERS_JOINING_DELIMITER = ", "
    }

    override fun showTitle() {
        println("\n" + RESULT_TITLE)
    }

    override fun showStatuses(cars: Cars) {
        cars.getCars()
            .forEach { car ->
                print("%s: ".format(car.getName()))
                for (index in (1..car.position)) {
                    print(CAR_POSITION_CHARACTER)
                }
                println()
            }
        println()
    }

    override fun showWinners(cars: Cars) {
        val winners = cars.getWinners()
            .stream()
            .map { it.getName() }
            .collect(joining(WINNERS_JOINING_DELIMITER))

        println("$winners 가 최종 우승하였습니다.")
    }
}
