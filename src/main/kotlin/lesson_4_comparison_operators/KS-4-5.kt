package org.example.lesson_4_comparison_operators

fun main() {
    val isBodyDamaged: Boolean
    val numberOfCrew: Int
    val provisionsBoxes: Int
    val isGoodWeather: Boolean
    val canVoyage: Boolean
    val canVoyageAlt: Boolean

    print("Корпус повреждён?: ")
    isBodyDamaged = readln().toBoolean()
    print("Число экипажа: ")
    numberOfCrew = readln().toInt()
    print("Число ящиков с провизией: ")
    provisionsBoxes = readln().toInt()
    print("Погода хорошая?: ")
    isGoodWeather = readln().toBoolean()
    canVoyage = !isBodyDamaged && numberOfCrew in 55..70 && provisionsBoxes > 50
    canVoyageAlt = numberOfCrew == 70 && isGoodWeather && provisionsBoxes >= 50
    print("Корабль может отплыть?: ")
            when (canVoyage || canVoyageAlt) {
                true -> print("Да")
                false ->print("Нет")
            }
}
