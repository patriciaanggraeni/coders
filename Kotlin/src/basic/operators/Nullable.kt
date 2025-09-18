package basic.operators

/**
 * Kotlin mempunyai operator yang memungkinkan sebuah variabel dapat menyimpan nilai null dengan aman (null save).
 * Operator Nullable/ Null save menggunakan tanda ? setelah deklarasi tipe data. Hal ini berguna untuk mengatasi
 * [NullPointerException] yang biasa terjadi di bahasa pemrograman Java.
 *
 * Dengan menggunakan nullable save, maka tidak terjadi lagi yang namanya error [NullPointerException].
 */

fun main() {

    // contoh penggunaan
    var name: String? = null
    var username: String? = null
    var age: Byte? = null
    var address: String? = null

    // menginisialisasikan ulang nilai ke variabel
    name = "Patria Anggara Susilo Putra"
    username = "Angga191"
    age = null
    address = null

    // menampilkan hasil
    println()
    println("Nama    : $name")
    println("Username: $username")
    println("Umur    : $age")
    println("Alamat  : $address")
    println("-------------------------------------")

}