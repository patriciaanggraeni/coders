package course.oop.`class`

/**
 * Inline class di Kotlin adalah fitur yang memungkinkan kita untuk mendeklarasikan tipe yang hanya memiliki satu properti
 * dan memungkinkan pengoptimalan oleh compiler untuk menghindari overhead dari objek tambahan. Konsep ini sangat berguna
 * untuk meningkatkan kinerja dengan menghindari alokasi objek tambahan saat tidak diperlukan, serta meningkatkan
 * keterbacaan kode dengan memberikan nama tipe yang lebih jelas.
 *
 * Karakteristik Inline Class:
 * 1. Single Property: Inline class hanya bisa memiliki satu properti.
 * 2. No Overhead: Compiler Kotlin mengoptimalkan inline class sehingga tidak ada overhead objek tambahan selama runtime.
 *
 * Manfaat Inline Class:
 * 1. Kinerja: Mengurangi overhead memori dan CPU karena tidak ada objek tambahan yang dialokasikan.
 * 2.  Keterbacaan Kode: Membuat kode lebih mudah dibaca dan dimengerti dengan memberikan nama tipe yang bermakna.
 * 3. Keamanan Tipe: Mencegah penggunaan tipe yang tidak sesuai dengan memberikan tipe yang kuat dan spesifik.
 *
 * Keterbatasan Inline Class:
 * 1. Hanya Satu Properti: Inline class hanya bisa memiliki satu properti.
 * 2. Tidak Bisa Memiliki Inisialisasi Tambahan: Tidak bisa menambahkan inisialisasi tambahan atau blok inisialisasi.
 * 3. Tidak Bisa Menjadi Subclass: Inline class tidak bisa mewarisi atau diwarisi dari class lain.
 */

// membuat inline class di Kotlin 1.5 ke atas
@JvmInline
private value class Temperature(val celsius: Double) {
    fun toFahrenheit(): Double = celsius * 9 / 5 + 32
}

/**
 * Note: sekarang tidak menggunakan kata kunci inline lagi, tapi menggunakan kata kunci value dan diberi anotasi
 * "@JvmInline".
 */

fun main() {

    val temp = Temperature(25.0)

    println("Celsius: ${temp.celsius}")
    println("Fahrenheit: ${temp.toFahrenheit()}")

}