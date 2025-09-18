package Course.A_Basic.SwitchCase_09;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // switch case, nanti ada variabel yang menjadi switchnya
        // misal, menampilkan hari dengan menginputkan angka
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("\nMasukkan angka: ");
        pilih = sc.nextInt();

        // menggunakan switch yang ditingkatkan / enhanced switch
        switch (pilih) {
            case 1 -> System.out.println("Hari senin");
            case 2 -> System.out.println("Hari selasa");
            case 3 -> System.out.println("Hari rabu");
            case 4 -> System.out.println("Hari kamis");
            case 5 -> System.out.println("Hari jum'at");
            case 6 -> System.out.println("Hari Sabtu");
            case 7 -> System.out.println("Hari Minggu");
            default -> System.out.println("Input salah");
        }
    }
}
