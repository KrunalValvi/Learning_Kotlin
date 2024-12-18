fun main(){
//
////    If Else
//
//    val number = 12
//
//    if (number % 2 ==0){
//        println("$number is even")
//    }else{
//        println("$number is odd")
//    }
//
//
////    When
//
//    val grade = '4'
//
//    when(grade){
//        'A'-> println("Excellent")
//        'B'-> println("Good")
//        else-> println("Need Improvement")
//    }
//
////    For Loop
//
//    for (i in 1..5){
//        println(i)
//    }
//
////    While Loop
//
//    var count = 5
//    while (count>0){
//        println("Countdown: $count")
//        count--
//    }

    val number = -2

    if (number>0){
        println("Number is positive")
    }else if (number<0){
        println("Number is negative")
    }else{
        println("Number is Zero")
    }


    for (i in 1..10){
        if (i % 2 ==0){
            println("$i is Even")
        }else{
            println("$i is odd")
        }
    }

}