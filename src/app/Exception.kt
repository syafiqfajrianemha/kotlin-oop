package app

import exception.ValidationException
import java.lang.NullPointerException

fun validateAndSayHello(name: String) {
    if(name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello, $name")
}

fun main() {
    /**
     * Jika dalam program Kotlin kita terjadi exception, maka secara otomatis program kita akan terhenti
     * Kadang kita tidak ingin sampai kejadian seperti itu
     * Di Kotlin, kita bisa menangkap exception, lalu melakukan sesuatu jika terjadi error
     * Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai dengan yang kita mau
     */
    try {
        validateAndSayHello("Syafiq")
        validateAndSayHello("") // berhenti disini, kode dibawah tidak akan dijalankan
        println("Program")
    } catch (error: ValidationException) {
        println("Error with message: ${error.message}")
    }

    /**
     * Multiple Catch
     * Saat kita mengeksekusi sebuah kode program di blok Try, bisa dimungkinan tidak hanya terjadi satu jenis exception,
     * bisa saja terjadi beberapa jenis exception
     * Di Kotlin, kita bisa menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
     */
    try {
        validateAndSayHello("Fajrian")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Error with message: ${error.message}")
    } catch (error: Throwable) {
        println("Error with message: ${error.message}")
    }

    /**
     * Finally Catch
     * Finally adalah block kode yang bisa ditambahkan di Try Catch
     * Block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
     * Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
     */
    try {
        validateAndSayHello("Emha")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Error with message: ${error.message}")
    } finally {
        println("Finally will always be executed")
    }
}