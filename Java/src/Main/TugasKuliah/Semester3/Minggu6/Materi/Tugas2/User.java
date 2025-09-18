package TugasKuliah.Semester3.Minggu6.Materi.Tugas2;

public class User extends Akun {

    public String namaUser;

    User() {}

    User(String nama, String password, String namaUser) {
        super(nama, password);
        this.namaUser = namaUser;
    }

    public String getNamaUser() {
        return this.namaUser;
    }

    public void cetakInfoAkun() {
        System.out.println("\n------- Data Akun User -------");
        System.out.println("User         : " + this.getNamaUser());
        System.out.println("Nama Lengkap : " + super.getNama());
        System.out.println("Password     : " + super.getPassword());
        System.out.println("------------------------------");
    }
    
}
