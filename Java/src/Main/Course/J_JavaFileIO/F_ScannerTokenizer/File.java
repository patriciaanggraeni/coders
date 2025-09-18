package Course.J_JavaFileIO.F_ScannerTokenizer;

// import char stream (buffered)
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {

        // buat class buffered char stream
        FileReader inputFile = new FileReader("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\F_ScannerTokenizer\\input\\input.txt");
        BufferedReader buffRead = new BufferedReader(inputFile);
        buffRead.mark(100);
        /* 
            // Scanner input
            - next(): input per kata
            - nextLine(): input lebih dari 1 atau 2 kata
        */

        // cara 1 : agak panjang
        /*
            Scanner sc = new Scanner(buffRead);
            String teks = sc.next();
            System.out.println(teks);
            teks = sc.next();
            System.out.println(teks);
        */

        /*
            cara 2 : langsung ditampilkan
            Scanner sc = new Scanner(buffRead);

            jika ditaruh sini, maka akan mereturn true
            -> System.out.println(sc.hasNext());

            default limiter (pembatas) adalah spasi / karakter putih
            -> System.out.println(sc.next());
            -> System.out.println(sc.next());
            -> System.out.println(sc.next());
            -> System.out.println(sc.next());
            -> System.out.println(sc.next());
            -> System.out.println(sc.next());
            
            jika sudah tidak ada kata lagi, maka akan mereturn false
            -> System.out.println(sc.hasNext());
        */

        // ------------------------------------------------ Scanner
        // menampilkan isi file dengan while loop
        // memanfaatkan fungsi hasNext();
        System.out.print("Menggunakan Scanner: ");
        Scanner sc = new Scanner(buffRead);
        sc.useDelimiter(",");
        while (sc.hasNext() != false) {
            System.out.print(sc.next() + " ");
        }
        buffRead.reset();

        // ------------------------------------------------ String Tokenizer
        // string tokenizer (baris 1)
        // fungsi hasMoreTekons() berfungsi untuk mengecek apakah masih ada kata selanjutnya di dalam string
        // jika iya, akan mengembalikan nilai true, jika tidak maka akan mngembalikan nilai false (boolean)
        System.out.println(" ");
        System.out.print("Menggunakan String Tokenizer: ");
        String teks = buffRead.readLine();
        StringTokenizer myString = new StringTokenizer(teks, ",");
        while (myString.hasMoreTokens() != false) {
            System.out.print(myString.nextToken() + " ");
        }

        // string tokenizer baris 2
        // objek StringTokenizer berfnugsi untuk membuat sebuah ojek untuk bisa menggunakan StringTokenizer
        teks = buffRead.readLine();
        myString = new StringTokenizer(teks, ",");
        while (myString.hasMoreTokens() != false) {
            System.out.print(myString.nextToken() + " ");
        }

        // scanner juga butuh diclose
        sc.close();
        inputFile.close();
        buffRead.close();
    }
}