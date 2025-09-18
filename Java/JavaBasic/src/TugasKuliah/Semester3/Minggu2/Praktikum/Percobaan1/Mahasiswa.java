package TugasKuliah.Semester3.Minggu2.Praktikum.Percobaan1;

public class Mahasiswa {

    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    Mahasiswa () {}

    public void tampilBiodata() {
        System.out.println("Nim    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas  : " + kelas);
        System.out.println(" ");
    }
}
