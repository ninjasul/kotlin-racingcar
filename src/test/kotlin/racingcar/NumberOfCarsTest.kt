package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource
import racingcar.NumberOfCars.Companion.WRONG_NUMBER_OF_CARS_ENTERED

class NumberOfCarsTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = ["", "-1", "0", "abc", "!", "?"])
    fun `잘못된 자동차 대수를 입력하면 IllegalArgumentException이 발생한다`(input: String?) {
        Assertions.assertThatThrownBy {
            NumberOfCars(input?.toIntOrNull())
        }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining(WRONG_NUMBER_OF_CARS_ENTERED)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 100, 1000, Int.MAX_VALUE])
    fun `정상적인 자동차 대수 입력 시 테스트`(input: Int) {
        val numberOfCars = NumberOfCars(input)

        Assertions.assertThat(numberOfCars.value).isEqualTo(input)
    }
}
