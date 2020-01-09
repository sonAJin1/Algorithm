import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AppTest {
    @Test
    fun `get sum month of day`() {
        assertThat(get2016DayOfWeek(5, 24)).isEqualTo("TUE")
        assertThat(get2016DayOfWeek(1, 1)).isEqualTo("FRI")
        assertThat(get2016DayOfWeek(1, 7)).isEqualTo("THU")
    }

    @Test
    fun `get day of the week`() {
        assertThat(getDayOfTheWeek(1)).isEqualTo("FRI")
    }
}