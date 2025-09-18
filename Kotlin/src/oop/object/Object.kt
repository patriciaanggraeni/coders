package course.oop.`object`

/**
 * Membuat objek di Kotlin sangat mudah, seperti memanggil fungsi tapi menggunakan nama classnya. Contoh misal mempunyai
 * class Employee, maka jika ingin membuat objeknya cukup gunakan () setelah nama class, seperti ini: Employee(). Hampir
 * mirip seperti Java akan tetapi di Kotlin tidak perlu menambahkan kata kunci new saat membuat objeknya. Dalam satu
 * class dapat membuat banyak objek dan setiap objek memiliki alamat memori yang berbeda (membuat objek baru).
 */

// membuat class untuk dijadikan objek
private class Employee
private class Manager
private class Staff

fun main() {

    // membuat objek dari ke-tiga class di atas
    val employee = Employee()
    val manager = Manager()
    val staff = Staff()

    // jika diprint akan menampilkan alamat memori objek
    println()
    println("Objek Employee: $employee")
    println("Objek Manager : $manager")
    println("Objek Staff   : $staff")
    println("--------------------------------------------")

}