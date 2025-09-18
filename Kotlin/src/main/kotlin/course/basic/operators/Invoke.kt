package basic.operators

/**
 * Operator invoke merupakan operator yang digunakan untuk memanggil sebuah fungsi. Operator ini menggunakan tanda ()
 * setelah nama fungsi atau variabel yang memuat fungsi (lambda). Kotlin akan memanggi fungsi [invoke] yang bisa
 * memiliki parameter atau tidak.
 */

private fun sayHello(name: String) = "Hello, $name!"

fun main() {

    // memanggil fungsi sayHello
    val result: String = sayHello("Angga")

    // menampilkan hasil
    println()
    println("Hasil: $result")
    println("--------------------")

}