package functions

import java.util.Date

fun helloWorld(): Unit{
    println("Hello World")
}

fun printWithSpaces(text: String ){
    for(c in text){
        print(c + " ")
    }
}


fun getCurrentDate(): Date{
    return Date()
}


fun main(args: Array<String>): Unit {
    printWithSpaces("Kotlin is awesome")
    println()
    println(getCurrentDate())
    println( max(17, 42))
}


fun max(a: Int, b: Int ): Int {
    if(a >= b){
        return a
    }else{
        return b;
    }
}