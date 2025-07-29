fun main() {
    
    //the lowerCase function is being used as a variable inside the main function
    val lowerCase  = {
        
        val lowerList = listOf("kare", "bloom", "spooler") //a list of string values in shortcase
        
        val upperList = mutableListOf<String>() //an empty mutable list that can hold string values
        
        for(word in lowerList){ //this loops over the lowerList list and converts each element into an upper case form
            upperList.add(word.uppercase())
        }
      upperList //return the new list
    }
    
    val upperCase = lowerCase() //call the lowerCase lambda function
    
    println(upperCase)
}
