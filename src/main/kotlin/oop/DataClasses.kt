package oop

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {
}


data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {
}

fun main(args: Array<String>){
    val book = Book("Super book", "John Doe", 2017, 99.99)
    val databook = DataBook("Super book", "John Doe", 2017, 99.99)

    println(book)
    println(databook)


}