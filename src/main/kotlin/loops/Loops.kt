package loops

fun main(args: Array<String>) {
//    println(getSum())
//    loopTruList()
//    loopsWithWhile()

    thingsToDoWithBreakandContinue();
    thingsToDoWithNestedLoops();
}

fun getSum(): Int {
    var sum = 0

    for (i in 1..10) {
        sum = i + sum
    }

    return sum

}

fun loopTruList(){
    var list = listOf("Java", "kotlin", "python")

    for (element in list){
        println(element)
    }

    for((index, value) in list.withIndex()){
        println("Element at $index is $value")
    }


    for ((index, value) in list.withIndex()){
        println(list[index])
    }
}

fun loopsWithWhile(){
    var x = 9;
    while( x >= 0){
        println(x)
        x--
    }


    var i = 1;
    while (i <= 10){
        println(i)
        i++
    }
}


fun thingsToDoWithBreakandContinue(){

    for(c in "python"){
        if(c == 'o'){
            break
        }
    }

    val list = listOf("book", "table", "laptop")

    for(str in list){
        if(!str.contains('o')){
            continue
        }

        println(str)
    }
}


fun thingsToDoWithNestedLoops(){
   baba@ for(i in 1..10){
        for(j in 1..10){
            if(i - j == 5){
                break@baba
            }
            println("$i - $j")
        }
    }
}