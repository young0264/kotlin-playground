package threshold

/** 확장 함수 */
fun main() {
    fun Student.getGrade() = println("학생의 등급은 ${this.grade} 입니다")
    var student = Student("참새", 10, "A+")
    student.displayInfo()
    student.getGrade()
}

class Student(name: String, age: Int, grade: String) {
    var name: String
    var age: Int
    var grade: String

    init {
        this.name = name
        this.age = age
        this.grade = grade
    }

    constructor(name: String, age: Int) : this(name, age, "")

    fun displayInfo() {
        println("이름은 ${name} 입니다")
        println("나이는 ${age} 입니다")
    }
}