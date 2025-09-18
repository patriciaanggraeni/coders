package course.oop.`class`

/**
 * Enum class di Kotlin digunakan untuk mendefinisikan kumpulan konstan yang terbatas, yang merupakan tipe data khusus
 * untuk representasi nilai tetap yang telah diketahui sebelumnya. Enum class sangat berguna ketika kita ingin
 * merepresentasikan sekumpulan nilai tetap dan mendefinisikan logika terkait dengan nilai-nilai tersebut.
 *
 * Kegunaan Enum Class:
 * 1. Representasi Nilai Tetap: Enum class memungkinkan kita untuk mendefinisikan sekumpulan nilai tetap yang
 * merepresentasikan status, kategori, atau jenis tertentu dalam aplikasi.
 * 2. Keterbacaan Kode: Menggunakan enum class meningkatkan keterbacaan kode karena kita bisa menggunakan nama-nama
 * konstan yang bermakna daripada nilai-nilai integer atau string.
 * 3. Keamanan Tipe: Enum class meningkatkan keamanan tipe dengan memastikan bahwa hanya nilai-nilai yang valid yang
 * dapat digunakan.
 *
 * Note: Enum class juga dapat memiliki properti dan metode, sehingga kita bisa menambahkan logika tambahan pada setiap
 * nilai enum.
 */

// membuat enum class Direction
private enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

// enum class menggunakan parameter
private enum class Planet(private val mass: Double, private val radius: Double) {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    // Fungsi untuk menghitung gravitasi
    fun surfaceGravity(): Double {
        val g = 6.67300E-11
        return g * mass / (radius * radius)
    }
}

private fun navigate(direction: Direction) {
    when (direction) {
        Direction.NORTH -> println("Going North")
        Direction.SOUTH -> println("Going South")
        Direction.EAST -> println("Going East")
        Direction.WEST -> println("Going West")
    }
}

fun main() {

    val direction = Direction.NORTH
    navigate(direction)

    // menambil datfar enum yang dideklarasikan sebelumnya
    for (planet in Planet.entries) {
        println("Surface gravity on ${planet.name}: ${planet.surfaceGravity()}")
    }

}