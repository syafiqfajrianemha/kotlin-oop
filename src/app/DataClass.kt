package app

import data.Product

fun main() {
    val product = Product("Indomie", 2_500, "Food")
    println(product)

    /**
     * Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
     * Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya
     */
    val product2 = product.copy(name = "Supermie")
    println(product2)
}