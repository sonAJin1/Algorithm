import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AppTest {
    @Test
    fun `Find taller the tower`(){
        assertThat(findTallerTheTower(1, intArrayOf(4,5))).isEqualTo(5)
    }
}