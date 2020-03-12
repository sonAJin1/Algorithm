package com.algorithm.changewholenumber

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(s: String): Int = s.toInt()


class AppTest {
    @Test
    fun `정수로 변환 테스트`() {
        assertThat(solution("1234")).isEqualTo(1234)
        assertThat(solution("-1234")).isEqualTo(-1234)
    }
}
