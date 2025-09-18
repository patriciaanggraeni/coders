package Course.C_StrandardClasses.A_StringClass;

import java.util.StringJoiner;
import java.util.Scanner;

public class MainSTR {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * apakah bedanya String, StringBuilder dan StringBuffer?
         * 
         * Objek StringBuilder dan StringBuffer adalah mutable (bisa diubah) sedangkan
         * objek String adalah immutable (tidak bisa berubah).
         * StringBuffer itu synchronized sehingga thread safe, sedangkan StringBuilder
         * tidak synchronized.
         * kapan menggunakan String, StringBuilder dan StringBuffer ?
         * 
         * Saat membuat objek yang tidak akan berubah, gunakanlah String.
         * Saat membuat objek yang bisa berubah2 dan akan diakses dari beberapa thread,
         * gunakanlah StringBuffer.
         * Saat membuat objek yang bisa berubah2 namun hanya diakses oleh satu thread,
         * gunakanlah StringBuilder.
         * 
         */

        // sifat string adalah sekali dibuat tidak bisa diubah lagi
        // string sebelumnya masih ada di dalam memory, ketika kita membuat string lagi
        // maka, program akan membuat variabel string lagi, dan sring sebelumnya masih ada

        // ----- 1. memanipulasi string menjadi lower / upper case
        java.lang.String lowerCase = "MEMANIPULASI STRING MENJADI LOWERCASE".toLowerCase();
        java.lang.String upperCase = "memanipulasi string menjadi uppercase".toUpperCase();

        System.out.println("Lower Case: " + lowerCase);
        System.out.println("Upper Case: " + upperCase);

        // ----- 2. mengecek awalan dan akhiran string
        System.out.println("Hasil: " + lowerCase.startsWith("mema"));
        System.out.println("Hasil: " + upperCase.endsWith("CASE"));

        // ------ 3. mengecek apakah string blank atau empty
        System.out.println(lowerCase.isBlank());
        System.out.println(upperCase.isEmpty());

        // ------ 4. mengambil panjang dari sebuah string
        int panjang = lowerCase.length() + upperCase.length();
        System.out.println("Panjang String: " + panjang);

        // ------ 5. memotong string dengan split
        java.lang.String[] split = lowerCase.split("s");
        for (java.lang.String i : split) {
            System.out.print(i);
        }
        System.out.println(" ");

        // ------ 6. menkonvert string menjadi char
        char[] stringToChar = upperCase.toCharArray();
        for (char i : stringToChar) {
            System.out.print(i);
        }
        System.out.println(" ");

        // ------ 7. memanipulasi string dengan string builder
        StringBuilder string = new StringBuilder();
        string.append("Hello");
        string.append(" ");
        string.append("Dunia");

        System.out.println(string.toString());

        // memanipulasi string dengan string joiner class
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("Patria");
        stringJoiner.add("Anggara");
        stringJoiner.add("Susilo");
        stringJoiner.add("Putra");

        System.out.println(stringJoiner);
    }
}