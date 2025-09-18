package basic.data_types

    

fun main() {

    // menggunakan tipe data String
    val someText: String = "Hello World!";
    println("\nMenampilkan teks: $someText")
    println("------------------------------------\n")

    // melakukan concatenation/penggabungan String
    val firstWord = "Just"
    val secondWord = "Word"
    val concateString = firstWord + secondWord
    println("Menggabungkan String: $concateString")
    println("------------------------------------\n")

    // looping String
    val dummyText: String = "Lorem ipsum dollar sign"

    print("Looping String: ")
    dummyText.forEach { char -> print("$char ") }
    println("\n-------------------------------------------------------------\n")

    // looping dan konversi ke ASCII
    var getAscii: Int? = null
    val text: String = "Belajar Kotlin"

    text.forEachIndexed { index, char ->
        getAscii = char.code
        print("$char -> $getAscii, ")

        if (text[index] == ' ') print("\n")
    }

    println("\n")

}