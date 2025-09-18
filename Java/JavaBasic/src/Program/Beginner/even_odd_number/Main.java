package Program.Beginner.even_odd_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean hasil;
        int x;

        System.out.println("----------------------------------------------");
        System.out.println("----- Program Bilangan Ganjil atau Genap -----");
        System.out.println("----------------------------------------------");

        System.out.print("\nMasukkan bilangan: ");
        x = sc.nextInt();

        hasil = cekGanjilGenap(x);

        // buat kondisi jika bilangan ganjil atau genap
        if (hasil) {
            System.out.printf("\nBilangan %d adalah bilangan genap\n", x);
        } else {
            System.out.printf("\nBilangan %d adalah bilangan ganjil\n", x);
        }
        System.out.println("\n----------------------------------------------");

        sc.close();
    }

    // buat fungsi untuk mengcek apakah bilangan tersebut ganjil / genap
    private static boolean cekGanjilGenap(int x) {
        return x % 2 == 0;
    }
}
