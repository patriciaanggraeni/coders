package Course.D_ObjectOrientedProgramming.F_OverridingOverloading;

public class Child  extends Parent {

    byte umur = 0;
    String alamat = "Alamat tidak ada";

    Child() {}

    // di sini ada pengulangan data juga, kita bisa melakukan overloading (bukan overriding)
    // konsepnya sama seperti overidding, menggunakan super class
    Child(String nama, String nim, byte umur, String alamat) {
        super(nama, nim); // (super(parameter); > memanggil constructor berparameter / tidak dari class induk)
        this.umur = umur;
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void setNama() {
        this.nama = nama;
    }

    // sebernarnya ini sudah termasuk overriding, akan tetapi kuran efisien (masih DRY)
    // bisa menggunakan method super class
    @Override // hanya menegaskan bahwa fungsi ini di override / Overriding
    public void print() {
        super.print(); // (super.method > memanggil method dari class induk)
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}