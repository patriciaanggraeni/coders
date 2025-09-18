package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Vehicle;

public interface Vehicle {

    // membuat method untuk diimplementasikan ke class implementnya
    void tambahKecepatan(int speedUp);
    void kurangiKecepatan(int speedDown);
    void gantiGear(int gear);
    void infoKecepatan();
}