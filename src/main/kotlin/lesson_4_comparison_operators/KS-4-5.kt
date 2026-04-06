package org.example.lesson_4_comparison_operators

const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val MINIMUM_PROVISIONS = 50


fun main() {
    val isBodyDamaged: Boolean
    val numberOfCrew: Int
    val provisionsBoxes: Int
    val isGoodWeather: Boolean
    val canVoyage: Boolean
    val canVoyageAlt: Boolean
    val isMinorDamage: Boolean

    print("Корпус повреждён?: ")
    isBodyDamaged = readln().toBoolean()
    print("Повреждения незначительные?: ")
    isMinorDamage = readln().toBoolean()
    print("Число экипажа: ")
    numberOfCrew = readln().toInt()
    print("Число ящиков с провизией: ")
    provisionsBoxes = readln().toInt()
    print("Погода хорошая?: ")
    isGoodWeather = readln().toBoolean()
    canVoyage = !isBodyDamaged &&
            numberOfCrew in MINIMUM_CREW..MAXIMUM_CREW &&
            provisionsBoxes > MINIMUM_PROVISIONS
    canVoyageAlt = numberOfCrew == MAXIMUM_CREW &&
            isGoodWeather &&
            provisionsBoxes >= MINIMUM_PROVISIONS &&
            (isBodyDamaged && isMinorDamage)
    println(canVoyage || canVoyageAlt)
}
