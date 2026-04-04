package org.example.lesson_4_comparison_operators

const val FAVORABLE_AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " + "${
            isSunnyWeather && isAwningOpen && airHumidity == FAVORABLE_AIR_HUMIDITY && timeOfYear != UNFAVORABLE_SEASON
        }"
    )
}