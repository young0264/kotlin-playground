package grammarBasic


fun add(num1:Int, num2:Int, num3:Int) = (num1+num2+num3)/3

var add = {num1: Int, num2: Int, num3: Int -> (num1+num2+num3) / 3}

fun main() {
    println("평균값은 ${add(10,20,30)}입니다")
}