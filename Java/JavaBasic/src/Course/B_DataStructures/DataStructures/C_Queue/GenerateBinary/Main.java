package Course.B_DataStructures.DataStructures.C_Queue.GenerateBinary;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        generateBinary(5);
        print();

    }

    private static int length;

    private static String[] generateBinary(int n) {
        length = n;
        String[] result = new String[length];
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");
        for (int i = 0; i < length; i++) {
            result[i] = queue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return result;
    }

    private static void print() {
        System.out.println("Hasil: " + Arrays.toString(generateBinary(length)));
    }
}