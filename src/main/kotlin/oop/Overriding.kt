package oop


abstract class Course(val topic: String, val price: Double){
    open fun learn(){

    }
}
open class KotlinCourse(): Course("Kotling", 999.99){

    override fun learn() {
        println("I am one of the first people to learn kotlin")
    }
}



class SpecialKotlinCourse(): KotlinCourse(){


}