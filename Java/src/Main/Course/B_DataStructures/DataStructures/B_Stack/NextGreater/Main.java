package Course.B_DataStructures.DataStructures.B_Stack.NextGreater;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,5,7,9,10,7,4};
        System.out.println("Sebelum: " + Arrays.toString(array));
        System.out.println("Sesudah: " + Arrays.toString(nextGrater(array)));

    }

    private static int[] nextGrater(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while ((!stack.isEmpty()) && (stack.peek() <= arr[i])) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
