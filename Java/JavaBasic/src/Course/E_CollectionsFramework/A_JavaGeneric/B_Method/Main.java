package Course.E_CollectionsFramework.A_JavaGeneric.B_Method;

public class Main {
    public static void main(String[] args) {

        Method method = new Method();

        // jika menggunakan generic, maka tipe data harus mengunakan object
        // tidak bisa menggunakan tipe data primitif
        Integer[] dataArray1 = {3,4,1,2,3,6,7};
        String[] dataArray2 = {"Hai", "Kalian"};

        int result = method.count(dataArray1, dataArray2);
        System.out.println("Jumlah: " + result);
    }
}
