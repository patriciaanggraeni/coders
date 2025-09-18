package Course.D_ObjectOrientedProgramming.H_Abstract;

public class Extends extends Abstract {

    Extends() {
        super(); // memanggil konstruktor dari class parent
        System.out.println("Ini adalah konstruktor class Extends");
    }

    @Override
    protected void print() {
        // body dari fungsi turunan dari class abstrak boleh kosong atau tidak
        System.out.println("Memanggil fungsi print");
    }

    protected void hello() {
        super.hello();
    }
}
