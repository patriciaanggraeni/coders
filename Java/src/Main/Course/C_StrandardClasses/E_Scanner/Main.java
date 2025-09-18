package Course.C_StrandardClasses.E_Scanner;

// import dulu modulenya
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // membuat objek scanner
        // System.in adalah console untuk mengambil inputannya dan dibaca di console
        Scanner sc = new Scanner(System.in);

        System.out.print("Siapa nama mu? ");
        String nama = sc.next(); // mengambil string per kalimat

        System.out.println("Nama kamu adalah " + nama);

    }
}