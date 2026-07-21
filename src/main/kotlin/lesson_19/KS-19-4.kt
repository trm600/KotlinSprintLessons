package org.example.lesson_19

enum class CartridgeType(val damage: Int, val nameRus: String) {

    BLUE(5, "синие"),
    GREEN(10, "зелёные"),
    RED(20, "красные"),
    ;

}

class Tank(val name: String) {

    private var damage = 0

    fun loadAmmo(ammoType: CartridgeType) {

        damage = ammoType.damage

        println("\nЗагружены ${ammoType.nameRus} боеприпасы!")

    }

    fun shoot() {

        if (damage == 0) {
            println("Стрелять нечем, $name не заряжен!")
        } else {
            println("Танк $name произвёл выстрел! Урон: $damage единиц!")
            damage = 0
        }

    }

}

fun main() {

    val t1 = Tank("T-90")
    t1.shoot()
    t1.loadAmmo(CartridgeType.BLUE)
    t1.shoot()
    t1.loadAmmo(CartridgeType.GREEN)
    t1.shoot()
    t1.shoot()
    t1.shoot()
    t1.loadAmmo(CartridgeType.RED)
    t1.shoot()
    t1.loadAmmo(CartridgeType.BLUE)
    t1.shoot()

}