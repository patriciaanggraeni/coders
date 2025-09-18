package TugasKuliah.Semester3.Minggu6.Praktikum.Percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z: " + z);
    }

    public void getJumlah() {
        int hasil = this.getX() + this.getY() + this.z;
        System.out.println("jumlah: " + hasil);
    }
}
