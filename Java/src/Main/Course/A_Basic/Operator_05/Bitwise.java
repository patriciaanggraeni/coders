package Course.A_Basic.Operator_05;

public class Bitwise {
    public static void main(String[] args) {

        // Operator bitwise
        int bit1 = 50;
        int bit2 = 10;
        int sumbit1 = bit1 << bit2;
        int sumbit2 = bit1 >> bit2;
        int sumbit3 = bit1 << bit2 << bit1;

        System.out.printf("%d << %d = %d\n", bit1, bit2, sumbit1);
        System.out.printf("%d >> %d = %d\n", bit1, bit2, sumbit2);
        System.out.printf("%d << %d << %d = %d\n", bit1, bit2, bit1, sumbit3);
        System.out.println("\n");
    }
}
