package data

/**
 * Di Kotlin, singleton object bisa dibuat di dalam sebuah class
 * amun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada di outer class nya
 */
class Application(val name: String) {
    object Util {
        fun hello(name: String) {
            println("Hello $name")
        }
    }
}