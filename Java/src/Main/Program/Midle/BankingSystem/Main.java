package Program.Midle.BankingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----------------------------------------------");
        System.out.println("----- Program Banking System dengan Java -----");
        System.out.println("----------------------------------------------\n");

        Scanner sc = new Scanner(System.in);
        byte pilih;
        int n;

        System.out.print("Masukkan jumlah customer : ");
        n = sc.nextInt();

        Bank dataCustomers[] = new Bank[n];
        for (int i = 0; i < dataCustomers.length; i++) {
            dataCustomers[i] = new Bank();
            dataCustomers[i].bukaAkun();
        }

        do {
            System.out.println("**********************************");
            System.out.println("*** Program Banking dengan Java***");
            System.out.println("**********************************");
            System.out.println("1. Tampilkan data Akun Bank");
            System.out.println("2. Cari Data Akun");
            System.out.println("3. Deposit Uang");
            System.out.println("4. Penarikan Uang");
            System.out.println("5. Keluar");
            System.out.println("**********************************");

            System.out.print("Masukan pilihan: ");
            pilih = sc.nextByte();

            switch (pilih) {
                case 1 -> {
                    for (int i = 0; i < dataCustomers.length; i++) {
                        dataCustomers[i].tampilkanDataAkun();
                    }
                }

                case 2 -> {
                    System.out.println("Masukkan nomor akun: ");
                    String no = sc.next();
                    boolean ketemu = false;

                    for (Bank temp : dataCustomers) {
                        ketemu = temp.search(no);
                        if (ketemu) {
                            break;
                        } else {
                            System.out.println("Data Akun tidak ditemukan!");
                        }
                        break;
                    }
                }

                case 3 -> {
                    System.out.println("Masukkan nomor akun: ");
                    String no = sc.next();
                    boolean ketemu;

                    for (Bank temp : dataCustomers) {
                        ketemu = temp.search(no);

                        if (ketemu) {
                            temp.deposit();
                            break;
                        } else {
                            System.out.println("Data akun tidak ditemukan!");
                        }
                    }
                }

                case 4 -> {
                    System.out.println("Masukkan nomor akun: ");
                    String no = sc.next();
                    boolean ketemu;

                    for (Bank temp : dataCustomers) {
                        ketemu = temp.search(no);

                        if (ketemu) {
                            temp.tarikUang();
                            break;
                        } else {
                            System.out.println("Data Akun tidak ditemukan!");
                            break;
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Sampai jumpa lagi :)");
                    return;
                }
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    }
}