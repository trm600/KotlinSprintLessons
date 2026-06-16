package org.example.lesson_15

abstract class Product(val name: String, val quantityInStock: Int)

interface Searchable {
    fun search() {
        println("Выполняется поиск")
    }
}

class MusicalInstrument(name: String, quantityInStock: Int) : Product(name, quantityInStock), Searchable

class Component(name: String, quantityInStock: Int) : Product(name, quantityInStock)

fun main() {
    val instrument = MusicalInstrument("Гитара", 5)
    instrument.search()
}