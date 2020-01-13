import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AppTest {
    @Test
    fun `solution`() {
        assertThat(solution(intArrayOf(6, 9, 5, 7, 4))).isEqualTo(intArrayOf(0, 0, 2, 2, 4))
        assertThat(solution(intArrayOf(3, 9, 9, 3, 5, 7, 2))).isEqualTo(intArrayOf(0, 0, 0, 3, 3, 3, 6))
        assertThat(solution(intArrayOf(1, 5, 3, 6, 7, 6, 5))).isEqualTo(intArrayOf(0, 0, 2, 0, 0, 5, 6))
    }
}