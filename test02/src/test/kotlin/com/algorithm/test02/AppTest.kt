package com.algorithm.test02

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(s1: String, s2: String): String {


    return "ABCxyZA"
}

fun findOverlap(s1: String, s2: String): String {
    // take로 s1뒤에서부터 잘라오고 s2앞에서부터 잘라온다
    // s1 s2를 반씩 잘라
    var returnvalue = true
    var findIdxs1 = s1.length - 1
    var findIdxs2 = 1

    var newS1: String = ""


    while (returnvalue) {

        println("s1.drop: ${s1.drop(findIdxs1)}")
        println("s2.take: ${s2.take(findIdxs2)}")
        if (s1.drop(findIdxs1) != s2.take(findIdxs2)) {
            returnvalue = false

        } else {
            newS1 = s1.take(findIdxs1)
            findIdxs1 -= 1
            findIdxs2 += 1
        }
    }
    return newS1 + s2
}


fun findOverlap02(s1: String, s2: String) {
    // 같은 값이 있는지 check count
    val newS1 = s1.slice(0..s1.length / 2)
    val newS2 = s2.slice(s2.length / 2 until s2.length)
    var overlapCount = 0

    newS1.forEachIndexed { index, c ->
        println("c: ${c}")
        println("newS1 : ${newS1.take(index)}")
        println("newS2 : ${newS2.take(index)}")
        if (newS2[index] == c)
            overlapCount++
    }

    println("count: $overlapCount")


}


class AppTest {
    @Test
    fun `test`() {
        // assertThat(solution("xyZA","ABCxy")).isEqualTo("ABCxyZA")
        //  assertThat(findOverlap("xyZA", "ABCxy")).isEqualTo("ABCxyZA")
      //  assertThat(findOverlap("ABCxy", "xyZA")).isEqualTo("ABCxyZA")
        assertThat(findOverlap02("ABCxy", "xyZA")).isEqualTo("ABCxyZA")
    }
}
