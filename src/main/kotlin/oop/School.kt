package oop

open class School( open val name: String, open var age: Int) {
    init{
        println("Object was created")
    }

    fun speak(){
        println("Hello World")
    }

    fun greet(name: String){
        println("Hello $name")
    }

    fun getYearOfBirth() = 2016 - age
}

class Student(override val name: String, override var age: Int): School(name, age){

}


class Employee(override val name: String, override var age: Int): School(name, age){

}