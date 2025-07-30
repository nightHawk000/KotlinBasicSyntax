enum class Car(val yearMade: Int, val topSpeed: Int){
    SUBARU_XR(1997, 235),
    TOYOTA_24(1986, 156),
    PAGODA_B23(2009, 350)

}

fun main (){
    val myCar = Car.SUBARU_XR

    val carName = myCar.name
    val carIndex = myCar.ordinal
    val carYearMade = myCar.yearMade
    val carTopSpeed = myCar.topSpeed

    println("Car No.$carIndex is called $carName. First made in $carYearMade, it can reach a top speed of $carTopSpeed.")
}