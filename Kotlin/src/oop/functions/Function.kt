package course.oop.functions

/**
 * Function jika di OOP akan disebut dengan method/behaviour. Di Kotlin fungsi tetap dinamakan dengan fungsi, tapi beda
 * konsteks. Konteks di sini adalah OOP, jadi fungsi akan dibuat di dalam sebuah class dan merupakan bagian dari class
 * tersebut.
 */

private class Function(private val data: String? = null) {
    fun getData() = this.data
}

fun main() {

    // membuat objek dari class Function
    val function = Function("Hello World!")

    // memanggil fungsi class
    println()
    println("Hasil: ${function.getData()}")
    println("-------------------")
}