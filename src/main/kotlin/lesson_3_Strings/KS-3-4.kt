package org.example.lesson_3_Strings

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1u
    var moveMade = "$moveFrom-$moveTo;$moveNumber"

    println(moveMade)
    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2u
    moveMade = "$moveFrom-$moveTo;$moveNumber"
    println(moveMade)
}