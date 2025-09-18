package TugasKuliah.Semester3.Minggu9.Tugas.Overloading;

public class Main {
    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();

        System.out.println("\n----- Mencari Total Sudut -----");
        // memanggil method totalSudut dengan jumlah parameter satu
        int sudut1 = segitiga.totalSudut(360);
        System.out.println("Total Sudut Pertama: " + sudut1);

        // memanggil method totalSudut dengan jumlah parameter dua
        int sudut2 = segitiga.totalSudut(270, 180);
        System.out.println("Total Sudut Kedua  : " + sudut2);

        System.out.println("\n----- Mencari Total Keliling -----");
        // memanggil method keliling dengan jumlah parameter dua
        double keliling1 = segitiga.keliling(5, 13);
        System.out.printf("Total Keliling Pertama : %.1f\n",  keliling1);

        // memanggil method keliling dengan jumlah parameter tiga
        int keliling2 = segitiga.keliling(100, 100, 100);
        System.out.println("Total Keliling Kedua    : " + keliling2);


    }
}
