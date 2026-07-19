package org.example.lesson_19

class Spaceship(val name: String) {

    fun takeOff() {
        //TODO Нужна информация о дополнительной логике
    }

    fun landing() {
        TODO()
    }

    fun shootAsteroid() {}

}

fun main() {
    val ship = Spaceship("Лодочка")
    ship.takeOff()
    ship.landing()
}