package org.example.lesson_14

open class Liner(
    val shipName: String,
    open val speed: Float = 20.36f,
    open val crew: Int = 1704,
    open val liftingCapacity: Long = 184000,
    open val passengerCapacity: Int = 6327,
)

class CargoShip(
    shipName: String,
    val type: String,
) : Liner(shipName) {
    override val speed: Float = 15.23f
    override val crew: Int = 700
    override val liftingCapacity: Long = 400000
    override val passengerCapacity: Int = 200
}

class Icebreaker(
    shipName: String,
    val purpose: String,
    val iceClass: String,
) : Liner(shipName) {
    val isBreakIce: Boolean = true
    override val speed: Float = 10.12f
    override val crew: Int = 350
    override val liftingCapacity: Long = 62000
    override val passengerCapacity: Int = 100
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
        iceClass = "Icebreaker6",
    )
}