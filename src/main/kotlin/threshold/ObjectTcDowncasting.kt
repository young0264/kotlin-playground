package threshold

/**
 * 다운캐스팅 : 부모클래스를 자식 클래스의 자료형으로 객체 생성
 * */
fun main() {
    println("몇 마리를 생성하시겠습니까?")
    var count = readLine()!!.toInt()
    var birds = mutableListOf<Bird>()

    for(idx in 0..count-1) {
        println("조류의 이름을 입력해주세요")
        var name = readLine()!!

        birds.add(Sparrow(name) as Bird)
    }
    println("============조류 생성완료============")
    for(bird in birds) {
        bird.fly()
    }
    // 다운캐스팅 오류
    // Sparrow는 Bird가 가져야할 정보를 모두 가지고 있지 않기 때문임
//    var s1:Sparrow = birds.get(0)
}

open class Bird(name: String) {
    var name: String

    init {
        this.name = name
    }

    fun fly() {
        println("${name}이름의 조류가 날아요~")
    }
}

class Sparrow(name: String): Bird(name) {

}