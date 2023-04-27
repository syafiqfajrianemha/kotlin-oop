package data

/**
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah
 * class ke class lain
 * Dalam artian, kita bisa membuat class Parent dan class Child
 * Di Kotlin, tiap class Child, hanya bisa punya satu class Parent,
 * namun satu class Parent bisa punya banyak class Child
 * Secara standar, di class yang dibuat di Kotlin adalah final (tidak bisa diwariskan), agar bisa diwariskan,
 * kita harus menggunakan kata kunci open
 */
open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    /**
     * Function Overriding adalah kemampuan membuat ulang function yang sudah ada di class Parent
     * Secara standar, function di class adalah final, tidak bisa dibuat ulang di class Child
     * Agar function bisa dibuat ulang di class Child, kita harus menggunakan kata kunci open
     */
    final override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
    // ERROR
    /*override fun sayHello(name: String) {
        println("Hello $name, My Name is Super Manager ${this.name}")
    }*/
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice President ${this.name}")
    }
}
