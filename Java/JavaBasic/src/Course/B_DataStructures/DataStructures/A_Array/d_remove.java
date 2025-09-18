package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class d_remove {
    public static void main(String[] args) {


        int[] array = {2,3,4,5,2,1,7,6};
        System.out.println("Hasil: " + Arrays.toString(removeEven(array)));

    }

    private static int[] removeEven(int[] data) {

        int odd = 0;
        int length = data.length;
        for (int i = 0; i < length; i++) {
            if (data[i] % 2 != 0) {
                odd++;
            }
        }

        int[] hasil = new int[odd];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (data[i] % 2 != 0) {
                hasil[index] = data[i];
                index++;
            }
        }

        return hasil;
    }
}
