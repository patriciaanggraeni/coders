package Project.Project3_Inventory.Admin;

import Project.Project3_Inventory.Message.Message;
import java.util.Scanner;

public final class Register extends Admin {

    private String idAdmin;
    public static int jumlahAKun;
    private String namaLengkap, admin, password, nomorTelephone, alamatEmail;

    private static Admin dataAkun;
    public static Admin head, tail;

    private static final Message pesan = new Message();

    public Register() {
        head = tail = null;
        jumlahAKun = 0;
    }

    public static Admin cekDaftarAkun() { return head; }

    public static Admin getDataAkun() { return dataAkun; }

    public static int getJumlahAKun() { return jumlahAKun; }

    public static boolean kosong() { return head == null && jumlahAKun == 0; }

    public void registrasiAkun() {
        Scanner inputNamaLengkap = new Scanner(System.in);
        Scanner inputIdAdmin = new Scanner(System.in);
        Scanner inputAdmin = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);
        Scanner inputNomorTelephone = new Scanner(System.in);
        Scanner inputAlamtEmail = new Scanner(System.in);

        boolean kondisiDaftar = true;
        pesan.formRegistrasiAkun();

        while (kondisiDaftar) {
            do {
                do {
                    System.out.print("Nama Lengkap    : ");
                    namaLengkap = inputNamaLengkap.nextLine();

                    if (namaLengkap.isBlank()) { pesan.namaLengkapKosong(); }
                } while (namaLengkap.isBlank());

                do {
                    System.out.print("ID Admin        : ");
                    idAdmin = inputIdAdmin.nextLine();

                    if (idAdmin.isBlank()) { pesan.idAdminKosong(); }
                } while (idAdmin.isBlank());

                do {
                    System.out.print("Admin           : ");
                    admin = inputAdmin.nextLine();

                    if (admin.isBlank()) { pesan.adminKosong(); }
                } while (admin.isBlank());

                do {
                    System.out.print("Password        : ");
                    password = inputPassword.nextLine();

                    if (password.isBlank()) {
                        pesan.passwordKosong();
                    } else if (password.length() < 8) {
                        pesan.passwordKurangKuat();
                    }
                } while (password.isBlank() || password.length() < 8);

                do {
                    System.out.print("Nomor Telephone : ");
                    nomorTelephone = inputNomorTelephone.nextLine();

                    if (nomorTelephone.isBlank()) {
                        pesan.nomorTelpKosong();
                    } else if (!nomorTelephone.startsWith("+62") && !nomorTelephone.startsWith("0")) {
                        pesan.nomorTelpTidakValid();
                    }
                } while (nomorTelephone.isBlank() || (!nomorTelephone.startsWith("+62") && !nomorTelephone.startsWith("0")));

                do {
                    System.out.print("Alamat Email    : ");
                    alamatEmail = inputAlamtEmail.nextLine();

                    if (alamatEmail.isBlank()) {
                        pesan.alamatEmailKosong();
                    } else if (!alamatEmail.contains("@gmail.com")) {
                        pesan.alamatEmailTidakValid();
                    }
                } while (alamatEmail.isBlank() || !alamatEmail.contains("@gmail.com"));

            } while (namaLengkap.isBlank() || idAdmin.isBlank() || password.isBlank() || password.length() < 8 ||
                     nomorTelephone.isBlank() || (!nomorTelephone.startsWith("+62") && (!nomorTelephone.startsWith("0"))) ||
                     alamatEmail.isBlank() ||  !alamatEmail.contains("@gmail.com"));

            kondisiDaftar = false;
        }

        dataAkun = new Admin(namaLengkap, idAdmin, admin, password, nomorTelephone, alamatEmail);
        tambahAkun(dataAkun);
    }

    private void tambahAkun(Admin akun) {
        if (kosong()) {
            head = akun;
        } else {
            tail.next = akun;
            akun.prev = tail;
        }
        tail = akun;
        jumlahAKun++;
        pesan.daftarAkunBerhasil();
    }

    public static void tampilkanDaftarAkun() {
        if (kosong()) {
            System.out.println("pesan");
        } else {
            Admin basisAkun = head;

            pesan.daftarAkunAdmin();
            tampilkanJenisAkun();
            while (basisAkun != null) {
                System.out.println(" ");
                System.out.println("Nama Lengkap    : " + basisAkun.getNamaLengkap());
                System.out.println("ID Admin        : " + basisAkun.getIdAdmin());
                System.out.println("Admin           : " + basisAkun.getAdmin());
                System.out.println("Password        : " + basisAkun.getPassword());
                System.out.println("Nomor Telephone : " + basisAkun.getNomorTelephone());
                System.out.println("Alamat Email    : " + basisAkun.getAlamatEmail());
                basisAkun = basisAkun.next;
            }
        }
        pesan.jumlahAkunAdmin(getJumlahAKun());
    }
}
