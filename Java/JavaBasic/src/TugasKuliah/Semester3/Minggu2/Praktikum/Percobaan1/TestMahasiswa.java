package TugasKuliah.Semester3.Minggu2.Praktikum.Percobaan1;

public class TestMahasiswa {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";

        mhs2.nim = 666;
        mhs2.nama = "Samsudin";
        mhs2.alamat = "Jl. Penuh Berkah No 99A";
        mhs2.kelas = "3G";

        mhs3.nim = 191;
        mhs3.nama = "Patria Anggara";
        mhs3.alamat = "Jl. Wahyu HIdayat II";
        mhs3.kelas = "2B";

        mhs1.tampilBiodata();
        mhs2.tampilBiodata();
        mhs3.tampilBiodata();
    }
}
