package com.example.challengeskotlin

import BankManagmentSystem.BankAccount
import org.junit.Test

class BankAccountTest {


    val bankAccount = BankAccount(34.00)


    @Test
    fun testBalance(){
        assert(bankAccount.getBalance() == 34.00)
    }

    @Test
    fun testDeposit(){
        bankAccount.deposit(33.00)
        assert(bankAccount.getBalance()== 67.00)
    }

    @Test
    fun testWithdrau(){
        bankAccount.withdraw(2.00)
        assert(bankAccount.getBalance()== 32.00)
    }

    @Test
    fun testWithdrauOverLimit(){
        bankAccount.withdraw(35.00)
        assert(bankAccount.getBalance() == 34.00)
    }


}