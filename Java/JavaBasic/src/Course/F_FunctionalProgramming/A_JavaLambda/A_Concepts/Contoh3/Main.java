package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh3;

// 1. buat class interface dan beri anotasi
@FunctionalInterface
interface Pow {

    // 2. buat hanya satu abstract method
    public double sum(double x);
}


// 3. Buat class implementasinya
// note: jika menggunakan lambda expressions, maka class implementasi tidak perlu dituliskan
class ResultPow implements Pow {

    @Override
    public double sum(double x) {
        return Math.pow(x, x);
    }

}


public class Main {
    public static void main(String[] args) {

        // 4. Buat objek baru dari class implementasi
        Pow resultOne = new ResultPow();
        System.out.println("Hasil pangkat: " + resultOne.sum(5));

        // 5. dari kode diatas, dapat dioptimasi dengan menggunakan lambda expressions
        Pow resultTwo = x -> Math.pow(x, x);
        System.out.println("Hasil pangkat: " + resultTwo.sum(4));

    }
}
