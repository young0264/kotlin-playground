package grammarBasic.accessModExam.lateInit

fun main(){
    var s1 = Student()
//    s1.displayInfo() // lateinit 부분 초기화가 되기 전에 실행되면 -> UninitializedPropertyAccessException
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
//    var name:String = "널"
    lateinit var name:String
    var age:Int = 0

    fun displayInfo() {
        println("이름은: ${name} 입니다.")
        println("나이는: ${age} 입니다.")
    }
}