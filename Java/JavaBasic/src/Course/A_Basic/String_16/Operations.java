package Course.A_Basic.String_16;
import java.util.Scanner;
import java.lang.String;

public class Operations {
    public static void main(String[] args) {

        // mengambil komponen string dengan subtring atau char at
        String data1 = "Hello World";
        System.out.println(data1.charAt(0));
        System.out.println(data1.substring(0,5));

        // Operasi 1 : Concatenation (concate) / menyambung
        String data2 = data1 + " " + "Nice to meet you!";
        System.out.println(data2);

        // Operasi 2 : Concate dengan non string
        byte x = 10;
        String data3 = "Lari " + " " + x;
        System.out.println("Casting non string: " + data3);

        // Operasi 3 : Upper dan Lower Case
        System.out.println(" ");
        System.out.println(data1.toUpperCase());
        System.out.println(data1.toLowerCase());

        // Operasi 4 : Replace
        String data4 = data1.replace("World", "Dunia");
        System.out.println("\n" + data1);
        System.out.println(data4);

        // String berhubungan dengan equality / persamaan
        System.out.println(" ");
        String data5 = new String("Hello World");
        String data6 = "Hello World";

        if (data5 == data6) {
            // jika dua" sama maka blok if akan dieksekusi
            // yang dicek adalah address (karena berada di string pool)
            System.out.println("Ok");
        } else {
            // jika addressnya tidak sama, maka blok else akan dieksekusi
            System.out.println("Nope");
        }

        // saat mengambil string dari user, alokasi memori akan selalu berada di memori heap
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan input: "); // tidak masuk di string pool
        String data7 = sc.nextLine();

        // output akan salah (caranya pakai equals)
        if (data7.equals(data6)) {
            // jika dua" sama maka blok if akan dieksekusi
            // yang dicek adalah address (karena berada di string pool)
            System.out.println("Ok");
        } else {
            // jika addressnya tidak sama, maka blok else akan dieksekusi
            System.out.println("Nope");
        }

        // Operasi 5 : Compare
        // Membandingkan jarak setiap alphabet di dalam string
        String nama1 = "Patria Anggara";
        String nama2 = "Susilo Putra";

        System.out.println("Jarak s ke q: " + nama1.compareTo(nama2)); // p q r s (dari kanan ke kiri)
        System.out.println("Jarak q ke s: " + nama2.compareTo(nama1)); // p q r s (dari kiri ke kanan)

        String a1 = "Hekker";
        String a2 = "Helker";

        System.out.println("Jarak l ke k: " + a1.compareTo(a2));
        System.out.println("Jarak k ke l: " + a2.compareTo(a1));

    }
}
