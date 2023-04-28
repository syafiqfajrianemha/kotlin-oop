package app

import data.Boss

fun main() {
    val bossSyafiq = Boss("Syafiq")

    val budi = bossSyafiq.Employee("Budi")
    budi.hi()

    val joko = bossSyafiq.Employee("Joko")
    joko.hi()
}