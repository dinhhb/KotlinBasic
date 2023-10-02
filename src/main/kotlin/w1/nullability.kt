package w1

fun main(){
    var rocks: Int? = null

    var fishFoodTreats: Int? = null
//    if (fishFoodTreats != null) {
//        fishFoodTreats = fishFoodTreats.dec()
//    }

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

}