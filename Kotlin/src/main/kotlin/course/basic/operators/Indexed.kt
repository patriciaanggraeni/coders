package basic.operators

/**
 * Operator indexed merupakan sebuah operator yang digunakan untuk mengakses sebuah nilai/data array menggunakan index.
 * Operator ini menggunakan tanda []. Di antara kurung kurawal, diberi nilai index dari array.
 */

fun main() {

    val data: Array<String> = arrayOf("Pisang", "Apel", "Nanas", "Durian", "Nangka")

    // menggunakan operator indexed
    val banana: String = data[0]  // mengambil data: Pisang
    val aple: String = data[1]    // mengambil data: Apel
    val pinaple: String = data[2] // mengambil data: Nanas

    // menampilkan hasil
    println()
    println("Hasil: $banana, $aple, $pinaple")
    println("--------------------------")

}