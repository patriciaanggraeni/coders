package Program.Beginner.sum_two_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1, input2, hasil;

        System.out.println("-------------------------------------------");
        System.out.println("----- Program Menghitung Dua Bilangan -----");
        System.out.println("-------------------------------------------");

        System.out.print("\nMasukkan angka pertama: ");
        input1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        input2 = sc.nextInt();

        // panggil fungsi di sini
        hasil = sum(input1, input2);

        System.out.printf("\nHasil dari %d + %d = %d\n", input1, input2, hasil);
        System.out.println("-------------------------------------------");

        sc.close();
    }

    // buat fungsi untuk menjumlahakan dua bilangan
    private static int sum(int x, int y) {
        return x + y;
    }
}
