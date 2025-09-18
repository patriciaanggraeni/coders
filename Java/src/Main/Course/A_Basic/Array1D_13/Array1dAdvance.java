package Course.A_Basic.Array1D_13;
import java.util.Arrays;

public class Array1dAdvance {
    public static void main(String[] args) {

        int[] array1 = {2,4,6,8,10};
        int[] array2 = new int[5];

        System.out.println(array1);
        System.out.println(array2);

        // pass by references
        array2 = array1; // alamatnya pindah
        System.out.println(" ");
        System.out.println(array1);
        System.out.println(array2);

        System.out.println(" ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        array1[0] = 1;
        array2[2] = 5;
        System.out.println(" ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println(" ");
        ubahArray(array1, array2);
    }

    private static void ubahArray(int[] data1, int[] data2) {
        for (int i : data1) {
            System.out.print(i + " ");
        }

        data1[4] = 100;
        data2[3] = 50;
        System.out.println(" ");
        System.out.println("Array1: " + Arrays.toString(data1));
        System.out.println("Array2: " + Arrays.toString(data2));

        for (int i : data2) {
            System.out.print(i + " ");
        }
    }
}
