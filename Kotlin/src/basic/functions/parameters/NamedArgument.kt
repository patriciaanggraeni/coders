package basic.functions.parameters

/**
 * Kadang jika parameter sudah terlalu banyak, kita bingung parameter apa saja yang ingin diisi dan semua itu harus urut.
 * Hal ini sangat menyulitkan saat kita memanggil fungsi tersebut karena harus benar-benar tahu urutan parameter di fungsi
 * tersebut. Kotlin memiliki fitur untuk mempermudah pengisian argumen fungsi saat dipanggil, fitur tersebut bernama Named
 * Argument.
 *
 * Lalu apa bedanya function parameter dan argument? Parameter function adalah sebuah variabel yang akan menerima
 * data dari luar, sedangkan Argument adalah data yang dikirim/passing melalui parameter saat memanggil fungsi dan data
 * tersebut akan diterima oleh parameter fungsi. Nah named argument sangat membantu sekali jika parameter fungsi sudah
 * banyak, dengan menggunakan fitur ini kita bisa langsung menyebutkan nama parameter fungsi dan tidak perlu tahu
 * posisi dari parameter fungsi tersebut.
 */

// membuat fungsi dengan parameter
private fun fullName(firstName: String?, middleName: String?, lastName: String?) {
    println()
    println("Hello, $firstName $middleName $lastName!")
    println("-----------------------------------")
}

fun main() {

    // memanggil fungsi dengan menyebutkan nama parameternya
    // tidak perlu mengurutkan argumennya saat mengisi nilai
    fullName(lastName = "Putra", firstName = "Patria", middleName = "Anggara Susilo")

}