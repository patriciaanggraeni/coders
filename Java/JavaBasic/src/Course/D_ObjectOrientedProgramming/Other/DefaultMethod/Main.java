package Course.D_ObjectOrientedProgramming.Other.DefaultMethod;

public class Main implements MyInterface {

    @Override
    public String getNama() {
        return this.nama;
    }

    @Override
    public byte getUmur() {
        return this.umur;
    }

    @Override
    public String getHobi() {
        // return MyInterface.super.getHobi();
        return this.hobi;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Nama: " + main.getNama());
        System.out.println("Umur: " + main.getUmur());

    }
}
