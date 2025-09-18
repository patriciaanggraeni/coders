package TugasKuliah.Semester3.Minggu9.Materi.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        MahasiswaReguler mhsR = new MahasiswaReguler("Patria Anggara", "2141720058", (byte)20);
        MahasiswaPrestasi mhsP = new MahasiswaPrestasi("Angga Susilo", "2141720059", (byte)19);

        Mahasiswa reguler = new Mahasiswa(mhsR);
        Mahasiswa prestasi = new Mahasiswa(mhsP);

        reguler.cetakInfoReguler();
        prestasi.cetakInfoPrestasi();

    }
}
