package com.algorithm.basicstring

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(s: String): Boolean {
    if (s.length == 4 || s.length == 6)
       return s.toCharArray().all { it in '0'..'9' }
    return false
}


class AppTest {
    @Test
    fun `기본 문자열 테스트`() {
        assertThat(solution("1234")).isEqualTo(true)
        assertThat(solution("123d4")).isEqualTo(false)
    }
}
