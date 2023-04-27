package data

class User(var username: String, var password: String) {
    /**
     * toString() adalah function yang digunakan untuk memberitahu representasi String dari object
     * Saat kita melakukan println object, sebenarnya function toString() akan dipanggil
     * Standarnya, function toString() akan mengembalikan referensi kode unik dari object
     * Kita bisa meng-override function toString() jika ingin mengubah representasi dari String pada object kita
     */
    override fun toString(): String {
        return "User with username $username"
    }
}