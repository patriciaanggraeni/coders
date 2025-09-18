package basic.data_types

/**
 * [Array]/Larik termasuk dalam tipe data Reference atau bisa disebut sebagai tipe data kompleks. Array
 * merupakan sekumpulan data homogen (yang bertipe sama). Memiliki index dan index tersebut digunakan
 * untuk mengakses dan memanipulasi data.
 *
 * [Array] memiliki panjang yang fiks atau tidak bisa dirubah setelah didefinisikan panjangnya. Nilai yang
 * dimasukkan ke [Array] akan ditempatkan di alamat memori yang berdekatan. Nilainya dapat dirubah. Index
 * [Array] dimulai dari 0 sampai length - 1.
 *
 */

fun main() {

    // membuat Array dengan tipe data Integer
    val numbers1: Array<Int> = arrayOf(100, 30, 12, 32, 89) // secara eksplisit
    val numbers2 = arrayOf(100, 30, 12, 32, 89) // secara implisit

    // mengakses nilai Array
    val data1 = numbers1[0] // mengakses data dengan index ke-0 (data pertama)
    val data2 = numbers2[3] // mengakses data dengan index ke-3 (data ke-empat)

    // menampilkan hasil
    println()
    println("Data pertama: $data1")
    println("Data kedua  : $data2")
    println("-----------------\n")

    // menampilkan semua data menggunakan looping
    print("Hasil: [")
    numbers1.forEachIndexed { index, data ->
        print(data)
        if (index != numbers1.size - 1) print(", ")
        else print("]")
    }
    println("\n----------------------------\n")

}