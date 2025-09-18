package Course.B_DataStructures.DataStructures.A_Array;

public class i_polindrome {
    public static void main(String[] args) {

        String word = "malam";
        boolean cek = polindrome(word);

        if (cek) {
            System.out.println(word + " is polindrome");
        } else {
            System.out.println(word + " is not polindrome");
        }
    }

    private static boolean polindrome(String word) {
        char[] array = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        do {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;

        } while (start < end);

        return true;
    }
}
