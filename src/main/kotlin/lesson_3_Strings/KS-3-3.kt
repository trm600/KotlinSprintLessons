package org.example.lesson_3_Strings

fun main() {
    val factor: Byte = 7
    var i: Byte = 1

    println("""
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i++}
        |$factor x $i = ${factor * i}
    """.trimMargin())
}