package TugasKuliah.Semester3.Minggu3.Praktikum.Encapsulation;

public class MotorDemo {
    public static void main(String[] args) {

        Motor motor = new Motor();

        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
