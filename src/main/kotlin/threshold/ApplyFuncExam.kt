package threshold

fun main() {
    var student = Student("참새", 10)

    var result = student?.apply {
        student.age = 50
    }
    result?.displayInfo()
    student.displayInfo()
}

//class Student(name: String, age: Int) {
//    var name: String
//    var age: Int
//
//    init {
//        this.name = name
//        this.age = age
//    }
//
//    fun displayInfo() {
//        println("이름은 ${name} 입니다")
//        println("나이는 ${age} 입니다")
//    }
//}