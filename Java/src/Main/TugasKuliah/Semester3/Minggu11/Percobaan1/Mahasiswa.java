package TugasKuliah.Semester3.Minggu11.Percobaan1;

public class Mahasiswa implements ICumlaude {
    
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    
    @Override
    public void meraihIpkTertinggi() {
        System.out.println("IPK-ku lebih dari 3.51");
    }

    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa, Nama ku " + this.nama);
        System.out.println("Aku Berkuliah di Kampus");
    }
}