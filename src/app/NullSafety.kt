package app

/**
 * Jika teman-teman sebelumnya pernah belajar bahasa pemrograman Java, di Java kita sering mengenal
 * error bernama NullPointerException. Error ini terjadi ketika kita mengakses properties atau functions di null object
 * Di Kotlin, hal ini sangat jarang terjadi, karena sejak awal di Kotlin tidak direkomendasikan untuk menggunakan nullable type.
 * Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit menggunakan karakter ? (tanda tanya)
 * Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering kejadian seperti di Java
 */
data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    // println("Hello, ${friend?.name}")

    /*if(friend !== null) {
        println("Hello, ${friend.name}")
    }*/

    // Elvis Operator
    val name = friend?.name ?: "Friend"
    println("Hello, $name")

    /*val name = friend!!.name
    println("Hello, $name")*/
}

fun main() {
    sayHello(Friend("Syafiq"))
    sayHello(null) // error jika menggunakan !! operator
}