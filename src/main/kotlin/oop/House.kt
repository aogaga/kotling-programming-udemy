package oop

class House(val height: Double, val color: String, val price: Int) {
    fun print(){
        println("House[Height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>){
    val house = House(height = 4.5, color = "blue", price = 15000)
    val redHouse = House(color = "Red", price = 20000, height = 5.0)
}