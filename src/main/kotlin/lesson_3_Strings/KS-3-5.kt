package org.example.lesson_3_Strings

fun main() {
    val currentMove = "D2-D4;0"
    val listOfParameter = currentMove.split("-", ";")
    val moveFrom = listOfParameter[0]
    val moveWhere = listOfParameter[1]
    val moveNumber = listOfParameter[2]

    println(moveFrom)
    println(moveWhere)
    println(moveNumber)
}