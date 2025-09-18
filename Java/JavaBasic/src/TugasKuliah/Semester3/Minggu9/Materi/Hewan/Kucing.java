package TugasKuliah.Semester3.Minggu9.Materi.Hewan;

import java.sql.SQLOutput;

public class Kucing extends Hewan {

    public String makanan;

    Kucing(String nama, String jenis, byte umur, String kelompok, String makanan) {
        super(nama, jenis, umur, kelompok);
        this.makanan = makanan;
    }

    @Override
    public void cetakInfoHewan() {
        System.out.println("----- Data Hewan Kucing -----");
        System.out.println("Nama : " + this.nama);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Umur : " + this.umur);
        System.out.println("Kelompok : " + this.kelompok);
        System.out.println("Makanan  : " + this.makanan);
        System.out.println("=============================");
    }

}
