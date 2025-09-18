package basic.data_types

/**
 * Tipe data range hampir sama dengan [Array]. Data range berisi nilai angka yang berurutan.
 * Ini efektif jika ingin membuat data dengan banyak sekaligus. Cara membuatnya menggunakan tanda
 * titik dua kali (..).
 *
 * Ada fungsi yang dapat digunakan, yaitu downTo dan step. Fungsi downTo melakukan iterasi dari nilai
 * terbesar ke terkecil, sedangkan step seperti loncatan setiap iterasi, bisa 2, 10, 20 (berapapun)
 * selama nilai > step.
 */

fun main() {

    // menggunakan tipe data range
    val data1 = 1 .. 10

    // range dengan nilai menurun
    val data2 = 10 downTo 1

    // range dengan menggunakan step
    val data3 = 120 downTo 20 step 20

    // menampilkan hasil
    println()
    print("Data pertama: ")
    data1.forEach { data -> print("$data ") }
    println("\n----------------------------------\n")

    print("Data kedua  : ")
    data2.forEach { data -> print("$data ") }
    println("\n----------------------------------\n")

    print("Data ketiga : ")
    data3.forEach { data -> print("$data ") }
    println("\n----------------------------------\n")

}