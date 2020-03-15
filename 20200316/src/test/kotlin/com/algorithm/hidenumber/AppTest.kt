package com.algorithm.hidenumber

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(phone_number: String): String = phone_number.dropLast(4).map { "*" }.joinToString("") + phone_number.takeLast(4)



class AppTest {
    @Test
    fun `문자열 숨기기 테스트`(){
        assertThat(solution("01033334444")).isEqualTo("*******4444")
    }
}
