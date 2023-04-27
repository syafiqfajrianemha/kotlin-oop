package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Syafiq")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Budi", 10_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}