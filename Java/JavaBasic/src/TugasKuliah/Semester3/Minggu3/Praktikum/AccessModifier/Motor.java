package TugasKuliah.Semester3.Minggu3.Praktikum.AccessModifier;

public class Motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn) {
            if (kecepatan >= 100) {
                System.out.println("Kecepatan sudah mencapai maksimal! tidak bisa tambah kecepatan lagi!");
            } else {
                kecepatan  += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangKecepatan() {
        if (kontakOn) {
            kecepatan  -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
