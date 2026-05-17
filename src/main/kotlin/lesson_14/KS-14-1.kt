package org.example.lesson_14

open class Liner(
    val shipName: String,
    val speed: Float = 20.36f,
    val crew: Int = 1704,
    val liftingCapacity: Long = 184000,
    val passengerCapacity: Int = 6327,
)

class CargoShip(
    shipName: String,
    speed: Float = 15.23f,
    crew: Int = 700,
    liftingCapacity: Long = 400000,
    passengerCapacity: Int = 200,
    val type: String,
) : Liner(shipName, speed, crew, liftingCapacity, passengerCapacity)

class Icebreaker(
    shipName: String,
    speed: Float = 10.12f,
    crew: Int = 350,
    liftingCapacity: Long = 62000,
    passengerCapacity: Int = 100,
    val purpose: String,
    val iceClass: String,
) : Liner(shipName, speed, crew, liftingCapacity, passengerCapacity) {
    val isBreakIce: Boolean = true
}

fun main() {
    val liner1 = Liner(
        "MSC Euribia",
    )
    val cargo1 = CargoShip(
        "Лошадка",
        type = "Танкер",
    )
    val iceBreaker1 = Icebreaker(
        "Дудинка",
        purpose = "Вспомогательные ледоколы",
        iceClass = "Icebreaker6"
    )
}