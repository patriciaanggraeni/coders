package basic.functions

/**
 * Function Scope merupakan ruang lingkup di mana fungsi bisa diakses. Saat membuat fungsi di dalam file kotlin, fungsi
 * tersebut akan bisa diakases di semua file kotlin dengan syarat berada di package yang sama. Jika fungsi dideklarasikan
 * sejajar dengan fungsi main (fungsi utama), maka fungsi tersebut akan bisa diakses di manapun di dalam file kotlin
 * atau dengan kata lain bersifat publik. Untuk membatasi agar fungsi tersebut tidak public, deklarasikan fungsi tersebut
 * ke dalam sebuah fungsi, misal di dalam fungsi main.
 *
 * Note: fungsi yang dideklarasikan sejajar dengan fungsi main disebut dengan top-level function.
 */

// membuat top-level function
private fun sayHello(name: String) = println("Hello, $name!")

fun main() {

    // membuat local function di dalam fungsi main
    fun printSomething() = println("Fungsi di dalam fungsi")

    // contoh penggunaan lain closure
    var counter: Int = 0
    val increaseCounter: () -> Unit = {
        // variabel counter bisa diakases di dalam lambda
        counter++
    }

    // menampilkan hasil
    println()
    sayHello("Angga")
    println("Hasil: ${increaseCounter()}")
    printSomething()
    println("----------------------")

    /**
     * penjelasan singkat: mendeklarasikan fungsi akan memiliki scope secara otomatis adalah public. Jika ingin membatasi
     * agar fungsi tersebut hanya bisa diakses di file kotlin saat ini saja, gunakan private (akan dijelaskan lebih
     * lanjut di seri OOP). Fungsi yang dideklarasikan di dalam fungsi main juga akan menjadi private.
     */

}