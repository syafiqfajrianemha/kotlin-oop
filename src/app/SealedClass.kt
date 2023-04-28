package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    /**
     * Sealed class sangat berguna saat kita menggunakan when expression
     * Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check
     */
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 + value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10,10, Plus()))
    println(operation(10,5, Minus()))
    println(operation(10, 3, Modulo()))
}