package TugasKuliah.Semester3.Minggu6.Materi.Tugas2;

public class Main {
    public static void main(String[] args) {
        
        User user = new User("Patria Anggara", "12345678", "Angga191");
        Setting setting = new Setting();

        // cetak info user
        user.cetakInfoAkun();

        // ubah data yang telah diinput lewat Class Setting
        setting.setNama("Anggara Susilo");
        setting.setPassword("87654321");
        setting.setNamaUser("Apolo1990");

        // cetak info user
        setting.cetakInfoAkun();

    }
}
