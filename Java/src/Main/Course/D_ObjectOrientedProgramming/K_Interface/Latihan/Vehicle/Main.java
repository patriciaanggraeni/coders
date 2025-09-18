package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Vehicle;

public class Main {
    public static void main(String[] args) {
        
        // buat objek dari class yang diimplementasikan interface
        Bicycle sepeda = new Bicycle();
        Bike motor = new Bike();

        // set awal kecepatan dan gear sepeda
        sepeda.setKecepatan(10);
        sepeda.setGear(3);

        motor.setKecepatan(100);
        motor.setGear(5);

        // cetak informasi kecepatan sepeda
        sepeda.infoKecepatan();
        motor.infoKecepatan();

        // tambah kecepatan dan gear sepeda
        sepeda.tambahKecepatan(5);
        sepeda.gantiGear(5);
        sepeda.infoKecepatan();

        motor.tambahKecepatan(50);
        motor.gantiGear(7);
        motor.infoKecepatan();

    }
}
