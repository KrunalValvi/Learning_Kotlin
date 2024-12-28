fun main(){

    print("Enter Your name: ")
    val name = readLine()?.takeIf { it.isNotBlank() }?: "Stranger"

    print("What Is your Favorite Color: ")
    val color = readLine()?.takeIf { it.isNotBlank() }?: "No particular color"

    print("Enter Your Age: ")
    var age = readLine()?: ""


    println("Hello "+name+" You are "+age+" Years Old,And Your Favorite Color is "+color)

}