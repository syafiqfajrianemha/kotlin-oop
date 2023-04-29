package data

import kotlin.properties.Delegates

/**
 * Selain delegating di class, Kotlin mendukung delegating di properties.
 * Salah satu implementasi delegating properties yang sudah disediakan oleh Kotlin adalah, lazy properties
 * Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
 */
class Account(desc: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Syafiq"
    }

    /**
     * Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
     * Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
     */
    var descpripton: String by Delegates.observable(desc) {
        property, oldValue, newValue ->
            println("${property.name} changed from $oldValue to $newValue")
    }
}