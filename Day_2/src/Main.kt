fun main(){

//    print("Enter Number: ")
//    val number = readLine()?: ""
//
//    if (number> 0.toString()){
//        println("Positive number")
//    }
//    else{
//        println("negative number")
//    }

    print("Enter day Number: ")
    val day = readLine()?: ""

    when (day){
        1.toString()-> println("Sunday")
        2.toString()-> println("Monday")
        3.toString()-> println("Tuesday")
        4.toString()-> println("Wednesday")
        5.toString()-> println("Thursday")
        6.toString()-> println("Friday")
        7.toString()-> println("Saturday")
        else-> println("Invalid day")
    }

}

