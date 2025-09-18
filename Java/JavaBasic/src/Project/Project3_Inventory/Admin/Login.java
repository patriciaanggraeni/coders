package Project.Project3_Inventory.Admin;

import java.util.Scanner;
import Project.Project3_Inventory.Main;
import Project.Project3_Inventory.Message.Message;

public final class Login extends Admin {

    public static boolean kondisiMasuk = false;
    private final Message pesan = new Message();

    public Login() {}

    public void masukAkunAdmin() {
        Scanner inputAdmin = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);

        String admin;
        String password;
        Admin temp = Register.head;

        if (!kondisiMasuk) {

            do {
                pesan.formLoginAkun();

                System.out.print("Admin    : ");
                admin = inputAdmin.nextLine();
                System.out.print("Password : ");
                password = inputPassword.next();


                while (temp != Register.tail && !temp.getAdmin().equals(admin) && !temp.getPassword().equals(password)) {
                    temp = temp.next;
                }

                if (!temp.getAdmin().equals(admin) || !temp.getPassword().equals(password)) {
                    pesan.masukAkunGagal();
                    kondisiMasuk = false;
                } else {
                    pesan.masukAkunBerhasil();
                    kondisiMasuk = true;
                }

            } while (temp != Register.tail && !temp.getAdmin().equals(admin) && !temp.getPassword().equals(password));

        } else {
            pesan.sudahMasukAkun();
            kondisiMasuk = true;
            Main.menuAwal();
        }
    }
}
