package basic.functions.parameters

/**
 * Parameter adalah sebuah variabel yang menerima data dari luar dan diterima oleh fungsi untuk diproses. Dideklarasikan
 * di dalam kurung setelah nama fungsi. Setiap paramter memiliki tipe data dan harus disebutkan secara eksplisit. Parameter
 * fungsi bisa lebih dari satu. Parameter tidaklah wajib (opsional), jadi bisa juga tidak menambahkan parameter sama sekali.
 * Namun jika sudah menambahkan parameter, maka ketika memanggil fungsi tersebut harus wajib memasukkan data ke parameternya.
 */

// membuat fungsi dengan parameter
private fun sayHello(name: String) { // parameter bisa lebih dari satu
    println()
    println("Hello, $name!")
    println("----------------------")
}

fun main() {

    // panggil fungsi dan masukkan data ke parameternya
    sayHello("Patria Anggara")

}