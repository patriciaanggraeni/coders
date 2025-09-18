package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh2;

// 1. Buat class interfacenya dan tambahakn anotasi
@FunctionalInterface
interface SumTwoNumber {

    // 2. deklarasi hanya satu method abstract
    public void sum(int a, int b);
}


// 3. buat class inplementasinya
// note: jika menggunakan lambda expressions, maka class implementasi tidak perlu dituliskan
class ResultSum implements SumTwoNumber {

    @Override
    public void sum(int a, int b) {
        System.out.println("Hasil dari " + a + " + " + b + " = " + (a+b));
    }
}

public class Main {
    public static void main(String[] args) {

        // 4. Buat objek baru dari class hasil implementasi
         SumTwoNumber resultOne = new ResultSum();
         resultOne.sum(5,10);

        // 5. dari kode diatas, dapat dioptimasi dengan menggunakan lambda expressions
        SumTwoNumber resultTwo = (a, b) -> System.out.println("Hasil dari " + a + " + " + b + " = " + (a+b));
        resultTwo.sum(12, 13);
    }
}
