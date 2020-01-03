package sum_between_two_integers

import org.assertj.core.api.Assertions
import org.junit.Test

class `20200103` {

    @Test
    fun `sum between_two_integers`() {
        Assertions.assertThat(sumBetweenTwoInteger03(3, 5)).isEqualTo(12)
        Assertions.assertThat(sumBetweenTwoInteger03(3, 3)).isEqualTo(3)
        Assertions.assertThat(sumBetweenTwoInteger03(5, 3)).isEqualTo(12)
    }
    @Test
    fun `sum between_two_integers to fold`() {
        Assertions.assertThat(sumBetweenTwoInteger04(3, 5)).isEqualTo(12)
        Assertions.assertThat(sumBetweenTwoInteger04(3, 3)).isEqualTo(3)
        Assertions.assertThat(sumBetweenTwoInteger04(5, 3)).isEqualTo(12)
    }
}