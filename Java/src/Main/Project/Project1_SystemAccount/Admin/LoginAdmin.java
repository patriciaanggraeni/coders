package Project.Project1_SystemAccount.Admin;

import Project.Project1_SystemAccount.Teks;
import java.util.Scanner;

public class LoginAdmin extends Admin {

    private String adminName;
    private String adminPass;
    public static boolean condition = false;

    LoginAdmin() {}

    public void loginAccount() {
        Scanner inputAdminName = new Scanner(System.in);
        Scanner inputAdminPass = new Scanner(System.in);

        if (!condition) {
            do {
                Teks.formLoginAdmin();
                System.out.print("Nama Admin : ");
                adminName = inputAdminName.nextLine();
                System.out.print("Password   : ");
                adminPass = inputAdminPass.nextLine();

                if (!RegisterAdmin.getAccount().getAdminName().equals(adminName)) {
                    Teks.checkDataLoginValidation();
                    condition = false;
                } else if (!RegisterAdmin.getAccount().getPassword().equals(adminPass)) {
                    Teks.checkDataLoginValidation();
                    condition = false;
                } else {
                    Teks.loginSuccessfuly(adminName);
                    condition = true;
                    MenuAdmin.goToAdmin();
                }
            } while (!RegisterAdmin.getAccount().getAdminName().equals(adminName) || !RegisterAdmin.getAccount().getAdminName().equals(adminPass) || !condition);
        } else {
            Teks.isLoginedAsAdmin();
            MenuAdmin.goToAdmin();
            condition = true;
        }
    }
}
