package com.algorithm.descendingsort

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution01(s: String): String = s.toCharArray().sortedWith(compareBy({ it }, { it.isLowerCase() })).sortedDescending().joinToString().replace(", ", "")
fun solution02(s: String): String = s.toCharArray().sortedArrayDescending().joinToString("")


class AppTest {
    @Test
    fun `내림차순 정렬`() {
        assertThat(solution01("feIdwald")).isEqualTo("wlfeddaI")
        assertThat(solution02("feIdwald")).isEqualTo("wlfeddaI")
    }
}
