package basic.data_types

/**
 * [Any] merupakan parent dari semua class yang ada di Kotlin. Jika di Java, Any adalah tipe data [Object].
 * Tipe data ini dapat menerima nilai dengan tipe apapun. Semua [Class] di Kotlin secara implisit merupakan
 * subclsas dari [Any] (kecuali tipe nullable).
 */

fun main() {

    // menggunakan tipe data Any
    val data1: Any = 100 // tidak error
    val data2: Any = "Hello World" // tidak error
    val data3: Any = arrayOf("Hello World", 10, true) // tidak error

    // menampilkan hasil
    println()
    println("Data pertama: $data1")
    println("Data kedua  : $data2")
    println("Data ketiga : $data3")

}