import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun `test`(){
        assertThat(get2016DayOfTheWeek(5,24)).isEqualTo("TUE")
        assertThat(get2016DayOfTheWeek(1,7)).isEqualTo("THU")
        assertThat(get2016DayOfTheWeek(1,14)).isEqualTo("THU")
        assertThat(get2016DayOfTheWeek(2,29)).isEqualTo("MON")
        assertThat(get2016DayOfTheWeek(1,1)).isEqualTo("FRI")
    }
}
