package data

open class Shape {
    open val corner: Int = -1

    open fun printName() {
        println("This is Shape")
    }
}

/**
 * Selain membuat ulang function di class Child, di Kotlin juga kita bisa membuat ulang properties
 * Secara standar, properties di class bersifat final, tidak bisa di buat ulang di class Child nya,
 * agar bisa dibuat ulang, kita harus menggunakan kata kunci open
 */
open class Rectangle : Shape() {
    override val corner: Int = 4
    /**
     * Kadang kita ingin mengakses function atau properties milik class Parent yang sudah dibuat ulang oleh class Child
     * Untuk mengakses function  atau properties milik class Parent, kita bisa menggunakan kata kunci super
     */
    val parentCorner: Int = super.corner

    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

class Triangle : Rectangle() {
    override val corner: Int = 3
}