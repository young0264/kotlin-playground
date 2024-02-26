package threshold

fun main() {

    /** 객체에서 호출하지 않는 경우 */
    var totalPrice = run {
        var computer = 10000
        var mouse = 5000

        computer+mouse
    }
    println("총 가격은 ${totalPrice}입니다")

    /** 객체에서 호출하는 경우 (+ Student class) */
    var student = Student("참새", 10)

    //이 부분
    student?.run {
        displayInfo()
    }
}

class Student(name: String, age: Int) {
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }

    fun displayInfo() {
        println("이름은 ${name} 입니다")
        println("나이는 ${age} 입니다")
    }
}