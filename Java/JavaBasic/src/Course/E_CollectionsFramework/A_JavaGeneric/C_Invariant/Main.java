package Course.E_CollectionsFramework.A_JavaGeneric.C_Invariant;

public class Main {
    public static void main(String[] args) {

        Invariant<Object> obj = new Invariant<>("testing");

        error(obj);
        // Invariant<String> parent = obj; -> error
        // error(obj); -> error
    }

    private static void error(Invariant<Object> objCasting) {}
}
