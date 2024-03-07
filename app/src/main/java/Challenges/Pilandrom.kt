package Challenges

class Pilandrom {
    fun checkPilandrome(expression: String): Boolean{

      return  expression.reversed().equals(expression)
    }

    fun factorial(num: Int):Int{
        if(num < 1){
            return -1
        }
        var result = 1
        for (i in 1..num){
            result = result * i
        }
        return result
    }
}