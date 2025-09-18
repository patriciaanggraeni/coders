package TugasKuliah.Semester3.Minggu6.Materi.Tugas2;

public class Setting extends User {

    Setting() {}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void cetakInfoAkun() {
        System.out.println("\n------- Data Akun User (Baru) -------");
        System.out.println("User         : " + this.getNamaUser());
        System.out.println("Nama Lengkap : " + super.getNama());
        System.out.println("Password     : " + super.getPassword());
        System.out.println("-------------------------------------");
    }
}
