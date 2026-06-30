package org.example.lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun calculateCircumference() = 2 * pi * radius

    fun calculateCircleArea() = pi * (radius * radius)
}

fun main() {
    val circle = Circle(11.1)

    println("Площадь равна: ${"%.2f".format(circle.calculateCircleArea())}")
    println("Длина окружности равна: ${"%.2f".format(circle.calculateCircumference())}")
}