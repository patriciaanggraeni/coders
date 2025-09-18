package TugasKuliah.Semester3.Minggu2.PersegiPanjang;

public class PersegiPanjang {

    private final int panjang;
    private final int lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    protected int panjangSisi() {
        return this.panjang;
    }

    protected int lebarSisi() {
        return this.lebar;
    }

    protected int hitungLuasPersegi() {
        return this.panjang * this.lebar;
    }

    protected int hitungKelilingPersegi() {
        return 2 * (this.panjang + this.lebar);
    }

    protected void tampilDataPersegPanjang() {
        System.out.println("\n----- Tampil Data Persegi Panjang-----\n");
        System.out.println("Panjang Sisi     : " + this.panjangSisi());
        System.out.println("Lebar Sisi       : " + this.lebarSisi());
        System.out.println("Luas Persegi     : " + this.hitungLuasPersegi());
        System.out.println("Keliling Persegi : " + this.hitungKelilingPersegi());
        System.out.println("----------------------------------------");
    }
}