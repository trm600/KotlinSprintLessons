package org.example.lesson_14

import kotlin.math.PI

const val COLOR_BLACK = "Черный"
const val COLOR_WHITE = "Белый"

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea() = PI * radius * radius
    override fun calculatePerimeter() = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateArea() = width * height
    override fun calculatePerimeter() = (width + height) * 2
}

fun main() {
    val figures = listOf(
        Circle(COLOR_BLACK, 5.0),
        Rectangle(COLOR_WHITE, 15.0, 23.5),
        Circle(COLOR_BLACK, 6.6),
        Rectangle(COLOR_WHITE, 24.7, 23.6)
    )
    val sumBlackPerimeter = "%.2f".format(
        figures
            .filter { it.color.lowercase() == "черный" }
            .sumOf { it.calculatePerimeter() }
    )
    val sumWhiteArea = "%.2f".format(
        figures
            .filter { it.color.lowercase() == "белый" }
            .sumOf { it.calculateArea() }
    )

    println("Сумма периметров чёрных фигур: $sumBlackPerimeter")
    println("Сумма площадей белых фигур: $sumWhiteArea")
}