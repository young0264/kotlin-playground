fun main(args: Array<String>) {

    var koreanScore = readLine()!!.toInt() // 국어점수 입력
    var englishScore = readLine()!!.toInt() // 영어점수 입력
    var mathScore = readLine()!!.toInt() // 수학점수 입력
    var average = (koreanScore + englishScore + mathScore) / 3

    if(average >= 90) {
        println("당신의 등급은 A입니다")
    } else if(average >= 80) {
        println("당신의 등급은 B입니다")
    } else if(average >= 70) {
        println("당신의 등급은 C입니다")
    } else {
        println("당신의 등급은 F입니다")
    }

}
