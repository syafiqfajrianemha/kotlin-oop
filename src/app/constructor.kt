package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2010

    val almaz = Car("Wuling", "Almaz")

    println("Avanza brand: ${avanza.brand}, year: ${avanza.year}")
    println("Almaz brand: ${almaz.brand}, year: ${almaz.year}")
}