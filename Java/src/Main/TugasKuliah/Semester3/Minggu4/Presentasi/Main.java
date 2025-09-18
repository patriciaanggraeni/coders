package TugasKuliah.Semester3.Minggu4.Presentasi;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("123", "Burhan");
        Mahasiswa mhs2 = new Mahasiswa("456", "Rizal");
        Mahasiswa mhs3 = new Mahasiswa("789", "Rahmat");

        Mahasiswa[] listMhs = {mhs1, mhs2, mhs3};

        Dosen dosen = new Dosen("12345", listMhs, listMhs.length);
        dosen.tampilData();
    }
}