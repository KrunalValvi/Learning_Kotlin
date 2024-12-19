
fun calculatearea(width: Int=5 , height: Int=10):Int{
    return width * height
}

fun opraction(a:Int, b:Int, opraction: (Int,Int)-> Int):Int {
    return opraction(a,b)
}

fun List<Int>.findmax(): Int?{
    return if (this.isEmpty()) null else this.maxOrNull()
}


fun main(){

    println("Default Area: ${calculatearea()}")
    println("Custom Area: ${calculatearea(3,4)}")


    val add = opraction(23,34) {a,b->a+b}
    val subtract = opraction(30,5) {a,b->a-b}
    val multiply = opraction(2,6) {a,b->a*b}

    println("Addiction: $add")
    println("Subtraction: $subtract")
    println("multiplication: $multiply")


    val number = listOf(2,5,7,3,5,7,3)
    val emptylist = listOf<Int>()

    println("Maximum: ${number.findmax()}")
    println("Maximum of empty list:${emptylist.findmax()}")

}