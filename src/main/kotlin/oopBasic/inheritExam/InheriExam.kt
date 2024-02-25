package oopBasic.inheritExam//package oopBasic

fun main() {
    var bird = Bird()
    var chicken = Chicken()
    var sparrow = Sparrow()
    var pigeon = Pigeon()

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird {
    fun fly() {
        println("새는 날아요~")
    }
}

class Chicken : Bird() {

}

class Sparrow : Bird() {

}

class Pigeon : Bird() {

}