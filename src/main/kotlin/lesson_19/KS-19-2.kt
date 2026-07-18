package org.example.lesson_19

enum class Category {

    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getName(): String {
        return when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }

}

class Product(val name: String, val id: Int, val category: Category) {

    fun printInfo() {
        println(
            """
            Id: $id
            Товар: $name
            Категория: ${category.getName()}
          
        """.trimIndent()
        )
    }

}

fun main() {

    val products = listOf(
        Product("Рубашка", 1234, Category.CLOTHING),
        Product("Степлер", 1383, Category.STATIONERY),
        Product("Теннисная ракетка", 4234, Category.MISCELLANEOUS),
        Product("Брюки", 1235, Category.CLOTHING),
    )

    products.forEach { it.printInfo() }

}