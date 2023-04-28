package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Syafiq"))
    a()
    b()

    Application.Util.hello("Syafiq")

    Application.Companion.toUpper("Fajrian")
    // keuntungan menggunkan companion kita bisa langsung memanggil function nya
    Application.toUpper("Emha")
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}