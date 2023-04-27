package app

import data.Handphone
import data.Laptop

/**
 * Dalam Object Oriented Programming, kita akan bertemu dengan banyak sekali tipe data (class) dan pewarisan (inheritance)
 * Kadang kita butuh melakukan pengecekan tipe data, atau bahkan melakukan konversi data
 */
fun printObject(any: Any) {
    /**
     * is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
     * !is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu
     */
    if(any is Laptop) {
        /**
         * Kotlin memiliki mekanisme konversi data secara otomatis setelah kita melakukan pengecekan menggunakan is
         * Setelah kita melakukan pengecekan menggunakan is, maka secara otomatis tipe data yang kita cek akan berubah menjadi tipe data yang kita check
         */
        // println("Laptop ${any.name}")
    } else if(any is Handphone) {
        // println("Handphone ${any.name}")
    } else {
        println(any)
    }
}

/**
 * Selain menggunakan If untuk melakukan pengecekan tipe data dan konversi tipe data
 * Kita juga bisa menggunakan when expression
 * Penggunaan when expression akan lebih sederhana dibanding if expression dalam melakukan pengecekan dan konversi tipe data
 */
fun printObjectWithWhen(any: Any) {
    when(any) {
        // is Laptop -> println("Laptop ${any.name}")
        // is Handphone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

/**
 * Kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
 * Namun konversi menggunakan as sangat tidak aman jika ternyata tipe datanya tidak sesuai
 */
fun printString(any: Any) {
    val value = any as String
    println(value)
}

/**
 * Penggunaan as sangat tidak aman, namun kadang bisa menjadikannya aman, dengan menggunakan kata kunci as?
 * Dengan menggunakan kata kunci as? secara otomatis jika gagal melakukan konversi, akan diubah menjadi null
 */
fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Syafiq")
    printObject(1)
    printObject(Laptop("Asus"))
    printObject(Handphone("Samsung"))

    printString("Syafiq") // success
    printString(1) // error: ClassCastException

    printStringSafe("Syafiq") // success
    printStringSafe(1) // null
}