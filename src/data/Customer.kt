package data

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

// jika membuat primray constuctor maka wajib memanggil primary constructor parent
// dan jika membuat primary constructor maka tidak lagi ada keyword super
class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance) {
    constructor(name: String) : this(name, 0)
}