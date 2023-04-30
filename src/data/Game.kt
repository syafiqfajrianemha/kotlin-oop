package data

/**
 * Destructuring declaration adalah membuat multiple variables dari sebuah object
 * Destructuring tidak bisa dilakukan untuk semua object,  hanya objek yang memiliki function componentX() yang bisa dilakukan destructuring
 * Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameter nya
 */
data class Game(val name: String, val price: Int) {
    // manual
    // operator fun component1(): String = name
    // operator fun component2(): Int = price
}