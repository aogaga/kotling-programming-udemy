package collections

fun main(args: Array<String>) {
    sampleMixedArray()
}


fun sampleArray() {
    val array = arrayOf("Texas", "Iowa", "California")
    val list = listOf("orange", "Apple", "Bananas")
    val arraylist = arrayListOf("Patrick", "Micheal", "Sarah")
    arraylist.add("sandra")
    println(arraylist)
}

fun sampleMixedArray() {

    //Arrays

    val array = arrayOf("Texas", "Iowa", "California")
    val mixed = arrayOf("kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(mixed[0])
    mixed[2] = 3.145

    println(mixed[2])
    val str = "udemy"

    println(str[0])
    val states = arrayOf("Nevada", "florida")
    val allstates = states + array;

    println(allstates.size)

    val empty: Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")) {
        println("It contains kentucky")
    } else {
        println("It does not")
    }
    //list

    val arrayList = arrayListOf("Patrick", "Micheal", "Sarah")
    val list = arrayListOf("Peter")

    println(arrayList[0])
    println(arrayList + list)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))

    arrayList.add("Josh")
    arrayList.add(1, "jack")

//    val removed = arrayList.remove("Micheal")
//    println(removed)
    println(arrayList)


    val sublist = arrayList.subList(1, 3);

    println(sublist)
}