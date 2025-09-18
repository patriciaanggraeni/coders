package course.oop.`class`

import kotlin.Error

/**
 * Sealed class adalah fitur di Kotlin yang berguna untuk membatasi hirarki class. Sealed class memungkinkan kita untuk
 * membuat sebuah kelas yang memiliki subclass terbatas dan diketahui di waktu kompilasi. Ini berguna saat kita ingin
 * merepresentasikan hierarki kelas yang tertutup (closed), di mana semua kemungkinan subclass sudah diketahui dan
 * ditentukan di awal. Cukup tambahkan kata kunci sealed.
 *
 * Kegunaan Sealed Class:
 * 1. Keamanan tipe (type safety): Dengan menggunakan sealed class, kita dapat memastikan bahwa semua kemungkinan subclass
 * dari sebuah kelas sudah diketahui, sehingga kita dapat menghindari kondisi yang tidak terduga saat melakukan pemeriksaan
 * tipe (type checking).
 *
 * 2. Kecocokan pola (pattern matching): Sealed class sangat berguna dalam konteks when expression, karena compiler dapat
 * memberikan peringatan jika ada cabang yang terlewat dalam pemeriksaan pola.
 *
 * 3. Modeling state: Sealed class sering digunakan untuk merepresentasikan status yang berbeda dalam aplikasi, seperti
 * hasil operasi yang bisa sukses atau gagal.
 */

// membuat sealed class
private sealed class ErrorClass(val message: String) {
    class NetworkError : Error("Network Failure")
    class DatabaseError : Error("Database cannot be reached")
    class UnknownError : Error("An unkown error has occurred")
}

fun main() {

    // membuat list dari sealed class
    val errors = listOf(
        ErrorClass.NetworkError(),
        ErrorClass.DatabaseError(),
        ErrorClass.UnknownError()
    )

    // menapilkan pesan error
    errors.forEach {
        println(it.message)
    }
}