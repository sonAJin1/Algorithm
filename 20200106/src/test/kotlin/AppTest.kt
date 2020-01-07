import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {

    @Test
    fun `int with remainder zero`() {
        assertThat(intWithRemainderZero(intArrayOf(5, 9, 7, 10), 5)).isEqualTo(intArrayOf(5, 10))
        assertThat(intWithRemainderZero(intArrayOf(2, 36, 1, 3), 1)).isEqualTo(intArrayOf(1, 2, 3, 36))
        assertThat(intWithRemainderZero(intArrayOf(3, 2, 6), 10)).isEqualTo(intArrayOf(-1))
    }

}
