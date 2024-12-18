open class animal {

    var name: String = "Unknown"

    fun eat(){
        println("Animal Is Eating.")
    }

    fun sleep(){
        println("Animal is Sleeping.")
    }
}

open class dog: animal(){

    fun bark(){
        println("Dog is barking.")
    }

}