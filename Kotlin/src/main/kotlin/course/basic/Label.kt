package basic

/**
 * Label adalah penanda, semua ekspresi di Kotlin bisa ditandai dengan label. Untuk membuat label di Kotlin, cukup
 * membuat nama labelnya diikuti oleh tanda @. Penggunaannya diintegrasikan dengan kata kunci break, continue dan return.
 * Jika menggunakan break, continue, dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun
 * dengan menggunakan label, bisa menentukan ke label mana kode akan berhenti.
 */

private fun labelBreak() {

    loopIBreak@ for (i in 1 .. 10) {
        loopJBreak@ for (j in 1 .. 10) {
            println("$i x $j = ${i * j}")

            // penggunaan label
            if (i == 3) break@loopIBreak
        }
        println()
    }

}

private fun labelContinue() {

    loopIContinue@ for (i in 1 .. 10) {
        loopJContinue@ for (j in 1 .. 10) {
            println("$i x $j = ${i * j}")

            // penggunaan label
            if (i == 3) break@loopIContinue
        }
        println()
    }

}

private fun test(name: String, param: (String) -> Unit): Unit = param(name)
private fun labelReturn() {

    test("Angga") testLabel@ {
        if (it == "Angga") return@testLabel
    }

    println("\nKode dieksekusi")
}

fun main() {

    println()

    // memanggil fungsi
    labelBreak()
    labelContinue()
    labelReturn()
    println("---------------")
}