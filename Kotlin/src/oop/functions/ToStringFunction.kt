package course.oop.functions

/**
 * Fungsi [toString] adalah fungsi yang digunakan untuk merepresentasikan [String] dari objek. Sebenarnya saat memanggil
 * fungsi println, fungsi [toString] akan dipanggil. Fungsi [toString] akan mengembalikan referensi kode yang terdapat
 * pada sebuah objek class. Fungsi [toString] bisa di-override dan dirubah isinya sesuai keinginan / merubah representasi
 * [String] dari objek.
 */

private class Cat(val name: String) {

    override fun toString(): String {
        return "Kucing ku bernama $name"
    }

}

fun main() {

    // membuat objek dari class Person
    val person = Cat(name = "Kittie")

    // langsung tampilkan objeknya
    println("Result: $person")
    println("================================")

}