package Course.C_StrandardClasses.N_ArraysClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * berisi static method yang bisa digunakan untuk memanipulasi array
        *
        * beberapa method yang ada di Arrays Class:
        * - binarySearch(array, value)
        * - copyOf(...)
        * - equals(array1, array2)
        * - sort(array)
        * - toString(array)
        *
        * */

        int[] array = {3,4,5,6,7,71,2,3,3,21,1};

        // sorting elemen array
        Arrays.sort(array);
        System.out.println("Hasil sorting: " + Arrays.toString(array));

        // mencari element array
        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, 100));

        // mengcopy elemen array
        int[] copyArray = Arrays.copyOf(array, 7);
        System.out.println("Hasil kopi: " + Arrays.toString(copyArray));

    }
}
