package basic.functions

/**
 * Menggunakan high-order function merupakan fitur yang sangat berguna, selain menyingkat kode menjadi lebih ringkas,
 * dia juga berfungsi untuk membuat input yang fleksibel. Namun penggunaan High-order function akan berdampak pada
 * performa saat aplikasi dijalankan karena harus membuat objek lambda secara berulang-ulang. Efek dari penggunaan
 * High-order function akan memiliki efek ketika sudah menggunakannya terlalu banyak.
 *
 * Di Kotlin, ada kata kunci untuk mengatasi masalah di atas, yaitu menggunakan kata kunci inline. Kotlin menyediakan
 * kata kunci inline agar menandakan fungsi sebagai inline. Dengan menggunakan inline function, kode di dalam fungsi
 * High-order function akan diduplikasi agar saat runtime, aplikasi tidak perlu membuat objek lambda baru. Keuntungan
 * menggunakan inline function adalah pertama, mengurangi overhead pemanggilan fungsi. kedua, optimalisasi kode, dll.
 */

// membuat fungsi inline
inline fun sayHello(name: () -> String) = "Hello, ${name()}!"

inline fun performOperation(a: Float, b: Float, operate: (Float, Float) -> Float): Float {
    return operate(a, b)
}

fun main() {

    // membuat variabel untuk high-order function
    val name: () -> String = { "Angga" }
    val operate: (Float, Float) -> Float = { a, b -> a * b }

    // membuat variabel untuk hasil fungsi
    val result1: String = sayHello { name() }
    val result2: Float = performOperation(45.3F, 12.4F, operate)

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("--------------------")

}