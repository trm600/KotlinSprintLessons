package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isCanDisembark: Boolean,
)

open class Planet(
    name: String,
    isAtmosphere: Boolean,
    isCanDisembark: Boolean,
    val satellitesList: List<Satellite> = listOf(),
) : CelestialBody(name, isAtmosphere, isCanDisembark) {

    fun printInfo() {
        println("Планета: \n$name")
        println("Спутники:")
        if (satellitesList.isNotEmpty()) {
            for (satellite in satellitesList) {
                println(satellite.name)
            }
        } else {
            println("Спутников нет.")
        }
    }
}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isCanDisembark: Boolean,
) : CelestialBody(name, isAtmosphere, isCanDisembark)

fun main() {
    val planet = Planet(
        "Марс",
        isAtmosphere = true,
        isCanDisembark = true,
        satellitesList = listOf(
            Satellite("Фобос", isAtmosphere = false, isCanDisembark = false),
            Satellite("Деймос", isAtmosphere = false, isCanDisembark = false),
        ),
    )

    planet.printInfo()
}