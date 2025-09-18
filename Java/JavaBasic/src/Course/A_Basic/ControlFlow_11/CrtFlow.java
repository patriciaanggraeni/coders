package Course.A_Basic.ControlFlow_11;

public class CrtFlow {
    public static void main(String[] args) {

        // Control Flow, Mengatur jalannya program
        // break, continue dan return
        int i = 1;

        while (true) {
            i++;

            if (i == 13) {
                System.out.println("Hello World");
                break;
            } else if ((i == 5) || (i == 7)) {
                continue;
            } else if (i == 15) {
                return;
            }

            // disaat nilai i adalah 5 atau 7, maka akan skip
            System.out.println("Nilai i: " + i);
        }

        System.out.println("akhir dari while loop");
    }
}
