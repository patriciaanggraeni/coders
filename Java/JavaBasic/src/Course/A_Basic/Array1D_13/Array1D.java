package Course.A_Basic.Array1D_13;

import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {

        // mendeklarasikan sebuah array
        int[] myArray1 = new int[5];

        // deklarasi + inisialisasi = instansiasi
        float[] myArray2 = {1.5f,2.5f,3.5f,4.5f,5.5f};

        // mengisi index array
        myArray1[0] = 1;
        myArray1[1] = 2;
        myArray1[2] = 3;
        myArray1[3] = 4;
        myArray1[4] = 5;

        // mengakses array
        System.out.println(" ");
        System.out.println("Mengakses manual array---");
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        System.out.println(" ");
        System.out.println("Mengakses manual array---");
        System.out.println(myArray2[0]);
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);
        System.out.println(myArray2[3]);
        System.out.println(myArray2[4]);

        System.out.println(" ");
        System.out.println("Menggunakan package Arrays ---");
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        System.out.println(" ");
        System.out.println("Menggunakan perulangan for each ---");
        for (int i : myArray1) {
            System.out.println(i);
        }
        System.out.println(" ");
        for (float i : myArray2) {
            System.out.println(i);
        }
        // for each biasanya digunakan jika ingin menampilkan datanya saja
        // tidak beserta indexnya


        System.out.println(" ");
        System.out.println("Menggunakan for loop ---");
        for (int i : myArray1) {
            System.out.println(i);
        }
        System.out.println(" ");
        for (float i : myArray2) {
            System.out.println(i);
        }
    }
}
