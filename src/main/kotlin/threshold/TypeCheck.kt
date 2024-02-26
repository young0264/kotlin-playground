package threshold

fun main() {
    var name = "abc"
    if(name is String) {
        println("name은 String 타입입니다")
    } else {
        println("name은 String 타입이 아닙니다")
    }
}