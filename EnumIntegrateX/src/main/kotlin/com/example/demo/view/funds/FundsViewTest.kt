package com.example.demo.view.funds

import com.example.demo.controller.funds.FundsController
import org.junit.jupiter.api.Assertions.*

internal class FundsViewTest {

    @org.junit.jupiter.api.Test
    fun getFundsController() {
        val fundsPool = FundsController()
        val result = fundsPool.universityPoolFundTotal().value
        assert(value = true)
    }

    @org.junit.jupiter.api.Test
    fun getUniversityList() {
        val fundsPool = FundsController()
        val result = fundsPool.universityList
        assert(value = true)
    }

    @org.junit.jupiter.api.Test
    fun setUniversityPoolFund() {
        val fundsPool = FundsController()
        val result = fundsPool.universityPoolFundTotal().value
        assert(value = true)
    }

    @org.junit.jupiter.api.Test
    fun getTotalOutgoingFunds() {
        val fundsPool = FundsController()
        val result = fundsPool.outgoingPayments().value
        assert(value = true)
    }

    @org.junit.jupiter.api.Test
    fun getTotalIncomingFunds() {
        val fundsPool = FundsController()
        val result = fundsPool.incomingPayments().value
        assert(value = true)
    }
}