package app

import data.Televesion

fun main() {
    val tv = Televesion()
    // println(tv.brand) // error

    // kita harus set terlebih dahulu value properties brandnya baru kita bisa akses
    tv.initTelevsion("Samsung")
    println(tv.brand)

    // kita juga bisa langsung set value tanpa menggunakan function
    tv.brand = "LG"
    println(tv.brand)
}