package app

import data.Laptop

/**
 * Di Kotlin, semua class yang kita buat tanpa class Parent,
 * sebenarnya secara otomatis dia akan menjadi class child dari class Any
 * Any adalah superclass untuk semua class yang kita buat di Kotlin
 */
fun main() {
    val laptop = Laptop("Asus")
    println(laptop.toString())
    println(laptop.hashCode())
}