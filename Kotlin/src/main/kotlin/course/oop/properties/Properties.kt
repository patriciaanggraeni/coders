package course.oop.properties

/**
 * Properties/Field/Attributes adalah sebuah data yang disisipkan di dalam class/object. Properti digunakan untuk mendeskripsikan
 * ciri-ciri dari class, misal class Car, nah properti digunakan untuk menjabarkan apa saja yang dimiliki oleh objek tersebut
 * (Car/Mobil), misal seperti mobil mempunyai merek, harga, warna, roda, jenis mesin dan masih banyak lagi. Untuk membuat
 * properti di Kotlin sama halnya mendeklarasikan sebuah variabel dan propertinya bisa mutable ataupun immutable.
 *
 * Mengikuti peraturan pembuatan properti di Bahasa Pemrograman Java, properti sangat disarankan untuk dibuat private. Hal
 * ini agar mencegah data bisa diubah secara langsung. Hal ini juga sangat berkaitan dengan fungsi getter dan setter nantinya.
 */

// membuat properti class/objek
private class Employee {

    // membuat properti yang dimiliki oleh objek Employee
    var nip: String = ""
    var name: String = ""
    var age: Byte = 0
    var company: String = ""
}

fun main() {

    // membuat objek dari class Employee
    val employee = Employee()

    // menambahkan data baru
    employee.nip = "32892893266473"
    employee.name = "Patria Anggara"
    employee.age = 23
    employee.company = "Microhard"

    // menampilkan data dari objek Employee
    println()
    println("------ Data Pegawai ------")
    println("NIP       : ${employee.nip}")
    println("Nama      : ${employee.name}")
    println("Umur      : ${employee.age}")
    println("Perusahaan: ${employee.company}")
    println("--------------------------")

}