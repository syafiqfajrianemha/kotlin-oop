package data

/**
 * Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
 * Interface adalah blueprint, prototype atau cetakan di Kotlin
 * Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
 * Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class - class turunannya
 * Secara standar, semua properties dan function di Interface adalah abstract
 */
interface Interaction {
    val name: String

    /**
     * Function di Interface memiliki pengecualian, tidak harus abstract
     * Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya
     * Sehingga kita tidak wajib meng-ovveride diclass turunannya
     */
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction {
    fun go() {
        println("Go ${this.name}")
    }
}

// super class hanya boleh satu
// tetapi jika super interface bisa banyak
open class Contoh

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

/**
 * Inheritance di Class hanya boleh memiliki satu class Parent
 * Di Interface, sebuah class Child bisa memiliki banyak interface Parent
 */
class Human(override val name: String) : Contoh(), Interaction, Go, MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}