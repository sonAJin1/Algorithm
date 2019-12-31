package sum_between_two_integers

import org.assertj.core.api.Assertions
import org.junit.Test

class `20191231` {
    @Test
    fun `sum between_two_integers`() {
        Assertions.assertThat(sumBetweenTwoInteger01(3, 5)).isEqualTo(12)
        Assertions.assertThat(sumBetweenTwoInteger01(3, 3)).isEqualTo(3)
        Assertions.assertThat(sumBetweenTwoInteger01(5, 3)).isEqualTo(12)
    }
}