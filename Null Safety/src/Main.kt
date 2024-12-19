
fun add (a:Int , b:Int ): Int{
    return a+b
}

fun nullnumbers(a:Int? ,b:Int?): Int{
    val number1 = a?:0
    val number2 = b?:0
    return number1 + number2
}


fun main(){

//    Nullable Type

    var name: String? = null
    println(name)

//    Safe Call: ?.

    val length = name?.length
    println(length)


//    Elvis Oprater: ?:

    val date = name?.length ?:0
    println(date)


//    Non-Nullable Variable

    var myname: String = "Krunal"
    println(myname)


//    Add Values

    val result = add(50,50)
    println(result)

    val nullresult1 = nullnumbers(12,56)
    println("Sum is: $nullresult1 ")

    val nullresult2 = nullnumbers(null,20)
    println("Sum is: $nullresult2")

    val nullresult3 = nullnumbers(null,null)
    println("Sum is: $nullresult3")

}

