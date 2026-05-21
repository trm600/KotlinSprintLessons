package org.example.lesson_14

open class Liner1(
    val shipName: String,
    open val speed: Float = 20.36f,
    open val crew: Int = 1704,
    open val liftingCapacity: Long = 184000,
    open val passengerCapacity: Int = 6327,
) {
    open fun loadShip() {
        println("$shipName выдвигает горизонтальный трап со шкафута")
    }

    open fun printShipInfo() {
        println(
            """
        |Имя корабля: $shipName
        |Скорость корабля: $speed узлов.
        |Экипаж: $crew человек.
        |Грузоподъемность: $liftingCapacity тонн.
        |Пассажировместимость: $passengerCapacity человек.
        """.trimMargin()
        )
    }
}

class CargoShip1(
    shipName: String,
    val type: String,
) : Liner1(shipName) {
    override val speed: Float = 15.23f
    override val crew: Int = 700
    override val liftingCapacity: Long = 400000
    override val passengerCapacity: Int = 200

    override fun loadShip() {
        println("$shipName активирует погрузочный кран")
    }

    override fun printShipInfo() {
        super.printShipInfo()
        println("Тип: $type")
    }
}

class Icebreaker1(
    shipName: String,
    val purpose: String,
    val iceClass: String,
) : Liner1(shipName) {
    val isBreakIce: Boolean = true
    override val speed: Float = 10.12f
    override val crew: Int = 350
    override val liftingCapacity: Long = 62000
    override val passengerCapacity: Int = 100

    override fun loadShip() {
        println("$shipName открывает ворота со стороны кормы")
    }

    override fun printShipInfo() {
        super.printShipInfo()
        println("""
        |Назначение: $purpose
        |Класс: $iceClass
        """.trimMargin())
    }
}

fun main() {
    val liner1 = Liner1(
        "Лайнер Михалыч",
    )
    val cargoShip1 = CargoShip1(
        "Грузовой Филипок",
        "Танкер",
    )
    val iceBreaker1 = Icebreaker1(
        "Ледокол Рубака",
        "Вспомогательные",
        "Icebreaker4",
    )

    liner1.loadShip()
    cargoShip1.loadShip()
    iceBreaker1.loadShip()
    println()

    liner1.printShipInfo()
    println()
    cargoShip1.printShipInfo()
    println()
    iceBreaker1.printShipInfo()
}