package oop

interface Driveable{
    fun drive()
}

interface Buildable{
    val buildTimeLine: Int
    fun build()
}

class Car(val color: String, override val buildTimeLine: Int): Driveable, Buildable{
    override fun drive() {
        TODO("Not yet implemented")
    }

    override fun build() {
        TODO("Not yet implemented")
    }

}


class MotorCycle(val color: String, override val buildTimeLine: Int):Driveable, Buildable{
    override fun drive() {
        TODO("Not yet implemented")
    }

    override fun build() {
        TODO("Not yet implemented")
    }

}