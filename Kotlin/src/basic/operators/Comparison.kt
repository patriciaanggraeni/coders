package basic.operators

/**
 * Operator comparison/perbangdingan digunakan untuk membandingkan dua nilai atau lebih yang mana jika
 * kondisi tersebut benar akan mengembalikan nilai [Boolean] yaitu true dan jika sebaliknya akan mengembalikan
 * nilai false. Beberapa operator yang bisa digunakan antara lain: < (lebih kecil), > (lebih besar),
 * <= (lebih kecil sama dengan), >= (lebih besar sama dengan).
 */

fun main() {

    val x: Int = 100
    val y: Int = 50

    // penggunaan opearor < (lebih kecil)
    val result1: Boolean = x < y

    // penggunaan opearor > (lebih besar)
    val result2 = x > y

    // penggunaan opearor <= (lebih kecil sama dengan)
    val result3 = x <= y

    // penggunaan opearor >= (lebih besar sama dengan)
    val result4 = x >= y

    // menampilkan hasil
    println()
    println("Hasil: $x < $y = $result1")
    println("Hasil: $x > $y = $result2")
    println("Hasil: $x <= $y = $result3")
    println("Hasil: $x >= $y = $result4")

    // studi kasus pengecekan umur untuk pembuatan SIM
    println("\nContoh Penggunaan:")
    val age: Int = 17
    if (age <= 17) print("Umur Anda $age, sudah bisa bikin SIM")
    else print("Umur Anda $age, belum bisa bikin SIM")
    println("\n----------------------------------")

}