package course.oop.functions

private data class Person(
    var name: String,
    var age: Byte,
    var description: String?,
    var hobby: ArrayList<String?>
) {
    fun test() {
        val str: String = "Hello World"
        val result = str.let {
            print(this)
            print(it)
            it.length
        }

        println(result)
    }

    fun modified(person: Person) {
        val prs = person.also { people ->
            val changedName = people.name + " Putra"
            this.name = changedName
        }

        println(prs)
    }
}

fun main() {

    // contoh penggunaan fungsi run ----------------------------------------------------
    val person = Person(
        name = "Patria Anggara",
        age = 21,
        description = "An ordinary person who want become programmer",
        hobby = arrayListOf("Ngoding", "Makan", "Gambar")
    ).run {
        // di sini menggunakan scope this untuk mengakses property
        // jadi objek disini diganti menggunakan keyword this
        // tidak perlu menuliskan keyword this secara eksplisit (tidak masalah)
        for (alphabet in this.name) { print("$alphabet ") }

        this
        // block run mengembalikan hasil dari blok kode yang dieksekusi pada objek
        // block run akan mengembalikan tipe data apapun terlepas dari tipe data variabel dari objek itu sendiri
        // misal menggunakan variabel dengan tipe objek maka kembaliannya bisa selain itu (tidak harus tipe yang sama)
    }

    // contoh penggunaan fungsi let ----------------------------------------------------
    val desc: String? = person.description

    desc?.let {
        println("Panjang string: ${it.length}")

        // mengembalikan panjang objek saat ini
        it.length

        // menggunakan keyword it untuk mengambil referensi objek saat ini
        // konsep sama seperti run, mengembalikan nilai hasil eksekusi objek
        // biasanya digunakan untuk pengecekan nilai null
    }

    println(desc)
    person.test()

    // contoh penggunaan fungsi apply ----------------------------------------------------
    person.apply {
        name = "Angga Susilo"
        age = 23

        // tidak mengembalikan nilai
        // menggunakan keyword this untuk mengambil referensi objek
        // biasanya digunakan untuk konfigurasi/memodifikasi properti
        // tidak perlu menuliskan keyword this secara eksplisit (tidak masalah)
    }

    // contoh penggunaan fungsi also  ----------------------------------------------------
    person.modified(person)

    // contoh penggunaan fungsi with  ----------------------------------------------------
    with(person) {
        this.name = "Patria Anggara Susilo Putra"
        this.age = 21

        // konsep hampir sama seperti run
        // fungsi with digunakan untuk memodifikasi properti tanpa harus mengembalikan nilainya
        // dengan menggunakan with, tidak perlu lagi menyimpan objek ini sebagai variabel terpisah
        // intinya tidak perlu menyimpan hasil perubahan ke dalam variabel lain, karena perubahan terjadi langsung dan meyimpan
        // perubahan tersebut langsung ke objeknya
    }

}