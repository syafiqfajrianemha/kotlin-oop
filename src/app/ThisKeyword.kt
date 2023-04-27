package app

import data.Person

/**
 * this adalah keyword yang bisa digunakan untuk mereferensikan object saat ini
 * this hanya bisa digunakan di dalam class itu sendiri
 * Biasanya, this digunakan untuk mengakses properties yang tertutup oleh
 * parameter dengan nama yang sama
 */
fun main() {
    val syafiq = Person()
    syafiq.firstName = "Syafiq"

    syafiq.sayHello("Budi", "Nugroho")
}