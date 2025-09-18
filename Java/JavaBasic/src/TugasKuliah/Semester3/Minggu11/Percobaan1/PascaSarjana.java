package TugasKuliah.Semester3.Minggu11.Percobaan1;

public class PascaSarjana extends Mahasiswa {
    
    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIpkTertinggi() {
        System.out.println("IPK-ku lebih dari 3.71");
    }
}