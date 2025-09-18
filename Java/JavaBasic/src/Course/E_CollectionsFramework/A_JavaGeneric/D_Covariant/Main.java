package Course.E_CollectionsFramework.A_JavaGeneric.D_Covariant;

public class Main {
    public static void main(String[] args) {

        Covariant<String> obj = new Covariant<>("Hello World");
        covariant(obj); // -> nggak error

        Covariant<? extends Object> text = obj;
    }

    private static void covariant(Covariant<? extends Object> temp) {
        System.out.println(temp.getData());
        // temp.setData(1); -> error bisa menyebabkan kerusakan data
    }
}