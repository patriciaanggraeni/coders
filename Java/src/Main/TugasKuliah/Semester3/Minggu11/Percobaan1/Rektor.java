package TugasKuliah.Semester3.Minggu11.Percobaan1;

public class Rektor {
    
    // mengganti tipe parameter yang sebelumnya ICumlaude diubah ke Mahasiswa
    public void beriSertifikatCumlaude(Mahasiswa mahasiswa) {

        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");

        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIpkTertinggi();

        System.out.println("---------------------------------------------");

    } 
}