package basic.looping

/**
 * Kotlin tidak menerapkan tradisional for loop. Apa itu? jadi sebagian besar bahasa pemrograman menggunakan syntax
 * looping seperti ini for(int i = 0; i < 10; i++). Nah di Kotlin jika ingin membuat for loop tidak seperti ini, tapi
 * menggunakan keyword in seperti ini, for (item in items). Secara otomatis akan melooping dari isi variabel items dan
 * ditampung oleh variabel item. Untuk variabel item tidak perlu menambahkan keyword var/val cukup nama variabel saja dan
 * tidak perlu secara eksplisit menuliskan tipe datanya.
 *
 * Menggunakan for loop secara otomatis akan melooping sebuah data yang memiliki iterasi, seperi [Array], [ArrayList],
 * [List] dan dll. Jadi tidak perlu mendeklarasikan looping secara tradisional, dan ini menjadi lebih simple dibanding
 * java. Oh ya, for loop ini sebenarnya juga ada di bahasa pemrograman Java, namanya [forEach].
 */

fun main() {

    val favoritFood: Array<String> = arrayOf("Keju", "Nasi Goreng", "Tempe")

    // menggunakan for loop
    println()
    print("Hasil: [")
    for (food in favoritFood) {
        print(food) // langsung menampilkan data array
        if (food != "Tempe") print(", ")
        else print("]")
    }
    println()
    println("---------------------------------")

}