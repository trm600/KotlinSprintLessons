package org.example.lesson_4_comparison_operators

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_CAPACITY = 100


fun main() {
    var weight = 20
    var capacity = 80

    println("Груз с весом $weight кг и объемом $capacity л " +
            "соответствует категории 'Average': " +
            "${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && capacity < MAX_CAPACITY}")
    weight = 50
    capacity = 100
    println("Груз с весом $weight кг и объемом $capacity л " +
            "соответствует категории 'Average': " +
            "${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && capacity < MAX_CAPACITY}")}