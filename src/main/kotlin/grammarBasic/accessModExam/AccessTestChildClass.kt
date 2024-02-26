package grammarBasic.accessModExam

class AccessTestChildClass: AccessTestClass() {

    fun protectedTest1() {
        println("e의 값은 ${e}")
        println("e의 값은 ${a}")
        println("e의 값은 ${b}")
//        println("e의 값은 ${c}")
        println("e의 값은 ${d}")
    }
}