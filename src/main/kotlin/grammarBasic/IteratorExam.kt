package grammarBasic

fun main() {
    var i = 0
    var startNum = 0
    var endNum = 5


    while (i < 3) {
        println("${i}번째 while 인쇄")
        i++
    }

    var infos = arrayOf("가", "나", "다", "라")
    for (info in infos) {
        println(info)
    }

    for (i in startNum until endNum) {
        println(i)
    }

    for (i in startNum .. endNum) {
        println(i)
    }

}