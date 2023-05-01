package annotations

/**
 * Annotation adalah menambahkan metadata ke kode program yang kita buat
 * Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework
 * Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
 * Untuk membuat class annotation, kita bisa menggunakan kata kunci annotation sebelum membuat class tersebut
 * Annotation hanya boleh memiliki properties via primary constructor, tidak boleh memiliki members lainnya (function atau properties di body)
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)