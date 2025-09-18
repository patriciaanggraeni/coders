package Course.B_DataStructures.DataStructures.A_Array;
import java.util.Arrays;

public class b_adding {
    public static void main(String[] args) {

        int[] array = new int[5]; // belum ada datanya, jadi di dalam array masih nol

        // index dimulai dari nol
        array[0] = 1; // taruh satu ke index ke-0
        array[1] = 2; // taruh dua ke index ke-1
        array[2] = 3; // taruh tiga ke index ke-2
        array[3] = 4; // taruh empat ke index ke-3
        array[4] = 5; // taruh lima ke index ke-4
        System.out.println(Arrays.toString(array));

        array[3] = 10; // update nilai di index 3 sebelumnya menjadi 10
        array[2] = 99;
        System.out.println(Arrays.toString(array));
    }
}
