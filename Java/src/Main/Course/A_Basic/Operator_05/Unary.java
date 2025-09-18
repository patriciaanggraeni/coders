package Course.A_Basic.Operator_05;

public class Unary {
    public static void main(String[] args) {

        // i++ artinya tampilkan terlebih dahulu baru ditambahkan (pre increment)
        int i = 1;
        System.out.println("Pre Increment  : " + i++);

        // ++i artinya tambahkan terlebih dahulu baru ditampilakan (Post Increment)
        int j = 1;
        System.out.println("Post Increment : " + ++j);
        System.out.println(" ");

        // mengubah variabel posistif menjadi minus
        int val = 5;
        System.out.println("Val Positif: " + +val);
        System.out.println("Val Negatif: " + -val);
    }
}
