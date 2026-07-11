package org.example.lesson_17

class Folder(name: String, numberOfFiles: Int, var isSecret: Boolean = false) {
    var name = name
        get() = if (isSecret) "скрытая папка" else field

    var numberOfFiles = numberOfFiles
        get() = if (isSecret) 0 else field
}

fun main() {
    val personal = Folder(name = "Моё", numberOfFiles=27, isSecret = true)
    println(personal.name)
    println(personal.numberOfFiles)
}