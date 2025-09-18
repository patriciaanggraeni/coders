package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Handphone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Phone asus = new Asus();
        PhoneUser angga = new PhoneUser(asus);

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            input.close();

            if(aksi.equalsIgnoreCase("1")){
                angga.nyalakanHp();
            } else if (aksi.equalsIgnoreCase("2")){
                angga.matikanHp();
            } else if (aksi.equalsIgnoreCase("3")){
                angga.besarkanVolume();
            } else if (aksi.equalsIgnoreCase("4")){
                angga.kecilkanVolume();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
