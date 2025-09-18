package course.oop.`object`

/**
 * Dalam Kotlin, companion object adalah objek yang terkait dengan class tertentu di mana objek tersebut dideklarasikan.
 * companion object mirip dengan objek biasa, tetapi memiliki sifat khusus karena dapat diakses langsung dari class yang
 * mendeklarasikannya. Ini memberikan cara untuk mengorganisir metode dan properti yang terkait dengan class tanpa perlu
 * membuat instance dari class tersebut.
 *
 * Fitur Utama Companion Object:
 * 1. Nama Tidak Diperlukan: companion object tidak memerlukan nama, tetapi secara default diberi nama "Companion".
 * 2. Akses dari Luar Class: Memberikan akses ke metode dan properti tanpa membuat instance dari class yang mendeklarasikannya.
 * 3. Static Behavior: Mirip dengan konsep static dalam bahasa pemrograman lain, tetapi dengan lebih banyak fleksibilitas
 * dan kemampuan di Kotlin.
 *
 * Karakteristik Companion Object:
 * 1. Dapat memiliki Properti dan Metode: Mirip dengan class biasa, companion object dapat memiliki properti
 * (termasuk val, var, atau const val) dan metode.
 * 2. Inisialisasi Lazy: Properti dalam companion object bisa diinisialisasi secara lazy (diinisialisasi saat pertama
 * kali diakses).
 * 3. Implementasi Interface: Companion object bisa mengimplementasikan interface, sehingga memungkinkan untuk memberikan
 * perilaku tertentu yang terkait dengan class.
 *
 * Penggunaan Umum Companion Object:
 * 1. Factory Method: Digunakan untuk membuat instance dari class dengan logika khusus.
 * 2. Static Utility Methods: Memberikan metode bantuan atau utilitas yang terkait dengan class tetapi tidak memerlukan
 * instance dari class.
 * 3. Implementasi Polymorphism: Companion object dapat digunakan untuk implementasi metode yang dapat diganti (override)
 * dalam hierarki class.
 */

// Contoh 1: menggunakan factory method
private interface Shape {
    fun draw()
}

private class Circle private constructor(private val radius: Int) : Shape {
    override fun draw() {
        println("Drawing circle with radius $radius")
    }

    companion object {
        fun create(radius: Int): Circle {
            return Circle(radius)
        }
    }
}

// Contoh 2: menggunakan singleton object
private class MySingleton private constructor() {

    /**
     * note: private constructor dalam singleton pattern untuk memastikan bahwa class MySingleton tidak dapat
     * di-instantiate secara langsung di luar classnya sendiri.
     */

    init {
        println("Singleton instance created")
    }

    companion object {
        private val INSTANCE: MySingleton by lazy { MySingleton() }

        fun getInstance(): MySingleton {
            return INSTANCE
        }
    }

    fun doSomething() {
        println("Doing something in singleton")
    }
}

// contoh 3: menggunakan polymorphism
private interface Printer {
    fun print()
}

private class LaserPrinter : Printer {
    override fun print() {
        println("Printing with laser printer")
    }

    companion object : Printer {
        override fun print() {
            println("Companion object printing")
        }
    }
}

fun main() {
    val circle = Circle.create(5)
    circle.draw()

    // tidak bisa diakses karena constructor private
    // val singleton1 = MySingleton.getInstance()
    // val singleton2 = MySingleton.getInstance()
    //
    // println(singleton1 === singleton2) // true, karena singleton instance yang sama
    // singleton1.doSomething() // Memanggil metode dari singleton

    val printer1: Printer = LaserPrinter()
    printer1.print() // Output: Printing with laser printer

    val printer2: Printer = LaserPrinter.Companion
    printer2.print() // Output: Companion object printing

    /**
     * kesimpulan: companion object adalah fitur yang berguna dalam Kotlin untuk mengelola metode dan properti yang
     * terkait dengan class tanpa perlu membuat instance dari class itu sendiri. Hal ini memungkinkan untuk memisahkan
     * kode secara logis, menyediakan akses mudah ke fitur terkait class, dan meningkatkan keterbacaan serta modularitas
     * dalam pengembangan aplikasi Kotlin.
     */
}
