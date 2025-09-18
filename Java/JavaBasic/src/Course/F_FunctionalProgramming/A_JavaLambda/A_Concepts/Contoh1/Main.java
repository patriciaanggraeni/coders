package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh1;

// 1. buat dulu interface classnya dan beri anotasi
@FunctionalInterface
interface Text {

    // 2. buat hanya satu method abstract
    public void showSomeText();
}

// 3. buat class implementasinya
// note: jika menggunakan lambda expressions, maka class implementasi tidak perlu dituliskan
class MyText implements Text {

    @Override
    public void showSomeText() {
        System.out.println("Belajar Java Lambda Expressions");
    }
}

public class Main {
    public static void main(String[] args) {

        // 3. membuat instansiasi objek tanpa lambda expressions
         Text myTextOne = new MyText();
         myTextOne.showSomeText();

        // 4. dari class implementasi, bisa dilakukan optimisasi kode
        // menggunakan java lambda expressions
        Text myTextTwo = () -> System.out.println("Belajar Java Lambda Expressions");
        myTextTwo.showSomeText();

    }
}
