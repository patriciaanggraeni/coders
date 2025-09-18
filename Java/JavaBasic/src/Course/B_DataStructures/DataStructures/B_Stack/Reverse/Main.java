package Course.B_DataStructures.DataStructures.B_Stack.Reverse;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String data = "abcd";
        System.out.println("Sebelum: " + data.toUpperCase());
        System.out.println("Sesudah: " + reverse(data.toUpperCase()));
    }

    private static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
