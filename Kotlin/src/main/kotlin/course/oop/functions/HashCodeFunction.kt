package course.oop.functions

/**
 * [hashCode] merupakan fungsi yang digunakan sebagai representasi angka unit untuk objek yang dibuat. Fungsi [hashCode]
 * berguna saat ingin mengkonversi objek menjadi angka. Penggunaan [hashCode] banyak dilakukan di struktur data, seperti
 * memastikan tidak ada data yang duplikat dengan mengecek nilai [hashCode], jika sama maka akan dianggap sama.
 */

private class Company(val company: String) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> company == other.company
            else -> false
        }
    }

    // jika mengoverride fungsi hashCode dan mengembalikan hashCode property class Company
    // maka hasil perbandingan akan menjadi true
    override fun hashCode(): Int {
        return company.hashCode() // mengembalikan hachCode dari property class Company
    }

}

fun main() {

    // membuat objek class State
    val company1 = Company("XYZ") // jika argument diganti nilanya dengan yang lain, perbandingan menghasilkan nilai false
    val company2 = Company("XYZ") // misal XYZ diganti dengan ZYX, hasil sama dengan false

    // menampilkan hashCode
    println("Hash Code Company 1: ${company1.hashCode()}")
    println("Hash Code Company 2: ${company2.hashCode()}")

    // membandingkan hashCode kedua objek
    val result = company1.hashCode() == company2.hashCode()

    // menampilkan hasil perbandingan
    println("Result: $result")

    // kenapa hasilnya false? karena hashCode itu nilainya digenerate secara random oleh komputer

}