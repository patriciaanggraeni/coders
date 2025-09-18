package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Vehicle;

public class Bike implements Vehicle {
    
    private int kecepatan;
    private int gear;

    Bike() {}

    // bisa bikin method geter dan seter
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

    // override method yang ada di class interface
    @Override
    public void tambahKecepatan(int speedUp) {
        this.kecepatan += speedUp;
    }

    @Override
    public void kurangiKecepatan(int speedDown) {
        this.kecepatan -= speedDown;
    }

    @Override
    public void gantiGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void infoKecepatan() {
        System.out.println("\n----- Informasi Kecepatan Motor -----\n");
        System.out.println("Kecepatan Motor: " + this.getKecepatan());
        System.out.println("Gear Motor: " + this.getGear());
        System.out.println("---------------------------------------\n");
    }

}
