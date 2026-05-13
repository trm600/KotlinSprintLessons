package org.example.lesson_12

import kotlin.math.roundToInt
import kotlin.random.Random

const val ABSOLUTE_ZERO: Float = 273.15f

class Weather5(
    daytimeTemperature5: Int,
    nighttimeTemperature5: Int,
    isRainfall5: Boolean,
) {
    val rainfall5: Boolean
    val daytimeTemperature5Celsius: Int
    val nighttimeTemperature5Celsius: Int

    init {
        require(daytimeTemperature5 >= 0 && nighttimeTemperature5 >= 0) {
            "Температура в Кельвинах не может быть отрицательной"
        }
        daytimeTemperature5Celsius = (daytimeTemperature5 - ABSOLUTE_ZERO).roundToInt()
        nighttimeTemperature5Celsius = (nighttimeTemperature5 - ABSOLUTE_ZERO).roundToInt()
        rainfall5 = isRainfall5
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

    val daysWithRainfalls = weatherForMonth.count { it.rainfall5 }
    println("Дней с осадками: $daysWithRainfalls")

    val dayTemperature = weatherForMonth.map { it.daytimeTemperature5Celsius }
    val middleDayTemperature = dayTemperature.average().roundToInt()
    println("Средняя дневная температура: $middleDayTemperature")

    val nightTemperature = weatherForMonth.map { it.nighttimeTemperature5Celsius }
    val middleNightTemperature = nightTemperature.average().roundToInt()
    println("Средняя ночная температура: $middleNightTemperature")
}

fun simulateSensor() = (281..317).random()