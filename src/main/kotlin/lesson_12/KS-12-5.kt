package org.example.lesson_12

import java.util.Locale
import kotlin.math.roundToInt
import kotlin.random.Random

const val ABSOLUTE_ZERO: Float = 273.15f
const val ZERO = 0

class Weather5(
    daytimeTemperature5: Int,
    nighttimeTemperature5: Int,
    isRainfall5: Boolean,
) {
    val rainfall5: String
    val daytimeTemperature5Celsius: Int
    val nighttimeTemperature5Celsius: Int

    init {
        require(daytimeTemperature5 >= ZERO && nighttimeTemperature5 >= ZERO) {
            "Температура в Кельвинах не может быть отрицательной"
        }
        daytimeTemperature5Celsius = (daytimeTemperature5 - ABSOLUTE_ZERO).roundToInt()
        nighttimeTemperature5Celsius = (nighttimeTemperature5 - ABSOLUTE_ZERO).roundToInt()
        rainfall5 = if (isRainfall5) "Да" else "Нет"
        println(
            """
        Дневная температура: $daytimeTemperature5Celsius
        Ночная температура: $nighttimeTemperature5Celsius
        Осадки: $rainfall5
        
        """.trimIndent()
        )
    }
}

fun main() {
    val weatherForMonth: List<Weather5> = List(30) {
        Weather5(
            daytimeTemperature5 = simulateSensor(),
            nighttimeTemperature5 = simulateSensor(),
            isRainfall5 = Random.nextBoolean()
        )
    }

    println("Дневные температуры: ")
    val dayTemperature = weatherForMonth.map { it.daytimeTemperature5Celsius }
    println(dayTemperature)

    println("Ночные температуры: ")
    val nightTemperature = weatherForMonth.map { it.nighttimeTemperature5Celsius }
    println(nightTemperature)

    val daysWithRainfalls = weatherForMonth.count { it.rainfall5 == "Да" }
    println("Дней с осадками: $daysWithRainfalls")

    val middleDayTemperature = "%.2f".format(Locale.US, dayTemperature.average())
    println("Средняя дневная температура: $middleDayTemperature")

    val middleNightTemperature = "%.2f".format(Locale.US, nightTemperature.average())
    println("Средняя ночная температура: $middleNightTemperature")
}

fun simulateSensor() = (281..317).random()