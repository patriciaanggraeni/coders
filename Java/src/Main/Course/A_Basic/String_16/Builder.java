package Course.A_Basic.String_16;

import java.lang.StringBuilder;

public class Builder {
    public static void main(String[] args) {

        // membuta objek baru dari string builder
        StringBuilder data = new StringBuilder("Hello World");
        System.out.println(data);

        // di builder punya kapasitas beda dengan string punya length
        // kapasitas string builder adalah 16 (default)
        System.out.println(" ");
        System.out.println("Panjang: " + data.length()); // menampilkan panjang
        System.out.println("Kapasitas: " + data.capacity()); // menampilkan kapasitas

        // menampilkan alamat string builder
        printAddress(data);

        // Operasi String Builder : Append
        data.append(", Awesome!"); // kapasitas akan tetap sama dan panjang berbeda
        System.out.println("Panjang: " + data.length());
        System.out.println("Kapasitas: " + data.capacity());
        System.out.println("Hasil append: " + data);
        printAddress(data);

        // Operasi String Builder : Insert
        data.insert(20," Wow");
        System.out.println("Panjang: " + data.length());
        System.out.println("Kapasitas: " + data.capacity());
        System.out.println("Hasil insert: " + data);
        printAddress(data);

        // Operasi String Builder : Delete
        data.delete(20,24);
        System.out.println("Panjang: " + data.length());
        System.out.println("Kapasitas: " + data.capacity());
        System.out.println("Hasil delete: " + data);
        printAddress(data);

        // Operasi String Builder : setCharAt
        data.setCharAt(20, '?');
        System.out.println("Panjang: " + data.length());
        System.out.println("Kapasitas: " + data.capacity());
        System.out.println("Hasil set char: " + data);
        printAddress(data);

        // Operasi String Builder : Replace
        data.replace(6, 11, "Dunia");
        System.out.println("Panjang: " + data.length());
        System.out.println("Kapasitas: " + data.capacity());
        System.out.println("Hasil replace: " + data);
        printAddress(data);

        // Operasi String Builder : Casting
        String myString = data.toString();
        System.out.println("Panjang: " + myString.length());
        System.out.println("Hasil casting: " + myString);

        int x = System.identityHashCode(myString);
        System.out.println("Alamat: " + Integer.toHexString(x));
    }

    private static void printAddress(StringBuilder data) {
        int alamat = System.identityHashCode(data);
        System.out.println("Alamat: " + Integer.toHexString(alamat));
        System.out.println(" ");
    }
}
