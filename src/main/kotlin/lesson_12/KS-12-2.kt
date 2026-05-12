package org.example.lesson_12

class Weather2(
    val daytimeTemperature2: Int,
    val nighttimeTemperature2: Int,
    val isRainfall: Boolean,
) {
    val rainfall: String

    init {
        rainfall = if (isRainfall) "Да" else "Нет"
    }

    fun printInfo2() {
        println(
            """
        Дневная температура: $daytimeTemperature2
        Ночная температура: $nighttimeTemperature2
        Осадки: $rainfall
        """.trimIndent()
        )
    }
}

fun main() {
    val day1 = Weather2(
        daytimeTemperature2 = 28,
        nighttimeTemperature2 = 21,
        isRainfall = true,
    )
    day1.printInfo2()
}