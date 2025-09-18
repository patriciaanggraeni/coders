package basic.operators

/**
 * Operator augmented assignment merupakan sebuah operator yang digunakan untuk menyimpan nilai kedalam variabel
 * dan bersifat stack (nilai sebelumnya akan ditambahkan dengan nilai selanjutnya). Biasanya operator ini digunakan
 * untuk mencari sebuah total dikombinasikan dengan looping. Berikut penulisan operator augmented assignment:
 *
 * a += 10 jika dijabarkan akan menjadi a = a + 10. Operator ini tidak sebatas menggunakan penjumlahan, tapi bisa
 * menggunakan operator aritmatika, seperti -=, *=, /= dan %=. Jika dijabarkan akan sama dengan contoh sebelumnya.
 */

fun main() {

    var x: Float = 12.3F
    var y: Float = 5.1F
    println()

    // penggunaan operator +=
    x += y // atau x = x + y
    println("Hasil x += y = $x")

    // penggunaan operator -=
    x -= y // atau x = x - y
    println("Hasil x -= y = $x")

    // penggunaan operator *=
    x *= y // atau x = x * y
    println("Hasil x *= y = $x")

    // penggunaan operator /=
    x /= y // atau x = x / y
    println("Hasil x /= y = $x")

    // penggunaan operator %=
    x %= y // atau x = x % y
    println("Hasil x %= y = $x")

    println("------------------------")

}