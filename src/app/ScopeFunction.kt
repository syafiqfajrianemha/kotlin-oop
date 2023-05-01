package app

/**
 * Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi
 * object dengan mudah memanfaatkan lambda expression
 * Function-function tersebut adalah let, run, with, apply, dan also
 */
import data.Student

fun main() {
    val student = Student("Syafiq", 19)

    /**
     * Let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
     * Let function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci it untuk mendapatkan
     * referensi terhadap object tersebut
     */
    val result: String = student.let {
        "let function: Name ${it.name}, Age ${it.age}"
    }
    println(result)

    /**
     * Run function mirip dengan let function
     * Yang membedakan adalah, pada run function, tidak ada parameter pada lambda nya,
     * sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it.
     * Namun kita masih bisa menggunakan kata kunci this
     */
    val result2: String = student.run {
        "run function: Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    /**
     * Apply function hampir sama dengan run function
     * Yang membedakan adalah return value dari apply function
     * adalah reference object itu sendiri
     */
    val result3: Student = student.apply {
        "apply function: Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    /**
     * Also function mirip dengan let function
     * Yang membedakan adalah, pada also function,
     * return value nya adalah reference ke object itu sendiri
     */
    val result4: Student = student.also {
        "also function: Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    /**
     * With function mirip dengan run function, menggunakan reference this
     * Yang membedakan adalah, with function bukanlah extension function,
     * jadi tidak bisa digunakan langsung dari object-nya
     * Kita harus memanggil with function secara manual
     */
    val result5: String = with(student) {
        "with function: Name ${this.name}, Age ${this.age}"
    }
    println(result5)
}