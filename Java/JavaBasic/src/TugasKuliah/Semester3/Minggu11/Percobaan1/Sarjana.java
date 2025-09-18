package TugasKuliah.Semester3.Minggu11.Percobaan1;

public class Sarjana extends Mahasiswa {
    
    public Sarjana(String nama) {
        super(nama);
    }

    // di Class Sarjana mengoverride methode lulus dan meraihIpkTertinggi
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIpkTertinggi() {
        System.out.println("IPK-ku lebih dari 3.51");
    }

}