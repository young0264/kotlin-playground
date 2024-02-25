package oopBasic
/** 코틀린에서는 항상 grammarBasic.oopBasic.overExam.main 함수를 시작함수로 인식함 */
fun main() {
//    val num1 = readLine()!!.toInt()
//    val num2 = readLine()!!.toInt()

//    oopBasic.sum(num1, num2)
//    oopBasic.displyInfo()
    var myMathScore = readLine()!!.toInt()
    var myRank = checkRank(myMathScore)
    println("나의 등급은 : ${myRank}")

}

fun sum(num1: Int, num2: Int) {
    var result = num1 + num2
    println("num1과 num2의 결과는 ${result} 입니다.")
}

fun displyInfo() :Unit {
    println("오늘의 날씨는 화창해요.")
    println("오늘은 검정색을 조심하세요.")
}

fun checkRank(score:Int) :String {
    return when (score) {
        in 90 .. 100 -> return "A"
        in 80 .. 89 -> return "B"
        in 70 .. 79 -> return "C"
        else -> return "D"
    }
}