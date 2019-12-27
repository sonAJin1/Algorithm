package kth_number

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class `20191227` {
    @Test
    fun `get k-th number to array`() {
        assertThat(getKthNumberToArray(intArrayOf(1, 5, 2, 6, 3, 7, 4),
                arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3)))).isEqualTo(intArrayOf(5, 6, 3))
    }

    @Test
    fun `get k-th number`() {
        assertThat(getKthNumber(intArrayOf(1, 5, 2, 6, 3, 7, 4), 2, 5, 3)).isEqualTo(5)
    }

}
