package grammarBasic

fun method1() {
    try {
        println("예외가 발생할 가능성이 존재하는 코드")
    } catch(e : Exception) {
//    } catch(예외종류) {
//        예외가 발생했을때 처리할 코드
        println("예외가 발생했을때 처리할 코드")
    }
}

fun method1(num1:Int) {
    if(num1 > 10) {
//        throw 예외종류

    }
}

fun main() {

//    while(true) {
//        try {
//            var num1 = readLine()!!.toInt()
//            println("내가 입력한 숫자는 ${num1}입니다")
//            break
//        } catch(e:java.lang.NumberFormatException) {
//            println("숫자를 입력하세요")
//        }
//    }

    while(true) {
        try {
            var num1 = readLine()!!.toInt()
            println("내가 입력한 숫자는 ${num1}입니다")
            break
        } catch(e:java.lang.NumberFormatException) {
            println("숫자를 입력하세요")
        } finally {
            println("키보드와의 연결은 정상적입니다")
        }
    }
}