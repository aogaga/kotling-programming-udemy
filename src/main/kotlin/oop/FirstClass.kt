package oop


class Person(open val name: String, val age: Int) {

    var birthYear = 2016 - age
    init{
        println("Object was created")
    }
    fun greet(name: String){
     println("Hello $name")
    }

    fun speak(){
        println("Hello fool")
    }

    fun getYearOfBirth() = 2016 - age
}


fun main(args: Array<String>){
 var person: Person = Person("Sarah", 47)
    println(person.name)
    println(person.age)
    println(person.speak())
    println(person.greet("World"))
}