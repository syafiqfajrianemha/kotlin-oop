package app

import data.Company

fun main() {
    val company1 = Company("emha")
    val company2 = Company("emha")
    val company3 = Company("fajrian")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company3.hashCode())
    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company3.hashCode())
}