package org.example.lesson_3_Strings

fun main() {
    val factor: Byte = 7
    var counter: Byte = 1

    println("""
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter++}
        |$factor x $counter = ${factor * counter}
    """.trimMargin())
}