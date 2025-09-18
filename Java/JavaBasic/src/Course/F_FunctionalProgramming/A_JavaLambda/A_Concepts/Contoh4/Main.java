package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh4;

// 1. Buat class interface dengan anotasi
@FunctionalInterface
interface Source {

    // 2. buat hanay satu abstract method
    public String run(String source, String destination, String time);

}

// 3. buat class implementasi
// note: jika menggunakan lambda expressions, maka class implementasi tidak perlu dituliskan
class Destination implements Source {

    @Override
    public String run(String source, String destination, String time) {
        System.out.println("Hanya berlari dari " + source + " menuju ke " + destination);
        return "Waktu tempuh: " + time + " hari!";
    }

}


public class Main {
    public static void main(String[] args) {

        // 4. Buat objek baru dari class implementasi
        Source sourceOne = new Destination();
        String resultOne = sourceOne.run("Jakarta", "Bandung", "7");
        System.out.println(resultOne);

        // 5. dari kode diatas, dapat dioptimasi dengan menggunakan lambda expressions
        Source sourceTwo = (source, destination, time) -> {
            System.out.println("Hanya berlari dari " + source + " menuju ke " + destination);
            return "Waktu tempuh: " + time + " hari!";
        };

        String resultTwo = sourceTwo.run("Madiun", "Surabaya", "10");
        System.out.println(resultTwo);

    }
}
