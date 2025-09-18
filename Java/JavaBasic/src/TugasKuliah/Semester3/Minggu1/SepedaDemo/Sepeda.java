package TugasKuliah.Semester3.Minggu1.SepedaDemo;

public class Sepeda {

    private String merk;
    private int kecepatan;
    private int gear;

    Sepeda() {}

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void rem(int increment) {
        kecepatan -= increment;
    }

    public void cetakStatus() {
        System.out.println("merk      : " + merk);
        System.out.println("kecepatan : " + kecepatan);
        System.out.println("gear      : " + gear);
    }


}
