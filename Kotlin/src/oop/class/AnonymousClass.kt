package course.oop.`class`

/**
 * Anonymous class di Kotlin adalah class yang tidak memiliki nama dan biasanya digunakan untuk membuat instance dari
 * interface atau class abstrak dengan menerapkan metode atau properti yang dibutuhkan secara langsung. Anonymous class
 * sangat berguna ketika kita hanya membutuhkan satu instance dari sebuah class atau interface dan tidak ingin membuat
 * deklarasi class yang terpisah.
 *
 * Kegunaan Anonymous Class:
 * 1. Kode yang Lebih Ringkas: Anonymous class memungkinkan kita untuk membuat instance dan mengimplementasikan metode
 * secara langsung dalam satu blok kode.
 * 2. Implementasi Sederhana: Sangat cocok untuk penggunaan sementara di mana implementasi hanya diperlukan sekali atau
 * dalam lingkup yang sangat terbatas.
 * 3. Listener dan Callback: Sering digunakan untuk mengimplementasikan listener dan callback dalam UI atau event handling.
 */

// anonymous berlaku pada class interface dan abstract
private interface ClickListener {
    fun onClick()
}

private abstract class Animals {
    abstract fun sound()
}

fun main() {

    // membuat anonymous class
    val buttonClickListener = object : ClickListener {
        override fun onClick() {
            println("Button clicked!")
        }
    }

     val dog = object : Animals() {
        override fun sound() {
            println("Woof! Woof!")
        }
    }

    // Menggunakan anonymous class instance
    dog.sound()

    // Menggunakan listener
    buttonClickListener.onClick()
}
