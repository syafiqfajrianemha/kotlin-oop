package app

import data.Address

/**
 * Kotlin mendukung pembuatan constructor lebih dari satu
 * Constructor yang utama yang terdapat di Class,
 * disebut primary constructor, constructor tambahan yang bisa kita buat lagi
 * adalah secondary constructor
 * Saat membuat constructor, kita wajib memanggil primary constructor
 * jika ada primary constructor
 */
fun main() {
    val address1 = Address("jl. Jalan", "Jakarta")
    val address2 = Address("jl. Jalan-Jalan", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}