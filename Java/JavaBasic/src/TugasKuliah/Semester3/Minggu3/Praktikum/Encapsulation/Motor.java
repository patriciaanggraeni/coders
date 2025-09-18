package TugasKuliah.Semester3.Minggu3.Praktikum.Encapsulation;

public class Motor {

    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
