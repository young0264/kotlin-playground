package oopBasic.RpgOopExam

open class Character {

    var weapons : ArrayList<String>  = ArrayList()
    open fun attack() {
        println("기본 공격!")
    }


//    open fun weapons() {
//        println("무기 공격!")
//    }
}