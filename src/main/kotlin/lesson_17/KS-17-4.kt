package org.example.lesson_17

class Parcel(val idNumber: Int, currentLocation: String) {
    var movementCounter: Int = 0
        private set

    var currentLocation = currentLocation
        set(value) {
            field = value
            movementCounter++
        }
}

fun main() {
    val parcel = Parcel(99, "Курск")
    println(parcel.movementCounter)
    parcel.currentLocation = "Воронеж"
    println(parcel.movementCounter)
}