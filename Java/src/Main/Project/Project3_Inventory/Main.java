package Project.Project3_Inventory;

import java.util.Scanner;
import Project.Project3_Inventory.Admin.Login;
import Project.Project3_Inventory.Admin.Setting;
import Project.Project3_Inventory.Admin.Register;
import Project.Project3_Inventory.Message.Message;

public class Main {

    private static final Login logAdmin     = new Login();
    private static final Setting pengaturan = new Setting();
    private static final Message pesan      = new Message();
    private static final Register regAdmin  = new Register();

    public static void main(String[] args) {

        menuAwal();

    }

    public static void menuAwal() {

        Scanner inputPilihan = new Scanner(System.in);

        byte pilih;
        boolean kondisi = true;

        do {

            pesan.menuAwal();
            System.out.print("Masukkan pilihan menu: ");
            pilih = inputPilihan.nextByte();

            switch (pilih) {

                case 1 -> {
                    if (Register.cekDaftarAkun() == null) {
                        pesan.belumAdaData();
                    } else if (Login.kondisiMasuk) {
                        pesan.sudahMasukAkun();
                    } else {
                        logAdmin.masukAkunAdmin();
                    }
                }

                case 2 -> {
                    if (Login.kondisiMasuk) {
                        pesan.sudahMasukAkun();
                    } else {
                        regAdmin.registrasiAkun();
                    }
                }

                case 3 -> {
                    if (!Login.kondisiMasuk) {
                        pesan.belumMasukAkun();
                    } else {
                        pengaturan.menuPengaturan();
                    }
                }

                case 4 -> {
                    if (!Login.kondisiMasuk) {
                        pesan.belumMasukAkun();
                    } else {
                        System.out.println("coming soon");
                    }
                }

                case 5 -> {
                    System.out.println("\nKeluar dari program...");
                    System.out.println("Berhasil! Terimakasih! :)");
                    System.exit(0);
                }
            }

            if (pilih > 5) {
                pesan.pilihanSalah();
                kondisi = false;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || !kondisi);
    }
}
