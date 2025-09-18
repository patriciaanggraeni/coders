package basic.looping

/**
 * break dan continue dapat digunakan di semua perulangan. break digunakan untuk menghentikan perulangan
 * jika mencapai kondisi tertentu, sedangkan continue akan menskip nilai saat ini dan langsung melanjutkan
 * ke perulangan selanjutnya.
 */

fun main() {

    // contoh penggunaan break
    print("\nBreak: ")
    for (i in 1 .. 10) {
        print("$i ")
        if (i == 5) break
    }

    // contoh penggunaan continue
    print("\nContinue: ")
    for (i in 1 .. 10) {
        if (i % 2 == 0) continue // jika i memiliki sisa bagi 0, skip
        print("$i ")
    }

    println("\n------------------------")
}