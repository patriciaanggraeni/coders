package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh5;

import java.util.Scanner;

public class Main implements SecondInterface {

    // buat variabel nama
    public String nama;

    // override method dari class interface
    @Override
    public String inputNama(String nama) {
        this.nama = nama;
        return this.nama;
    }

    // buat method getNama
    public String getNama() {
        return this.nama;
    }

    public static void main(String[] args) {

        // buat objek yang diperlukan
        Scanner sc = new Scanner(System.in);
        SecondInterface data = nama -> nama;
        Main main = new Main();

        // beri pesan inputan
        System.out.println("--------------------------");
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        // panggil fungsi yang dibutuhkan
        main.inputNama(nama);
        data.showName(main);

        // close scanner
        sc.close();
    }    
}