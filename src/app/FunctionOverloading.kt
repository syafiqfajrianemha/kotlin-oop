package app

import data.Person

fun main() {
    val syafiq = Person()
    syafiq.firstName = "Syafiq"

    syafiq.sayHello("Budi")
    syafiq.sayHello("Joko", "Nugroho")
}