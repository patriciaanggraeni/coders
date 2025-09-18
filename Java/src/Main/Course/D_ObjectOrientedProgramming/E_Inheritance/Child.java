package Course.D_ObjectOrientedProgramming.E_Inheritance;

public class Child extends Parent {

    byte umur = 0;
    String alamat = "Alamat tidak ada";

    Child() {}

    Child(String nama, String nim, byte umur, String alamat) {
        super(nama, nim);
        this.umur = umur;
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }

}
