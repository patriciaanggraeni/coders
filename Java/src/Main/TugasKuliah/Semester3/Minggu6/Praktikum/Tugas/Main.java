package TugasKuliah.Semester3.Minggu6.Praktikum.Tugas;

public class Main {
    public static void main(String[] args) {
        
        DaftarGaji daftarGaji = new DaftarGaji(3);

        // tambahkan pegawai
        daftarGaji.addPegawai(new Dosen("19904756371221", "Patria Anggara", "Jalan Wahyu Hidayat II", 21, 1000000));

        daftarGaji.addPegawai(new Dosen("1990475637122", "Dadar Sumono", "Jalan Jakarta No.19", 100, 200000));

        daftarGaji.addPegawai(new Dosen("19904756371223", "Hatsune Miku", "Jalan Wibu Akut No.10", 31, 2500000));

        daftarGaji.printSemuaGaji();

    }
}
