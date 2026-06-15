package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun toDisplayString(): String
}

class Temperature(val temperature: Int) : WeatherStationStats() {
    override fun toDisplayString(): String = "Температура: $temperature°C"
}

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats() {
    override fun toDisplayString(): String = "Осадки: $precipitation мм"
}

class WeatherServer {

    fun sendMessage(data: WeatherStationStats) {
        println(data.toDisplayString())
    }
}

fun main() {
    val temperature = Temperature(25)
    val precipitation = PrecipitationAmount(10)
    val message = WeatherServer()
    message.sendMessage(temperature)
    message.sendMessage(precipitation)
}