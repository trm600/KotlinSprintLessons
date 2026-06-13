package org.example.lesson_15

const val FLY = "летит"
const val SWIM = "плывёт"

interface Flying {
    fun fly(): String
}

interface Swimming {
    fun swim(): String
}

class Crucian : Swimming {
    override fun swim(): String = "Карась $SWIM."
}

class Seagull : Flying, Swimming {
    override fun swim(): String = "Чайка $SWIM."
    override fun fly(): String = "Чайка $FLY."
}

class Duck : Flying, Swimming {
    override fun swim(): String = "Утка $SWIM."
    override fun fly(): String = "Утка $FLY."
}

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()
    println(crucian.swim())
    println(seagull.fly())
    println(seagull.swim())
    println(duck.fly())
    println(duck.swim())
}