package course.oop.`class`

/**
 * Dalam Kotlin, inner class adalah sebuah class yang dideklarasikan di dalam class lain dan memiliki akses ke anggota
 * dari class luar (outer class). Dengan mendeklarasikan class sebagai inner, kita dapat membuat instance dari class
 * dalam konteks instance dari class luar dan mengakses properti serta metode dari class luar tersebut.
 *
 * Kegunaan Inner Class:
 * 1. Mengorganisir kode: Inner class membantu mengorganisir kode dengan lebih baik ketika class tersebut memiliki
 * hubungan logis yang kuat dengan class luar.
 * 2. Akses ke anggota class luar: Inner class memiliki akses ke properti dan metode dari class luar, yang memungkinkan
 * inner class untuk menggunakan atau memodifikasi anggota tersebut.
 */

private class OuterClass {
    private val outerProperty: String = "Outer Property"

    // inner class dapat mengakses properti/data dari outer classnya
    // bisa ditambahkan visibility
    inner class InnerClass {
        fun accessOuterClassProperty() {
            println("Accessing: $outerProperty")
        }
    }

    /**
     * penjelasan: Dalam contoh di atas, OuterClass memiliki properti outerProperty. InnerClass dideklarasikan di dalam
     * OuterClass dengan kata kunci inner. Metode accessOuterClassProperty dalam InnerClass dapat mengakses outerProperty
     * dari OuterClass.
     */
}

fun main() {

    // mengakses inner class
    val outer = OuterClass()
    val inner = outer.InnerClass()

    inner.accessOuterClassProperty()

    /**
     * Kesimpulan:
     * 1. Inner class memungkinkan akses ke anggota dari class luar dan memerlukan instance dari class luar untuk dibuat.
     * 2. Nested class tidak memiliki akses ke anggota dari class luar dan tidak memerlukan instance dari class luar untuk dibuat.
     * 3. Menggunakan inner class dapat membantu mengorganisir kode ketika ada hubungan logis yang kuat antara class
     * luar dan class dalam.
     */
}