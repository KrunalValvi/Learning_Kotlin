class Person {
    var name: String = "Unknown"
    var age: Int = 0

    // Method
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main(){

    val person = Person()

    person.name = "Krunal"
    person.age = 19

    person.introduce()
}