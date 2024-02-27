package oopBasic.RpgOopExam

class CashShop private constructor() {
    private val bowPrice = 150
    private val staffPrice = 120

    companion object {
        @Volatile private var instance: CashShop? = null

        fun getInstance(): CashShop {
            // 외부에서 요청왔을때 instance가 null인지 검증
            if(instance == null) {
                // synchronized로 외부 쓰레드의 접근을 막음
                // 쓰레드는 다음챕터에서 소개합니다!
                // 쓰레드간의 객체상태 혼돈을 막기위해 사용한다고 이해해주세요
                synchronized(this) {
                    instance = CashShop()
                }
            }
            return instance!!
        }
    }

    fun purchaseWeapon(character:Character){
        if(character is Archer) {
            character?.run {
                if(money >= bowPrice) {
                    println("[구매 후 금액]: [${money} - ${bowPrice}] = ${money-bowPrice}")
                    money -= bowPrice
                    weapons.add("슈퍼 활")
                } else {
                    println("돈이 부족합니다.")
                }
            }
        } else if(character is Wizard) {
            character?.run {
                if(money >= staffPrice) {
                    println("[구매 후 금액]: [${money} - ${staffPrice}] = ${money-staffPrice}")
                    money -= staffPrice
                    weapons.add("슈퍼 스태프")
                } else {
                    println("돈이 부족합니다.")
                }
            }
        }
    }

}