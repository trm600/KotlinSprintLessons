package org.example.lesson_7

import kotlin.random.Random

const val PASSWORD_SIZE = 6
const val LETTERS_MAKING_KIT = "abcdefghijklmnopqrstuvwxyz"
const val NUMBERS_MAKING_KIT = "0123456789"


fun main() {
    var pass = ""

    for (i in 1..PASSWORD_SIZE) {
        pass += if (i % 2 == 0) {
            NUMBERS_MAKING_KIT[Random.nextInt(NUMBERS_MAKING_KIT.length)]
        } else {
            LETTERS_MAKING_KIT[Random.nextInt(LETTERS_MAKING_KIT.length)]
        }
    }
    println(pass)
}