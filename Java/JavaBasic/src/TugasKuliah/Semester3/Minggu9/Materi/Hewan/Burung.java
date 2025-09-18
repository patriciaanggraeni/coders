package TugasKuliah.Semester3.Minggu9.Materi.Hewan;

public class Burung extends Hewan {

    public String makanan;
    public byte bentangSayap;

    Burung(String nama, String jenis, byte umur, String kelompok, String makanan, byte bentangSayap) {
        super(nama, jenis, umur, kelompok);
        this.makanan = makanan;
        this.bentangSayap = bentangSayap;
    }

    @Override
    public void cetakInfoHewan() {
        System.out.println("----- Data Hewan Burung -----");
        System.out.println("Nama : " + this.nama);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Umur : " + this.umur);
        System.out.println("Kelompok : " + this.kelompok);
        System.out.println("Makanan  : " + this.makanan);
        System.out.println("Bentang Sayap : " + this.bentangSayap + "m");
        System.out.println("=============================");
    }
}
