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


/*

an enum class is a special type of class that represents a fixed set of constants.
each constant in the enum class is an instance of the enum class and has a name and a value.
An enum class can have properties, just like any other class in Kotlin.
You can define any number of properties for an enum class, as long as each constant in the enum class has a value for each property.

enum class Person(val lastName: String, val age: Int, val sex: String){

    GREG("Jones", 25, "Male"),
    DENNIS("Merlin", 35, "Male"),
    SALLY("Kim", 27, "Female"),
    JANE("Boone", 32, "Female")

}

fun main(){
    var person1: Person = Person.GREG

    name and ordinal are the only predefined properties in any enum class for constants
    all other properties need to be defined as parameters in the class
    println(person1.name.lowercase().capitalize())
    println(person1.ordinal)
    println(person1.lastName)
    println(person1.age)
    println(person1.sex)

}

*/
