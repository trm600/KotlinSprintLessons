package org.example.lesson_18

open class Animal(val name: String) {

    open fun eat() {
        println("$name ест")
    }

    fun sleep() {
        println("$name -> спит")
    }

}

class Fox(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест ягоды")
    }

}

class Dog(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест кости")
    }

}

class Cat(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест рыбу")
    }

}

fun main() {

    val tamagochi: List<Animal> = listOf<Animal>(Cat("Мурка"), Dog("Палкан"), Fox("Алиса"))

    tamagochi.forEach { it.eat() }

}