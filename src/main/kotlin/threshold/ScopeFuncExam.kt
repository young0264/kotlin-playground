package threshold

fun main() {

    /** let 활용 */
    var strNum = "10"

    var result = strNum?.let {
        // 중괄호 안에서는 it으로 활용함
        Integer.parseInt(it)
    }

    println(result!!+1)


    /** with 활용 */
    var alphabets = "abcd"

    with(alphabets) {
//      var result = this.subSequence(0,2)
        var result = subSequence(0,2)
        println(result)
    }
}

