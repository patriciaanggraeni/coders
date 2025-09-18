package basic.looping

/**
 * do while di Kotlin sama seperti bahasa meporgraman lainnya. do while mempunyai cara kerja yang hampir sama seperti
 * while loop, bedanya do while akan mengeksekusi kode minimal satu walaupun kondisi salah/false. Hal ini karena
 * do while akan mengeksekusi kode program terlebih dahulu baru mengecek kondisinya. Jadi walaupun kondisi salah
 * saat pertama kali dijalankan, maka kode akan tetap dieksekusi sekali.
 */

fun main() {

    var initialValue: Int = 0

    // penggunaan do while loop
    println()
    print("Hasil: ")
    do { // block akan dieksekusi minimal satu jika kondisi false
        print("$initialValue ") // menampilkan nilai
        initialValue++        // menambahkan nilai
    } while (initialValue < -1) // cek kondisi nilai
    println("\n--------------------------")

}