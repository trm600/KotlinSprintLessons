package org.example.lesson_17

class Ship(name: String, val averageSpeed: Int, val homePort: String) {
    var name = name
        set(value) {
            if (value != field) {
                println("Имя нельзя менять!")
            }
        }
}

fun main() {
    val boat = Ship("Баркас", 15, "Мурманск")
    boat.name = "Самолет"
    println(boat.name)
}