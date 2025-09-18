package basic.operators

/**
 * Operator materika digunakan untuk melakukan komputasi numerik. Operator matematika bisa digunakan untuk tipe
 * data numerik (bulat dan pecahan), seperti ([Int], [Long], [Float], [Double]). Ada lima operator matematika
 * yang bisa digunakan: penjumlahan (+), pengurangan (-), perkalian (*), pembagian (/), modulus (%). Operator
 * Modulus digunakan untuk mendapatkan sisa bagi, dan range (..).
 *
 * Khusus operator penjumlahan (+) bisa digunakan untuk concatenation (penggabungan) pada tipe data [String]. Jika
 * menggunakan operator pembagian dan hasilnya ditampung ke dalam variabel yang bertipe [Int], hasilnya akan dibulatkan
 * secara otomatis (ke bawah/ke atas). Jadi jika memproses nilai pecahan, gunakan variabel yang memiliki tipe pecahan juga
 * seperti [Float] dan [Double].
 */

fun main() {

    val x: Float = 45.6F
    val y: Float = 12.3F
    var result: Float = 0F

    // operator penjumlahan
    result = x + y
    println()
    println("Penjumlahan: $x + $y = $result")

    // operator pengurangan
    result = x - y
    println("Pengurangan: $x - $y = $result")

    // operator perkalian
    result = x * y
    println("Perkalian  : $x x $y = $result")

    // operator pembagian
    result = x / y
    println("Pembagian  : $x : $y = $result")

    // operator modulus/sisa pembagian
    result = x % y
    println("Modulo     : $x % $y = $result")

    // operator range
    val range: IntRange = 1 .. 10
    print("Range      : ")
    for (number in range) { print("$number ") }
    println()
    println("------------------------------------")

}
