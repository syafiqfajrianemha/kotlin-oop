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

    /**
     * Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
     * Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
     */
    companion object {
        fun toUpper(name: String) {
            println(name.toUpperCase())
        }
    }
}