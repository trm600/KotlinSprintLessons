package org.example.lesson_17

class Ship(name: String, var averageSpeed: Int, var homePort: String) {
    var name = name
        set(value) {
            println("Имя нельзя менять!")
        }
}

fun main() {
    val boat = Ship("Баркас", 15, "Мурманск")
    boat.name = "Самолет"
    println(boat.name)
}