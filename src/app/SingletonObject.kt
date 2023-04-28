package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Syafiq"))
    a()
    b()

    Application.Util.hello("Syafiq")
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}