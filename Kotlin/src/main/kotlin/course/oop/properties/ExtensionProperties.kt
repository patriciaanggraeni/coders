package course.oop.properties

/**
 * Extension properties di Kotlin memungkinkan kita untuk menambahkan properti baru ke class yang sudah ada tanpa harus
 * mengubah sumber kode dari class tersebut. Ini mirip dengan extension functions, tetapi digunakan untuk properti.
 * Extension properties berguna untuk memperluas fungsionalitas dari class yang ada, terutama jika kita tidak memiliki
 * akses ke sumber kode class tersebut.
 *
 * Extension properties tidak dapat memiliki field yang sebenarnya (backing fields), jadi mereka tidak dapat menyimpan
 * nilai. Sebaliknya, mereka hanya dapat mendefinisikan getter dan/atau setter yang memberikan akses ke properti yang
 * sebenarnya dari objek.
 *
 * Batasan Extension Properties
 * 1. Tidak Ada Backing Field: Extension properties tidak dapat memiliki backing field. Mereka hanya bisa mendefinisikan
 * getter dan/atau setter.
 * 2. Akses ke Private Members: Extension properties tidak dapat mengakses anggota private dari class yang diperluas.
 * 3. Resolusi Statis: Extension properties bersifat statis dan tidak dapat diganti (override) oleh subclass.
 */

class RectangleTwo(val width: Int, val height: Int)

val String.lastChar: Char
    get() = this[length - 1]

var StringBuilder.lastChar: Char
    get() = this[length - 1]
    set(value) {
        this.setCharAt(length - 1, value)
    }

val RectangleTwo.area: Int
    get() = width * height

fun main() {

    val str = "Kotlin"
    println(str.lastChar) // Output: n

    val rect = RectangleTwo(4, 5)
    println(rect.area) // Output: 20

    val sb = StringBuilder("Kotlin")
    println(sb.lastChar) // Output: n
    sb.lastChar = 'x'
    println(sb) // Output: Kotlix

    /**
     * kesimpulan: Extension properties di Kotlin memungkinkan kita untuk menambahkan properti baru ke class yang sudah
     * ada tanpa mengubah sumber kode class tersebut. Mereka digunakan untuk memperluas fungsionalitas dari class yang
     * ada dengan cara yang bersih dan terpisah. Meskipun memiliki beberapa keterbatasan, extension properties adalah
     * fitur yang kuat dan fleksibel yang meningkatkan kemampuan untuk bekerja dengan class yang sudah ada dalam Kotlin.
     */

}