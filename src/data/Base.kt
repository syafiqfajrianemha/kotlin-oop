package data

/**
 * Salah satu design pattern lain yang populer adalah Delegation
 * Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 */
interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Good bye $name")
    }
}

class MyBaseDelegate(val base: Base) : Base by base {
    /**
     * Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
     * Namun kita tetap bisa meng-override properties dan function jika kita mau
     */
    override fun sayHello(name: String) {
        println("Delegate Hello $name")
    }
}