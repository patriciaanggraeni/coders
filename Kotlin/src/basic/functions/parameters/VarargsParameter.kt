package basic.functions.parameters

/**
 * Function Varargs Parameter merupakan parameter yang berada di posisi paling akhir, parameter tersebut memiliki
 * kemampuan untuk dijadikan sebagai varargs parameter. Varargs berarti datanya bisa menerima lebih dari satu input,
 * atau anggap sebagai [Array] atau [List].
 *
 * Apa bedanya dengan parameter biasa dengan tipe data [Array] atau [List]? Jika menggunakan tipe data [Array] atau [List],
 * kita wajib membuat array terlebih dahulu sebelum mengirimkannya ke fungsi, beda jika menggunakan varargs. Jika
 * menggunakan varargs bisa langsung mengirimkan datanya, jika lebih dari satu, cukup gunakan tanda koma.
 *
 * Saat ingin membuat parameter varargs, cukup menambahkan kata kunci vararg lalu diikut nama paramater dan tipe, dan
 * tempatkan parameter di posisi terakhir.
 */

// membuat fungsi dengan parameter varargs
private fun sumData(vararg values: Double): Double {
    var total: Double = 0.0

    // varargs memiliki iterable jadi bisa dilooping
    for (value in values) { total += value }

    total /= values.size // mengambil panjang dari varargs
    return total
}

fun main() {

    // membuat variabel untuk hasil fungsi
    val result: Double = sumData(10.4, 30.5, 20.1, 10.43, 20.902, 30.7, 50.01, 100.001)

    // menampilkan hasil
    println()
    println("Hasil: $result")
    println("----------------")

}