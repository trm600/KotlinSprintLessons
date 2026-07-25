package org.example.lesson_21

import java.io.File

fun File.writeFormatedWord(wordToWrite: String) {

    val existingContent = if (exists()) readText() else ""

    writeText("${wordToWrite.lowercase()}\n$existingContent")
    println("Слово $wordToWrite записано в файл $name \n")

}

fun main() {

    val file = File("EnglishWords.txt")

    file.writeFormatedWord("Move")
    file.writeFormatedWord("Girl")
    file.writeFormatedWord("Rice")

    println(file.readText())

}