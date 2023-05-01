package app

/**
 * Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
 * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
 * Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class, atau bisa langsung dari NamaClass::class
 */
import annotations.NotBlank
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/*
fun validateRequest(request: CreateProductRequest) {
    if(request.id == "") {
        throw ValidationException("id is blank")
    } else if(request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest) {
    if(request.id == "") {
        throw ValidationException("id is blank")
    } else if(request.name == "") {
        throw ValidationException("name is blank")
    }
}*/

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for(property in properties) {
        if(property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when(value) {
                is String -> {
                    if("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}
