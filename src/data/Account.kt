package data

/**
 * Selain delegating di class, Kotlin mendukung delegating di properties.
 * Salah satu implementasi delegating properties yang sudah disediakan oleh Kotlin adalah, lazy properties
 * Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
 */
class Account {
    val name: String by lazy {
        println("Name is called")
        "Syafiq"
    }
}