package org.example.lesson_12

import kotlin.math.roundToInt

const val ABSOLUTE_ZERO: Float = 273.15f
const val ZERO = 0

class Weather4(
    daytimeTemperature4: Int,
    nighttimeTemperature4: Int,
    isRainfall4: Boolean,
) {
    val rainfall4: String
    val daytimeTemperature4Celsius: Int
    val nighttimeTemperature4Celsius: Int

    init {
        require(daytimeTemperature4 >= ZERO && nighttimeTemperature4 >= ZERO) {
            "Температура в Кельвинах не может быть отрицательной"
        }
        daytimeTemperature4Celsius = (daytimeTemperature4 - ABSOLUTE_ZERO).roundToInt()
        nighttimeTemperature4Celsius = (nighttimeTemperature4 - ABSOLUTE_ZERO).roundToInt()
        rainfall4 = if (isRainfall4) "Да" else "Нет"
        println(
            """
        Дневная температура: $daytimeTemperature4Celsius
        Ночная температура: $nighttimeTemperature4Celsius
        Осадки: $rainfall4
        """.trimIndent()
        )
    }
}

fun main() {
    val day4 = Weather4(
        daytimeTemperature4 = 301,
        nighttimeTemperature4 = 290,
        isRainfall4 = false,
    )
}
