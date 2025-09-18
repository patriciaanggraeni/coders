package Project.Project1_SystemAccount;

import Project.Project1_SystemAccount.Admin.MenuAdmin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        returnHome();
    }

    public static void returnHome() {
        Scanner inputMenuHome = new Scanner(System.in);
        byte pilihMenuHome;

        Teks.homeMenu();
        do {
            System.out.print("Masukkan menu: ");
            pilihMenuHome = inputMenuHome.nextByte();

            switch (pilihMenuHome) {
                case 1 -> { MenuAdmin.goToAdmin(); }
                case 2 -> { System.out.println("belum jadi"); }
                case 3 -> { return;}
            }

        } while (pilihMenuHome == 1);

        inputMenuHome.close();
    }
}
