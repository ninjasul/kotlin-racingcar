package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource

class NumberOfTrialsTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = ["", "-1", "0", "abc", "!", "?"])
    fun `잘못된 시도 횟수를 입력하면 IllegalArgumentException이 발생한다`(input: String?) {
        Assertions.assertThatThrownBy {
            NumberOfTrials(input?.toIntOrNull())
        }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining(NumberOfTrials.WRONG_NUMBER_OF_TRIALS_ENTERED)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 100, 1000, Int.MAX_VALUE])
    fun `정상적인 시도 횟수 입력 시 테스트`(input: Int) {
        val numberOfTrials = NumberOfTrials(input)

        Assertions.assertThat(numberOfTrials.value).isEqualTo(input)
    }
}
