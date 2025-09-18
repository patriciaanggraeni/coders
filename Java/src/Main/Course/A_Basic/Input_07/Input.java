package Course.A_Basic.Input_07;

// import module scanner
import java.util.Scanner; // Scanner => *

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user juga bisa menginput berdasarkan tipe data variabel
        // byte, short, int, long, float, double, boolean, char, string
        System.out.print("Masukkan angka   : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan kondisi : ");
        boolean kondisi = sc.nextBoolean();

        System.out.println(" ");
        System.out.println("Data masuk : " + angka);
        System.out.println("Data masuk : " + kondisi);
    }
}