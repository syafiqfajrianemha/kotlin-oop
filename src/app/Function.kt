package app

import data.Person

/**
 * Selain Properties / Fields / Attributes, di dalam Class,
 * kita juga bisa mendeklarasikan Function
 * Function yang kita deklarasikan di dalam Class,
 * secara otomatis menjadi behaviour si object yang dibuat dari class tersebut
 */
fun main() {
    val syafiq = Person()
    syafiq.firstName = "Syafiq"
    syafiq.middleName = "Fajrian"
    syafiq.lastName = "Emha"

    syafiq.sayHello("Budi")
    println(syafiq.getFullName())
}