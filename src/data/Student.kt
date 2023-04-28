package data

/**
 * Perlu diperhatikan, bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
 * Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private atau protected dari class tersebut
 */
class Student(val name: String, val age: Int)

/**
 * Secara standar, extension function hanya bisa untuk data yang tidak null
 * Jika kita ingin membuat extension function yang bisa digunakan untuk data yang bisa null, kita perlu menggunakan kata kunci ? (tanda tanya)
 */
fun Student?.sayHello(name: String) {
    if(this != null) {
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }
}

/**
 * Selain function, kita juga bisa membuat extension untuk properties di Kotlin
 * Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter
 */
val Student.upperName: String
    get() = this.name.toUpperCase()