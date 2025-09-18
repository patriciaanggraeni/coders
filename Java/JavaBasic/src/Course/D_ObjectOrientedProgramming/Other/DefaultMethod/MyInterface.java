package Course.D_ObjectOrientedProgramming.Other.DefaultMethod;

public interface MyInterface {

    String nama = "Anggara";
    byte umur = 12;
    String hobi = "Ngoding";

    String getNama();
    byte getUmur();

    // method default tidak akan memaksa class implement untuk meng-ovwerride method default
    // seperti diberi sebuah opsi
    // method default wajib ada body beserta isinya
    default String getHobi() {
        return this.hobi;
    }

}
