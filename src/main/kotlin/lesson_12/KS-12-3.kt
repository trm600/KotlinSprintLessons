package org.example.lesson_12

import kotlin.math.roundToInt

const val ABSOLUTE_ZERO: Float = 273.15f

class Weather3(
    daytimeTemperature3: Int,
    nighttimeTemperature3: Int,
    isRainfall3: Boolean,
) {
    val rainfall3: String
    val daytimeTemperature3Celsius: Int
    val nighttimeTemperature3Celsius: Int


    init {
        rainfall3 = if (isRainfall3) "Да" else "Нет"
        daytimeTemperature3Celsius = (daytimeTemperature3 - ABSOLUTE_ZERO).roundToInt()
        nighttimeTemperature3Celsius = (nighttimeTemperature3 - ABSOLUTE_ZERO).roundToInt()
    }

    fun printInfo3() {
        println(
            """
        Дневная температура: $daytimeTemperature3Celsius
        Ночная температура: $nighttimeTemperature3Celsius
        Осадки: $rainfall3
        """.trimIndent()
        )
    }
}

fun main() {
    val day3 = Weather3(
        daytimeTemperature3 = 301,
        nighttimeTemperature3 = 290,
        isRainfall3 = false,
    )
    day3.printInfo3()
}
