package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class e_reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Hasil: " + Arrays.toString(reverse(array, 0, array.length -1)));

    }

    private static int[] reverse(int[] data, int start, int end) {

        do {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        } while (start < end);

        return data;
    }
}
