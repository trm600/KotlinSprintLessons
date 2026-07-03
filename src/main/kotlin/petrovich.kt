package org.example

class Cart {
    private val items = mutableListOf<String>()
    private var isOrdered = false

    fun add(item: String) {
        if (isOrdered) {
            println("Заказ уже оформлен")
            return
        }
        items.add(item)
        println("Добавлено: $item")
    }

    fun checkout() {
        if (items.isEmpty()) {
            println("Корзина пуста")
            return
        }
        isOrdered = true
        println("Заказ оформлен: ${items.size} товар(а)")
    }
}

fun main() {
    val cart = Cart()
    cart.add("Кофе")
    cart.add("Сахар")
    cart.checkout()
    cart.add("Молоко")  // уже оформлен!
}