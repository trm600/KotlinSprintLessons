package org.example.lesson_18

class Order(val orderNumber: Int) {

    fun printInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun printInfo(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }

}

fun main() {

    val order1 = Order(123)
    val order2 = Order(345)

    order1.printInfo("Meat")
    order2.printInfo(listOf("Eggs", "Salt", "Pepper"))

}