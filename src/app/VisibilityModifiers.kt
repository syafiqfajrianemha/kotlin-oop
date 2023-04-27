package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = Teacher("Syafiq")
    println(teacher.name)

    // teacher.teach() // error
    val superTeacher = SuperTeacher("Budi")
    superTeacher.test()
}