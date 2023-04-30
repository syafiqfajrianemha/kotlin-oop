package app

import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int) : MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 1_000_000)
    // val name = game.name
    // val price = game.price
    val (name, price) = game
    println(name)
    println(price)

    // Destructuring di Function
    // val result = minmax(1000, 100)
    // println("Terkecil: ${result.min}")
    // println("Terbesar: ${result.max}")
    val (min, max) = minmax(100, 10)
    println("Terkecil: $min")
    println("Terbesar: $max")

    // Destructuring Lambda Parameter
    var request = Login("Syafiq", "Rahasia")
    /*login(request) {login ->
        request.username == "Syafiq" && request.password == "Rahasia"
    }*/
    var loginSuccess = login(request) {(username, password) ->
        username == "Syafiq" && password == "Rahasia"
    }
    println(loginSuccess)
}