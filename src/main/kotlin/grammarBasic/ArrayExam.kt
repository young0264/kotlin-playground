package grammarBasic

fun main() {
//    var kors = arrayOf(90, 93, 96)
    var kors =  Array(3) { i -> (i*3)+90}
    for((idx, kor) in kors.withIndex()) {
        println("${idx+1}번째 국어 점수는 ${kor}입니다")
    }
}