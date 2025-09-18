package Project.Project1_SystemAccount.Admin;

import Project.Project1_SystemAccount.Teks;
import java.util.Scanner;

public final class AdminSetting extends Admin {

    static RegisterAdmin info = new RegisterAdmin();

    public AdminSetting() {}

    public static void adminMenuSetting() {

        System.out.println("""
            
            --------------------------
            --- Menu Setting Admin ---
            --------------------------
            
                1. Ganti nama admin
                2. Reset Password
                3. Ganti Nomor Telephone
                4. Tampilkan Informasi Akun
                5. Hapus Akun
                6. Logout
                7. Kembali
            """);

        inputMenuSettingAdmin();
    }

    public static void inputMenuSettingAdmin() {
        Scanner inputSetting = new Scanner(System.in);
        byte pilihan;

        do {
            System.out.print("Masukkan pilihan: ");
            pilihan = inputSetting.nextByte();

            switch(pilihan) {
                case 1 -> { setNewAdminName(); }
                case 2 -> { setNewAdminPass(); }
                case 3 -> { setNewNumber(); }
                case 4 -> {
                    info.getInformationAccount();
                    MenuAdmin.goToAdmin();
                }
                case 5 -> { deleteMyAccount(); }
                case 6 -> { logoutAccountAdmin(); }
                case 7 -> { MenuAdmin.goToAdmin(); }
            }
        } while (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5);

    }

    public static void setNewAdminName() {
        Scanner inputAdminName = new Scanner(System.in);
        Admin admin = new RegisterAdmin();
        String newAdminName;

        System.out.print("Masukkan nama Admin: ");
        newAdminName = inputAdminName.nextLine();
        admin.setAdminName(newAdminName);
    }

    public static void setNewAdminPass() {
        Scanner inputAdminPass = new Scanner(System.in);
        Admin admin = new RegisterAdmin();
        String newAdminPass;

        System.out.print("Masukkan password: ");
        newAdminPass = inputAdminPass.nextLine();
        admin.setPassword(newAdminPass);

    }

    public static void setNewNumber() {
        Scanner inputNewNumber = new Scanner(System.in);
        Admin admin = new RegisterAdmin();
        String newNumber;

        System.out.print("Masukkan password: ");
        newNumber = inputNewNumber.nextLine();
        admin.setNoTelp(newNumber);
    }

    public static void deleteMyAccount() {
        RegisterAdmin deleteAccount = new RegisterAdmin();
        Scanner inputAdminName = new Scanner(System.in);
        String adminName;

        System.out.print("Masukkan password: ");
        adminName = inputAdminName.nextLine();
        deleteAccount.deleteAccountAdmin(adminName);
    }

    public static void logoutAccountAdmin() {
        LoginAdmin.condition = false;
        Teks.logoutAccountAdminSuccessfuly();
        MenuAdmin.goToAdmin();
    }
}
