package TugasKuliah.Semester3.Minggu2.Tugas.Nomor1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Peminjaman peminjaman = new Peminjaman();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String namaMember, namaGame;
        int id, lamaSewa, harga;
        byte pilihan;

        do {
            menu();
            System.out.print("Input pilihan: ");
            pilihan = sc1.nextByte();

            switch (pilihan) {

                case 1 -> {
                    System.out.println("\n----- Input Peminjaman -----\n");
                    System.out.print("ID Peminjaman : ");
                    id = sc1.nextInt();
                    System.out.print("Nama Member   : ");
                    namaMember = sc2.nextLine();

                    do {
                        System.out.print("Nama Game     : ");
                        namaGame = sc2.nextLine();
                        if (peminjaman.cekGame(namaGame)) {
                            System.out.println("\n------------------------------------------------");
                            System.out.println(namaGame + " Masih dipinjam! mohon pilih lainnya!");
                            System.out.println("------------------------------------------------\n");
                        }
                    } while (peminjaman.cekGame(namaGame));

                    System.out.print("Lama Sewa     : ");
                    lamaSewa = sc1.nextInt();
                    System.out.print("Harga         : ");
                    harga = sc1.nextInt();

                    Peminjaman data = new Peminjaman(id, namaMember, namaGame, lamaSewa, harga);
                    peminjaman.tambahPeminjaman(data);
                    System.out.println("----------------------------");
                }

                case 2 -> peminjaman.tampilDataPeminjaman();

                case 3 -> {
                    System.out.println("\nKeluar dari program...");
                    System.out.println("Berhasil!");
                    return;
                }
            }
        } while (pilihan == 1 || pilihan == 2 || pilihan == 3);

        sc1.close();
        sc2.close();
    }

    private static void menu() {
        System.out.println("""
            
            ----- Tugas Nomor 1 -----
                1. Input Peminjaman
                2. Daftar Peminjaman
                3. Keluar
            ------------------------""");
    }
}
