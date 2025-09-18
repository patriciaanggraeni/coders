package Project.Project1_SystemAccount.Admin;

import Project.Project1_SystemAccount.Main;
import Project.Project1_SystemAccount.Teks;
import java.util.Scanner;

public final class MenuAdmin extends Admin {

    MenuAdmin() {}

    public static void goToAdmin() {
        Scanner inputMenuAdmin = new Scanner(System.in);
        RegisterAdmin regAdmin = new RegisterAdmin();
        LoginAdmin logAdmin    = new LoginAdmin();
        byte pilihMenuAdmin;

        do {
            Teks.adminMenu();
            System.out.print("Masukkan menu: ");
            pilihMenuAdmin = inputMenuAdmin.nextByte();

            switch (pilihMenuAdmin) {
                case 1 -> {
                    regAdmin.registerAccount();
                } case 2 -> {
                    logAdmin.loginAccount();
                } case 3 -> {
                    if (!LoginAdmin.condition) {
                        Teks.isLogoutedAsAdmin();
                    } else {
                        AdminSetting.adminMenuSetting();
                    }
                } case 4 -> {
                    Main.returnHome();
                }
            }
        } while (pilihMenuAdmin == 1 || pilihMenuAdmin == 2 || pilihMenuAdmin == 3);
    }
}
