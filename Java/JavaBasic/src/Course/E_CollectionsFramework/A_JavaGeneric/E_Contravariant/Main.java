package Course.E_CollectionsFramework.A_JavaGeneric.E_Contravariant;

public class Main {
    public static void main(String[] args) {

        Contravariant<Object> parent = new Contravariant<>("Angga");
        Contravariant<? super String> child = parent;

        System.out.println("Nama ku adalah " + child.getData());

        Contravariant<Object> myData = new Contravariant<>("Hello");
        // myData.setData(1000); -> tidak aman
        contravariant(myData);

    }

    protected static void contravariant(Contravariant<? super String> input) {
        // String temp = (String) input.getData(); -> tidak aman
        System.out.println("Data masuk: " + input.getData());
    }
}
