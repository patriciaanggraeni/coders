package Project.Project3_Inventory.Admin;

import Project.Project3_Inventory.Template.Akun;

public class Admin extends Akun {

    Admin next, prev;
    private String idAdmin;
    private static final String jenisAkun = "ADMIN";

    Admin() {}

    Admin(String namaLengkap, String idAdmin, String admin, String password, String nomorTelephone, String alamatEmail) {
        super(namaLengkap, admin, password, nomorTelephone, alamatEmail);
        this.idAdmin = idAdmin;
        this.next = this.prev = null;
    }

    @Override
    public void fungsi() {}

    public static void tampilkanJenisAkun() {
         System.out.println(">> Jenis Akun " + jenisAkun);
    }

    public String getIdAdmin() {
        return idAdmin;
    }
}
