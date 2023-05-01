package app

/**
 * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Polymorphism erat hubungannya dengan Inheritance
 */
import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Syafiq")
    employee.sayHello("Budi")

    employee = Manager("Syafiq")
    employee.sayHello("Budi")

    employee = VicePresident("Syafiq")
    employee.sayHello("Budi")
}