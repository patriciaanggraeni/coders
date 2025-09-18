package src.Course.A_Basic.Array1D_13;
import java.util.Arrays;

public class ArraysOperations {
    public static void main(String[] args) {

        /*
            di dalam package Arrays ada :
            1. method toString: menjadikan arrays menjadi string
            2. method copyOf: mengkopi elemen array ke dalam array baru (tanpa merubah address)
            3. method copyOfRange: mengkopi elemen array berdasarkan range (0 - n)
            4. method fill: mengisi array dengan elemen yang ditentukan
               (output elemen akan sama semua)
            5. method equals: membandingkan dua array (output boolean)
            6. method compare: membandingkan lebih besar / kecil dari sua buah array
                   => output 0: tidak ada yang lebih besar / kecil (sama)
                   => output 1: ada yang lebih besar (tidak sama)
                   => output -1: array ke 2 (dibandingkan) > array ke 1 (membandingkan)
            7. method mismatch: mencari index yang berbeda dari dua buah array (perbandingan)
                   => output -1: tidak ada yang beda (index tidak ditemukan)
            8. method sort: mengurutkan elemen array
            9. method binarySearch: mencari elemen yang ada di dalam array
        */
        int[] array1 = {1,2,3,4,5};

        System.out.println("To String Method ---");
        System.out.println("Array1: " + Arrays.toString(array1)); // output akan jadi string

        System.out.println("\nCopy array dengan Arrays ---"); // copy elemen tanpa merubah address
        int[] array2 = Arrays.copyOf(array1, 5);
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("\nMenampilkan alamat array yang dicopy ---");
        System.out.println("Array1: " + array1);
        System.out.println("Array2: " + array2);

        System.out.println("\nCopy array dengan copyOfRange ---"); // mencopy elemen dengan range
        int[] array3 = Arrays.copyOfRange(array1, 2, 5);
        System.out.println("Array3: " + Arrays.toString(array3));

        System.out.println("\nMengisi array dengan fill ---"); // mengisi emelen dengan satu inputan
        int[] array4 = new int[5];
        Arrays.fill(array4, 5);
        System.out.println("Array4: " + Arrays.toString(array4));

        int[] array5 = {1,2,3,4,5};
        int[] array6 = {1,2,3,4,5};

        System.out.println("\nMembandingkan dua buah array ---");
        System.out.println("Array5: " + Arrays.toString(array5));
        System.out.println("Array6: " + Arrays.toString(array6));

        boolean hasil = Arrays.equals(array5,array6);
        if (hasil) {
            System.out.println("Elemen array sama");
        } else {
            System.out.println("Elemen array tidak sama");
        }

        System.out.println("\nMembandingkan dua buah array (lebih besar/kecil) ---");
        System.out.println("Array5: " + Arrays.toString(array5));
        System.out.println("Array6: " + Arrays.toString(array6));
        int hasilCom = Arrays.compare(array5,array6);
        System.out.println("Hasil compare: " + hasilCom);

        System.out.println("\nMembandingkan dua buah array dengan output index ---");
        int difIndex = Arrays.mismatch(array5,array6);
        System.out.println("Elemen yang berbeda ada di index: " + difIndex);

        int[] array7 = {7,32,1,4,9,10,54,22,16,19,5};

        System.out.println("\nMengurutkan array ---");
        System.out.println("Sebelum sorting: " + Arrays.toString(array7));
        Arrays.sort(array7);
        System.out.println("Sesudah sorting: " + Arrays.toString(array7));

        System.out.println("\nSearch array dengan binary search ---");
        int tempSearch = Arrays.binarySearch(array7, 32);
        System.out.println("Data yang dicari berada di index: " + tempSearch);

    }
}