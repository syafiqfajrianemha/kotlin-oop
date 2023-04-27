package app

import data.Person

/**
 * Membuat Object di Kotlin sangat mudah, mirip seperti memanggil function,
 * dengan menggunakan nama class
 * Di Kotlin, tidak butuh kata kunci khusus untuk membuat Object,
 * misal jika di Java kita butuh menggunakan kata kunci new untuk membuat Object
 */
fun main() {
    val syafiq = Person()
    syafiq.firstName = "Syafiq"

    val ana = Person()
    ana.firstName = "Erdiana"

    println(syafiq.firstName)
    println(ana.firstName)
}