package data

/**
 * Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
 * Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
 * Secara standar visibility modifiers di kotlin adalah public
 */
open class Teacher(internal val name: String) {
    private fun teach() {
        println("Teach!")
    }

    open protected fun test() {
        println("Test")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    override public fun test() {
        super.test()
    }
}