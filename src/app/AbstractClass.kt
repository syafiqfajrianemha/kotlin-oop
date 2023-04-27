package app

import data.City
import data.Country
import data.Location

fun main() {
    // val location = Location("Jakarta") // ERROR

    val city = City("Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}