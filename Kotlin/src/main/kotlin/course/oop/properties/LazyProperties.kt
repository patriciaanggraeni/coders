package course.oop.properties

/**
 * Dalam Kotlin, lazy properties memungkinkan inisialisasi properti dilakukan hanya ketika properti tersebut pertama kali
 * diakses. Ini dikenal sebagai "lazy initialization" atau inisialisasi malas. Fitur ini berguna untuk meningkatkan kinerja
 * dan efisiensi memori dengan menunda pembuatan objek yang mungkin tidak akan digunakan segera atau sama sekali. Lazy
 * properties di Kotlin didefinisikan menggunakan fungsi lazy. Properti yang diinisialisasi secara lazy hanya akan
 * diinisialisasi sekali dan inisialisasi tersebut aman untuk digunakan dalam lingkungan multi-threaded secara default.
 *
 * Manfaat Lazy Properties:
 * 1. Kinerja: Menunda inisialisasi objek yang mahal hingga benar-benar dibutuhkan, yang dapat meningkatkan kinerja aplikasi.
 * 2. Efisiensi Memori: Menghemat memori dengan tidak membuat objek yang mungkin tidak akan digunakan.
 * 3. Thread-Safety: Menyediakan inisialisasi yang aman untuk lingkungan multi-threaded secara default.
 */

class Example {

    // tidak akan diinisialisasi jika tidak diakses
    val heavyComputation: String by lazy {
        println("Performing heavy computation...")
        "Computed Value"
    }

    val number: Int by lazy {
        println("Initializing...")
        42
    }

    val lazyValue: Int by lazy {
        println("Computed!")
        42
    }

    val lazyValuePublication: Int by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("Computed!")
        42
    }

    val lazyValueNone: Int by lazy(LazyThreadSafetyMode.NONE) {
        println("Computed!")
        42
    }

}

fun main() {

    val example = Example()

    println("Before accessing lazy property")
    println(example.heavyComputation) // Mengakses properti, menyebabkan inisialisasi
    println(example.heavyComputation) // Menggunakan nilai yang sudah diinisialisasi

    println("Before accessing number")
    println(example.number) // Mengakses properti, menyebabkan inisialisasi
    println(example.number) // Menggunakan nilai yang sudah diinisialisasi

    println("Before accessing value")
    println(example.lazyValue)
    println(example.lazyValuePublication)
    println(example.lazyValueNone)

    /**
     * kesimpulan: Lazy properties di Kotlin adalah fitur yang kuat dan fleksibel yang memungkinkan inisialisasi properti
     * dilakukan hanya ketika diperlukan. Dengan menggunakan fungsi lazy, kita dapat meningkatkan kinerja dan efisiensi
     * memori aplikasi. Lazy properties sangat berguna dalam situasi di mana inisialisasi properti mahal atau tidak selalu
     * diperlukan, dan mereka menyediakan solusi yang aman untuk digunakan dalam lingkungan multi-threaded secara default.
     */

}