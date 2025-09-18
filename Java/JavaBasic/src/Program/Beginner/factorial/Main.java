package Program.Beginner.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, hasil;

        System.out.println("--------------------------------------");
        System.out.println("----- Program Bilangan Faktorial -----");
        System.out.println("--------------------------------------");

        System.out.print("\nMasukkan bilangan: ");
        n = sc.nextInt();

        // panggil fungsi dan tampilkan hasilnya
        hasil = faktorial(n);

        System.out.printf("\nHasil faktorial dari %d adalah %d\n", n, hasil);
        System.out.println("--------------------------------------");

        sc.close();
    }

    private static int faktorial(int fact) {
        int temp = 1;

        for (int i = fact; i >= 1; i--) {
            temp = temp * i;
        }

        return temp;
    }
}
