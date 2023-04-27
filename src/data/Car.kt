package data

/**
 * Saat kita membuat Object, maka kita seperti memanggil sebuah function
 * Di dalam class Kotlin, kita bisa membuat Constructors,
 * Constructors mirip seperti function yang akan dipanggil saat
 * pertama kali Object dibuat.
 * Mirip seperti di Function, kita bisa memberi parameter pada Constructors
 */
// Primray Constructor
class Car(brandParam: String,
          nameParam: String,
          yearParam: Int) {
    /**
     * Initializer Block adalah blok kode yang akan dieksekusi
     * ketika constructor dipanggil
     * Kita bisa memasukkan kode program di dalam initializer block
     */
    init {
        println("Car ${brandParam} dibuat")
    }

    // secondary contructor -> wajib memanggil primary constructor
    constructor(brandParam: String, nameParam: String) : this(brandParam, nameParam, 2023) {
        println("Secondary Constructor 1")
    }

    constructor(brandParam: String) : this(brandParam, "") {
        println("Secondary Constructor 2")
    }

    /**
     * Properties / Fields / Attributes adalah data yang bisa kita
     * sisipkan di dalam Object
     * Namun sebelum kita bisa memasukkan data di Properties,
     * kita harus mendeklarasikan data apa aja yang dimiliki
     * object tersebut di dalam deklarasi class-nya
     * Membuat Properties sama seperti membuat variable, bisa mutable atau immutable
     */
    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam
}