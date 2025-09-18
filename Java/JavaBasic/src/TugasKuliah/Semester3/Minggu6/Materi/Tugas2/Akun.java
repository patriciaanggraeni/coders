package TugasKuliah.Semester3.Minggu6.Materi.Tugas2;

public class Akun {
    
    public String nama;
    public String password;

    Akun() {}

    Akun(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return this.nama;
    }

    public String getPassword() {
        return this.password;
    }

    public void cetakInfoAkun() {}

}
