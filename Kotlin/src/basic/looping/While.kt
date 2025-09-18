package basic.looping

/**
 * while loop menggunakan kondisi untuk menjalankan iterasinya. while loop akan dieksekusi secara terus menerus
 * jika kondisi true, untuk bisa menghentikannya, kondisi harus dirubah/diberi nilai false, jadi harus diberi batasan.
 * operator increment dan decrement biasanya digunakan bebarengan dengan while loop.
 *
 * Bisa menggunakan break dan continue di loopingnya. break digunakan untuk menghentikan looping jika sudah mencapai
 * kondisi tertentu sedangkan continue men-skip nilai selanjutnya ke nilai selanjutnya lagi.
 */

fun main() {

    var i: Int = 0;

    // menggunakan while loop
    println()
    print("Hasil: ")
    while (i < 10) { // selama kondisi benar, block while akan dijalankan
        print("$i ") // menampilkan nilai
        i++ // memberi batasan dengan menambahkan nilai i setiap iterasi
    }

    println("\n--------------------------")

}