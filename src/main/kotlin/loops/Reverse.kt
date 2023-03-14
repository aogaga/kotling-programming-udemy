package loops

fun main(args: Array<String>){
    val numbers = listOf<Int>(1, 2, 3, 6, 8, 9)

    println(reverse(numbers))
    println(reverseV2(numbers))
}

fun reverse(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>();
    val size = list.size -1;
    for(i in 0..size){
        result.add(list[size-i])
    }
    return result
}

fun reverseV2(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>();
    val size = list.size -1;

    for(i in size downTo 0){
        result.add(list.get(i))
    }
    return result;

}