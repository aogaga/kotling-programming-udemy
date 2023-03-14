package condiationals


fun main(args: Array<String>) {
    conditionalWhen()
}


fun conditionif(): Unit {
    val age: Int = 15

    if (age < 18) {
        print("You cannot register .")
    } else if (age < 21) {
        println("well, maybe you can register")
    } else if (age < 27) {
        println("you should be able to register")
    } else {
        println("you are good to go !")
    }
}


fun conditionalWhen() {
    val mode: Int = 2

    when (mode) {
        1 -> println("The mode is lazy")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }

        3 -> println("The mode is super productive")

        else -> println(" I don't know that mode")
    }
}


fun conditionalifandWhen(){
    val mode: Int = 4

    val result = when (mode){
        1 -> "The body is lazy"
        2 -> {
            println("The Mode is 2")
            val i: Int = 3
            "so the mode is busy"
        }
        else -> "I don't know that mode"
    }


    val x = if(mode < 2){
        println("Mode is less than 2")
    }else
    {
        print("we do not know the mode")
    }
}

fun conditionMoreWhenExpression(){
    val x = 10

    when(x){
        5 -> println("x is 5")
        3 * 12 -> println("is is ${3*12}")
        "Hey There".length -> println("x is the length pf the string 'hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println()
        in 21..50 -> println("bet")
        !in 1..19 -> println("x is not between 1 - 9")
    }

}