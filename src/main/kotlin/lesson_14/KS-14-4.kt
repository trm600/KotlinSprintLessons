package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val canDisembark: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    canDisembark: Boolean,
    val satellites: List<Satellite> = listOf(),
) : CelestialBody(name, hasAtmosphere, canDisembark) {

    fun printInfo() {
        println("Планета: \n$name")
        println("Спутники:")
        if (satellites.isNotEmpty()) {
            for (satellite in satellites) {
                println(satellite.name)
            }
        } else {
            println("Спутников нет.")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    canDisembark: Boolean,
) : CelestialBody(name, hasAtmosphere, canDisembark)

fun main() {
    val planet = Planet(
        "Марс",
        hasAtmosphere = true,
        canDisembark = true,
        satellites = listOf(
            Satellite("Фобос", hasAtmosphere = false, canDisembark = false),
            Satellite("Деймос", hasAtmosphere = false, canDisembark = false),
        ),
    )

    planet.printInfo()
}