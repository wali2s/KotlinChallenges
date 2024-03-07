package BankManagmentSystem

import android.util.Log


// Create a BankAccount class with methods to deposit, withdraw, and check balance.
// Include features like setting an overdraft limit and handling transactions.
class BankAccount(
    private var balance:Double) {
    private var limit = 0.0

    fun deposit(amount: Double){
        this.balance += amount
    }

    fun withdraw(amount: Double){
        if (this.balance - amount >= this.limit) {
            this.balance -= amount
        }else{
            Log.d("auszahlen","not possible")
        }
    }

    fun setLimit(newLimit: Double){
        this.limit = newLimit
       // print("limit set to $newLimit")
    }

    fun getBalance():Double{
        return this.balance
    }
}