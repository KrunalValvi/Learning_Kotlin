
fun main() {

//Create a list of numbers and filter out the even numbers.

    val number = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val evenNumbers = number.filter { it % 2 == 0}
    println(evenNumbers)


//Create a Map of Student Names to Their Scores and Find the Names of Students Who Scored Above 50

    val studentscore = mapOf("Ramesh" to 12,"Kamlesh" to 75,"Raghu" to 90,"Dinesh" to 68,"Mohit" to 50)
    val highscore = studentscore.filter { it.value >= 50 }.keys
    println(highscore)


//Use a Lambda to Double the Values in a List of Integers

    val Numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val double = Numbers.map{it * 2}
    println(double)

}