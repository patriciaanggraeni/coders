package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Vehicle;

public class Bicycle implements Vehicle {

    private int kecepatan;
    private int gear;

    Bicycle() {}

    // bisa bikin method getter dan seter
    public int getKecepatan() {
        return this.kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // tulis ulang semua method yang ada di class interface sebelumnya
    @Override
    public void gantiGear(int gear){
        this.gear = gear;
    }

    @Override
    public void tambahKecepatan(int speedUp) {
        this.kecepatan += speedUp;
    }

    @Override
    public void kurangiKecepatan(int speedDown) {
        this.kecepatan -= speedDown;
    }

    @Override
    public void infoKecepatan() {
        System.out.println("\n----- Informasi Kecepatan Sepeda -----\n");
        System.out.println("Kecepatan Sepeda: " + this.getKecepatan());
        System.out.println("Gear Sepeda: " + this.getGear());
        System.out.println("----------------------------------------\n");
    }
}