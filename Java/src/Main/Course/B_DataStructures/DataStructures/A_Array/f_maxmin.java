package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class f_maxmin {
    public static void main(String[] args) {

        int[] array = {8,4,3,10,9,78,5,100};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Nilai min: " + minVal(array));
        System.out.println("Nilai max: " + maxVal(array));
        System.out.println("Total: " + (minVal(array) + maxVal(array)));

    }

    private static int minVal(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int maxVal(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}