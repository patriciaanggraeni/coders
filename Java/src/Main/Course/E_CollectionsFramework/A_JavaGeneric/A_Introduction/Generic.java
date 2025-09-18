package Course.E_CollectionsFramework.A_JavaGeneric.A_Introduction;

public class Generic<T, U> {

    // di sini, bayangkan aja huruf T sebuah tipe data
    private T generic1;
    private U generic2;

    Generic() {}

    Generic(T generic1, U generic2) {
        this.generic1 = generic1;
        this.generic2 = generic2;
    }

    protected void setGeneri1(T generic1) {
        this.generic1 = generic1;
    }

    protected T getGeneric1() {
        return this.generic1;
    }

    protected void setGeneri2(U generic2) {
        this.generic2 = generic2;
    }

    protected U getGeneric2() {
        return this.generic2;
    }

    protected void showBio() {
        System.out.println("Nama: " + this.getGeneric1());
        System.out.println("Umur: " + this.getGeneric2());
    }

    protected void showAdd() {
        System.out.println("Kota: " + this.getGeneric1());
        System.out.println("Provinsi: " + this.getGeneric2());
    }

}
