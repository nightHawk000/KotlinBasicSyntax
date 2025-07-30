fun randomDay(): String {
    
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    
  return week.random()
  
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> {
            "flakes"
        }
        "Wednesday" -> {
            "redworms"
        }
        "Thursday" -> {
            "granules"
        }
        "Friday" -> {
            "mosquitoes"
        }
        "Sunday" -> {
            "plankton"
        }
        else -> {
            "nothing"
        }
    }
}

fun main(){
    
    val currentRandomDay = randomDay()
    val food = fishFood(currentRandomDay)
    
    println ("Today is $currentRandomDay and the fish eat $food.")

}
