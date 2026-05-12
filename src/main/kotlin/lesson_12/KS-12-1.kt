package org.example.lesson_12

class Weather() {
    var daytimeTemperature: String = "none"
    var nighttimeTemperature: String = "none"
    var presenceOfPrecipitation: String = "none"

    fun printInfo() {
        println(
            """
        Дневная температура: $daytimeTemperature
        Ночная температура: $nighttimeTemperature
        Осадки: $presenceOfPrecipitation
        """.trimIndent()
        )
    }
}

fun main() {
    val day1 = Weather()
    val day2 = Weather()
    day1.daytimeTemperature = "20"
    day1.nighttimeTemperature = "10"
    day1.presenceOfPrecipitation = "Дождь"
    day2.daytimeTemperature = "25"
    day2.nighttimeTemperature = "14"
    day2.presenceOfPrecipitation = "Нет"
    day1.printInfo()
    println()
    day2.printInfo()
}