package course.oop.constructors

/**
 * Penjelsan secara umum, constructor merupakan fungsi yang memiliki nama sama dengan class-nya. Constructor akan
 * dijalankan pertama kali saat objek dari class tersebut dibuat dan dipanggil. Constructor juga bisa diberi parameter
 * dengan jumlah tidak terbatas (sama seperti fungsi). Kotlin jika ingin membuat constructor bisa menggunakan keyword
 * constructor (kalau ini disebut secondary constructor) atau bisa langsung di samping nama class (primary constructor).
 * Jika constructor terdapat parameter, maka parameter tersebut wajib diisi (bisa opsional jika diberi nilai default).
 */

// membuat class dengan constructor (secondary constructor)
private class EmployeeOne {
    var nip: String? = null
    var name: String? = null
    var age: Byte? = null
    var company: String? = null

    // membuat constructor di dalam class
    constructor(nip: String?, name: String?, age: Byte?, company: String?) {
        this.nip = nip
        this.age = age
        this.name = name
        this.company = company
    }
}

// membuat class dengan constructor (primary constructor)
private class EmployeeTwo(
    var nip: String? = null,
    var name: String? = null,
    var age: Byte? = null,
    var company: String? = null
) {
    // tambahkan logika di sini
}

fun main() {

    // membuat objek EmployeeOne dan EmployeeTwo
    val employeeOne = EmployeeOne("382983298", "Patria Anggara", 23, "Microhard")
    val employeeTwo = EmployeeTwo()

    // menambahkan data ke properti objek class EmployeeTwo
    employeeTwo.nip = "382983298"
    employeeTwo.name = "Patria Anggara"
    employeeTwo.age = 23
    employeeTwo.company = "Microhard"

    // menampilkan data objek
    println()
    println("------- Data Pegawai 1 -------")
    println("NIP       : ${employeeOne.nip}")
    println("Nama      : ${employeeOne.name}")
    println("Umur      : ${employeeOne.age}")
    println("Perusahaan: ${employeeOne.company}")

    println()
    println("------- Data Pegawai 2 -------")
    println("NIP       : ${employeeTwo.nip}")
    println("Nama      : ${employeeTwo.name}")
    println("Umur      : ${employeeTwo.age}")
    println("Perusahaan: ${employeeTwo.company}")
    println("------------------------------")

}