package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class g_resize {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        System.out.println("Hasil: " + Arrays.toString(resize(array, 8)));

    }

    private static int[] resize(int[] array, int cap) {

        int[] temp = new int[cap];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
        return array;
    }
}
