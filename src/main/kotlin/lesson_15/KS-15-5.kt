package org.example.lesson_15

const val TRUCK_PASSENGER_MAX = 1
const val TRUCK_CARGO_MAX = 2000
const val PASSENGER_CAR_PASSENGER_MAX = 3

interface Riding {
    val transportName: String
    fun drive() {
        println("Автомобиль $transportName поехал.")
    }

    fun stop() {
        println("Автомобиль $transportName остановился.")
    }
}

interface TransportingPassenger {
    val transportName: String
    fun seatPassenger(passengerName: String) {
        println("Пассажир $passengerName сел в автомобиль $transportName")
    }

    fun passengerDisembarkation(passengerName: String) {
        println("Пассажир $passengerName вышел из автомобиля $transportName")
    }
}

interface TransportingGoods {
    val transportName: String
    fun loadCargo(cargoName: String, value: Int) {
        println("Груз $cargoName загружен в автомобиль $transportName в количестве $value кг")
    }

    fun unloadCargo(cargoName: String, value: Int) {
        println("Груз $cargoName выгружен из автомобиля $transportName в количестве $value кг")
    }
}

class Truck(override val transportName: String) : TransportingPassenger, TransportingGoods, Riding {
    private var passengerValue = 0
    private var cargoValue = 0

    override fun loadCargo(cargoName: String, value: Int) {
        if (cargoValue + value <= TRUCK_CARGO_MAX) {
            super.loadCargo(cargoName, value)
            cargoValue += value
        } else {
            println(
                "В $transportName больше не влезет, " +
                        "груз $cargoName в количестве $value кг не будет погружен!"
            )
        }
    }

    override fun unloadCargo(cargoName: String, value: Int) {
        if (value <= cargoValue) {
            super.unloadCargo(cargoName, value)
            cargoValue -= value
        } else {
            println("Автомобиль $transportName полностью разгружен и пуст.")
            cargoValue = 0
        }
    }

    override fun seatPassenger(passengerName: String) {
        if (passengerValue < TRUCK_PASSENGER_MAX) {
            super.seatPassenger(passengerName)
            ++passengerValue
        } else {
            println("В $transportName пассажиров больше не влезет!")
        }

    }

    override fun passengerDisembarkation(passengerName: String) {
        if (passengerValue > 0) {
            super.passengerDisembarkation(passengerName)
            --passengerValue
        } else {
            println("Все пассажиры вышли!")
        }
    }
}

class PassengerCar(override val transportName: String) : TransportingPassenger, Riding {
    private var passengerValue = 0

    override fun seatPassenger(passengerName: String) {
        if (passengerValue < PASSENGER_CAR_PASSENGER_MAX) {
            super.seatPassenger(passengerName)
            ++passengerValue
        } else {
            println("В $transportName пассажиров больше не влезет!")
        }

    }

    override fun passengerDisembarkation(passengerName: String) {
        if (passengerValue > 0) {
            super.passengerDisembarkation(passengerName)
            --passengerValue
        } else {
            println("Все пассажиры вышли!")
        }
    }
}

fun main() {
    val t = Truck("Камаз")
    val t2 = Truck("Зил")
    val c = PassengerCar("Лада")
    val c2 = PassengerCar("Крузак")

    t.seatPassenger("Димон")
    t.loadCargo("Уголь", 500)
    t.loadCargo("Уголь", 1600)
    t.drive()
    t.stop()
    t.unloadCargo("Уголь", 500)
    t.passengerDisembarkation("Димон")
    println()
    c.seatPassenger("Петрович")
    c.seatPassenger("Семеныч")
    c.seatPassenger("Викторыч")
    c.drive()
    c.stop()
    c.passengerDisembarkation("Петрович")
    c.passengerDisembarkation("Семеныч")
    c.passengerDisembarkation("Викторыч")
    println()
    c2.seatPassenger("Генадич")
    c2.drive()
    c2.stop()
    c2.passengerDisembarkation("Петрович")
    println()
    t2.seatPassenger("Степаныч")
    t2.loadCargo("Картоха", 1500)
    t2.drive()
    t2.stop()
    t2.unloadCargo("Картоха", 1500)
    t2.passengerDisembarkation("Степаныч")
}