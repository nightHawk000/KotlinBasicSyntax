fun main() {
    var a:Int = 0
    
    while(a<=2){
        
        var b:Int = 0
        while(b<=2){
            print("Inner While Loop <-> ")
            b++
            println()
        }
        
        println("Outer While Loop ")
        a++
        println()
    }
	
	//second logic
    var g:Int = -3
    
    while(g<=2){
        
        var b:Int = 0
        while(b<=a+1){
            print("Inner While Loop <-> ")
            b++
            println()
        }
        
        println("Outer While Loop ")
        a++
        println()
}

}
