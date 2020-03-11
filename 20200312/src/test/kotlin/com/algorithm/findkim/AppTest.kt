package com.algorithm.findkim

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(seoul: Array<String>): String  = "김서방은 " + seoul.indexOf("Kim") + "에 있다"


class AppTest {
    @Test
    fun `김서방 찾기 테스트`(){
        assertThat(solution(arrayOf("Jane", "Kim"))).isEqualTo("김서방은 1에 있다")
    }
}
