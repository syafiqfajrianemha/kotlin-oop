package app

import data.User

/**
 * Kotlin mendukung deklarasi properties langsung di primary constructor
 * Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties,
 * dan mengisi datanya lewat constructor
 */
fun main() {
    val user1 = User("Syafiq", "rahasia")
    val user2 = User("emha", "12345")

    user1.username = "budi"
    user1.password = "321"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}