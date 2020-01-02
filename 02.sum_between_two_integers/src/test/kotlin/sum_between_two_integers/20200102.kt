package sum_between_two_integers

import org.assertj.core.api.Assertions
import org.junit.Test

class `20200102` {
    @Test
    fun `sum between_two_integers`() {
        Assertions.assertThat(sumBetweenTwoInteger02(3, 5)).isEqualTo(12)
        Assertions.assertThat(sumBetweenTwoInteger02(3, 3)).isEqualTo(3)
        Assertions.assertThat(sumBetweenTwoInteger02(5, 3)).isEqualTo(12)
    }
}