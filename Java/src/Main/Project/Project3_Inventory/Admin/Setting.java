package Project.Project3_Inventory.Admin;

import java.util.Scanner;
import Project.Project3_Inventory.Main;
import Project.Project3_Inventory.Message.Message;

public class Setting extends Admin {

    public Setting() {}

    static final Message pesan  = new Message();

    private final Scanner inputAdmin = new Scanner(System.in);
    private final Scanner inputNoTelp = new Scanner(System.in);
    private final Scanner inputIdAdmin = new Scanner(System.in);
    private final Scanner inputPilihan = new Scanner(System.in);
    private final Scanner inputCariData = new Scanner(System.in);
    private final Scanner inputAlamatEmail = new Scanner(System.in);

    public void menuPengaturan() {
        byte pilih;

        do {
            pesan.menuPengaturan();
            System.out.print("Masukkan pilihan menu >> ");
            pilih = inputPilihan.nextByte();

            switch (pilih) {

                case 1 -> gantiAdmin();

                case 2 -> gantiNomorTelephone();

                case 3 -> gantiAlamatEmail();

                case 4 -> {
                    if (Register.cekDaftarAkun() == null) {
                        pesan.belumAdaData();
                    } else if (!Login.kondisiMasuk) {
                        pesan.belumMasukAkun();
                    } else {
                        Register.tampilkanDaftarAkun();
                    }
                }

                case 5 -> konfirmasiHapusAkun();

                case 6 -> keluarDariAkun();

                case 7 -> Main.menuAwal();
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }

    private void gantiAdmin() {
        String admin, newAdmin;

         do {
            pesan.gantiAdmin();
            do {
                System.out.print("Admin Lama: ");
                admin = inputCariData.nextLine();

                if (admin.isBlank()) { pesan.adminKosong(); }
            } while (admin.isBlank());

            do {
                System.out.print("Admin Baru: ");
                newAdmin = inputAdmin.nextLine();

                if (newAdmin.isBlank()) { pesan.adminKosong(); }
            } while (newAdmin.isBlank());


            Admin temp = Register.getDataAkun();
            while (temp != null) {
                if (Register.getDataAkun().getAdmin().equals(admin)) {
                    temp.setAdmin(newAdmin);
                    pesan.berhasilGantiAdmin();
                    return;
                }
                temp = temp.next;
            }

            pesan.adminTidakDitemukan();

        } while (admin.isBlank() || newAdmin.isBlank());
    }

    private void gantiNomorTelephone() {
        String noTelp, newNoTelp;

        do {
            pesan.gantiNomor();
            do {
                System.out.print("Nomor Lama: ");
                noTelp = inputCariData.nextLine();

                if (noTelp.isBlank()) {
                    pesan.nomorTelpKosong();
                } else if (!noTelp.contains("+62") && !noTelp.contains("0")) {
                    pesan.nomorTelpTidakValid();
                }
            } while (noTelp.isBlank() || (!noTelp.contains("+62") && !noTelp.contains("0")));

            do {
                System.out.print("Nomor Baru: ");
                newNoTelp = inputNoTelp.nextLine();

                if (newNoTelp.isBlank()) {
                    pesan.nomorTelpKosong();
                } else if (!newNoTelp.contains("+62") && !newNoTelp.contains("0")) {
                    pesan.nomorTelpTidakValid();
                }
            } while (newNoTelp.isBlank() || (!newNoTelp.contains("+62") && !newNoTelp.contains("0")));


            Admin temp = Register.getDataAkun();
            while (temp != null) {
                if (Register.getDataAkun().getNomorTelephone().equals(noTelp)) {
                    temp.setNomorTelephone(newNoTelp);
                    pesan.berhasilGantiNomor();
                    return;
                }
                temp = temp.next;
            }

            pesan.nomorTidakDitemukan();

        } while (noTelp.isBlank() || (!noTelp.contains("+62") && !noTelp.contains("0")) ||
                 newNoTelp.isBlank() || (!newNoTelp.contains("+62") && !newNoTelp.contains("0")));
    }

    private void gantiAlamatEmail() {
       String alamatEmail, newAlamatEmail;

        do {
            pesan.gantiAlamatEmail();
            do {
                System.out.print("Email Lama: ");
                alamatEmail = inputCariData.nextLine();

                if (alamatEmail.isBlank()) {
                    pesan.nomorTelpKosong();
                } else if (alamatEmail.isBlank() && !alamatEmail.contains("@gmail.com")) {
                    pesan.alamatEmailTidakValid();
                }
            } while (alamatEmail.isBlank() || (alamatEmail.isBlank() && !alamatEmail.contains("@gmail.com")));

            do {
                System.out.print("Email Baru: ");
                newAlamatEmail = inputAlamatEmail.nextLine();

                if (newAlamatEmail.isBlank()) {
                    pesan.nomorTelpKosong();
                } else if (newAlamatEmail.isBlank() && !newAlamatEmail.contains("@gamil.com")) {
                    pesan.alamatEmailTidakValid();
                }
            } while (alamatEmail.isBlank() && !alamatEmail.contains("@gmail.com") ||
                    (newAlamatEmail.isBlank() && !newAlamatEmail.contains("@gmail.com")));


            Admin temp = Register.getDataAkun();
            while (temp != null) {
                if (Register.getDataAkun().getAlamatEmail().equals(alamatEmail)) {
                    temp.setAlamatEmail(newAlamatEmail);
                    pesan.berhasilGantiEmail();
                    return;
                }
                temp = temp.next;
            }

            pesan.alamatEmailTidakDitemukan();

        } while (alamatEmail.isBlank() || newAlamatEmail.isBlank() ||
                (newAlamatEmail.isBlank() || !newAlamatEmail.contains("@gmail.com")));
    }

    private void hapusAkun(String idAdmin) {

        if (Register.kosong()) {
            pesan.belumAdaData();
        } else {
            if (Register.head.getAdmin().equals(idAdmin)) {
               if (Register.head.next == null) {
                   Register.head = null;
               } else {
                    Register.head.next.prev = null;
                    Register.head = Register.head.next;
                    Register.head.next = null;
               }
            } else {
                Admin current = Register.head;
                Admin temp = current;

                while (current != Register.tail && !current.getIdAdmin().equals(idAdmin)) {
                    temp = current;
                    current = current.next;
                }

                if (current == Register.tail && !current.getIdAdmin().equals(idAdmin)) {
                    pesan.adminTidakDitemukan();
                    menuPengaturan();
                }

                temp.next = current.next;
                current.next.prev = temp;
                Register.jumlahAKun--;
            }
        }
    }

    private void konfirmasiHapusAkun() {
        String idAdmin;
        char konfirmasi;

        do {
            pesan.hapusAkunAdmin();

            do {
                System.out.print("ID Admin: ");
                idAdmin = inputIdAdmin.nextLine();

                if (idAdmin.isBlank()) { pesan.idAdminKosong(); }
            } while (idAdmin.isBlank());

            System.out.print("\nKonfirmasi penghapusan Akun [y/n]: ");
            konfirmasi = inputPilihan.next().charAt(0);

            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                hapusAkun(idAdmin);
                pesan.akunBerhasilDiHapus();
                menuPengaturan();
            } else if (konfirmasi == 'n' || konfirmasi == 'N') {
                pesan.hapusAkunDiBatalkan();
                Login.kondisiMasuk = true;
                menuPengaturan();
            } else {
                pesan.pilihanSalah();
                Login.kondisiMasuk = true;
                menuPengaturan();
            }

        } while ((konfirmasi != 'y') && (konfirmasi != 'n'));


    }

    private void keluarDariAkun() {
        Scanner inputPilihan = new Scanner(System.in);

        char pilih;
        boolean kondisi;

        do {
            pesan.konfirmasiKeluarAkun();
            System.out.print("Yakin mau keluar Akun? [y/n] ");
            pilih = inputPilihan.next().charAt(0);

            if (pilih == 'y' || pilih == 'Y') {
                Login.kondisiMasuk = false;
                pesan.berhasilKeluarAkun();
                Main.menuAwal();
                kondisi = true;
            } else if (pilih == 'n' || pilih == 'N') {
                menuPengaturan();
                kondisi = true;
            } else {
                pesan.pilihanSalah();
                kondisi = false;
            }

        } while (!kondisi);
    }
}
