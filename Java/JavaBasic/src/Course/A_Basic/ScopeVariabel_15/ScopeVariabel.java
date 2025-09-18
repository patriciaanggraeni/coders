package Course.A_Basic.ScopeVariabel_15;

public class ScopeVariabel {
    static int x = 10; // merupakan variabel global

    public static void main(String[] args) {

        {
            {
                // memanggil variabel inner lokal block
                int x = 20;
                System.out.println("Ini adalah variabel inner lokal block: " + x);
            }

            // memanggil variabel outer lokal block
            int x = 15;
            System.out.println("Ini adalah variabel outer lokal block: " + x);
        }

        // memanggil variabel global
        System.out.println("Ini adalah variabel global: " + x);

        // memanggil variabel lokal main
        int x = 5;
        System.out.println("Ini adalah variabel lokal main: " + x);
    }
}
