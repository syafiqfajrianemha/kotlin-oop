package data

/**
 * Di bahasa pemrograman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
 * Getter adalah function yang dibuat untuk mengambil data properties
 * Setter ada function untuk mengubah data propertie
 * Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya, karena sudah difasilitasi sehingga lebih mudah
 */
class Note(title: String) {
    var title: String = title
    get() {
        println("Call getter function")
        return field
    }
    set(value) {
        println("Call setter function")
        if(value.isNotBlank()) {
            field = value
        }
    }
}

/**
 * Getter dan Setter tidak wajib dideklarasikan semua di Kotlin
 * Kita bisa hanya mendeklarasikan hanya Getter atau hanya Setter
 */
class BigNote(val title: String) {
    val bigTitle: String
    get() {
        println("Call getter bignote")
        return title.toUpperCase()
    }
}