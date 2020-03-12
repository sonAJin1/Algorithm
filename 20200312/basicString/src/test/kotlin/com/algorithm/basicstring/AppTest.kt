package com.algorithm.basicstring

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution01(s: String): Boolean =
    when(s.length) {
        4, 6 -> s.all { it in '0'..'9' }
        else -> false
    }


class AppTest {
    @Test
    fun `기본 문자열 다루기 테스트`() {
        assertThat(solution01("a234")).isEqualTo(false)
        assertThat(solution01("1234")).isEqualTo(true)
    }
}
