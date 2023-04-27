package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Syafiq")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Ana")
    vicePresident.sayHello("Joko")
}