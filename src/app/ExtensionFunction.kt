package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val syafiq = Student("Syafiq", 19)
    syafiq.sayHello("Budi")
    println(syafiq?.upperName)
}