package Challenges

class IsPrime {

    fun isPrime(number: Int): Boolean{
        if(number == 1){
            return false
        }

        for (i in 2 until number){
            if (number % i == 0){
                    return false
             }
        }

        return true
    }

}