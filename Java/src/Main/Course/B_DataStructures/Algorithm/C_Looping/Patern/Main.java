package Course.B_DataStructures.Algorithm.C_Looping.Patern;

public class Main {
    public static void main(String[] args) {

        // Menampilkan persegi
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku (Logic 1)
        System.out.println("\n--- Logic 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku (Logic 2)
        System.out.println("\n--- Logic 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku terbalik (Logic 1)
        System.out.println("\n--- Logic 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku terbalik (Logic 2)
        System.out.println("\n--- Logic 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print("* ");
                if (j == i) {
                    break;
                }
            }
            System.out.println(" ");
        }

        // Menampilkan kepala panah (logic 1)
        System.out.println("\n--- Logic 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan kepala panah (logic 2)
        System.out.println("\n--- Logic 2");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i+j) == 10) {
                    break;
                }
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku terbalik (Logic 1)
        System.out.println("\n--- Logic 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku terbalik (Logic 2)
        System.out.println("\n--- Logic 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("* ");
                if (k == i) {
                    break;
                }
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku mirror (Logic 1)
        System.out.println("\n--- Logic 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Menampilkan segitiga siku - siku mirror (Logic 1)
        System.out.println("\n--- Logic 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print("  ");
                if (j == i) {
                    break;
                }
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("* ");
                if (k == i) {
                    break;
                }
            }
            System.out.println(" ");
        }
    }
}

