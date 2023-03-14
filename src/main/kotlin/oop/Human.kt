package oop

abstract class Mamal(open val name: String, open val age: Int) {
    init{
        println("Object was created ")
    }

    abstract fun speak()

    fun greet(name: String){
        println("Hello $name")
    }
}

class HomoSapien(override val name: String, override val age: Int):Mamal(name, age ){
    override fun speak() {
       println(" Hi there i am a homosapien");
    }

}



class Human(override val name: String, override val age: Int):Mamal(name, age ){
    override fun speak() {
        println(" Hi there i am a human");
    }

}