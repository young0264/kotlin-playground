package threshold

/**
 * 업캐스팅 : 자식클래스를 부모클래스의 자료형으로 객체 생성
 * */
fun main() {
    println("몇 마리를 생성하시겠습니까?")
    var count = readLine()!!.toInt()
    var birds = mutableListOf<Bird>()

    for(idx in 0..count-1) {
        println("조류의 이름을 입력해주세요")
        var name = readLine()!!

        // as Bird는 생략가능
        birds.add(Sparrow(name) as Bird)
    }
    println("============조류 생성완료============")
    for(bird in birds) {
        bird.fly()
    }
}

//open class Bird(name: String) {
//    var name: String
//
//    init {
//        this.name = name
//    }
//
//    fun fly() {
//        println("${name}이름의 조류가 날아요~")
//    }
//}
//
//class Sparrow(name: String): Bird(name) {
//
//}