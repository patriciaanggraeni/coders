package TugasKuliah.Semester3.Minggu11.Percobaan2;

public class Rektor {
    
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {

        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");


        mahasiswa.lulus();
        mahasiswa.meraihIpkTertinggi();

        System.out.println("---------------------------------------------");
    } 

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {

        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("---------------------------------------------");
    }
}