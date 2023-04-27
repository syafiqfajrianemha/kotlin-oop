package data

/**
 * Saat kita membuat class yang abstract, kita bisa membuat properties abstract dan function abstract di dalam class tersebut
 * Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class Child nya
 */
abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Eshan"
    override fun run() {
        println("Cat run $name")
    }
}

class Dog : Animal() {
    override val name: String = "Tom"
    override fun run() {
        println("Dog run $name")
    }
}