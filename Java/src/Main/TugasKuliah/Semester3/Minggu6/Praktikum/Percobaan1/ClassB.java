package TugasKuliah.Semester3.Minggu6.Praktikum.Percobaan1;

public class ClassB extends ClassA {
    
    public int z;

    public void getNilaiZ() { 
        System.out.println("nilai Z: " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah: " + (x+y+z));
    }
}
