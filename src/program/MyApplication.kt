package program

import annotations.Fancy

@Fancy("Syafiq")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Appliaction $name-$version"
}