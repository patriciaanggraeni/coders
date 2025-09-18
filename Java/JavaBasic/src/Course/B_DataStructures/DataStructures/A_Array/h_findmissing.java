package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class h_findmissing {
    public static void main(String[] args) {

        int[] array = {1,5,7,4,6,3};
        int result = findMissing(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Missing number: " + result);
    }

    private static int findMissing(int[] array) {

        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : array) {
            sum -= num;
        }
        return sum;
    }
}
