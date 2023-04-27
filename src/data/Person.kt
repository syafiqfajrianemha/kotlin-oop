package data

class Person() {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        // this keyword
        println("Hello $name, my names ${this.firstName}")
    }

    /**
     * Function Overloading adalah kemampuan membuat function dengan nama yang sama di dalam class
     * Untuk membuat function dengan nama yang sama, kita wajib menggunakan parameter yang berbeda,
     * bisa tipe parameter yang berbeda, atau jumlah parameter yang berbeda
     */
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my names ${this.firstName}")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}