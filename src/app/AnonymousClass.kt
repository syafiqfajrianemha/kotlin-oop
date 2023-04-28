package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())

    /**
     * Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang  lengkap
     * Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
     * Bahkan, di Kotlin, kisa bisa membuat object dari interface
     * Kemampuan ini dinamakan anonymous class
     * Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan deklarasi class Child seperti pada pewarisan
     */
    fireAction(object : Action {
        override fun action() = println("Anonymous class: Action One")
    })
    fireAction(object : Action {
        override fun action() {
            println("Anonymous class: Action Two")
        }
    })
}