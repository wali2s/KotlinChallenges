package com.example.challengeskotlin

import Challenges.Pilandrom
import org.junit.Test

class PilandromTest {
    @Test
    fun testPilandrom(){
        val pilandrom = Pilandrom()

        assert(pilandrom.checkPilandrome("apccpa"))

        assert(pilandrom.factorial(5)==120)
    }
}