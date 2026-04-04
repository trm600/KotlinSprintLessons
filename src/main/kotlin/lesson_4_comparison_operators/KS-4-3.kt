package org.example.lesson_4_comparison_operators

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
    "${isSunnyWeather && isAwningOpen && airHumidity == 20 && !(timeOfYear.equals("зима", ignoreCase = true))}")
}