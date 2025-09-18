package Project.Project1_SystemAccount.Admin;

import Project.Project1_SystemAccount.Teks;
import java.util.Scanner;

public class RegisterAdmin extends Admin {

    Admin head, tail;
    private int length;
    private static RegisterAdmin account;
    private String fullName, adminName, adminPass;
    private String verifyAdminPass, noTelp, email;

    public RegisterAdmin() {}

    public RegisterAdmin(String fullName, String adminName, String adminPass, String verifyAdminPass, String noTelp, String email) {
        super(fullName, adminName, adminPass, verifyAdminPass, noTelp, email);
    }

    private boolean isEmpty() {
        return length == 0 && head == null;
    }

    private int getLength() {
        return this.length;
    }

    protected static Admin getAccount() { return account;}

    public void registerAccount() {
        Scanner inputFullName  = new Scanner(System.in);
        Scanner inputAdminName = new Scanner(System.in);
        Scanner inputAdminPass = new Scanner(System.in);
        Scanner inputVerifPass = new Scanner(System.in);
        Scanner inputNoTelp    = new Scanner(System.in);
        Scanner inputEmail     = new Scanner(System.in);

        System.out.println(" ");
        Teks.textRegAdmin();
        boolean condition = true;

        while (condition) {
            do {
                do {
                    System.out.print("Nama Lengkap    : ");
                    fullName = inputFullName.nextLine();
                    if (fullName.isBlank()) { Teks.fullNameIsEmpty(); }
                } while (fullName.isBlank());

                do {
                    System.out.print("Nama Admin      : ");
                    adminName = inputAdminName.nextLine();
                    if (adminName.isBlank()) { Teks.adminNameIsEmpty(); }
                } while (adminName.isBlank());

                do {
                    System.out.print("Password        : ");
                    adminPass = inputAdminPass.nextLine();
                    if (adminPass.isBlank()) {
                        Teks.passwordIsEmpty();
                    } else if (!adminPass.isBlank() && adminPass.length() < 8) {
                        Teks.passVeryShort();
                    }
                } while (adminPass.isBlank() || adminPass.length() < 8);

                do {
                    System.out.print("Ulangi Password : ");
                    verifyAdminPass = inputVerifPass.nextLine();

                    if (verifyAdminPass.isBlank()) {
                        Teks.passwordIsEmpty();
                    } else if (!verifyAdminPass.isBlank() && (!verifyAdminPass.equals(adminPass))) {
                        Teks.passwordNotMatch();
                    }
                } while (verifyAdminPass.isBlank() || (!verifyAdminPass.isBlank() && !verifyAdminPass.equals(adminPass)));

                do {
                    System.out.print("Nomor Telephone : ");
                    noTelp = inputNoTelp.nextLine();
                    if (!noTelp.startsWith("0") && !noTelp.startsWith("+62")) {
                        Teks.noValidTelph();
                    } else if (noTelp.isBlank()) {
                        Teks.noTelphIsEmpty();
                    }
                } while ((!noTelp.startsWith("0") && !noTelp.startsWith("+62")) || noTelp.isBlank());

                do {
                    System.out.print("Masukkan email  : ");
                    email = inputEmail.nextLine();
                    if (!email.contains("@gmail.com")) {
                        Teks.noValidEmail();
                    } else if (email.isBlank())  {
                        Teks.emailIsEmpty();
                    }
                } while (!email.contains("@gmail.com") || email.isBlank());

            } while (fullName.isBlank() || adminName.isBlank() || (adminPass.length() < 8 || adminPass.isBlank()));

            condition = false;
        }

        account = new RegisterAdmin(fullName, adminName, adminPass, verifyAdminPass, noTelp, email);
        addAdminAccount(account);
        System.out.println("\nDaftar Akun Admin berhasil!");
        System.out.println("-----------------------------------------------");
    }

    private void addAdminAccount(Admin account) {
        if (isEmpty()) {
            head = account;
        } else {
            tail.next = account;
            account.prev = tail;
        }
        tail = account;
        length++;
    }

    public void deleteAccountAdmin(String adminName) {
        Admin adminAccount = head;
        Admin temp = adminAccount;

        if (isEmpty()) {
            Teks.textEmptyAdminAccount();
        } else {
            if (head.getAdminName().equals(adminName)) {
                if (head.next == null) {
                    head = null;
                } else {
                    head.next.prev = null;
                    head = head.next;
                    head.next = null;
                }
            } else {
                while (adminAccount != tail && !adminAccount.getAdminName().equals(adminName)) {
                    temp = adminAccount;
                    adminAccount = adminAccount.next;
                }

                if (adminAccount.next == null && !adminAccount.getAdminName().equals(adminName)) {
                    Teks.adminNameNotFound();
                    return;
                } else {
                    temp.next = adminAccount.next;
                    adminAccount.next.prev = temp;
                }
            }
            length--;
            System.out.println("\nAkun berhasil dihapus!");
            System.out.println("---------------------------------------");
        }
    }

    public void access(String listAccount) {
        if (listAccount.equals(getAccountType())) {
            Teks.accessVisibility();
        } else {
            getInformationAccount();
        }
    }

    public void getInformationAccount() {
        if (isEmpty()) {
            Teks.textEmptyAdminAccount();
        } else {
            Teks.listAdminAccount();
            System.out.println(" ");
            accountType();

           RegisterAdmin myAccount = (RegisterAdmin) head;
            while (myAccount != null) {
                System.out.println("Full Name      : " + myAccount.getFullName());
                System.out.println("Admin No       : " + myAccount.getNoTelp());
                System.out.println("Admin email    : " + myAccount.getEmail());
                System.out.println("Admin Name     : " + myAccount.getAdminName());
                System.out.println("Admin Password : " + myAccount.getPassword());
                System.out.println(" ");
                myAccount = (RegisterAdmin) myAccount.next;
            }
            System.out.println("Jumlah akun: " + getLength());
        }
    }
}
